import java.util.Scanner;

public class kelas1 {
 Double ttlhrg,diskon,ttl,bayar,kmbl; 
 int barang;
 Scanner my = new Scanner(System.in);
  String[] list = {"Masker","Beras"};
	 int [] harga = {4000,3000};	
  void menu(){
      System.out.println("LIST Menu ");
      System.out.println("1.Member ");
      System.out.println("2.NonMember ");
      System.out.println("Pilihan anda : ");
  }
 static void listbarang(){
System.out.println("LIST barang yang tersedia");
System.out.println("1.Masker");
System.out.println("2.Beras");
System.out.print("Masukan pilihan Anda : ");
}
void member (){   	
     listbarang();
     do{
     barang = my.nextInt();
      if(barang>2||barang<1){
		 System.out.println("mohon masukan nomor 1,2");}		 
     }while(barang>2||barang<1);
    int price = harga[barang-1];
	    String ls = list[barang-1];    
     System.out.println ("barang yang anda beli : "+ls);
     System.out.println ("Harga Barang : Rp. "+price);
     System.out.print ("Masukan jumlah barang : ");
     diskon=my.nextDouble();
     ttl=diskon*price;
     ttlhrg=ttl*0.1;
     System.out.println ("anda mendapatkan diskon : Rp."+ttlhrg); 
     System.out.print ("masukan pembayaran anda : Rp.");
     do{
     bayar=my.nextDouble();
     kmbl=bayar-ttlhrg;
     if(bayar<ttlhrg){
     System.out.println("Uang anda kurang mohon coba lagi");}	
     }while(bayar<ttlhrg);
      System.out.println ("Kembalian anda : Rp."+kmbl);
 
		 }
 

 void nonmember(){
     listbarang();
     do{
     barang = my.nextInt();
      if(barang>2||barang<1){
		 System.out.println("mohon masukan nomor 1,2");}	
     }while(barang>2||barang<1);   	
           int price = harga[barang-1];
	    String ls = list[barang-1];    
     System.out.println ("barang yang anda beli : "+ls);
     System.out.println ("Harga Barang : Rp."+price);
     System.out.print ("Masukan jumlah barang : ");
     diskon=my.nextDouble();
      ttl=diskon*price;
    System.out.println ("Bayaran Anda : Rp."+ttl); 
     System.out.print ("masukan pembayaran anda : Rp.");
     do{
     bayar=my.nextDouble();
     kmbl=bayar-ttl;
     if(bayar<ttl){
     System.out.println("Uang anda kurang mohon coba lagi");}	
     }while(bayar<ttl);
      System.out.println ("Kembalian anda : Rp."+kmbl);
      
}
 }
