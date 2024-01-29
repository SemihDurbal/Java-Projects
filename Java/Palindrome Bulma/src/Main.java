import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Palindrome Kelime Oyunu");

        while(true){
            System.out.println("1. Oyuna Başlama\n2.Programı Kapat(q)");
            String process = scanner.nextLine();

            if(process.equals("1")){
                System.out.print("Kelime Girişi Yapınız : ");
                String word = scanner.nextLine();
                try {
                    if (word.isEmpty()) {
                        throw new RuntimeException();
                    } else if (word.startsWith("ğ") || word.startsWith("Ğ")) {
                        throw new RuntimeException();
                    }
                }
                catch(RuntimeException e){
                    System.out.println("Hatalı İşlem Girişi Yaptınız..." +
                            "\nProgram Sonlandırılıyor...");
                    return;
                }

                System.out.println("Kelimenin harf sayısı : " + word.length());
                for(int i = 0 ; i < (word.length()/2) ; i++){
                    if(word.charAt(i) != word.charAt((word.length()-(1+i)))){
                        System.out.println("Palindrom Kelime Değildir...\n Sonlandırılıyor.....");
                        return;
                    }
                }

                System.out.println(word+" kelimesi palindrom kelimedir.");
                return;
            }
            else if (process.equals("q")) {
                System.out.println("Programdan Çıkış Yapılıyor...");
                return;
            }
            else{
                System.out.println("Hatalı Giriş Yaptınız.\nTekrar Deneyiniz...\n");
            }

        }

    }
}