import java.util.Scanner;

public class OyunMekanizma {
static Scanner scanner = new Scanner(System.in);

    public int kullaniciGiris_X (){

        System.out.println("Oyun İçin Kordinatları Giriş Yapınız");
        System.out.println(" X -> ");
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;

    }

    public int kullaniciGiris_Y (){

        System.out.println(" Y -> ");
        int y = scanner.nextInt();
        scanner.nextLine();
        return y;

    }

}
