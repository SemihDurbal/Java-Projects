import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main{
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        Queue<String> pideKuyrugu = new LinkedList<String>();
        pideKuyrugu.offer("Semih");
        pideKuyrugu.offer("Yağmur");
        pideKuyrugu.offer("Seda");
        pideKuyrugu.offer("Senanur");
        pideKuyrugu.offer("Nesrin");
        pideKuyrugu.offer("Ahmet");
        pideKuyrugu.offer("Emre");
        pideKuyrugu.offer("Yağız");
        pideKuyrugu.offer("Emo");
        pideKuyrugu.offer("Göko");

        System.out.println("Ramazan Pidesi Oyunu");

        while(true){
            System.out.println("1.Oyuna Başla\n2.Oyunu Kapat (q) ");
            String process = scanner.nextLine();
            if(process.equals("1")){
                System.out.println("Kaç Pide Yapılacağı Hesaplanıyor...");
                Thread.sleep(3000);
                int pideSayi = random.nextInt(10)+1;
                System.out.println(pideSayi + " adet pide yapılacak.");
                System.out.println("Kaç kişinin pide alacağı hesaplanıyor...");
                Thread.sleep(3000);
                for(int i = 0 ; i < pideSayi ; i++){
                    System.out.println(pideKuyrugu.poll() + " pidesini aldı ve kuyruktan çıkış yapıyor.");
                }
            }
            else if (process.equals("q")){
                System.out.println("Program Kapatılıyor...");
                break;
            }
            else{
                System.out.println("Hatalı Değer Girişi Yaptınız...");
            }
        }






    }
}