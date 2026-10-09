public class KitapKopyasi {
    private String barkodNo;
    private boolean oduncteMi;
    private Kitap kitap;

    public KitapKopyasi(String barkodNo, Kitap kitap) {
        this.barkodNo = barkodNo;
        this.kitap = kitap;
        this.oduncteMi = false;
    }

    public String getBarkodNo() { return barkodNo; }
    public Kitap getKitap() { return kitap; }
    public boolean isOduncteMi() { return oduncteMi; }
    public void setOduncteMi(boolean oduncteMi) { this.oduncteMi = oduncteMi; }
}