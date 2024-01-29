import java.util.Scanner;

public class Kontrol implements YurtDisiKurallari{
    static Scanner scanner = new Scanner(System.in);
    private int ucret;
    private String vize;
    private String sicil;
    public void harc_bedeli() {
            System.out.print("Lutfen Harc Bedelini Yatırın : ");
            setUcret(scanner.nextInt());
            scanner.nextLine();
            if (getUcret() < 15) {
                throw new ArithmeticException();
            } else {
                System.out.println("Harç Tutarı Yatırıldı");
            }
    }
    public void vize_durumu() {
        while(true) {
            System.out.print("Vizeniz Bulunuyor mu ? (Evet veya Hayır) : ");
            setVize(scanner.nextLine());
            if (getVize().contains("hayır")) {
                throw new RuntimeException();
            } else if (getVize().contains("evet")) {
                System.out.println("Vizeniz Onaylandı...");
                break;
            } else {
                System.out.println("Hatalı Değer Girdiniz...");
            }
        }
    }
    public void sicil_kaydi() {
        while(true) {
            System.out.print("Sicil kaydınız bulunuyor mu ? (Evet veya Hayır) : ");
            setSicil(scanner.nextLine());
            if (getSicil().contains("evet")) {
                throw new RuntimeException();
            } else if (getSicil().contains("hayır")) {
                System.out.println("Sicil Kaydınız Onaylandı...");
                break;
            } else {
                System.out.println("Hatalı Değer Girdiniz Tekrar Deneyiniz...");
            }
        }
    }
    public void kurallar_ekrani() {
        System.out.println("Kurallar : ");
        System.out.println("15 € harç bedelini ödemelisiniz !" +
                "\nAdli sicil kaydınız bulunmamalı !" +
                "\nVizeniz Bulunmalı !");
    }

    public int getUcret() {
        return ucret;
    }

    public String getVize() {
        return vize;
    }

    public String getSicil() {
        return sicil;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public void setVize(String vize) {
        this.vize = vize;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }
}
