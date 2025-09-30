package modul1;
import java.util.Scanner;

public class PRAK103_2410817210024_MuhammadIbnuSina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int angka = scan.nextInt();
		
		int jarak = 0;
		
		do {
			if (angka % 2 != 0) {
				System.out.print(angka);
				jarak++;
				if (jarak < N)
					System.out.print(", ");
			} angka++;
		} while (jarak < N);
	}

}
