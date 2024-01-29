public class Ucgen extends Sekil{
    private int[] kenar;
    public Ucgen(String isim , int[] kenar) {
        super(isim);
        this.kenar=kenar;
    }

    void alanhesaplama() {
        int u = (kenar[0]+kenar[1]+kenar[2])/2;
        System.out.println(getIsim() + " alanı = " + Math.sqrt(u*(u-kenar[1])*(u-kenar[0])*(u-kenar[2])));
    }
}
