// Inheritance
// Class Makanan merupakan subclass dari Menu
public class Makanan extends Menu {

    // =========================
    // ATTRIBUTE
    // =========================

    private int levelPedas;

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Makanan() {
        super();
        this.levelPedas = 0;
    }

    // =========================
    // Constructor Overloading
    // Untuk menu tanpa level pedas
    // =========================

    public Makanan(String namaMenu, int harga, String kategori) {

    super(namaMenu, harga, kategori);
    this.levelPedas = -1;

}

    // =========================
    // Constructor Overloading
    // Untuk menu dengan level pedas
    // =========================

    public Makanan(String namaMenu, int harga, String kategori, int levelPedas) {

    super(namaMenu, harga, kategori);
    this.levelPedas = levelPedas;

}

    // =========================
    // GETTER & SETTER
    // =========================

    public int getLevelPedas() {
        return levelPedas;
    }

    public void setLevelPedas(int levelPedas) {
        this.levelPedas = levelPedas;
    }

    // =========================
    // METHOD
    // =========================

    // Method Override
    // Menampilkan informasi menu makanan
    @Override
    public void tampilInfo() {

        System.out.println("Nama Menu : " + getNamaMenu());
        System.out.println("Harga     : Rp" + getHarga());
        System.out.println("Kategori  : " + getKategori());

        // Khusus Mie Gacoan & Hompimpa
        if (getNamaMenu().equalsIgnoreCase("Mie Gacoan")
                || getNamaMenu().equalsIgnoreCase("Mie Hompimpa")) {

            System.out.println("Level     : " + levelPedas);

        }
    }

}