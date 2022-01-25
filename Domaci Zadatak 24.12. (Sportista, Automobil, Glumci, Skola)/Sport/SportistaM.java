package DomaciZadaci.Sport;

import java.util.Scanner;

public class SportistaM {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Unesite ime sportiste: ");
        String ime1 = sc.next();
        System.out.println("Unesite prezime sportiste: ");
        String prezime1 = sc.next();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport1 = sc.next();
        System.out.println("Unesite klub u kojem igra: ");
        String klub1 = sc.next();
        System.out.println("Unesite broj sa dresa: ");
        int broj1 = sc.nextInt();
        Sportista brojJedan = new Sportista(ime1, prezime1, sport1, klub1, broj1);

        System.out.println("Unesite ime sportiste: ");
        String ime2 = sc.next();
        System.out.println("Unesite prezime sportiste: ");
        String prezime2 = sc.next();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport2 = sc.next();
        System.out.println("Unesite klub u kojem igra: ");
        String klub2 = sc.next();
        System.out.println("Unesite broj sa dresa: ");
        int broj2 = sc.nextInt();
        Sportista brojDva = new Sportista(ime2, prezime2, sport2, klub2, broj2);

        System.out.println("Unesite ime sportiste: ");
        String ime3 = sc.next();
        System.out.println("Unesite prezime sportiste: ");
        String prezime3 = sc.next();
        System.out.println("Unesite sport kojim se bavi: ");
        String sport3 = sc.next();
        System.out.println("Unesite klub u kojem igra: ");
        String klub3 = sc.next();
        System.out.println("Unesite broj sa dresa: ");
        int broj3 = sc.nextInt();
        Sportista brojTri = new Sportista(ime3, prezime3, sport3, klub3, broj3);

        System.out.println(brojJedan.getIme());
        System.out.println(brojJedan.getPrezime());
        System.out.println(brojJedan.getSport());
        System.out.println(brojJedan.getKlub());
        System.out.println(brojJedan.getBrojNaDresu());
        System.out.println();
        System.out.println(brojDva.getIme());
        System.out.println(brojDva.getPrezime());
        System.out.println(brojDva.getSport());
        System.out.println(brojDva.getKlub());
        System.out.println(brojDva.getBrojNaDresu());
        System.out.println();
        System.out.println(brojTri.getIme());
        System.out.println(brojTri.getPrezime());
        System.out.println(brojTri.getSport());
        System.out.println(brojTri.getKlub());
        System.out.println(brojTri.getBrojNaDresu());

    }

}
