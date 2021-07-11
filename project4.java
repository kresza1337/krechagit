public class project4 {
    public static void main(String[] args){
        int a = 20;
        int b = 20;
        int wynik = 0;
        a += b; // skrócny operator dodawania, umieszcza wynik pod zmienna "a"
        System.out.println(a);
        //potęgowanie, pierwiastkowanie -- za pomoca klasy statycznej
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9)); // pierwiastek
        System.out.println(Math.abs(-50)); // pierwiastek

        //skracanie inkrementacja - zwiekszenie o 1
        int c = 30;
        int d = 10;
        c ++;
        c ++;
        c ++;
        System.out.println(c);
    }
}
