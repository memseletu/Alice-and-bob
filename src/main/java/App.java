import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1-create a scanner
        Scanner userInput = new Scanner(System.in);
        String name;

    while(true) {
        System.out.print("Enter Your Name: ");
        name = userInput.nextLine();
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hey " + name + "!");
            break;
        }

        }
    }

    }





