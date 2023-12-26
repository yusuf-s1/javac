package Stack;

import java.util.Scanner;

public class Stack {


    static void stack_pop(java.util.Stack<Integer> stack)
    {
        if(stack.isEmpty()) {
            return;
        }
        int x = stack.peek();
        stack.pop();
        System.out.println(x);
        stack_pop(stack);
        stack.push(x);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int islem;
        char x = 'y';
        java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }
        System.out.println("Stack: ");
        stack_pop(stack);
        System.out.println("1. Sayi ekle:");
        System.out.println("2. Sayi bul:");
        System.out.println("3. Sayi cikar");
        System.out.println("4. Yiginda en ustteki sayi");
        System.out.println("5. Yigin dolu mu?:");
        System.out.println("Yapmak istediginiz islemi seciniz:");
        islem = scan.nextInt();
        while (x == 'y') {
            switch (islem) {
                case 1:
                    System.out.println("Eklemek istediginiz sayiyi giriniz: ");
                    int eklenenSayi = scan.nextInt();
                    stack.push(eklenenSayi);
                    System.out.println(eklenenSayi + " yigina eklendi. Yigin: ");
                    stack_pop(stack);
                    break;
                case 2:
                    System.out.println("Aramak istediginiz sayiyi giriniz: ");
                    int arananSayi = scan.nextInt();
                    int pos = (Integer) stack.search(arananSayi);
                    if(pos == -1) {
                        System.out.println("Sayi yıgında bulunamadi: Yigin: ");
                        stack_pop(stack);
                    } else {
                        System.out.println(arananSayi + " sayisi " + pos + ". sayidir.");
                    }
                    break;
                case 3:
                    int silinenSayi = stack.pop();
                    System.out.println(silinenSayi + " yıgından cikarildi. Yigin: ");
                    stack_pop(stack);
                    break;
                case 4:
                    int head = stack.peek();
                    System.out.println("Yiginin tepesinde " + head + " sayisi var. Yıgın: ");
                    stack_pop(stack);
                    break;
                case 5:
                    int size = stack.size();
                    if(size != 0) {
                        System.out.println("Yigin dolu. Yigin: ");
                        stack_pop(stack);
                    } else {
                        System.out.println("Yigin bos. Sayi eklemek icin 1. adima gidiniz.");
                    }
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
