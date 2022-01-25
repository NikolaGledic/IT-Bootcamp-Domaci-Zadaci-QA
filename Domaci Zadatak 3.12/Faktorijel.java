package DomaciZadaci;

import java.util.Scanner;

/*
Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 * 2 * 1 = 6
*/
public class Faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj: ");
        int n= sc.nextInt();
        int rezultat=1;
        for (int i=1; i <=n; i++ ){     //f-ju for koristimo kao brojac da nam ide do unetog broja
            rezultat = rezultat * i;        // operacija koja ce se izvrsiti svaki put kad prodjemo kroz for da bi
                                            // dobili n!
        }
        System.out.println(rezultat);

    }
}
