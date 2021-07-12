import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String name;
                System.out.println("Your name: ");
                name = scanner.nextLine();
                System.out.println("Hello " + name);
            int age;
                System.out.println("Your age : ");
                age = scanner.nextInt();
                    if( age >= 18 ) {
                        System.out.println("Hi " + age + " years old bro!");
                        int money;
                        System.out.println("Enter your monthly salary: ");
                        money = scanner.nextInt();
                            if( money > 2800 ){
                                System.out.println("You are rich");
                            }
                            else if( money == 2800 ){
                                System.out.println("You are not rich or poor");
                            }
                            else{
                                System.out.println("Hello poor man");
                            }
                    }
                    else{
                        System.out.println("Hi " + age + " years old child!");
                    }
        }
    }





