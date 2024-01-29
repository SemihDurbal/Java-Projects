import java.util.Objects;

import static java.lang.Thread.sleep;

public class Main{

    public static void main(String[] args) throws InterruptedException {
        Kontrol kontrol1 = new Kontrol();
        System.out.println("*****  Yurt Dışı Çıkabilir misiniz ? Kontrol Edin  *****");
            kontrol1.kurallar_ekrani();
            try{
                kontrol1.harc_bedeli();
            }catch (ArithmeticException e){
                System.out.println("Harç Bedeli Yeterli Miktarda Değil Çıkış Yapamazsınız ...");
                return;
            }
            Thread.sleep(3000);
            try{
                kontrol1.vize_durumu();
            }catch (RuntimeException e){
                System.out.println("Vizeniz Bulunmuyor Çıkış Yapamazsınız ...");
                return;
            }
            Thread.sleep(3000);
            try{
                kontrol1.sicil_kaydi();
            }catch (RuntimeException e){
                System.out.println("Sicil Kaydınız Bulunuyor Çıkış Yapamazsınız ...");
                return;
            }
    }

}