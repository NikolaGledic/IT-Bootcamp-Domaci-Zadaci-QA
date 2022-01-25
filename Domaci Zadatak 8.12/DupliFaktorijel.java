package DomaciZadaci;

/*
1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
 */
import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();
        int rezultat = 1;
        for (int i = n; i > 0; i = i-2) {     //petlju for koristimo kao brojac da nam ide do unetog broja
            rezultat = rezultat * i;          // operacija koja ce se izvrsiti svaki put kad prodjemo kroz for da bi
                                              // dobili n!
        }
        System.out.println(rezultat);
    }
}
