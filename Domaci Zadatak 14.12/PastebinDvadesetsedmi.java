package DomaciZadaci;

/*27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
Ispisati svaki drugi element tog niza Primer: [1, 2, 3, 4, 5] -> 1 3 5*/

import java.util.Scanner;

public class PastebinDvadesetsedmi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite koliki niz zelite da bude: ");
        int duzinaNiza= sc.nextInt();
        int[] niz= new int[duzinaNiza];
        for (int i=0 ; i<duzinaNiza; i++){
            System.out.println("Unesite " + (i+1) + " clana niza");
            niz[i]=sc.nextInt();
        }
        svakiDrugiElementNiza(niz, duzinaNiza);

    }

    public static void svakiDrugiElementNiza(int[] a , int b ) {
        for (int i =0; i<b ;i+=2 ){
            System.out.println(a[i]);
        }
    }
}
