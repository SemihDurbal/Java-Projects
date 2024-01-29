import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);

    IntProcessException Int = new IntProcessException();
    public static int toplama(int a,int b){
        int sonuc = a+b;
        return sonuc;
    }
    public static int toplama(int a,int b, int c){
        int sonuc = a+b+c;
        return sonuc;
    }
    public static int cikarma(int a,int b){
        int sonuc = a-b;
        return sonuc;
    }
    public static int cikarma(int a,int b, int c){
        int sonuc = a-b-c;
        return sonuc;
    }
    public static int carpma(int a,int b){
        int sonuc = a*b;
        return sonuc;
    }
    public static int carpma(int a,int b, int c){
        int sonuc = a*b*c;
        return sonuc;
    }
    public static int bolme(int a,int b){
        int sonuc = a/b;
        return sonuc;
    }
    public static int bolme(int a,int b, int c){
        int sonuc = a/b/c;
        return sonuc;
    }

    public static int hesap_makinesi(){
        System.out.println("Hesap Makinesi Programina Hos Geldiniz");
        boolean control = true;
        int sayi_1 = 0;
        int sayi_2 = 0;
        int sayi_3 = 0;

        while(control){
            System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz");
            System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme\n5.Programdan Cikis");
            int islem = scanner.nextInt();
            if(islem > 5){
                control =false;
                System.out.println("Gecersiz Deger Girdiniz.");
            }
            else if(islem == 5){
                control = false;
                System.out.println("Programdan Cikis Yapiliyor.");
            }
            else{
                System.out.print("Kac sayi ile islem yapmak istiyorsunuz :");
                int control2 = scanner.nextInt();
                boolean control3 = true;

                while(control3){
                    if(control2 !=2 && control2 !=3){
                        System.out.println("Yanlis deger girdiniz.");
                        return 0;
                    }
                    else if(control2 == 2){
                        System.out.println("Islem yapmak istediginiz sayilari giris yapin : ");
                        System.out.print("1.sayi = ");
                        try{
                            int sayi1 = scanner.nextInt();
                        }catch (ArithmeticException e){
                            System.out.println("Hatalı Değer");
                        }
                        System.out.print("2.sayi = ");
                        try{
                            int sayi2 = scanner.nextInt();
                        }catch (ArithmeticException e){
                            System.out.println("Hatalı Değer");
                        }
                        sayi_2=sayi2;
                        break;
                    }
                    else if(control2 == 3){
                        System.out.println("Islem yapmak istediginiz sayilari giris yapin : ");
                        System.out.print("1.sayi = ");
                        int sayi1 = scanner.nextInt();
                        sayi_1=sayi1;
                        System.out.print("2.sayi = ");
                        int sayi2 = scanner.nextInt();
                        sayi_2=sayi2;
                        System.out.print("3.sayi = ");
                        int sayi3 = scanner.nextInt();
                        sayi_3=sayi3;
                        break;
                    }
                }
                switch(islem){
                    case 1:
                        System.out.println("Toplama islemi sonucunuz : "+toplama(sayi_1,sayi_2,sayi_3));
                        break;
                    case 2:
                        System.out.println("Cikarma islemi sonucunuz : "+cikarma(sayi_1,sayi_2,sayi_3));
                        break;
                    case 3:
                        if(sayi_3==0){
                            sayi_3=1;
                        }
                        System.out.println("Carpma islemi sonucunuz : "+carpma(sayi_1,sayi_2,sayi_3));
                        break;
                    case 4:
                        if(sayi_3==0){
                            sayi_3=1;
                        }
                        System.out.println("Bolme islemi sonucunuz : "+bolme(sayi_1,sayi_2,sayi_3));
                        break;
                    default:
                        System.out.println("Gecersiz bir deger girisi yaptiniz.");
                        break;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args){
    hesap_makinesi();
    }
}