package soal1;
import java.util.Scanner;

public class Soal1Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nama Hewan Peliharaan: ");
		String name = scan.nextLine();
		System.out.print("Ras: ");
		String race = scan.nextLine();
		
		HewanPeliharaan kucing = new HewanPeliharaan(race, name);
		
		kucing.display();
		
		scan.close();
	}

}
