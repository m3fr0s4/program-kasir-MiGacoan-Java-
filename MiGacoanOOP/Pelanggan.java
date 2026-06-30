public class Pelanggan {

    // =========================
    // ATTRIBUTE (Encapsulation)
    // =========================

    private String nama;
    private String noHP;
    private boolean member;

    // =========================
    // CONSTRUCTOR
    // =========================

    // Constructor Default
    public Pelanggan() {
        this.nama = "";
        this.noHP = "";
        this.member = false;
    }

    // Constructor Overloading
    public Pelanggan(String nama, String noHP, boolean member) {
        this.nama = nama;
        this.noHP = noHP;
        this.member = member;
    }

    // =========================
    // GETTER & SETTER
    // =========================

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        // Validasi sederhana
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }

    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {

        // Validasi sederhana
        if (noHP != null && !noHP.trim().isEmpty()) {
            this.noHP = noHP;
        }

    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    // =========================
    // METHOD
    // =========================

    // Menampilkan informasi pelanggan
    public void tampilInfo() {

        System.out.println("\n========== DATA PELANGGAN ==========");
        System.out.println("Nama           : " + nama);
        System.out.println("Nomor HP       : " + noHP);
        System.out.println("Status Member  : " + (member ? "Ya" : "Tidak"));

    }

}