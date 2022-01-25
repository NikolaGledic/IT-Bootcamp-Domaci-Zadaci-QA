package DomaciZadaci.Skola;

import java.util.ArrayList;

public class Ucenik {
/*
Napisati klasu Ucenik koja ima sledeca polja:
	- String ime
	- String prezime
	- ArrayList ocene

Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
Napisati gettere i settere za sva polja.
Napisati toString() metod:
	{ime} i {prezime} ima ocene:
	{ocene}
Napisati metod proske koji racuna prosek Ucenika.
 */
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        for (Integer ocena : ocene) {
            if (ocena < 1 || ocena > 5){
                System.out.println("Uneli ste ne validnu ocenu");
            }
            else {
                this.ocene = ocene;
            }
        }

    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        ArrayList<Integer> ocene = new ArrayList<Integer>();
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

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        for (Integer ocena : ocene) {
            if (ocena < 1 || ocena > 5){
                System.out.println("Uneli ste ne validnu ocenu");
            }

            else {
                this.ocene = ocene;
            }
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(ime).append(" ").append(prezime).append(" ima ocene:\n");
        if (ocene.isEmpty()){
            sb.append("Ucenik nema ni jednu ocenu");
        }
        else {
            for (Integer ocena : ocene) {
                sb.append(ocena).append(" ");
            }
        }
        sb.append("\n");

        return sb.toString();
    }
    public double prosek (){
        double prosecnaOcena = 0;
        for (Integer ocena : ocene) {
            prosecnaOcena += ocena;
        }
        prosecnaOcena = 1.0 * prosecnaOcena / ocene.size();
        return prosecnaOcena;
    }
}
