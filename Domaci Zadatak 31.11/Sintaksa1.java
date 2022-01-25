/*
Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
 tako sto se ivice prostorije ucitavaju preko konzole.
(za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
 */
import java.util.Scanner;
public class Sintaksa1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in); //Pravimo scanner za unos podataka
        int povrsina;
        System.out.println("Unesite duzinu okrecene prostorije u cm ");
        int duzina=s.nextInt();
        System.out.println("Unesite sirinu okrecene prostorije u cm ");
        int sirina=s.nextInt();
        System.out.println("Unesite visinu okrecene prostorije u cm ");
        int visina=s.nextInt();
        povrsina = (2*(duzina*visina))+(2*(sirina*visina)); // formula za izracunavanje
        System.out.println("Povrsina okrecene prostorije je " + povrsina + "cm^2");
    }
}
