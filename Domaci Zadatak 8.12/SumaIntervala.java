package DomaciZadaci;


/*
2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].
 */
import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite manji ceo broj:");   //pocetak sume
        int m= sc.nextInt();
        System.out.println("Unesite veci ceo broj:");  //kraj sume
        int n = sc.nextInt();
        int suma=0;
        for (int i=m; i<=n; i++){
            suma = suma +i;
        }
        System.out.println(suma);
    }
}
