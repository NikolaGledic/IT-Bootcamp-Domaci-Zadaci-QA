package DomaciZadaci;

/*
31. Napisati funkciju koja racuna proizvod 3 broja.
 */

import java.util.Scanner;

public class PastebinTridesetPrvi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite tri broja za mnozenje: ");
        int prviBroj = sc.nextInt();
        int drugiBroj = sc.nextInt();
        int treciBroj = sc.nextInt();
        System.out.println("Proizvod je: " + mnozenje(prviBroj,drugiBroj,treciBroj));
    }
    public static int mnozenje (int x, int y, int z){
        return x * y * z;
    }
}
