public class project5 {
    public static void main(String[] args){
        int a = 4, b = 5;
        // == operator porównania
         boolean logiczna = a >= b;
        // != rózność
        // a > b -- wiekszość  a >= b
        System.out.println("1: " + logiczna);
//--------- operatory logiczne
       // boolean logiczna = 5 >= 5 && 6 > 1; //łączenie
        boolean logiczna2 = 5>= 5 || 0 > 1; // lub
        System.out.println("2: " + logiczna2);
        boolean logiczna3 = 10 >= 10 || true && true;
        System.out.println("3: " + logiczna3);
        // negacje          ! -  zamienia na przeciwną
        boolean logiczna4 = !(a == b);
        System.out.println("4: " + logiczna4);
    }
}
