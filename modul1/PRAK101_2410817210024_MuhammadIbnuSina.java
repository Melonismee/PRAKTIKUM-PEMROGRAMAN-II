package modul1;
import java.util.Scanner;

public class PRAK101_2410817210024_MuhammadIbnuSina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] Bulan = {
				"Januari", "Februari", "Maret", "April", "Mei", "Juni",
				"Juli", "Agustus", "September", "Oktober", "November", "Desember"
		};
		
		System.out.print("Masukkan Nama Lengkap: ");
		String namaLengkap = scan.nextLine();
		
		System.out.print("Masukkan Tempat Lahir: ");
		String tempatLahir = scan.nextLine();

		System.out.print("Masukkan Tanggal Lahir: ");
		int tanggalLahir = scan.nextInt();

		System.out.print("Masukkan Bulan Lahir: ");
		int bulanLahir = scan.nextInt();

		System.out.print("Masukkan Tahun Lahir: ");
		int tahunLahir = scan.nextInt();

		System.out.print("Masukkan Tinggi Badan: ");
		int tinggiBadan = scan.nextInt();

		System.out.print("Masukkan Berat Badan: ");
		double beratBadan = scan.nextDouble();
		
		if (tinggiBadan < 0 || beratBadan < 0) {
            System.out.println("Input Yang Anda Masukkan Tidak Valid.");
        } else {
            String bulanNama = Bulan[bulanLahir - 1];
            
            System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulanNama + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        }
           
            
	}

}

