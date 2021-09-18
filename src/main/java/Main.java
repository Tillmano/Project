public class Main {
    public static void main(String [] args) {
        InputOutput input = new InputOutput();
        MatrixSolver solver = new MatrixSolver();
        double[][] twoDArray = input.GetInput();
        double[] answers = input.ResultInput();
        double[] result = solver.Solve(twoDArray,answers);
        input.PrintResult(result);
    }

}