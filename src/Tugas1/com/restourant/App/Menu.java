package Tugas1.com.restourant.App;

/**
 * Class Menu merepresentasikan data makanan/minuman
 * yang tersedia di restoran.
 */
public class Menu {
    private String nama;
    private double harga;

    /**
     * Konstruktor untuk membuat objek Menu
     * @param nama nama makanan/minuman
     * @param harga harga per item
     */
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return nama + " - Rp" + harga;
    }
}

