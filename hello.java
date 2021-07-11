import java.util.Scanner;

public class hello {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            String name;
            System.out.print("Your name: ");
            name = scanner.nextLine();
            System.out.print("Hello " + name);

    }
}
