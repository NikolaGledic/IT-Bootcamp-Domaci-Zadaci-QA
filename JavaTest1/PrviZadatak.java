package JavaTest1;

//Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
//niz je tipa int
//Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
//Primer ispisa resenja u konzoli:
//Najveci broj u nizu je 43

public class PrviZadatak {
    public static void main(String[] args) {
        int[] niz = { 3 , 5 , 4 , 11 , -1, 23, 5, 43, 0, 5};
        int maximum = niz[0];  // Uzimamo pretpostavku da je prvi element niza maksimum
        for (int i = 1; i < niz.length; i++ ) {
            if (maximum < niz[i]) {  //proveravamo da li je nasa pretpostavka tacna
                maximum = niz[i];      // ako nije dodeljujemo maksimumu novu vrednost
            }
        }
        System.out.println("Maksimum je: " + maximum);
    }

}
