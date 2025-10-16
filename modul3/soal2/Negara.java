package soal2;

public class Negara {
    private String namaNegara;
    private String kepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunMerdeka;
    
    public Negara(String namaNegara, String kepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
		this.namaNegara = namaNegara;
		this.kepemimpinan = kepemimpinan;
		this.namaPemimpin = namaPemimpin;
		this.tanggalKemerdekaan = tanggalKemerdekaan;
		this.bulanKemerdekaan = bulanKemerdekaan;
		this.tahunMerdeka = tahunKemerdekaan;
	}
    
    public Negara(String namaNegara, String kepemimpinan, String namaPemipin) {
		this(namaNegara, kepemimpinan, namaPemipin, 0, 0, 0);
	}
    
    public String getNamaNegara() {
		return namaNegara;
	}
    
    public String getKepemimpinan() {
		return kepemimpinan;
	}
    
    public String getNamaPemimpin() {
		return namaPemimpin;
	}
    
    public int getTanggalKemerdekaan() {
		return tanggalKemerdekaan;
	}
    
    public int getBulanKemerdekaan() {
		return bulanKemerdekaan;
	}
    
    public int getTahunMerdeka() {
		return tahunMerdeka;
	}
}
