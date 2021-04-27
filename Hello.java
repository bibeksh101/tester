import java.util.Scanner;  // Import the Scanner class
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("LOREM IPSUM PRINTED HERE!");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
