package utps.barang;

public class Seni extends BarangLelang {
    private String seniman;

    public Seni(String namaBarang, double hargaAwal, String seniman) {
        super(namaBarang, hargaAwal);
        this.seniman = seniman;
    }

    public void mulaiLelang() {
        super.mulaiLelang();
        System.out.println("Karya seni ini dibuat oleh: " + seniman);
    }
}
