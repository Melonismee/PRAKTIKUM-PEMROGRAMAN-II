package PRAK203_2410817210024_MUHAMMADIBNUSINA;

public class Soal3Main { 
    public static void main(String[] args) { 
        Pegawai p1 = new Pegawai(); 
        // kurang nya tanda ; diakhir
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin");
        //perlu menambahkan nilai pada variabel umur;
        //p1.umur perlu ditambahkan
        p1.umur = 17;
 
        //perlu menambahkan Pegawai setelah nama
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal()); 
        System.out.println("Jabatan: " + p1.jabatan);
        //perlu menambahkan tahun setelah umur di cetak
        //System.out.println("Umur: " + p1.umur); 
        System.out.println("Umur: " + p1.umur + " tahun"); 
        } 
    }