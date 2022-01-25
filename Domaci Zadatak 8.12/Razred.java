package DomaciZadaci;
/*
8.Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
"Dobrodosao u {x}. razred, {ime} {prezime}", pod pretpostavkom da je trenutna godina 2021.
Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
 */

import java.util.Scanner;

public class Razred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.next();
        System.out.println("Unesite prezime: ");
        String prezime = sc.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godRodjenja= sc.nextInt();
        int godina =2021-godRodjenja ;
        if (godina>=7 && godina <=20) {
            int i = godina - 6;         //ubacio sam promenjivu i da bi racunala u koji razred korisnik ide
            System.out.println("Dobrodosao u " + i + " razred, " + ime + " "+ prezime);
        }
        else if (godina<7){
            System.out.println( ime + " "+ prezime + " tek treba da zapocne obrazovanje.");
        }
        else {
            System.out.println(ime + " " + prezime + " je zavrsio skolu.");
        }
    }
}
