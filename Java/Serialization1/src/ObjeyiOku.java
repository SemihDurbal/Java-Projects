import java.io.*;

public class ObjeyiOku {

    public static void main (String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("ogrenci.bin"));
            Ogrenci ogr1 = (Ogrenci)objectInputStream.readObject();
            Ogrenci ogr2 = (Ogrenci)objectInputStream.readObject();
            Ogrenci ogr3 = (Ogrenci)objectInputStream.readObject();
            Ogrenci ogr4 = (Ogrenci)objectInputStream.readObject();
            Ogrenci ogr5 = (Ogrenci)objectInputStream.readObject();

            System.out.println(ogr1);
            System.out.println(ogr2);
            System.out.println(ogr3);
            System.out.println(ogr4);
            System.out.println(ogr5);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
