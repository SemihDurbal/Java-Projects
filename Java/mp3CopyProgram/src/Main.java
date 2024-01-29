import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Yana Yana.mp3");

            int oku;
            while((oku = fis.read()) != -1){
                icerik.add(oku);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        } catch (IOException e) {
            System.out.println("Okunacak Değer yok.");
        }

    }

    public static void kopyala (String dosya){
        try {
            FileOutputStream fos = new FileOutputStream(dosya);

            for(int deger : icerik){
                fos.write(deger);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){

        dosyaOku();
        long baslangic = 0;
        kopyala("Yana Yana2.mp3");
        kopyala("Yana Yana3.mp3");
        kopyala("Yana Yana4.mp3");
        kopyala("Yana Yana5.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println(bitis);

    }
}