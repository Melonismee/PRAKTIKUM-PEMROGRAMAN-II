package soal3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
		
		int pilihan = 0;
		
		do {
			System.out.println("Menu:");
			System.out.println("1. Tambah Mahasiswa");
			System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
			System.out.println("3. Cari Mahasiswa berdasarkan NIM");
			System.out.println("4. Tampilkan Daftar Mahasiswa");
			System.out.println("0. Keluar");
			System.out.print("Pilihan: ");
			pilihan = scan.nextInt();
			scan.nextLine();
			switch (pilihan) {
			
			case 1:
				System.out.print("Masukkan Nama Mahasiswa: ");
				String nama = scan.nextLine();
				System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
				String nim = scan.nextLine();
				listMahasiswa.add(new Mahasiswa(nama, nim));
				System.out.println("Mahasiswa " + nama + " ditambahkan.");
				break;
				
			case 2:
				System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
				String nimHapus = scan.nextLine();
				boolean ada = false;
				for (int i = 0; i < listMahasiswa.size(); i++) {
					if (listMahasiswa.get(i).getNim().equals(nimHapus)) {
						System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
						listMahasiswa.remove(i);
						ada = true;
						break;
					}
				}
				if (!ada) {
					System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
				}
				break;
			
			case 3:
				System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                String nimCari = scan.nextLine();
                boolean ditemukan = false;
                for (Mahasiswa m : listMahasiswa) {
                    if (m.getNim().equals(nimCari)) {
                        System.out.println("NIM ditemukan:");
                        System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                }
                break;
                
			case 4:
				if (listMahasiswa.isEmpty()) {
					System.out.println("Daftar Mahasiswa kosong.");
				} else {
					System.out.println("Daftar Mahasiswa:");
					for (Mahasiswa m : listMahasiswa) {
						System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
					}
				}
				break;
				
			case 0:
				System.out.println("Terima kasih!");
				listMahasiswa.clear();
				break;

			default:
				System.out.println("Pilihan tidak valid!");
				
			}
		} while (pilihan != 0);
		scan.close();
	}

}
