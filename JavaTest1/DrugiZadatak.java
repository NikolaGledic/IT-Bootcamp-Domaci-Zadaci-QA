package JavaTest1;

/*
//Napisati program koji racuna potrosnju goriva
//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
//Motor trosi 5 litara goriva na 100 kilometara,
//Automobil trosi 7 litara na 100 kilometara,
//Kombi trosi 11 litara na 100km,
//Kamion trosi 15 litara na 100km
//Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch

//Primeri ispisa u konzoli:
//Molim vas unesite tip vozila:
//Kombi
//Molim vas unesite distancu u kilometrima:
//134
//Kombi na 134.0 km potrosi 14.74 litara goriva
//Primer ispisa kad se unese pogresno vozilo

//Molim vas unesite tip vozila:
//Tenk
//Molim vas unesite distancu u kilometrima:
//133
//Uneli ste pogresan tip vozila
 */

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite distancu u km: ");
        double distanca = sc.nextDouble();
        System.out.println("Unesite tip vozila: ");
        String tipVozila = sc.next();
        double potrosnja ;
        switch (tipVozila) {
            case "Motor" :
                potrosnja = distanca * (5.0/100);
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Automobil" :
                potrosnja = distanca * (7.0/100);
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Kombi" :
                potrosnja = distanca * (11.0/100);
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnja + " litara goriva");
                break;
            case "Kamion" :
                potrosnja = distanca * (15.0/100);
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnja + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }
    }
}
