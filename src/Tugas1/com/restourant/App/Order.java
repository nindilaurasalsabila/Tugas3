package Tugas1.com.restourant.App;

/**
 * Class Order merepresentasikan pesanan pelanggan,
 * menyimpan informasi menu dan jumlah yang dipesan.
 */
public class Order {
    private Menu menu;
    private int jumlah;

    /**
     * Konstruktor untuk membuat pesanan
     * @param menu objek menu yang dipilih
     * @param jumlah jumlah pesanan
     */
    public Order(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    /**
     * Menghitung total harga pesanan (harga * jumlah)
     * @return total harga
     */
    public double hitungTotal() {
        return menu.getHarga() * jumlah;
    }
}
