//Wap to calculate highest num of notes in a num.
import java.util.Scanner;

public class Note {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] notes = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Highest note:");

        for (int note : notes) {
            if (num >= note) {
                int count = num / note;
                System.out.println(count + "-" + note + " note");
                num = num % note;
            }
        }

        if (num > 0) {
            System.out.println("Other: " + num);
        }
    }
}


