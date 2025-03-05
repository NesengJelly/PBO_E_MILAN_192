import java.util.Scanner;  // Import Scanner untuk input
import java.time.LocalDate; // Import LocalDate untuk tahun saat ini

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

        // Meminta input nama
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        // Meminta input jenis kelamin
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Meminta input tahun lahir
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur berdasarkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminStr;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        } else {
            jenisKelaminStr = "Tidak Diketahui";
        }

        // Menampilkan output
        System.out.println("\n===== Data Pengguna =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur         : " + umur + " tahun");

        // Menutup Scanner
        scanner.close();
    }
}
