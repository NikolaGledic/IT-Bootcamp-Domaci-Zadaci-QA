package DomaciZadaci;

/*
Na standardni ulaz se unose dva cela broja.Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku,
 proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.
*/

import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite ceo broj: ");
        int prviBroj= sc.nextInt();
        System.out.println("Unesite ceo broj: ");
        int drugiBroj = sc.nextInt();
        int sabiranje = prviBroj + drugiBroj;
        int oduzimanje = prviBroj - drugiBroj;
        int mnozenje = prviBroj * drugiBroj;
        int deljenje = prviBroj / drugiBroj;
        int moduo = prviBroj % drugiBroj;
        System.out.println(sabiranje);
        System.out.println(oduzimanje);
        System.out.println(mnozenje);
        System.out.println(deljenje);
        System.out.println(moduo);

    }
}
