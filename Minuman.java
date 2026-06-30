// =========================
// INHERITANCE
// Class Minuman merupakan subclass dari Menu
// =========================

public class Minuman extends Menu {

    // =========================
    // ATTRIBUTE
    // =========================

    // Tidak memiliki atribut tambahan karena
    // nama menu, harga, dan kategori sudah
    // diwarisi dari superclass Menu.

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Minuman() {
        super();
    }

    // Constructor Overloading
    public Minuman(String namaMenu, int harga, String kategori) {
        super(namaMenu, harga, kategori);
    }

    // =========================
    // GETTER & SETTER
    // =========================

    // Tidak ada getter & setter tambahan
    // karena tidak memiliki atribut baru.

    // =========================
    // METHOD
    // =========================

    // Method Overriding
    // Menampilkan informasi menu minuman
    @Override
    public void tampilInfo() {

        System.out.println("Nama Menu : " + getNamaMenu());
        System.out.println("Harga     : Rp" + getHarga());
        System.out.println("Kategori  : " + getKategori());
        System.out.println("Jenis     : Minuman");
    }

}