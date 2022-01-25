package DomaciZadaci;

/*
3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
1 - 2 + 3 - .... (+/-) n.

 */

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = sc.nextInt();
        int naizmenicnaSuma=0;
        for (int i =0; i<=n ; i+=2){
            naizmenicnaSuma = naizmenicnaSuma - i;
        }
        for (int i=1; i<=n ; i+=2){
            naizmenicnaSuma = naizmenicnaSuma +i;
        }

        System.out.println(naizmenicnaSuma);
    }
}
