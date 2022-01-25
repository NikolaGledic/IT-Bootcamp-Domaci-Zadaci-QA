package DomaciZadaci;
/*
6. Ispisati proizvod prvih n celih brojeva [1, n].
 */

import java.util.Scanner;

public class PasteBinSestiZad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj: ");
        int n= sc.nextInt();
        int rezultat=1;
        for (int i=1; i <=n; i++ ){     //petlju for koristimo kao brojac da nam ide do unetog broja
            rezultat = rezultat * i;        // operacija koja ce se izvrsiti svaki put kad prodjemo kroz for da bi
            // dobili n!
        }
        System.out.println(rezultat);

    }
}
