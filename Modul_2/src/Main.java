public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1
        RekeningBank rekening1 = new RekeningBank("202410370110192", "Milan", 500000);
        // Membuat objek rekening2
        RekeningBank rekening2 = new RekeningBank("202410370110190", "Kasep", 1000000);

        // Menampilkan informasi rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        rekening1.tarikUang(800000); // Gagal
        rekening2.tarikUang(300000); // Berhasil
    }
}
