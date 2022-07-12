package Encapsulation;

public class Kitap {
    private String kitapAdi, yazar; /* değişkenlerimizi tanımladık */
    private int sayfaSayisi;

    Kitap(String kitapAdi, String yazar, int sayfaSayisi) { /* kurucu methdumuzu tanımladık */
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 0;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }


    public String getKitapAdi() { /* getter setter ile private değişkenlerimize ulaşacağız */
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) { /* setter metodumuz değiştirme yapacağı için void olarak tanımladık*/

        this.kitapAdi = kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public static void main(String[] args) {
        Kitap kitap = new Kitap("Vakıf", "Asimov", 450);
        bilgileriYazdir(kitap);
        kitap.setSayfaSayisi(290);
        kitap.setKitapAdi("Anna Karenina");
        kitap.setYazar("Tolstoy");
        System.out.println("----------------------");
        bilgileriYazdir(kitap);

    }

    private static void bilgileriYazdir(Kitap kitap) {
        System.out.println("Kitap Adı : " + kitap.getKitapAdi() + "\nKitap yazarı : " + kitap.getYazar() +
                "\nKitap Sayfa Sayısı  : " + kitap.getSayfaSayisi());
    }
}
