package DomaciZadaci;

/*
42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
 */

public class Pastebin42 {
    public static void main(String[] args) {

        String[] nizImena = {"Ana" , "Nevena" , "Igor" , "Marko" , "Marija" , "Petar" , "Dana"};
        if (proveraImena(nizImena)){
            System.out.println("Ime postoji u nizu.");
        }
        else {
            System.out.println("Ime ne postoji u nizu");
        }
    }

    public static boolean proveraImena (String[] a) {
        boolean b = false;
        for (String imena : a) {
            if (imena.equals("Marija") || imena.equals("Petar")) {
                b = true;
                break;
            }
        }
        return b;
    }
}
