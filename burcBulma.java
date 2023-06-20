import java.awt.*;
import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {

        int mounth, day;

        Scanner imp = new Scanner(System.in);

        System.out.println("Doğduğunuz ay : ");
        mounth = imp.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = imp.nextInt();


        String burc = "";

        if ((mounth == 3 && day >= 21) || (mounth == 4 && day <= 20)) {
            burc = "koç";
        } else if ((mounth == 4 && day >= 21) || (mounth == 5 && day <= 21)) {
            burc = "boğa";
        } else if ((mounth == 5 && day >= 22) || (mounth == 6 && day <= 22)) {
            burc = "ikizler";
        } else if ((mounth == 6 && day >= 23) || (mounth == 7 && day <= 22)) {
            burc = "yengeç";
        } else if ((mounth == 7 && day >= 23) || (mounth == 8 && day <= 22)) {
            burc = "aslan";
        } else if ((mounth == 8 && day >= 23) || (mounth == 9 && day <= 22)) {
            burc = "başak";
        } else if ((mounth == 9 && day >= 23) || (mounth == 10 && day <= 22)) {
            burc = "terazi";
        } else if ((mounth == 10 && day >= 23) || (mounth == 11 && day <= 21)) {
            burc = "akrep";
        } else if ((mounth == 11 && day >= 22) || (mounth == 12 && day <= 21)) {
            burc = "yay";
        } else if ((mounth == 12 && day >= 22) || (mounth == 1 && day <= 21)) {
            burc = "oğlak";
        } else if ((mounth == 1 && day >= 22) || (mounth == 2 && day <= 19)) {
            burc = "kova";
        } else if ((mounth == 2 && day >= 20) || (mounth == 3 && day <= 20)) {
            burc = "balık";
        }
        System.out.println("Burcunuz : " + burc);
    }
}
