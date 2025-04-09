// Kelas Hewan
class Hewan {
    // Atribut
    private String nama;
    private String jenis;
    private String suara;

    // Konstruktor
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara);
    }
}

// Kelas Main
public class codelab1 {
    public static void main(String[] args) {
        // Membuat objek Hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo
        hewan1.tampilkanInfo();
        System.out.println(); // Menambahkan baris kosong
        hewan2.tampilkanInfo();
    }
}
