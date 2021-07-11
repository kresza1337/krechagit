public class project2 {
    public static void main(String[] args){
        //Znak - tylko jeden znak
            char zmChar;
            zmChar = 'a';
            System.out.println(zmChar);
        //String
            String zmString = "Krecha";
            System.out.println(zmString);
        //Boolean - tylko 2 wartosci
            boolean zmBoolean = true;
            System.out.println(zmBoolean);
        //byte - liczby całkowite (-128 do 127)
            byte zmByte = Byte.MIN_VALUE;
            byte zmByte2 = Byte.MAX_VALUE;
            System.out.println("Byte: " + zmByte + " do " + zmByte2);
        //short - liczby całkowite (-32768 do 32767)
            short zmShort = Short.MIN_VALUE;
            short zmShort2 = Short.MAX_VALUE;
            System.out.println("Short: " + zmShort + " do " + zmShort2);
        //int (-2147483648 do 2147483647)
            int zmInt = Integer.MIN_VALUE;
            int zmInt2 = Integer.MAX_VALUE;
            System.out.println("Int: " + zmInt + " do " + zmInt2);
        //long (-9223372036854775808 do 9223372036854775807)
            long zmLong = Long.MIN_VALUE;
            long zmLong2 = Long.MAX_VALUE;
            System.out.println("Long: " + zmLong + " do " + zmLong2);
        //float - liczby rzeczywiste // precyzja      -- zmienno przecinkowe liczby
        //przykład liczby niecalkowitej 26.4332345f;
            //konczy sie znakiem "f"
            float zmFloat = Float.MIN_VALUE;
            float zmFloat2 = Float.MAX_VALUE;
            System.out.println("Float: " + zmFloat + " - " + zmFloat2);
        //double wieksza // precyzja           -- zmienno przecinkowe liczby
            double zmDouble = Double.MIN_VALUE;
            double zmDouble2 = Double.MAX_VALUE;
            System.out.println("Double: " + zmDouble + " - " + zmDouble2);
            // --------------------------------------------------------------------------------------
        // stałe -- final --> skończone. final nie moze byc zmienione
           final int liczba = 256;
        // zmienne do zmiennych
           // int liczba = 256;
          //  liczba = zmByte;










    }
}
