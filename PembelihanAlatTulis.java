package Perulangan;
import java.util.Scanner;
public class PembelihanAlatTulis {
    public static void main(String[] args) {
        int pilihan, jumlah=0;
        double harga=0, total,temp=0;
        String tambahBeli;

        do{

        Scanner s = new Scanner(System.in); 
        System.out.println("List Alat Tulis");
        System.out.println("1. Buku 4000\n3. Pensil 2500\n3. penghapus : 1000\n4. penggaris : 2500");
        System.out.println("inputrkan pembelian dengan angka");
        pilihan=s.nextInt();
        System.out.println("jumblah beli");


        switch (pilihan) {
            case 1:
                harga=4000;
                break;
             case 2:
                harga=2500;
                break;
            case 3:
                harga=1000;
                break;
            case 4:
                harga=2500;
                break;
                
        
            default:
                break;

        } 
        total=jumlah*harga;
        temp += total;

        System.out.println("apakah anda mau membeli lagi (ya/tidak)");
        tambahBeli = s.next();


    }while (tambahBeli.equalsIgnoreCase("ya"));

    System.out.println("total yg dibayarkan");
}
}