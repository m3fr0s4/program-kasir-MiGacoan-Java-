import java.util.ArrayList;

// =========================
// POLYMORPHISM
// ArrayList<Menu> dapat menyimpan
// object Makanan maupun Minuman.
// =========================

public class Pesanan {

    // =========================
    // ATTRIBUTE
    // =========================

    private ArrayList<Menu> daftarPesanan;
    private ArrayList<Integer> jumlahPesanan;
    private ArrayList<Integer> levelPedas;

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Pesanan() {

        daftarPesanan = new ArrayList<>();
        jumlahPesanan = new ArrayList<>();
        levelPedas = new ArrayList<>();

    }

    // =========================
    // METHOD
    // =========================

    // Menambahkan pesanan tanpa level pedas
    public void tambahPesanan(Menu menu, int jumlah) {

        daftarPesanan.add(menu);
        jumlahPesanan.add(jumlah);

        // -1 berarti menu tidak memiliki level pedas
        levelPedas.add(-1);

    }

    // =========================
    // METHOD OVERLOADING
    // =========================

    // Menambahkan pesanan dengan level pedas
    public void tambahPesanan(Menu menu, int jumlah, int level) {

        daftarPesanan.add(menu);
        jumlahPesanan.add(jumlah);
        levelPedas.add(level);

    }

    // =========================
    // METHOD
    // =========================

    // Menampilkan seluruh pesanan
    public void tampilPesanan() {

        System.out.println("\n========== DAFTAR PESANAN ==========");

        for (int i = 0; i < daftarPesanan.size(); i++) {

            Menu menu = daftarPesanan.get(i);

            System.out.println((i + 1) + ". " + menu.getNamaMenu());

            if (levelPedas.get(i) != -1) {

                System.out.println("   Level  : " + levelPedas.get(i));

            }

            System.out.println("   Jumlah : " + jumlahPesanan.get(i));
            System.out.println("   Harga  : Rp" + menu.getHarga());
            System.out.println("   Total  : Rp" + (menu.getHarga() * jumlahPesanan.get(i)));

            System.out.println("-------------------------------------");

        }

    }

    // Menghitung subtotal pesanan
    public int hitungSubtotal() {

        int subtotal = 0;

        for (int i = 0; i < daftarPesanan.size(); i++) {

            subtotal += daftarPesanan.get(i).getHarga()
                    * jumlahPesanan.get(i);

        }

        return subtotal;

    }

    // =========================
    // GETTER
    // =========================

    public ArrayList<Menu> getDaftarPesanan() {
        return daftarPesanan;
    }

    public ArrayList<Integer> getJumlahPesanan() {
        return jumlahPesanan;
    }

    public ArrayList<Integer> getLevelPedas() {
        return levelPedas;
    }

}