public class Kare extends Sekil{

    private int kenar;
    public Kare(String isim , int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    void alanhesaplama() {
        System.out.println(getIsim() + " alani = " + (kenar*kenar) );
    }
}
