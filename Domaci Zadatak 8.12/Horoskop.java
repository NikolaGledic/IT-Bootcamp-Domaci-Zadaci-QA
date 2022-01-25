package DomaciZadaci;

/*
7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.
 */

import java.util.Scanner;

public class Horoskop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Unesite mesec rodjenja (broj): ");
        int mesec = sc.nextInt();
        System.out.println("Unesite dan rodjenja: ");
        int dan = sc.nextInt();
        if ((mesec==1 && dan<=20) || (mesec == 12 && dan>=22 )) {
            System.out.println("Jarac");
        }
        else if ((mesec == 1 && dan>=21 ) || (mesec==2 && dan<= 19) ){
            System.out.println("Vodolija");
        }
        else if ((mesec == 2 && dan>= 20 ) || (mesec==3 && dan<= 20) ){
            System.out.println("Riba");
        }
        else if ((mesec == 3 && dan>=21 ) || (mesec==4 && dan<= 20) ){
            System.out.println("Ovan");
        }
        else if ((mesec == 4 && dan>=21 ) || (mesec==5 && dan<= 21) ){
            System.out.println("Bik");
        }
        else if ((mesec == 5 && dan>=22 ) || (mesec==6 && dan<= 21) ){
            System.out.println("Blizanci");
        }
        else if ((mesec == 6 && dan>=22 ) || (mesec==7 && dan<= 22) ){
            System.out.println("Rak");
        }
        else if ((mesec == 7 && dan>=23 ) || (mesec==8 && dan<= 22) ){
            System.out.println("Lav");
        }
        else if ((mesec == 8 && dan>=23 ) || (mesec==9 && dan<= 22) ){
            System.out.println("Devica");
        }
        else if ((mesec == 9 && dan>=23 ) || (mesec==10 && dan<= 23) ){
            System.out.println("Vaga");
        }
        else if ((mesec == 10 && dan>=24 ) || (mesec==11 && dan<= 22) ){
            System.out.println("Skorpija");
        }
        else if ((mesec == 11 && dan>=23 ) || (mesec==12 && dan<= 21) ){
            System.out.println("Strelac");
        }


    }
}
