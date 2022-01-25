package DomaciZadaci.Automobil;



public class Osoba {
    String ime;
    String prezime;
    int godinaRodjenja;
    double visina;

    Osoba(String ime1, String prezime1, int godinaRodjenja1, double visina1 ){
        ime = ime1;
        prezime = prezime1;
        godinaRodjenja = godinaRodjenja1;
        visina = visina1;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public double getVisina() {
        return visina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
    public String toString(){
        /*String stringKojiVracamo;
        stringKojiVracamo = "Ime: " + ime + "\n";
        stringKojiVracamo += "Prezime: " + prezime + "\n";
        stringKojiVracamo += "Godina rodjenja: " + godinaRodjenja + "\n";
        stringKojiVracamo += "Visina: " + visina + "\n";
        return stringKojiVracamo;*/
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ").append(ime).append("\n");
        sb.append("Prezime: ").append(prezime).append("\n");
        sb.append("Godina rodjenja: ").append(godinaRodjenja).append("\n");
        sb.append("Visina: ").append(visina).append("\n");
        return sb.toString();
    }
}
