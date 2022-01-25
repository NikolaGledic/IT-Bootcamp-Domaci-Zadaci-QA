package DomaciZadaci;

/*
3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
 */
import java.util.Scanner;

public class PasteBinTreciZad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo beoj: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }

    }
}
