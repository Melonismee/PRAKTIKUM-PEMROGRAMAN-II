package soal2;
import java.util.Scanner;

public class Soal2Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pilihan = scan.nextInt();
		scan.nextLine();
		
		if (pilihan == 1) {
			System.out.print("Nama hewan peliharaan: ");
			String nk = scan.nextLine();
			System.out.print("Ras: ");
			String rk = scan.nextLine();
			System.out.print("Warna Bulu: ");
			String bk = scan.nextLine();
			
			Kucing kucing1 = new Kucing(rk, nk, bk);
			kucing1.displayDetailKucing();
			
		} else if (pilihan == 2) {
			System.out.print("Nama hewan peliharaan: ");
			String na = scan.nextLine();
			System.out.print("Ras: ");
			String ra = scan.nextLine();
			System.out.print("Warna Bulu: ");
			String ba = scan.nextLine();
			System.out.print("Kemampuan : ");
			String kb = scan.nextLine();
			String[] ka = kb.split(",");
			
			Anjing anjing1 = new Anjing(ra, na, ba, ka);
			anjing1.displayDetailAnjing();
		}
		scan.close();
	}

}
