package DomaciZadaci.Sport;

public class Sportista {
    private String ime;
    private String prezime;
    private String sport;
    private String klub;
    private int brojNaDresu;

    public Sportista(String ime, String prezime, String sport, String klub, int brojNaDresu) {
        this.ime = ime;
        this.prezime = prezime;
        this.sport = sport;
        this.klub = klub;
        this.brojNaDresu = brojNaDresu;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }
}
