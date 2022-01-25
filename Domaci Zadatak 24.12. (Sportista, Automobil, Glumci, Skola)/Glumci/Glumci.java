package DomaciZadaci.Glumci;

public class Glumci {
/*
Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i da li je iz Srbije odgovorite preko booleana.
Sve potrebno za glumca i glumicu da budu dva ispisa
 */

    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean izSrbije;

    public Glumci (String ime, String prezime, char pol, int godine, double ocena, boolean izSrbije){
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.izSrbije = izSrbije;

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

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean isIzSrbije() {
        return izSrbije;
    }

    public void setIzSrbije(boolean izSrbije) {
        this.izSrbije = izSrbije;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (pol == 'm' ) {
            sb.append("Glumac ").append(ime).append(" ").append(prezime)
                    .append(" ima ").append(godine).append(" godina. \n")
                    .append("Ocena mu je: ").append(ocena).append("\n");
                    if (izSrbije){
                        sb.append("Glumac je poreklom iz Srbije. \n");
                    }
                    else {
                        sb.append("Glumac nije iz Srbije. \n");
                    }
        }
        else if (pol == 'z'){
            sb.append("Glumica ").append(ime).append(" ").append(prezime)
                    .append(" ima ").append(godine).append(" godina. \n")
                    .append("Ocena joj je: ").append(ocena).append("\n");
            if (izSrbije){
                sb.append("Glumica je poreklom iz Srbije. \n");
            }
            else {
                sb.append("Glumica nije iz Srbije. \n");
            }
        }

        return sb.toString();
    }

}
