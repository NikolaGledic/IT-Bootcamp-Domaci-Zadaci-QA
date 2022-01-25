package DomaciZadaci;

import java.util.Scanner;

/*
1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.
 */
public class ParNepar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      //Pravimo scanner za unos podataka
        System.out.println("Unesite broj za proveru ");
        int n = s.nextInt();    // Kreiramo promenjivu koju ce korisnik uneti
        if (n % 2 == 0) {       //proveravamo da li je broj paran
            System.out.println("Paran!");
        } else {                //jedina druga opcija ako nije paran
            System.out.println("Neparan!");
        }
    }

}
