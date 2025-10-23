
import java.util.Scanner;

public class CafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hrgKopi = 12000, hrgTeh = 7000, hrgRoti = 20000;
        String nmPelanggan;


            do {            
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) :");
            nmPelanggan=sc.nextLine();
            if (nmPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi Dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi=sc.nextInt();
            System.out.print("Jumlah teh :");
            teh=sc.nextInt();
            System.out.print("Jumlah roti :");
            roti=sc.nextInt();

            int totalHarga = (kopi * hrgKopi) + (teh * hrgTeh) + (hrgRoti * roti);
            System.out.println("Total yang harus dibayar adalah : Rp" + totalHarga);
            sc.nextLine();

        }while (true) ; 
            System.out.println("Semua transaksi selesai. ");
            
        }
    }

