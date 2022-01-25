package Telefonija;

/*
Napisati test program (main metodu), u kojoj je potrebno
	- napraviti 2 broja
	- i dva korisnika sa tim brojevima
	- zatim korinisci jedan drugom treba da salju neke poruke i obavljaju neke pozive (min 3 poruke i 2 poziva)
	- zatim treba ispisati oba korisnika
	- zatim treba ispisati kolika je cena svih usluga za svakog korisnika.
 */

public class Test {
    public static void main(String[] args) {

        Broj br1 = new Broj("381", "66","1111111",false);
        Broj br2 = new Broj("381", "64","11111222",false);
        Korisnik k1 = new Korisnik("Marko", "Makrovic",br1);
        Korisnik k2 = new Korisnik("Darko", "Makrovic",br2);
        k1.posaljiPoruku(br2, "Pozzz");
        k2.posaljiPoruku(br2, "Pozzz111");
        k2.posaljiPoruku(br1, "Pozzz222");
        k1.pozivi(br1, 22);
        k1.pozivi(br2, 85);
        System.out.println(k1);
        System.out.println(k1.cenaSvihUsluga());
        System.out.println(k2);
        System.out.println(k2.cenaSvihUsluga());

    }
}
