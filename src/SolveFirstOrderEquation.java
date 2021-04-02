import java.util.Scanner;

public class SolveFirstOrderEquation {

    public static void main(String[] args) {
	// write your code here
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();

        if(a != 0){
            double result = -b / a;
            System.out.println("nghiệm phương trình là: "+result);
        }
        else {
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}
