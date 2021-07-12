import java.util.Scanner;

public class project7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz cyfre pory roku: ");
        int poraRoku;
        poraRoku = scanner.nextInt();
        // switch (do jakiej zmiennej)
        switch(poraRoku){
                    //dwukropek!
            case 1:
                System.out.println("Wiosna");
                break; //skok - blokuje dalszy tok
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
                // wartosc nieprzewidziana
            default:
                System.out.println("Nie ma takiej pory roku, wpisz cyfre od 1 - 4");
                break;


        }

    }
}
