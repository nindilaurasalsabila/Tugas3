package Tugas1.com.restourant.App;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan program Nota Pemesanan Makanan.
 * Fitur: Autocomplete, Live Template, dan dokumentasi JavaDoc.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Daftar menu restoran
        ArrayList<Menu> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Menu("Nasi Goreng", 15000));
        daftarMenu.add(new Menu("Mie Ayam", 12000));
        daftarMenu.add(new Menu("Ayam Geprek", 18000));
        daftarMenu.add(new Menu("Es Teh", 5000));
        daftarMenu.add(new Menu("Es Jeruk", 6000));

        Nota nota = new Nota();

        System.out.println("=== RESTORAN LEZAT ===");
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nDaftar Menu:");
            for (int i = 0; i < daftarMenu.size(); i++) {
                System.out.println((i + 1) + ". " + daftarMenu.get(i));
            }

            System.out.print("Pilih nomor menu: ");
            int pilihan = input.nextInt();

            if (pilihan < 1 || pilihan > daftarMenu.size()) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();

            // Tambahkan pesanan ke nota
            nota.tambahPesanan(new Order(daftarMenu.get(pilihan - 1), jumlah));

            System.out.print("Tambah pesanan lagi? (y/n): ");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }

        nota.cetakNota();

        System.out.println("\nTerima kasih telah memesan di Restoran Lezat!");
    }
}