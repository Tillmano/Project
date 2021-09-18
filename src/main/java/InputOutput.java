import org.apache.commons.math3.linear.RealVector;

import java.util.Scanner;

public class InputOutput {
    public double[][] GetInput() {
        System.out.print("Enter number of equations: ");
        Scanner sc = new Scanner(System.in);
        double rows = sc.nextDouble();
        double columns = rows;

        System.out.println("Enter array elements : ");

        double twoD[][] = new double[(int) rows][(int) columns];


        for (double i = 0; i < rows; i++) {
            for (double j = 0; j < columns; j++) {
                twoD[(int) i][(int) j] = sc.nextDouble();
            }
        }
        System.out.print("\nData you entered : \n");
        for (double[] x : twoD) {
            for (double y : x) {
                System.out.print(y + "        ");
            }
            System.out.println();
        }

        return twoD;
    }

    public void PrintResult(double[] solution) {
        int n;
        n = solution.length;
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(solution[i]);
        }
    }

    public double[] ResultInput() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of variables (same as equations) ");
        n = sc.nextInt();
        double[] answers = new double[n];
        System.out.println("Enter the answers to the equations: ");
        for (int i = 0; i < n; i++) {
            answers[i] = sc.nextInt();
        }
        System.out.println("Answers are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(answers[i]);
        }
        return answers;
    }
}

