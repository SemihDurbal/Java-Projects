import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("*** Alan Hesaplama Uygulaması ***");

        while (true) {
            AnaMenu();
            String process = scanner.nextLine();
            if(process.equals("1")){
                System.out.print("Karenin Kenarını Giriş Yapınız : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                Kare kare = new Kare("Kare" , kenar);
                kare.alanhesaplama();
            }
            if(process.equals("2")){
                System.out.print("Dairenin Yaricapini Giris Yapiniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Daire daire = new Daire("Daire" , yaricap);
                daire.alanhesaplama();
            }
            if(process.equals("3")){
                int[] kenar = new int[3];
                System.out.println("Ucgenin Kenarlarınını Giris Yapınız : ");
                for(int i = 0 ; i < 3 ; i++){
                    System.out.print("kenar " + i+1 + " : ");
                    kenar[i] = scanner.nextInt();
                    scanner.nextLine();
                }
                Ucgen ucgen = new Ucgen("Ucgen" , kenar);
                ucgen.alanhesaplama();
            }
            if(process.equals("4")){
                System.out.println("Dikdortgenin kenarlarını giris yapınız :");
                System.out.print("1.kenar :");
                int kenar1 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("2.kenar :");
                int kenar2 = scanner.nextInt();
                scanner.nextLine();
                Dikdortgen dikdortgen = new Dikdortgen("Dikdörtgen" , kenar1 , kenar2);
                dikdortgen.alanhesaplama();
            }
            if(process.equals("q")){
                System.out.println("Programdan Çıkış Yapılıyor...");
                break;
            }
        }

    }

    public static void AnaMenu() {
        System.out.print("Alanını hesaplamak istediğiniz sekli seçiniz : " +
                "\n1.Kare\n2.Daire\n3.Ucgen\n4.Dikdortgen\n(q) Cikis\nIslem :");
    }
}