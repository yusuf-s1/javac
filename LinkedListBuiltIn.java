package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem;
        char x = 'y';

        List<Integer> numbersList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            numbersList.add(i + 1);
        }
        System.out.println("Bagli Liste");
        System.out.println(numbersList);
        System.out.println("1- Sayi Ekle: ");
        System.out.println("2- Sayi Ara: ");
        System.out.println("3- Sayi Sil: ");
        System.out.println("4- Liste Bos mu?: ");
        System.out.println("Yapmak istediginiz islemi seciniz: ");
        islem = scan.nextInt();
        while (x == 'y') {
            switch (islem) {
                case 1:
                    System.out.println("Eklemek istediginiz sayiyi giriniz: ");
                    int sayi = scan.nextInt();
                    numbersList.add(0, sayi);
                    System.out.println("Sayi eklendi. Liste: ");
                    System.out.println(numbersList);
                    break;
                case 2:
                    System.out.println("Aramak istediginiz sayiyi giriniz: ");
                    int sayi1 = scan.nextInt();
                    int index = numbersList.indexOf(sayi1);
                    System.out.println("Sayi " + (index + 1) + ". sayidir. Liste: ");
                    System.out.println(numbersList);
                    break;
                case 3:
                    System.out.println("Silmek istediginiz sayiyi giriniz:  (sira sayisina gore siler)");
                    int sayi2 = scan.nextInt();
                    numbersList.remove(sayi2 - 1);
                    System.out.println("Sayi silindi. Liste: ");
                    System.out.println(numbersList);
                    break;
                case 4:
                    if (numbersList.isEmpty()) {
                        System.out.println("Liste bos. Sayi eklemek icin 1. isleme gidiniz.");
                    } else {
                        System.out.println("Liste bos degil. Liste elemanlari: ");
                        System.out.println(numbersList);
                    }
                    break;
                default:
                    System.out.println("Bir hata olustu 'y' tusuna basarak tekrar deneyiniz.");
                    break;
            }
            System.out.println("\nDevam etmek ister misiniz?(y/n)");
            x = scan.next().charAt(0);
            if(x == 'y') {
                System.out.println("İslem seciniz: ");
                islem = scan.nextInt();
            }
        }
    }
}
