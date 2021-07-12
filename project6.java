public class project6 {
    public static void main(String[] args) {
        int wiek = 16;
        if (wiek >= 18) {
            System.out.println("Pełnoletnia");
        }
        else if (wiek >= 16)
        {
            System.out.println("Możesz pracować");
        }
        else
        {
            System.out.println("Nie możesz pracować");

        }
        // operator 3 argumentowy - po znaku ? prawda, : fałsz
        String imie = wiek >= 18 ?  "Krecha" : "Zdzichu";
        System.out.println(imie);
        }
    }

