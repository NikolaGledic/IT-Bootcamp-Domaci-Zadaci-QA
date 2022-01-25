package DomaciZadaci;

import java.util.Scanner;

/*
30. -//-. Izracunati proizvod elemenata tog niza.
Primer: [2, 4] -> 8
30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.
 */

public class PastebinTrideseti {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite koliki niz zelite da bude: ");
        int duzinaNiza= sc.nextInt();
        int[] niz= new int[duzinaNiza];
        for (int i=0 ; i<duzinaNiza; i++){
            System.out.println("Unesite " + (i+1) + " clana niza");
            niz[i]=sc.nextInt();
        }
        System.out.println("Proizvod je: " + proizvodNiza(niz,duzinaNiza));
    }
    public static int proizvodNiza(int [] a, int b){
        int proizvod=1;
        for (int i = 0; i<b ; i++){
            proizvod= proizvod * a[i];
        }
        return proizvod;
    }

}
