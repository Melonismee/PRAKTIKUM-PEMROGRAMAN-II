package modul1;
import java.util.Scanner;

public class PRAK102_2410817210024_MuhammadIbnuSina {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int angka = scan.nextInt();

		int jarak = 0;
		while (jarak <= 10) {
			if (angka % 5 == 0) {
				int hasil = (angka / 5) - 1;
				System.out.print(hasil);
			} else {
				System.out.print(angka);
			}

			jarak++;
			angka++;

			if (jarak <= 10) {
				System.out.print(", ");
			}
		}
	}
}


