package modul1;
import java.util.Scanner;

public class PRAK105_2410817210024_MuhammadIbnuSina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double phi = 3.14;
		
		System.out.print("Masukkan jari-jari: ");
		Double r = scan.nextDouble();
		
		System.out.print("Masukkan tinggi:");
		Double t = scan.nextDouble();
		
		Double v = phi * (r*r) * t;
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3" ,r,t,v);
	}

}
