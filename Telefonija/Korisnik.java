package Telefonija;


/*
Napisati klasu Korisnik koja ima slece atribute:
	- id (int) - jednoznacan automatski generisan celobrojan identifikator (int) (+3 poena)
	- ime (string)
	- prezime (string)
	- Broj (Broj)
	- istorijaUsluga (ArrayList<Usluga>) - niz koji sadrzi sve usluge(poruke i pozive) koje je korisnik inicirao
Napisati
	- konstruktor(ime prezime broj polja obavezna, niz inicijalno prazan)
	- getter i setter metode (istorijaUsluga nije moguce set-ovati, samo getovati)
	- toString metodu, format je
		ime prezime broj
		Istorija usluga:
		<usluga>
		<usluga>
		....
		npr

		Zoran Milicevic +381 63 1234567
		Istorija usluga:
		+381 63 1234567 -> +381 63 4567123 Cao Strahinja!
		+381 63 1234567 -> +381 63 4567123 2:34

 */

import java.util.ArrayList;

public class Korisnik {
    private int id;
    private static int brojac = 1;
    private String ime;
    private String prezime;
    private Broj broj;
    ArrayList<Usluga> istorijaUsluga = new ArrayList<>();

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        id = brojac;
        brojac++;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(broj.toString()).append("\n");
        sb.append("Istorija usluga: \n");
        for (Usluga usluga : istorijaUsluga) {
            sb.append(usluga).append("\n");
        }
        return sb.toString();
    }

    /*
    - napisati metodu posaljiPoruku, koja prima broj na koji treba posalti poruku i tekst poruke. Metoda kreira poruku i stavlja je u niz istorija usluga.
	- napisati metodu pozovi, koja prima broj koji treba pozvati i trajanje poziva u sekundama. Metoda kreira poziv i stavlja ga u niz istorija usluga.
	- napisati metodu cenaSvihUsluga koja vraca ukupnu cenu svih usluga (double) koje je korisnik obavio, tako sto prodje kroz
	 niz istorija usluga i sumira cene svih usluga koje se nalaze u tom nizu
     */

    public void posaljiPoruku(Broj b, String txt){
        Poruka p = new Poruka(broj, b, txt);
        istorijaUsluga.add(p);
    }

    public void pozivi(Broj br, int trajanje){
        Poziv p = new Poziv(broj, br, trajanje);
        istorijaUsluga.add(p);
    }
    public double cenaSvihUsluga(){
        double cena = 0;
        for (Usluga usluga : istorijaUsluga) {
            cena += usluga.cenaUsluge();
        }
        return cena;
    }
}
