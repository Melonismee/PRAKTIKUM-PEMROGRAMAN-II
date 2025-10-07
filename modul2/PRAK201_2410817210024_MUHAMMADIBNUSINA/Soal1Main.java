package PRAK201_2410817210024_MUHAMMADIBNUSINA;

public class Soal1Main {

	public static void main(String[] args) {
		buah apel = new buah("Apel", 0.4, 7000.0, 40.0);
		buah mangga = new buah("Mangga", 0.2, 3500.0, 15.0);
		buah alpukat = new buah("Alpukat", 0.25, 10000.0, 12.0);
		
		apel.print();
		mangga.print();
		alpukat.print();
	}

}