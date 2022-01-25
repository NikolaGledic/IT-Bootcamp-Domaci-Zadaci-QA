
/*Grananja1: Napisati program koji proverava da li je uneti broj paran.
 Ukoliko jeste, program treba da ispise poruku: Broj je paran!
 Ukoliko nije, program treba da ispise poruku: Broj je neparan!
 */
import java.util.Scanner;
public class Grananja1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      //Pravimo scanner za unos podataka
        System.out.println("Unesite broj za proveru ");
        int br = s.nextInt();    // Kreiramo promenjivu koju ce korisnik uneti
        if (br % 2 == 0) {       //proveravamo da li je broj paran
            System.out.println("Broj je paran!");
        } else {
            System.out.println("Broj je neparan!");
        }
    }
}
