import java.util.Scanner;

class Node { //dugum
    public int data;
    public Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
    public void print() {
        System.out.print(data + " ");
    }
}

public class LinkedList { //bagli liste
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int key) { //ekleme
        Node newNode = new Node(key);
        newNode.next = head;
        head = newNode;
    }
    public Node search(int key) { //arama
        Node currentNode = head;
        while(currentNode.data != key) {
            if(currentNode.next == null) {
                return null;
            } else {
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

    public Node delete(int key) { //silme
        Node currentNode = head;
        Node prev = head;

        while(currentNode.data != key) {
            if(currentNode.next == null) {
                return null;
            } else {
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
        if(currentNode == head) {
            head = head.next;
        } else {
            prev.next = currentNode.next;
        }
        return currentNode;
    }

    public boolean isEmpty(LinkedList list) {
        Node currentNode = list.head;
        if(currentNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public void list() { //listele
        Node currentNode = head;
        while(currentNode!=null) {
            currentNode.print();
            currentNode=currentNode.next;
        }
    }



    //*********** main fonksiyon ************
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int islem;
        char x = 'y'; //cikis icin;

        LinkedList list = new LinkedList(); //yeni liste

        for (int i = 5; i > 0; i--) { //listeye eleman ekleme
            list.add(i);
        }

        System.out.println("Bagli liste");
        list.list(); //listeyi listele

        System.out.println("\n1- Sayi ekle");
        System.out.println("2- Sayi ara");
        System.out.println("3- Sayi sil");
        System.out.println("4- Liste bos mu?");

        System.out.println("\nYapmak istediginiz islemi seciniz: ");
        islem = input.nextInt();
        while(x == 'y') {
            switch (islem) {
                case 1:
                    System.out.println("Eklemek istediginiz sayiyi giriniz: ");
                    int sayi = input.nextInt();
                    list.add(sayi);
                    System.out.println("Sayi eklendi. Yeni Liste:");
                    list.list();
                    break;
                case 2:
                    System.out.println("Aramak istediginiz sayiyi giriniz: ");
                    int sayi1 = input.nextInt();
                    Node n = list.search(sayi1);
                    if (n == null) {
                        System.out.println(sayi1 + " bulunamadi. Liste: ");
                        list.list();
                    } else {
                        System.out.println(sayi1 + " bulundu! Liste: ");
                        list.list();
                    }
                    break;
                case 3:
                    System.out.println("Silmek istediginiz sayiyi giriniz: ");
                    int sayi2 = input.nextInt();
                    Node n1 = list.delete(sayi2);
                    if (n1 == null) {
                        System.out.println(sayi2 + " zaten listede yok. Liste: ");
                        list.list();
                    } else {
                        System.out.println(sayi2 + " slilindi. Yeni Liste: ");
                        list.list();
                    }
                    break;
                case 4:
                    if (list.isEmpty(list)) {
                        System.out.println("Liste bos.");
                    } else {
                        System.out.println("Liste dolu. Liste: ");
                        list.list();
                    }
                    break;
                default:
                    System.out.println("Bir hata olustu.");
                    break;
            }
            System.out.println("\nDevam etmek ister misiniz?(y/n)");
            x = input.next().charAt(0);
            if(x == 'y') {
                System.out.println("Islem seciniz: ");
                islem = input.nextInt();
            }
        }
    }

}
