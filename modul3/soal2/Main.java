package soal2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	HashMap<Integer, String> bulanList = new HashMap<>();
    	bulanList.put(1, "Januari");
    	bulanList.put(2, "Februari");
    	bulanList.put(3, "Maret");
    	bulanList.put(4, "April");
    	bulanList.put(5, "Mei");
    	bulanList.put(6, "Juni");
    	bulanList.put(7, "Juli");
    	bulanList.put(8, "Agustus");
    	bulanList.put(9, "September");
    	bulanList.put(10, "Oktober");
    	bulanList.put(11, "November");
    	bulanList.put(12, "Desember");
    	
    	LinkedList<Negara> listNegara = new LinkedList<>();
    	
    	int jumlah = scan.nextInt();
    	scan.nextLine();
    	
    	for (int i = 0; i < jumlah; i++) {
			String nama = scan.nextLine();
			String jenis = scan.nextLine();
			String pemimpin = scan.nextLine();
			
			if(jenis.equalsIgnoreCase("monarki")) {
				listNegara.add(new Negara(nama, jenis, pemimpin));
			} else {
				int tanggal = scan.nextInt();
				int bulan = scan.nextInt();
				int tahun = scan.nextInt();
				scan.nextLine();
				listNegara.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
			}
			
		}
    	for (Negara negara : listNegara) {
			String j = negara.getKepemimpinan();
			String jab = "";
			
			if (j.equalsIgnoreCase("presiden")) {
				jab = "Presiden";
			} else if (j.equalsIgnoreCase("perdana menteri")) {
				jab = "Perdana Menteri";
			} else if (j.equalsIgnoreCase("monarki")) {
				jab = "Raja";
			}
			
			System.out.println("Negara " + negara.getNamaNegara() + " mempunyai " + jab + " bernama " + negara.getNamaPemimpin());
			
			if(!j.equalsIgnoreCase("monarki")) {
				String namaB = bulanList.get(negara.getBulanKemerdekaan());
				System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + namaB + " " + negara.getTahunMerdeka());
			}
			System.out.println();
		}
    	scan.close();
    	
    }
        
}