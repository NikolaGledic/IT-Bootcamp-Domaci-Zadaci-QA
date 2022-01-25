package DomaciZadaci.Skola;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }
    public void upisUcenika (Ucenik u){     //metoda koja dodaje ucenika {u} u dnevnik.
        dnevnik.add(u);
    }
    public void upisUcenika (Ucenik u, int redniBroj){ //metoda koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
        dnevnik.add(redniBroj, u);
    }
    public void ispisUcenika(Ucenik u){     //metoda koja brise ucenika {u} iz dnevnika
        dnevnik.remove(u);
    }
    public void ispisUcenika(int redniBroj){      //metoda koja brise ucenika na poziciji {i} u dnevniku
        dnevnik.remove(redniBroj);
    }
    public void pogledajOcene (Ucenik u){       //metod koja ispisuje sve ocene ucenika {u}.
        int redniBroj;
        redniBroj = dnevnik.indexOf(u);
        System.out.println(dnevnik.get(redniBroj));
        }
    public void pogledajOcene (int i){      //metod koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
        System.out.println(dnevnik.get(i));
        }
    public double prosecnaOcena(Ucenik u){  //metod koja ispisuje prosecnu ocenu ucenika {u}.
        return u.prosek();
    }
    public double prosecnaOcena(int i){     //metod koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
        Ucenik u = dnevnik.get(i);
        return u.prosek();
    }
    public double prosecnaOcenaOdeljenja(){     //metod koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
        double prosecnaOcena = 0;
        if (dnevnik.isEmpty()){
            return prosecnaOcena;
        }
        else {

        for (Ucenik ucenik : dnevnik) {
            prosecnaOcena += ucenik.prosek();
        }
        return prosecnaOcena/dnevnik.size();
        }
    }
    public void opisnaOcena(Ucenik u){
        for (Integer ocena : u.getOcene()) {
            if (ocena == 1){
                System.out.println("Nedovoljan");
                break;
        }
        }
        if (u.prosek()>4.5){
            System.out.println("Odlican");
        }
        else if (u.prosek()>3.5){
            System.out.println("Vrlo dobar");
        }
        else if (u.prosek()>2.5){
            System.out.println("Dobar");
        }
        else {
            System.out.println("Dovoljan");
        }

    }

    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik) {
           sb.append(ucenik) ;
        }
        return sb.toString();
    }
    public String velicinaOdeljenja(){
        StringBuilder sb = new StringBuilder();
        if (dnevnik.size() > 25){
            sb.append("Veliko odeljenje");
        }
        else if (dnevnik.size() > 15){
            sb.append("Srednje odeljenje");
        }
        else  {
            sb.append("Malo odeljenje");
        }
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" ima djake:\n");
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme()).append(" ").append(ucenik.getPrezime()).append("\n");
        }
        return sb.toString();
    }


    }


