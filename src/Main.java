public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap("978-01", "Kuyucakli Yusuf", "Sabahattin Ali");
        KitapKopyasi kopya1 = new KitapKopyasi("BARKOD-101", k1);
        Kullanici u1 = new Kullanici("1", "Ahmet Yilmaz");

        // Nesneler uretildi ve iliski kuruldu
        OduncKaydi kayit = new OduncKaydi(u1, kopya1);
        kayit.yazdir();

        // Iade testi
        kayit.iadeEt();
        kayit.yazdir();
    }
}