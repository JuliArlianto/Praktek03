
package praktek03;


public class PakaianAksi {
    public static void main(String[] args) {
         Pakaian p = new Pakaian();
       
         p.setMerk("Lois");
         p.setWarna("Black");
         p.setHarga(150000);
         
         p.cetakInfo();
         
         System.out.print("Merknya \t: ");
         System.out.println(p.getMerk());
         System.out.print("Warnanya \t: ");         
         System.out.println(p.getWarna());
         System.out.print("Harganya \t: ");
         System.out.println(p.getHarga());
         
    }
    
}
