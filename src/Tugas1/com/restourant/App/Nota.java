package Tugas1.com.restourant.App;


import java.util.ArrayList;

/**
 * Class Nota digunakan untuk menampilkan ringkasan transaksi
 * beserta total harga, pajak, dan total akhir.
 */
public class Nota {
    private ArrayList<Order> daftarPesanan;

    public Nota() {
        daftarPesanan = new ArrayList<>();
    }

    /**
     * Menambahkan pesanan baru ke nota
     * @param order pesanan pelanggan
     */
    public void tambahPesanan(Order order) {
        daftarPesanan.add(order);
    }

    /**
     * Menghitung total harga keseluruhan sebelum pajak
     * @return total harga
     */
    public double hitungSubtotal() {
        double total = 0;
        for (Order order : daftarPesanan) {
            total += order.hitungTotal();
        }
        return total;
    }

    /**
     * Menampilkan nota lengkap dengan detail pesanan dan pajak
     */
    public void cetakNota() {
        System.out.println("\n=== NOTA PEMESANAN ===");
        for (Order order : daftarPesanan) {
            System.out.println(order.getMenu().getNama() + " x " + order.getJumlah() +
                    " = Rp" + order.hitungTotal());
        }

        double subtotal = hitungSubtotal();
        double pajak = subtotal * 0.1;
        double totalAkhir = subtotal + pajak;

        System.out.println("--------------------------");
        System.out.println("Subtotal : Rp" + subtotal);
        System.out.println("Pajak 10%: Rp" + pajak);
        System.out.println("Total    : Rp" + totalAkhir);
    }
}

