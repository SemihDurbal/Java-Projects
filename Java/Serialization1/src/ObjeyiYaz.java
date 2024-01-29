import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void  main (String[] args) {

        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {

            Ogrenci ogr1 = new Ogrenci("Semih" , "1" , "Computer Engineering");
            Ogrenci ogr2 = new Ogrenci("Yağmur" , "2" , "Computer Engineering");
            Ogrenci ogr3 = new Ogrenci("Yağız" , "3" , "Halkla İlişkiler");
            Ogrenci ogr4 = new Ogrenci("Ali Kaan" , "4" , "İstatistik");
            Ogrenci ogr5 = new Ogrenci("Emre Gezer" , "5" , "Industry Engineering");

            output.writeObject(ogr1);
            output.writeObject(ogr2);
            output.writeObject(ogr3);
            output.writeObject(ogr4);
            output.writeObject(ogr5);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya Bulunamadı !!!");
        } catch (IOException e) {
            System.out.println("Dosya Çalıştırılamadı !!!");
        }

    }
}
