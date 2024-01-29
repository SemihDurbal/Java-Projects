import java.io.Serializable;

public class Ogrenci implements Serializable {

    private static final long serialVersionUID = 1000;

    private String isim;
    private String id;
    private String bolum;

    @Override
    public String toString() {
        return "İsim : " + isim + "\nId : " + id + "\nBölüm : " + bolum ;
    }

    public Ogrenci(String isim, String id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }
}
