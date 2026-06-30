public class Menu {

    // =========================
    // ATTRIBUTE
    // =========================

    private String namaMenu;
    private int harga;
    private String kategori;

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Menu() {
        this.namaMenu = "";
        this.harga = 0;
        this.kategori = "";
    }

    // Constructor Overloading
    public Menu(String namaMenu, int harga, String kategori) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    // =========================
    // GETTER & SETTER
    // =========================

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // =========================
    // METHOD
    // =========================

    // Method untuk menampilkan informasi menu
    public void tampilInfo() {
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("Kategori  : " + kategori);
    }

    // =========================
    // METHOD OVERLOADING
    // =========================

    // Menampilkan informasi menu beserta nomor menu
    public void tampilInfo(int nomor) {
        System.out.println(nomor + ". " + namaMenu + " - Rp" + harga);
    }

}