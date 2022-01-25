package DomaciZadaci;

/*
29. -//-. Ispisati svaki treci element u obrnutom redosledu.
Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
 */

import java.util.Scanner;

public class PastebinDvadesetDeveti {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite koliki niz zelite da bude: ");
        int duzinaNiza= sc.nextInt();
        int[] niz= new int[duzinaNiza];
        for (int i=0 ; i<duzinaNiza; i++){
            System.out.println("Unesite " + (i+1) + " clana niza");
            niz[i]=sc.nextInt();
        }
        svakiTreciElementNiza(niz, duzinaNiza);

    }
    public static void svakiTreciElementNiza(int[] a , int b ) {
        for (int i= b-1 ; i>=0 ;i-=3 ){
            System.out.println(a[i]);
        }
    }
}
