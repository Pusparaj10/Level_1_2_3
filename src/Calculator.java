import java.util.Scanner;

//Wap to create a calculator
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 For Addition");
        System.out.println("Enter 2 For Subtraction");
        System.out.println("Enter 3 For Multiplication");
        System.out.println("Enter 4 For Division");
        int calc = sc.nextInt();
        System.out.println("Enter 2 Numbers for the Problem");
        float num1= sc.nextFloat();
        float num2= sc.nextFloat();
        if (calc==1){
            float num3=num1+num2;
            System.out.println("Addition: "+num3);
        }
        else if (calc==2) {
            float num3=num1-num2;
            System.out.println("Subtraction: "+num3);
        }
        else if (calc==3) {
            float num3=num1*num2;
            System.out.println("Multiplication: "+num3);
        }
        else if (calc==4) {
            float num3=num1/num2;
            System.out.println("Division: "+num3);
        }
        else{
            System.out.println("enter valid information");
        }
    }
}
