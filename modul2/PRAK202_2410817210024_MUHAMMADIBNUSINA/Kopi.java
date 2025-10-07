package PRAK202_2410817210024_MUHAMMADIBNUSINA;

public class Kopi {
	String namaKopi, ukuran, pembeli;
	double  harga, pajak;

	public void info() {
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga: Rp. " + harga);
	}
	
	public void setPembeli (String pembeli) {
		this.pembeli = pembeli;
	}
	
	public String getPembeli () {
		return pembeli;
	}
	
	public double getPajak () {
		return harga * 0.11;
	}
} 