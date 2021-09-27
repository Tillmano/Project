

public class Main {
    public static void main(String[] args) {
        /*GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 500);
        gui.setTitle("Input");*/
        InputOutput input = new InputOutput();
        MatrixSolver solver = new MatrixSolver();
        double[][] twoDArray = input.GetInput();
        double[] answers = input.ResultInput();
        double[] result = solver.Solve(twoDArray, answers);
        input.PrintResult(result);
    }

}