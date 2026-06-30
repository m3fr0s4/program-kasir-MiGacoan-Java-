import java.text.NumberFormat;
import java.util.Locale;

public class Transaksi {

    // =========================
    // ATTRIBUTE
    // =========================

    private String metodePembayaran;

    // Konstanta
    private final double DISKON_MEMBER = 0.05;
    private final double PPN = 0.11;

    // Formatter Rupiah
    private final NumberFormat rupiah =
            NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Transaksi() {
        metodePembayaran = "";
    }

    // Constructor Overloading
    public Transaksi(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    // =========================
    // GETTER & SETTER
    // =========================

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {

        if (metodePembayaran.equalsIgnoreCase("Cash")
                || metodePembayaran.equalsIgnoreCase("QRIS")) {

            this.metodePembayaran = metodePembayaran;

        }

    }

    // =========================
    // METHOD
    // =========================

    // Menghitung diskon member
    public double hitungDiskon(int subtotal, boolean member) {

        if (member) {
            return subtotal * DISKON_MEMBER;
        }

        return 0;

    }

    // Menghitung PPN
    public double hitungPPN(int subtotal) {

        return subtotal * PPN;

    }

    // Menghitung total pembayaran
    public double hitungTotal(int subtotal, boolean member) {

        double diskon = hitungDiskon(subtotal, member);
        double ppn = hitungPPN(subtotal);

        return subtotal - diskon + ppn;

    }

    // =========================
    // METHOD OVERLOADING
    // =========================

    // Menampilkan total tanpa diskon
    public double hitungTotal(int subtotal) {

        return subtotal + hitungPPN(subtotal);

    }

    // =========================
    // CETAK STRUK
    // =========================

    public void cetakStruk(Pelanggan pelanggan, Pesanan pesanan) {

        int subtotal = pesanan.hitungSubtotal();

        double diskon = hitungDiskon(subtotal,
                pelanggan.isMember());

        double ppn = hitungPPN(subtotal);

        double total = hitungTotal(subtotal,
                pelanggan.isMember());

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          STRUK PEMBAYARAN");
        System.out.println("==========================================");

        pelanggan.tampilInfo();

        System.out.println();
        pesanan.tampilPesanan();

        System.out.println("Subtotal           : "
                + rupiah.format(subtotal));

        System.out.println("Diskon Member      : "
                + rupiah.format(diskon));

        System.out.println("PPN (11%)          : "
                + rupiah.format(ppn));

        System.out.println("------------------------------------------");

        System.out.println("TOTAL BAYAR        : "
                + rupiah.format(total));

        System.out.println("Metode Pembayaran  : "
                + metodePembayaran);

        System.out.println("==========================================");
        System.out.println(" Terima Kasih telah berkunjung di");
        System.out.println("          Mi Gacoan");
        System.out.println("==========================================");

    }

}