package soal1;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int jumlahDadu = scan.nextInt();
		int totalNilai = 0;
		
		LinkedList<Dadu> daduList = new LinkedList<>();
		
		if (jumlahDadu < 1) {
			System.out.println("Jumlah Dadu Tidak Valid.");
		} else {
			for (int i = 0; i < jumlahDadu; i++) {
				Dadu dadu = new Dadu();
				daduList.add(dadu);
				System.out.println("Dadu ke-" + (i+1) + " bernilai " + dadu.getNilai());
				totalNilai += dadu.getNilai();
				
			}
			System.out.println("Total nilai dadu keseluruhan "+totalNilai);

		}

		scan.close();
	}

}
