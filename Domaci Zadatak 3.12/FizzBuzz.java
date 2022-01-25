package DomaciZadaci;

/*
Za uneti celobrojni nenegativan broj n,
ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3,
 nisku "Buzz" ako je on deljiv sa 5, a nisku "FizzBuzz" ako je on deljiv i sa 3 i sa 5.
*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Uneti broj: ");
        int broj = sc.nextInt();
        for (int i = 1 ; i<=broj; i++) { // pozivamo f-ju for da nam radi kao brojac da bi prosli kroz sve brojeve
            if (i % 5 == 0 && i % 3 == 0) {  // prvi uslov mora biti da je deljiv i sa 3 i sa 5
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {      //drugi uslov
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {      // treci uslov
                System.out.println("Buzz");
            }
            else {
                System.out.println();       // stampamo prazan red da bi dobili zeljenu formu konacnog ispisa
            }
        }
    }
}
