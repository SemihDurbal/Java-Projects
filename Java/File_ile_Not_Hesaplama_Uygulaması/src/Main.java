import java.io.*;
import java.util.Scanner;

public class Main{

    public static String harfNotuHesaplama (String isim , int vize1 , int vize2 , int final_notu){
        String harfNotu = null;
        double not_Ortalamasi = (vize1*(0.2) + vize2*(0.2) + final_notu*(0.6));

        if(not_Ortalamasi>90 && not_Ortalamasi <=100){
            harfNotu = "AA";
        } else if(not_Ortalamasi <= 89 && not_Ortalamasi >= 85){
            harfNotu = "BA";
        } else if (not_Ortalamasi <= 84 && not_Ortalamasi >= 80) {
            harfNotu = "BB";
        } else if (not_Ortalamasi <= 79 && not_Ortalamasi >= 70) {
            harfNotu = "CB";
        } else if (not_Ortalamasi <= 69 && not_Ortalamasi >= 60) {
            harfNotu = "CC";
        } else if (not_Ortalamasi <= 59 && not_Ortalamasi >= 50) {
            harfNotu = "DC";
        } else if (not_Ortalamasi <= 49 && not_Ortalamasi >= 45){
            harfNotu = "DD";
        } else if (not_Ortalamasi <= 44 && not_Ortalamasi >= 0) {
            harfNotu = "FF";
        }

        return isim + " bu dersten " + " - " +harfNotu+" - " + " aldı..." ;

    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"));
            FileWriter writer =new FileWriter("harfnotlari.txt")){

            while(scanner.hasNextLine()){

                String oggrenciBilgiler = scanner.nextLine();

                String[] ogrenciArray = oggrenciBilgiler.split(",");
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int final_notu = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesaplama(ogrenciArray[0],vize1,vize2,final_notu);

                writer.write(cikti + "\n");
            }

        }
        catch (FileNotFoundException ex) {
            System.out.println("File Not Found !!!");
        }
        catch (IOException ex) {
            System.out.println("Runtime Error !!!");
        }

    }
}