package soal2;

public class Anjing extends HewanPeliharaan {
	private String warnaBulu;
	private String[] kemampuan;
	
	public Anjing(String n, String r, String w, String[] k) {
		super(n, r);
		this.warnaBulu = w;
		this.kemampuan = k;
	}
	
	public void displayDetailAnjing () {
		super.display();
		System.out.println("Warna Bulu: " + warnaBulu);
		System.out.print("Kemampuan :");
		for (String k : kemampuan) {
			System.out.print("" + k);
		}
	}
}
