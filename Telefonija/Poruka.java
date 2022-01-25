package Telefonija;

/*
Napisati klasu Poruka. Poruka je Usluga koja ima sledece dodatne atribute:
	- tekstPoruke (String)
Napisati:
	- konstruktor
	- gettere i  settere
	- toString metodu, format je
		brojOd -> brojKa tekstPoruke
		npr
		+381 63 1234567 -> +381 62 234123 Cao :).
	- nadjacati metodu cena usluge. Metoda vraca koliko je cena slanja poruke sa brojOd na brojKa.
	Cena poruke ukoliko ju je moguce poslati je 3 dinara, ukoliko je nije moguce poslati cena je 0 dinara.

 */

public class Poruka extends Usluga{

    private String textPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String textPoruke) {
        super(brojOd, brojKa);
        this.textPoruke = textPoruke;
    }

    public String getTextPoruke() {
        return textPoruke;
    }

    public void setTextPoruke(String textPoruke) {
        this.textPoruke = textPoruke;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd).append(" --> ");
        sb.append(brojKa).append(" ").append(textPoruke);
        return sb.toString();
    }

    /*
    Poruku je moguce poslati ako
		- brojOd nije jednak null
		- brojKa nije jednak null i
		- brojOd i brojKa nisu jednaki medjusobno i
		- brojOd nije fiksni broj i
		- brojKa nije fiksni broj
     */

    @Override
    public double cenaUsluge() {
        if ( brojKa != null && brojOd != null && brojOd.equals(brojKa) && !brojKa.isFixniBroj() && !brojOd.isFixniBroj() ){
            return 3;
        }
        else {
            return 0;
        }

    }
}
