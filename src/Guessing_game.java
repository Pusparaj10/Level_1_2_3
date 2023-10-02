import java.util.Scanner;

// WAP to create a guessing game
public class Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random() * 10);
        System.out.println("Enter a random number: ");
        int num = sc.nextInt();

        if(random == num){
            System.out.println("correct");
        }else{
            System.out.println("The correct number is " + random + "You failed");
        }

    }
}
