public class Dikdortgen extends Sekil{

    private int kenar_U , kenar_K;
    public Dikdortgen(String isim , int kenar_U , int kenar_K) {
        super(isim);
        this.kenar_K = kenar_K;
        this.kenar_U = kenar_U;
    }
    void alanhesaplama() {
        System.out.println(getIsim() + " alanı = " + (kenar_U*kenar_K));
    }
}
