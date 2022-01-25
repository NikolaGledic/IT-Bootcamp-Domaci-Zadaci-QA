package DomaciZadaci.Nedelja6;

public class LoopInLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Week: " + (i+1));
            for (int j = 0; j < 7; j++) {
                System.out.println("Day: " + (j+1));

            }
        }
    }
}
