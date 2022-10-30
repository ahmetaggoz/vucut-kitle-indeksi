package Giris;
import java.util.Scanner;
public class proje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy,kilo,index;
        System.out.print("Boyunuzu metre,santimetre cinsinden girin : ");
        boy = sc.nextDouble();
        System.out.print("Kilonuzu girin : ");
        kilo = sc.nextDouble();
        index = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz : " + index);

    }
}
