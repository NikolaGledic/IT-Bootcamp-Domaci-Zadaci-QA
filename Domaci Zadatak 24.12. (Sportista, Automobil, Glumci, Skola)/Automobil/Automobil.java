package DomaciZadaci.Automobil;


/*
vozilo  - Napisati klasu Automobil. Automobil ima
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

 */
public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba vlasnik;

    public Automobil(String marka, String model, int serijskiBroj){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }
    public Automobil(String marka, String model, int serijskiBroj, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Marka automobila je: ").append(marka).append("\n");

        sb.append("Model je: ").append(model).append("\n");

        sb.append("Serijski broj vozila je: ").append(serijskiBroj).append("\n");

        if (vlasnik == null){
            sb.append("Vozilo nema vlasnika");
        }
        else {
            sb.append("Vlasnik je: ").append(vlasnik.getIme()).append(" ").append(vlasnik.getPrezime()).append("\n");
        }
        return sb.toString();
    }
}
