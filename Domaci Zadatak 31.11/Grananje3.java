/*
Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
(Vodite racuna o prestupnoj godini!)
 */
import java.util.Scanner;
public class Grananje3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite godinu: ");     //Uzimamo unos godine
        int godina = s.nextInt();
        System.out.println("Unesite mesec (mora biti broj) : ");        //Uzimamo unos meseca
        int mesec= s.nextInt();
        if (godina % 400 == 0) {        // prvi uslov za prestupnu godinu
            if (mesec==4 || mesec==6 || mesec==9 || mesec==11){     //meseci sa 30 dana
                System.out.println( mesec + " Mesec ima 30 dan");
            }
            else if (mesec == 2) {      // februar ima 29 dana svake prestupne godine
                System.out.println(mesec + " Mesec ima 29 dana");
            }
            else {
                System.out.println(mesec + "Mesec ima 31 dana");        //ostali meseci 31
            }
        }
        else if (godina % 100 != 0 && godina % 4 == 0) {        //drugi uslov za prestupnu godinu
            if (mesec==4 || mesec==6 || mesec==9 || mesec==11){
                System.out.println( mesec + " Mesec ima 30 dan");
            }
            else if (mesec == 2) {
                System.out.println(mesec + " Mesec ima 29 dana");
            }
            else {
                System.out.println(mesec + "Mesec ima 31 dana");
        }
        }
        else {      //ako godina nije prestupna onda je prosta
            if (mesec==4 || mesec==6 || mesec==9 || mesec==11){
                System.out.println( mesec + " Mesec ima 30 dan");
            }
            else if (mesec == 2) {
                System.out.println(mesec + " Mesec ima 28 dana");       //u prostoj godini februar ima 28 dana
            }
            else {
                System.out.println(mesec + "Mesec ima 31 dana");
            }


        }
    }
}

