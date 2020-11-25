import java.util.Scanner;

public class kelas {
 public static void main (String[] arguments){
     Scanner input = new Scanner (System.in);
     kelas1 masukan = new kelas1();
     String answer;
     do{
     masukan.menu();
     int b;
      do{
     b = input.nextInt();
      if(b>2 || b<1){
		 System.out.println("mohon masukan nomor 1,2");}
		 }
   while(b>2 || b<1);
     switch(b){
         case 1:
             masukan.member();
             break;
         case 2:
             masukan.nonmember();
             break;
       
     }
     System.out.println("coba lagi? ");
        answer = input.next();			 
}
while (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("y"));
 }
}
