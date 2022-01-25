package JavaTest1;

/*
/NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
//Proizvoljno napravite niz od 10 brojeva
//korisnik unosi broj koji zeli da prebroji u nizu
//niz je tipa int

//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
//Primeri ispisa u konzoli

//Unesite broj koji zelite da prbrojimo u nizu brojeva:
//2
//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva

//Unesite broj koji zelite da prbrojimo u nizu brojeva:
//8
//Broj 8 se ne pojavljuje u nasem nizu
 */

import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] niz = {2, 12, 15, 44, 18, 23, 11, 2, 23, 23, 23, 18};
        System.out.println("Unesite broj koji zelite da prbrojimo u nizu brojeva: ");
        int broj = sc.nextInt();
        if (brojac(niz,broj) != 0) {        // ako nam brojac nije jednak nuli vrsimo jedan ispis
            System.out.println("Broj " + broj + " se pojavljuje " + brojac(niz,broj) + " puta u nasem nizu brojeva");
        }
        else {                               // ako jeste vrsimo drugi
            System.out.println("Broj " + broj + " se ne pojavljuje u nasem nizu");
        }

    }

    public static int brojac (int[] niz ,int n){
        int c = 0;
        for (int i = 0 ; i < niz.length ; i++){
            if (niz[i] == n) {      // ako postoji neki clan niza koji je jednak unetom broju
                c++;                // uvecavamo brojac koji na kraju vracamo
            }
        }
        return c;                   // vracamo brojac main metodi
    }
}
