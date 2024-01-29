public abstract class Sekil {

    private String isim;

    protected Sekil(String isim) {
        this.isim = isim;
    }

    abstract void alanhesaplama();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
