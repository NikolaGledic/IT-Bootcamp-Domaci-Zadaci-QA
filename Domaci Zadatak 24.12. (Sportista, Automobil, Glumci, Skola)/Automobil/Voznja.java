package DomaciZadaci.Automobil;

public class Voznja {
    public static void main(String[] args) {

        Osoba o1 = new Osoba("Pera","Detlic" , 1983, 55);
        Osoba o2 = new Osoba("Hromi","Daba" , 1960, 120);


        Automobil autoJedan = new Automobil("BMW", "X6", 1584688, o1);
        Automobil autoDva = new Automobil("Fiat", "Tippo", 1585518, o2);
        Automobil autoTri = new Automobil("BMW", "X6", 1584688);

        System.out.println(autoJedan);
        System.out.println(autoDva);
        System.out.println(autoTri);


    }
}
