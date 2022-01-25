package DomaciZadaci.Nedelja6;

import java.util.ArrayList;

public class ArreyLista {
    public static void main(String[] args) {
        ArrayList<String> Sport = new ArrayList<String>();   //Kreirajte array listu nekog vaseg interesovanje (npr sport)

        Sport.add("Basket");                       //u listu dodajte vase omiljene iteme tog hobija
        Sport.add("Americki fudbal");
        Sport.add("Fudbal");
        Sport.add("MMA");
        Sport.add("Boks");
        Sport.add("Tenis");
        System.out.println(Sport.get(2));         //iz liste dohvatite 3. element liste i ispisite
        Sport.set(0,"Kosarka");                   //promenite naziv prvog elementa
        Sport.remove(4);                    //uklonite 5. element

        System.out.println(Sport.size());       //ispisite velicinu vase liste

        for (int i = 0; i < Sport.size(); i++) {        //pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste
            System.out.println(Sport.get(i));
        }
        for (String s : Sport) {
            System.out.println(s);
        }

    }
}
