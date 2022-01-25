package JavaTest1;

/*
//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
//Korisnik unosi iznos dinara i valutu u koji zeli da konvertuje dinare
//1 evro je 0,0085 dinara
//1 franak je 0,0093 dinara
//1 dolar je 0,010 dinara
//Ispise vrsiti iskljucivo iz main metode!

//Primeri ispisa u konzoli:

//Molim vas unesite iznos u dinarima:
//1200
//Molim vas da unesete valutu u koju da konvertujemo dinare:
//evro
//1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
//Primer ispisa u konzoli kad se unese pogresna valuta

//Molim vas unesite iznos u dinarima:
//123
//Molim vas da unesete valutu u koju da konvertujemo dinare:
//zlato
//Niste uneli dobru valutu
 */

import java.util.Objects;
import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Molim vas unesite iznos u dinarima: ");
        double dinari = sc.nextDouble();
        System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare: ");
        String valuta = sc.next();
        if (Objects.equals(valuta, "evro") || Objects.equals(valuta, "franak") || Objects.equals(valuta, "dolar")) {
            System.out.println(dinari + " dinara kada se prebaci u " + valuta + " iznosi "
                    + konverter(dinari, valuta) + " u toj valuti");
        }       // proveravamo koju poruku ispisujemo
        else {
            System.out.println("Niste uneli dobru valutu");
        }

    }

    public static double konverter ( double x, String val){
        double b = 0;
        if (Objects.equals(val, "evro")) {      // provera za evro
        b = x * 0.0085;                         // jednacina za konverziju
        }
        else if (Objects.equals(val, "franak")) {   // provera za franak
            b = x * 0.0093;
        }
        else if (Objects.equals(val, "dolar")) {    // provera za dolar
        b = x * 0.010;
        }
        return b;
    }
}
