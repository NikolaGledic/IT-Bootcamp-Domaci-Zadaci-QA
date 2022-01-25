package DomaciZadaci.Glumci;

public class TestGlumci {
    public static void main(String[] args) {


        Glumci nikolaDjuricko = new Glumci("Nikola", "Djuricko", 'm', 47, 8.8, true);
        Glumci miraBanjac = new Glumci("Mira", "Banjac", 'z', 92, 9.2, true);
        Glumci hughLaurie = new Glumci("Hugh", "Laurie", 'm', 62, 8.9, false);

        System.out.println(nikolaDjuricko);
        System.out.println(miraBanjac);
        System.out.println(hughLaurie);
    }
}
