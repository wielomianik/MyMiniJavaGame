import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome into guessing game!   (Input 'E' to exit)");
        System.out.println("Input a number of a field and see what you gained ;)");

        Line line = new Line();
        line.printAll();
        line.whatCoin();

        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("\n");
        System.out.println("Give me an Integer: ");

        do {
            try {
                input = scan.next();
                if(input.charAt(0) == 'E') {
                    break;
                } else {line.inGuessing(Integer.parseInt(input));}
            } catch (Exception e) {
                System.out.println("Input correct number!");
            }

            line.printAll();
            System.out.println();
        } while (true);

    }
}