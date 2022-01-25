package Telefonija;

/*
Napisati klasu Poziv. Poziv je Usluga koja ima sledece dodatne atribute:
	- trajanje u sekndama (int)
Napisati:
	- konstruktor
	- gettere i settere
	- toString metodu, format je
		brojOd -> brojKa <trajanje u formatu minuti:sekunde>
		npr
		+381 63 1234567 -> +381 62 234123 2:31
	- nadjacati metodu cena usluge. Metoda vraca kolika je cena razgovora koji je inicirao brojOd ka brojKa.

 */

public class Poziv extends Usluga {

    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(brojOd).append(" --> ");
        sb.append(brojKa).append(" ");
        sb.append(trajanjeUSekundama / 60).append(" : ").append(trajanjeUSekundama % 60);
        return sb.toString();
    }
/*
Cena razgovora ukoliko ga je moguce obaviti je 10 dinara za svaki zapoceti minut (npr ako je trajanje u sekundama 122, to je 2 minuta i 2 sekunde, odnosno 2 cela minuta i zapocet treci, cena je 3*10=30 dinara). Ukoliko nije moguce obaviti poziv cena je 0 dinara.
	Poziv je moguce obaviti ako
		- brojOd nije jednak null
		- brojKa nije jednak null i
		- brojOd i brojKa nisu jednaki medjusobno
 */

    @Override
    public double cenaUsluge() {
        int minuti = trajanjeUSekundama / 60;

        if (brojOd != null || brojKa != null || brojOd.equals(brojKa)){
            if (trajanjeUSekundama % 60 == 0){
                return minuti * 10;
            }
            else {
                return  (minuti * 10) + 10;
            }

        }
        else {
            return 0;
        }
    }
}
