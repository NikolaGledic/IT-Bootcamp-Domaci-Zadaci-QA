/*
Grananja2: Sintaksa1 uraditi ponovo,
 koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
 (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
 */

import java.util.Scanner;
public class Grananja2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);      //Pravimo scanner za unos podataka
        int povrsina;
        System.out.println("Unesite duzinu okrecene prostorije u cm ");
        int duzina=s.nextInt();
        System.out.println("Unesite sirinu okrecene prostorije u cm ");
        int sirina=s.nextInt();
        System.out.println("Unesite visinu okrecene prostorije u cm ");
        int visina=s.nextInt();
        if (sirina >0 && visina >0 && duzina>0) {       // uslov da sve tri dimenzije moraju biti pozitivne da bi se program izvsio
            povrsina = (2 * (duzina * visina)) + (2 * (sirina * visina));       // formula za izracunavanje
            System.out.println("Povrsina okrecene prostorije je " + povrsina + "cm^2");
        }
        else {      // ako nisu unete pozitivne dimenzije program ispisuje poruku
            System.out.println("Niste uneli validne dimenzije pokusajte ponovo");
        }
    }
}       // licno mi se vise svidja kako bi ovaj program radio sa while loop-om
