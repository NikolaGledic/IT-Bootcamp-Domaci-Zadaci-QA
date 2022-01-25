package Telefonija;

public class Broj {

    private String drzava;
    private String pozivniBroj;
    private String broj;
    private boolean fixniBroj;

    public Broj(String drzava, String pozivniBroj, String broj, boolean fixniBroj) {
        this.fixniBroj = fixniBroj;
        this.drzava = drzava;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isFixniBroj() {
        return fixniBroj;
    }

    public void setFixniBroj(boolean fixniBroj) {
        this.fixniBroj = fixniBroj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(drzava).append(" ");
        sb.append(pozivniBroj).append(" ");
        sb.append(broj).append("\n");
        return sb.toString();
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String br){
        boolean sadrzi = true;
        char promenjiva;
        for (int i = 0; i < br.length(); i++) {
            promenjiva = br.charAt(i);
            if (!Character.isDigit(promenjiva)){
                sadrzi = false;
                break;
            }
        }
        return sadrzi;
    }

    /*
    - napisati privatnu staticku metodu proveriBroj koja prima kod drzave, pozivni broj i broj i proverava da li su validni.
		- Kod drzave ne sme biti null i
		- mora sadrzati tacno 3 karaktera (odnosno biti duzine 3),
		- svi karakteri u kodu drzave moraju biti numerici (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
		- Pozivni broj ne sme biti null i
		- mora sadrzati tacno 2 karaktera (odnosno biti duzine 2), i
	 	- svi karakteri u pozivnom broju moraju biti numerici. (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)
		- Broj ne sme biti null i
		- mora sadrzati 7 ili 8 karaktera, i
		- svi karakteri u broju moraju biti numerici.  (za ovu proveru pozvati prethodno napisanu staticku metodu proveriDaLiStringSadrziSamoNumerike)

		Metoda vraca vrednost tipa boolean (true ako su SVI gore navedeni uslovi zadovoljeni, false ako BAREM JEDAN nije)
	- u konstruktoru i setter metodama u slucaju da je neka vrednost nevalidna:
		- ispisati poruku o gresci ili
		- baciti ArithmeticException izuzetak (+5 poena)
     */

    private static boolean proveriBroj(String kod, String pozivniBroj, String broj){
        boolean provera = true;
        if (kod == null || kod.length() == 3 || !proveriDaLiStringSadrziSamoNumerike(kod)){
            provera = false;
        }
        else if (pozivniBroj == null || pozivniBroj.length() == 2 || !proveriDaLiStringSadrziSamoNumerike(pozivniBroj)){
            provera = false;
        }
        else if (broj == null || !proveriDaLiStringSadrziSamoNumerike(broj) || (broj.length()>8 && broj.length()<7)){
            provera = false;
        }
        return provera;
    }
}
