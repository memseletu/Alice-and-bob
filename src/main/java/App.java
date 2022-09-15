import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1-create a scanner
        Scanner userInput = new Scanner(System.in);
        String name;
        System.out.print("Enter Your Name: ");

        name = userInput.nextLine();
        if (name == "Alice" && name == "Bob") {
            System.out.println("Hey " + name + "!");
        }


        }


    }


