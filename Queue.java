package Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem;
        char x = 'y';

        java.util.Queue<Integer> queue = new LinkedList<>(); //new queue
        for (int i = 0; i < 5; i++) {
            queue.add(i + 1);
        }
        System.out.println("Kuyruk:\n" + queue);
        System.out.println("1. Sayi ekle:");
        System.out.println("2. Sayi cikar:");
        System.out.println("3. Kuyrugun head i:");
        System.out.println("4. Kuyruk Bos mu?: ");
        System.out.println("Yapmak istediginiz islemi seciniz: ");
        islem = scan.nextInt();
        while(x == 'y') {
            switch (islem) {
                case 1:
                    System.out.println("Eklemek istediginiz sayiyi giriniz: ");
                    int eklenenSayi = scan.nextInt();
                    queue.add(eklenenSayi);
                    System.out.println(eklenenSayi + " kuyruga eklendi. Kuyruk: " + queue);
                    break;
                case 2:
                    int silinenSayi = queue.remove();
                    System.out.println(silinenSayi + " kuyruktan cikarildi. Kuyruk: " + queue);
                    break;
                case 3:
                    int head = queue.peek();
                    System.out.println(" Kuyrugun head i " + head + " Kuyruk " + queue);
                    break;
                case 4:
                    int sizeOfQueue = queue.size();
                    System.out.println("Kuyrukta " + sizeOfQueue + " eleman var. Kuyruk: " + queue);
                    break;
                default:
                    System.out.println("Bir hata olustu 'y' tusuna basarak tekrar deneyiniz.");
            }
            System.out.println("Devam etmek ister misiniz?(y/n)");
            x = scan.next().charAt(0);
            if(x == 'y') {
                System.out.println("Yapmak istediginiz islemi seciniz: ");
                islem = scan.nextInt();
            }
        }
    }
}
