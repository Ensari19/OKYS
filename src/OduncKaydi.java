import java.time.LocalDate;

public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kopya;
    private LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kopya) {
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.alisTarihi = LocalDate.now();
        this.kopya.setOduncteMi(true);
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
        this.kopya.setOduncteMi(false);
    }

    public void yazdir() {
        System.out.println("Odunc Alan: " + kullanici.getAd());
        System.out.println("Kitap: " + kopya.getKitap().getBaslik() + " (Barkod: " + kopya.getBarkodNo() + ")");
        System.out.println("Durum: " + (kopya.isOduncteMi() ? "Oduncte" : "Kutuphanede"));
        System.out.println("-----------------------------------");
    }
}