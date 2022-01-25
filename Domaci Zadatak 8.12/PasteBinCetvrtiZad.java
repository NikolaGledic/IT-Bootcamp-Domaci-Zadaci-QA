package DomaciZadaci;
/*
4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.
 */

import java.util.Scanner;

public class PasteBinCetvrtiZad {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite negativan ceo beoj: ");
        int n = sc.nextInt();
        for (int i=n; i<=0; i++){
            System.out.println(i);
        }

    }
}
