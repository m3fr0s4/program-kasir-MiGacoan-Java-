/**
 * ======================================================
 * Project     : Sistem Kasir Restoran Mi Gacoan
 * Mata Kuliah : Algoritma Pemrograman Lanjut
 * ======================================================
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ==========================================
        // MEMBUAT OBJECT MENU MAKANAN
        // ==========================================

        Makanan mieGacoan = new Makanan("Mie Gacoan", 15000, "Makanan");
        Makanan mieHompimpa = new Makanan("Mie Hompimpa", 15000, "Makanan");
        Makanan mieSuit = new Makanan("Mie Suit", 15000, "Makanan");

        Makanan lumpiaUdang = new Makanan("Lumpia Udang", 15000, "Ala Carte");
        Makanan udangKeju = new Makanan("Udang Keju", 15000, "Ala Carte");
        Makanan pangsitGoreng = new Makanan("Pangsit Goreng", 14000, "Ala Carte");
        Makanan siomay = new Makanan("Siomay", 14000, "Ala Carte");
        Makanan udangRambutan = new Makanan("Udang Rambutan", 15000, "Ala Carte");

        // ==========================================
        // MEMBUAT OBJECT MENU MINUMAN
        // ==========================================

        Minuman teh = new Minuman("Es Teh", 6000, "Minuman");
        Minuman lemonTea = new Minuman("Lemon Tea", 8000, "Minuman");
        Minuman thaiTea = new Minuman("Thai Tea", 12000, "Minuman");
        Minuman airMineral = new Minuman("Air Mineral", 6000, "Minuman");
        Minuman jusJeruk = new Minuman("Jus Jeruk", 10000, "Minuman");

        // ==========================================
        // MEMBUAT OBJECT LAIN
        // ==========================================

        Pesanan pesanan = new Pesanan();
        Transaksi transaksi = new Transaksi();

        // ==========================================
        // TAMPILAN AWAL
        // ==========================================

        System.out.println("==================================================");
        System.out.println("        SISTEM KASIR RESTORAN MI GACOAN");
        System.out.println("         UAS Algoritma Pemrograman Lanjut");
        System.out.println("==================================================");

        // ==========================================
        // INPUT DATA PELANGGAN
        // ==========================================

        System.out.println("\n========== INPUT DATA PELANGGAN ==========");

        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Nomor HP       : ");
        String noHP = input.nextLine();

        System.out.print("Member (Y/T)   : ");
        char member = input.next().charAt(0);

        boolean statusMember = false;

        if (member == 'Y' || member == 'y') {
            statusMember = true;
        }

        Pelanggan pelanggan = new Pelanggan(nama, noHP, statusMember);

        // ==========================================
        // KONFIRMASI DATA
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("   DATA PELANGGAN BERHASIL DISIMPAN");
        System.out.println("==========================================");

        pelanggan.tampilInfo();

        // Membersihkan buffer Scanner
        input.nextLine();

        System.out.println("\nTekan ENTER untuk melanjutkan...");
        input.nextLine();

        // ==========================================
        // MULAI PEMESANAN
        // ==========================================

        boolean tambahPesanan = true;

        while (tambahPesanan) {

            System.out.println();
            System.out.println("==================================================");
            System.out.println("                 MENU MAKANAN");
            System.out.println("==================================================");

            System.out.println("1. Mie Gacoan              Rp15.000");
            System.out.println("2. Mie Hompimpa            Rp15.000");
            System.out.println("3. Mie Suit                Rp15.000");
            System.out.println("4. Lumpia Udang            Rp15.000");
            System.out.println("5. Udang Keju              Rp15.000");
            System.out.println("6. Pangsit Goreng          Rp14.000");
            System.out.println("7. Siomay                  Rp14.000");
            System.out.println("8. Udang Rambutan          Rp15.000");

            System.out.println("------------------------------------------");

            System.out.println("                MENU MINUMAN");

            System.out.println("------------------------------------------");

            System.out.println("9.  Es Teh                 Rp6.000");
            System.out.println("10. Lemon Tea              Rp8.000");
            System.out.println("11. Thai Tea               Rp12.000");
            System.out.println("12. Air Mineral            Rp6.000");
            System.out.println("13. Jus Jeruk              Rp10.000");

            System.out.println("------------------------------------------");
            System.out.println("0. Selesai & Pembayaran");
            System.out.println("==================================================");

            System.out.print("Pilih Menu : ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                break;
            }

            int jumlah;
            int level;

            // =====================================================
            // SWITCH CASE AKAN DILANJUTKAN DI PART 2
            // =====================================================
                        switch (pilihan) {

                case 1 -> {
                    Makanan pesananGacoan = new Makanan("Mie Gacoan", 15000, "Makanan");

                    System.out.print("Level Pedas (0-8) : ");
                    level = input.nextInt();

                    System.out.print("Jumlah            : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(pesananGacoan, jumlah, level);
                }

                case 2 -> {
                    Makanan pesananHompimpa = new Makanan("Mie Hompimpa", 15000, "Makanan");

                    System.out.print("Level Pedas (0-8) : ");
                    level = input.nextInt();

                    System.out.print("Jumlah            : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(pesananHompimpa, jumlah, level);
                }

                case 3 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(mieSuit, jumlah);
                }

                case 4 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(lumpiaUdang, jumlah);
                }

                case 5 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(udangKeju, jumlah);
                }

                case 6 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(pangsitGoreng, jumlah);
                }

                case 7 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(siomay, jumlah);
                }

                case 8 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(udangRambutan, jumlah);
                }

                case 9 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(teh, jumlah);
                }

                case 10 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(lemonTea, jumlah);
                }

                case 11 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(thaiTea, jumlah);
                }

                case 12 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(airMineral, jumlah);
                }

                case 13 -> {
                    System.out.print("Jumlah : ");
                    jumlah = input.nextInt();

                    pesanan.tambahPesanan(jusJeruk, jumlah);
                }

                default -> {
                    System.out.println("Pilihan menu tidak tersedia!");
                    continue;
                }

            }

            System.out.println();
            System.out.print("Tambah Pesanan Lagi? (Y/T) : ");

            char lagi = input.next().charAt(0);

            if (lagi == 'T' || lagi == 't') {

                tambahPesanan = false;

            }

        }

        // ==========================================
        // PEMBAYARAN DILANJUTKAN DI PART 3
        // ==========================================
        
                // ==========================================
        // PROSES PEMBAYARAN
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          METODE PEMBAYARAN");
        System.out.println("==========================================");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");

        System.out.print("Pilih Metode Pembayaran : ");
        int metode = input.nextInt();

        if (metode == 1) {

            transaksi.setMetodePembayaran("Cash");

        } else {

            transaksi.setMetodePembayaran("QRIS");

        }

        System.out.println();

        transaksi.cetakStruk(pelanggan, pesanan);

        System.out.println();
        System.out.println("==========================================");
        System.out.println(" Terima kasih telah berkunjung di");
        System.out.println("            Mi Gacoan");
        System.out.println("==========================================");
        input.close();

    }

}