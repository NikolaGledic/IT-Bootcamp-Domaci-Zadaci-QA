package JavaTest1;

/*
//Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int), sve dok korisnik ne unese 0
//Primer ispisa resenja:
//Molim vas unesite 1. broj
//4
//Trenutni zbir je 4
//Molim vas unesite 2. broj
//5
//Trenutni zbir je 9
//Molim vas unesite 3. broj
//0
//Uneli ste 0 Kraj programa
 */

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;      // jedini razlog za unos ove promenljive ja da radi kao brojac u sout-u
        System.out.println("Molim vas unesite " + i + " broj");
        int broj= sc.nextInt();
        int zbir=0;     // zbir uvek krece od 0
        while (broj != 0) {     // uslov da se ne udje u while petlju tj da se zavrsi program
            zbir = zbir + broj;
            i++;
            System.out.println("Trenutni zbir je " + zbir);
            System.out.println("Molim vas unesite " + i + " broj");
            broj = sc.nextInt();
        }
        System.out.println("Uneli ste " + broj + " Kraj progrma");
    }
}
