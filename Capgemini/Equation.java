
import java.util.Scanner;

class Equation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = (a + b) * (a + b) * (a + b);
        System.out.println(sum);
    }
}
