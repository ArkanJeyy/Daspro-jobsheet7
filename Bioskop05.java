import java.util.Scanner;

public class Bioskop05 {
    private static final int HARGA_TIKET = 50000;
    public static double hitungTotalBayar(int jumlahTiket) {
        double diskon = 0.0;
        
        
        if (jumlahTiket > 10) {
            diskon = 0.15; 
        } else if (jumlahTiket > 4) {
            diskon = 0.10; 
        } 
        
        double hargaAwal = (double) jumlahTiket * HARGA_TIKET;
        double hargaBersih = hargaAwal * (1.0 - diskon); 
        return hargaBersih;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Akumulator
        int totalTiketTerjual = 0;
        double totalPendapatanHarian = 0.0;
        int jumlahTransaksi = 0;
        
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        
            int jumlahTiket;

        do {
            System.out.println("\n--- Transaksi ke-" + (jumlahTransaksi + 1) + " ---");
            System.out.print("Masukkan jumlah tiket yang dibeli (Ketik 0 untuk selesai): ");
            
            
            if (!scanner.hasNextInt()) {
                System.out.println(" Masukan tidak valid. Harap masukkan angka.");
                scanner.next(); 
                continue; 
            }
            
            jumlahTiket = scanner.nextInt();
            
            if (jumlahTiket < 0) {
                 System.out.println(" Jumlah tiket tidak boleh negatif.");
                 continue;
            }
            
            if (jumlahTiket == 0) {
                break; 
            }
            
            double hargaBayar = hitungTotalBayar(jumlahTiket);
            
            totalTiketTerjual += jumlahTiket;
            totalPendapatanHarian += hargaBayar;
            jumlahTransaksi++;

            System.out.printf("   Harga satuan: Rp %,d%n", HARGA_TIKET);
            System.out.printf("   Diskon: %.0f%%%n", (jumlahTiket > 10 ? 15.0 : (jumlahTiket > 4 ? 10.0 : 0.0)));
            System.out.printf("   TOTAL BAYAR: Rp %,.2f%n", hargaBayar);
            
        } while (true);
        

        // --- Tampilkan Laporan Total Harian ---
        System.out.println("\n===========================================");
        System.out.println("     LAPORAN TOTAL PENJUALAN HARI INI      ");
        System.out.println("===========================================");
        System.out.printf(" Total Transaksi: %d%n", jumlahTransaksi);
        System.out.printf(" TOTAL TIKET TERJUAL: %d tiket%n", totalTiketTerjual);
        System.out.printf(" TOTAL PENDAPATAN BERSIH: Rp %,.2f%n", totalPendapatanHarian);
        System.out.println("===========================================");

        scanner.close();
    }
}