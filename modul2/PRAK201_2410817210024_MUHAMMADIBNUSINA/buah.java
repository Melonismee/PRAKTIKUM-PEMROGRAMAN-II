package PRAK201_2410817210024_MUHAMMADIBNUSINA;

public class buah {
	String nama;
	Double berat;
	Double harga;
	Double jumlah;

	public buah(String nama, Double berat, Double harga, Double jumlah) {
		this.nama = nama;
		this.berat = berat;
		this.harga = harga;
		this.jumlah = jumlah;
	}
	
	public void print() {
		Double hargaKg = harga / berat;
		
		Double hargaSblm = hargaKg * jumlah;
		
		int kelipatanDisk = (int) (jumlah / 4);
		
		Double totalDisk = kelipatanDisk * (harga * 4) * 0.02;
		
		Double hargaStlh = hargaSblm - totalDisk;
		
		System.out.println("\nNama Buah: "+ nama);
		System.out.println("Berat: " + berat);
		System.out.println("Harga: " + harga);
		System.out.println("Jumlah Beli: " + jumlah + "kg");
		System.out.printf("Harga Sebelum Diskon: Rp%.2f \n",hargaSblm);
		System.out.printf("Total Diskon: Rp%.2f \n",totalDisk);
		System.out.printf("Harga Setelah Diskon: Rp%.2f \n",hargaStlh);
		
	}
}