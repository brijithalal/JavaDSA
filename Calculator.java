import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        // Take input from user till user does not press x or X
        while(true) {
            //ake the operator as input
            System.out.println("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op =='-' || op =='*' || op =='/' || op =='%') {
                // input 2 numbers
                System.out.println("Enter  two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
//                System.out.println();
                if(op =='+' ) {
                    ans = num1 + num2;
                }
                if(op =='-' ) {
                    ans = num1 - num2;
                }
                if(op =='*' ) {
                    ans = num1 * num2;
                }
                if(op =='/' ) {
                    if(num2 != 0 ){
                        ans = num1 / num2;
                    }
                }
                if(op =='%' ) {
                        ans = num1 % num2;
                }
            } else if (op == 'x' || op =='X'){
                break;
            }else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }

    }
}
