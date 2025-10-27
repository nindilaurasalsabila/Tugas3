package Tugas2.CekDiskonAfter;


import java.util.Scanner;

/**
 * Program Cek Diskon Belanja Sederhana.
 * <p>
 * Program ini menghitung harga akhir suatu barang setelah diberikan diskon
 * dan pajak, lalu menampilkan total yang harus dibayar.
 * </p>
 *
 * <p><b>Tugas 2 Modul 3 - Pemrograman Lanjut</b><br>
 * Universitas Muhammadiyah Malang</p>
 *
 * @author Nindi
 * @version 1.0
 */
public class Main {

    /**
     * Method utama yang menjalankan seluruh alur program.
     *
     * @param args argumen dari command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tampilkanHeader();

        String nama = inputNamaBarang(input);
        double harga = inputHarga(input);
        double diskon = inputDiskon(input);

        double hargaDiskon = hitungHargaSetelahDiskon(harga, diskon);
        double pajak = hitungPajak(hargaDiskon, 10);
        double total = hitungTotalBayar(hargaDiskon, pajak);

        tampilkanHasil(nama, harga, diskon, hargaDiskon, pajak, total);
    }

    /**
     * Menampilkan judul program.
     */
    public static void tampilkanHeader() {
        System.out.println("=== Program Cek Diskon Belanja ===");
    }

    /**
     * Meminta input nama barang dari pengguna.
     *
     * @param input objek Scanner untuk membaca input pengguna
     * @return nama barang yang diinput
     */
    public static String inputNamaBarang(Scanner input) {
        System.out.print("Masukkan nama barang: ");
        input.nextLine(); // untuk mencegah input terlewati
        return input.nextLine();
    }

    /**
     * Meminta input harga barang.
     *
     * @param input objek Scanner untuk membaca input
     * @return harga barang
     */
    public static double inputHarga(Scanner input) {
        System.out.print("Masukkan harga barang: ");
        return input.nextDouble();
    }

    /**
     * Meminta input persentase diskon.
     *
     * @param input objek Scanner untuk membaca input
     * @return persentase diskon
     */
    public static double inputDiskon(Scanner input) {
        System.out.print("Masukkan diskon (%): ");
        return input.nextDouble();
    }

    /**
     * Menghitung harga setelah diskon diterapkan.
     *
     * @param harga  harga awal barang
     * @param diskon persentase diskon
     * @return harga setelah diskon
     */
    public static double hitungHargaSetelahDiskon(double harga, double diskon) {
        return harga - (harga * diskon / 100);
    }

    /**
     * Menghitung jumlah pajak dari harga setelah diskon.
     *
     * @param hargaDiskon  harga setelah diskon
     * @param persenPajak  persentase pajak (misalnya 10%)
     * @return nilai pajak
     */
    public static double hitungPajak(double hargaDiskon, double persenPajak) {
        return hargaDiskon * persenPajak / 100;
    }

    /**
     * Menghitung total pembayaran (harga setelah diskon + pajak).
     *
     * @param hargaDiskon harga setelah diskon
     * @param pajak       jumlah pajak
     * @return total yang harus dibayar
     */
    public static double hitungTotalBayar(double hargaDiskon, double pajak) {
        return hargaDiskon + pajak;
    }

    /**
     * Menampilkan hasil perhitungan diskon dan pajak.
     *
     * @param nama         nama barang
     * @param harga        harga awal
     * @param diskon       persen diskon
     * @param hargaDiskon  harga setelah diskon
     * @param pajak        nilai pajak
     * @param total        total pembayaran
     */
    public static void tampilkanHasil(String nama, double harga, double diskon,
                                      double hargaDiskon, double pajak, double total) {
        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.printf("Nama Barang          : %s%n", nama);
        System.out.printf("Harga Awal           : Rp%.2f%n", harga);
        System.out.printf("Diskon               : %.2f%%%n", diskon);
        System.out.printf("Harga Setelah Diskon : Rp%.2f%n", hargaDiskon);
        System.out.printf("Pajak (10%%)          : Rp%.2f%n", pajak);
        System.out.printf("Total Bayar          : Rp%.2f%n", total);
    }
}
/**
 * git remote add origin https://github.com/nindilaurasalsabila/Tugas3
 *      git init
 *      git add .
 *      git commit -m "Menambahkan Nama"
 *      git remote add origin https://github.com/nindilaurasalsabila/Tugas3
 *      git push origin main
 *
 *      git branch -M main
 *      git push -u origin main
 *
 *      git checkout -b feature/add-fuel-efficiency
 *      git add SpaceMissionAfter.java
 *      git commit -m "Add fuel efficiency calculator method"
 *      git checkout main
 *      git merge feature/add-fuel-efficiency
 */
