package DomaciZadaci;

/*
41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
 */

public class Pastebin41 {
    public static void main(String[] args) {

        double[] niz = { 1.25, 5.34, 8.6, 15.2, 21.3, 8.8};
        System.out.println("Prosecna vrednost niza je: " + prosecnaVrednost(niz) );

    }

    public static double prosecnaVrednost (double[] niz) {
        double c = 0;
        for (int i = 0; i < niz.length; i++) {
            c += niz[i];
        }
        return c/ niz.length;
    }
}
