//Login_system
import java.util.Scanner;
public class Login_system {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String Username = "Pusparaj";
            String Password = "Binayak";
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }
