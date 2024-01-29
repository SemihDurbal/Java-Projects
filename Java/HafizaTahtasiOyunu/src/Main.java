import java.util.Objects;
import java.util.Scanner;

public class Main{
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***Hafıza Tahtası Oyununa Hoş Geldiniz***");
            while(true) {
                System.out.print("Yapmak İstediğiniz İşlemi Seçiniz = " +
                        "\n1) Oyuna Giriş" +
                        "\n2) Oyun Hakkında" +
                        "\n3) Çıkış(q)" +
                        "\nİşleminiz -> ");
                String process = scanner.nextLine();
                if(process.equals("1")){
                    while(true){
                        OyunMekanizma oyunMekanizma = new OyunMekanizma();
                        OyunTahtasi oyunTahtasi = new OyunTahtasi();
                        KullaniciTahtasi kullaniciTahtasi = new KullaniciTahtasi();
                        int x = oyunMekanizma.kullaniciGiris_X();
                        int y = oyunMekanizma.kullaniciGiris_Y();
                        for(int i = 0 ; i < 4 ; i++){
                            for(int j = 0 ; j < 4 ; j++){
                                if(i == x && j == y){
                                    System.out.print("|"+oyunTahtasi.oyunTahtasi(x,y)+"| ");
                                }
                                else{
                                    System.out.print("| | ");
                                }
                            }
                            System.out.print("\n");
                            System.out.println("--------------");
                        }

                        int yeni_x = oyunMekanizma.kullaniciGiris_X();
                        int yeni_y = oyunMekanizma.kullaniciGiris_Y();

                        if(Objects.equals(oyunTahtasi.oyunTahtasi(x,y),kullaniciTahtasi.kullaniciTahta(yeni_x,yeni_y))){
                            for(int i = 0 ; i < 4 ; i++){
                                for(int j = 0 ; j < 4 ; j++){
                                    if(i == yeni_x && j == yeni_y){
                                        System.out.print("|"+oyunTahtasi.oyunTahtasi(yeni_x,yeni_y)+"| ");
                                    }
                                    else{
                                        System.out.print("| | ");
                                    }
                                }
                                System.out.print("\n");
                                System.out.println("--------------");
                            }
                        }
                        else{
                            System.out.println("Kaybettiniz...");
                            break;
                        }
                    }
                }
                if(process.equals("2")){
                    System.out.println("Oyun Hakkında = " +
                            "\n Oyunumuz bir hafıza testi oyunudur." +
                            " Önünüze çıkan şekli ezberledikten sonra şekillerin kordinatlarını giriş yaparak" +
                            " arka arkaya aynı şekli tutturmaya çalışıyorsunuz.");
                }
                if(process.equals("q")){
                    System.out.println("Oyundan Çıkış Yapılıyor.");
                    break;
                }
                if(!(process.equals("1") || process.equals("2"))){
                    System.out.println("Hatalı Değer Girişi\n");
                }
            }
    }
}