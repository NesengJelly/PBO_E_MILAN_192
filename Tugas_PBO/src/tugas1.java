import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menampilkan pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            //Login Admin
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            String usernameValid = "Admin010";
            String passwordValid = "Password010";
            if (username.equals(usernameValid) && password.equals(passwordValid)) {
                System.out.println("Login Admin berhasill!!");
            } else {
                System.out.println("Login gagal! Username atau Password salah.");
            }
        } else if (pilihan == 2) {
            //Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            String namaValid = "Milan Nuridhan Mukhlisin";
            String nimValid = "202410370110192";

            //Gantilah dengan nama & nim kalian

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!!");
            } else {
                System.out.println("Login gagal! Nama atau Nim salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}

