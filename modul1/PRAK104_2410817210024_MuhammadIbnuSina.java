package modul1;
import java.util.Iterator;
import java.util.Scanner;

public class PRAK104_2410817210024_MuhammadIbnuSina {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Tangan Abu: ");
		String[] abu = scan.nextLine().split(" ");
		
		System.out.print("Tangan Bagas: ");
		String[] bagas = scan.nextLine().split(" ");
		
		int skorAbu = 0, skorBagas = 0;
		
		for (int i = 0; i < 3; i++) {
			String a = abu[i];
			String b = bagas[i];
			
			if(a.equals(b)) {
			} else if ((a.equals("B") && b.equals("G")) ||
					   (a.equals("G") && b.equals("K")) ||
					   (a.equals("K") && b.equals("B"))) {
						skorAbu++;
			} else {
				skorBagas++;
			}
		}
		
		if (skorAbu > skorBagas) {
			System.out.println("Abu");
		} else if (skorBagas > skorAbu) {
			System.out.println("Bagas");
		} else {
			System.out.println("Seri");
		}
	}

}
