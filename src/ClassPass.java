
import java.util.Scanner;

public class ClassPass {
    public static void main(String[] args) {
        double mat, fiz, türk, kim, müzik, total = 0, lessonCounter = 0, Average;
        int i;


        Scanner input = new Scanner(System.in);

        System.out.print("Matemaitk notununuz=");
        mat = input.nextInt();
        if (mat <= 0 || mat >= 100) {
            System.out.println("lutfen gecerli bir sayı giriniz!!!");
        } else {
            total += mat;
            lessonCounter++;
        }
        System.out.print("Fizik notununuz=");
        fiz = input.nextInt();
        if (fiz <= 0 || fiz >= 100) {
            System.out.println("lutfen gecerli bir sayı giriniz!!!");
        } else {
            total += fiz;
            lessonCounter++;
        }
        System.out.print("Turkce notununuz=");
        türk = input.nextInt();
        if (türk <= 0 || türk >= 100) {
            System.out.println("lutfen gecerli bir sayı giriniz!!!");
        }else {
            total +=türk;
            lessonCounter++;
        }

        System.out.print("Kimya notununuz=");
        kim = input.nextInt();
        if(kim<=0 || kim>=100){
            System.out.println("lutfen gecerli bir sayı giriniz!!!");
        }else {
            total +=kim;
            lessonCounter++;
        }
        System.out.print("Muzik notununuz=");
        müzik = input.nextInt();
        if(müzik<0 || müzik>100) {
            System.out.println("lutfen gecerli bir sayı giriniz!!!");
        }else {
            total +=müzik;
            lessonCounter++;
        }

        Average = total/ lessonCounter;


        System.out.println("ortalamaniz =" + Average);

        System.out.println("sinif gecme durumunuzu ogrenmek istiyor musunuz \n1-Evet \n2-Hayir");
        i = input.nextInt();

        switch (i) {
            case 1:
                if (Average >= 55) {
                    System.out.println("sinifi gectiniz,tebrikler");
                } else {
                    System.out.println("sinifta kaldiniz,uzgunuz");
                }
                break;
            case 2:
                System.out.println("iyi sen bilirsin");
                break;
        }


    }
}
