package PRAK203_2410817210024_MUHAMMADIBNUSINA;

//nama class yang salah, seharusnya Pegawai bukan employee
//public class Employee { 
public class Pegawai {
   public String nama; 
   //kesalahan tipe data, seharusnya menggunakan string bukan char
   //public char asal; 
   public String asal;
   public String jabatan; 
   public int umur; 

   public String getNama() { 
       return nama; 
   } 

   public String getAsal() { 
       return asal; 
   } 

   //tidak memasukkan parameter String j pada method
   //public void setJabatan() {
   public void setJabatan(String j) {
       this.jabatan = j; 
   } 
   }