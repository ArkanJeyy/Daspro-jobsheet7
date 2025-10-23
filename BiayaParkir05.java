import java.util.Scanner;

public class BiayaParkir05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int jenis = 0;
        int durasi = 0;
        int total = 0; 

        System.out.println("=== Program Penghitung Biaya Parkir ===");
        
        while (true) {
            
            
            System.out.println("\n-------------------------------------");
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");

            // Input jenis
            if (scanner.hasNextInt()) {
                jenis = scanner.nextInt();
            } else {
                System.out.println("⚠️ Input tidak valid. Harap masukkan angka.");
                scanner.next(); 
                continue; 
            }

           
            if (jenis == 0) {
                break; 
            }
            
            
            if (jenis == 1 || jenis == 2) {
                
                
                System.out.print("Masukkan durasi parkir (jam): ");
                if (scanner.hasNextInt()) {
                    durasi = scanner.nextInt();
                    if (durasi <= 0) {
                         System.out.println("⚠️ Durasi harus lebih dari 0.");
                         continue;
                    }
                } else {
                    System.out.println("⚠️ Input durasi tidak valid. Harap masukkan angka.");
                    scanner.next(); 
                    continue; 
                }
                
               
                if (durasi > 5) {
                    total += 12500;
                    System.out.printf("Transaksi: %s (%d jam). Biaya tetap (max): Rp %,d%n", 
                                      (jenis == 1 ? "Mobil" : "Motor"), durasi, 12500);
                } 
                
                else {
                   
                    if (jenis == 1) {
                        total += durasi * 3000;
                        System.out.printf("Transaksi: Mobil (%d jam). Biaya: Rp %,d%n", 
                                          durasi, durasi * 3000);
                    } 
                    
                    else if (jenis == 2) {
                        total += durasi * 2000;
                        System.out.printf("Transaksi: Motor (%d jam). Biaya: Rp %,d%n", 
                                          durasi, durasi * 2000);
                    }
                   
                }

            } else {
                // Jika jenis != 1 dan jenis != 2
                System.out.println("⚠️ Pilihan jenis kendaraan tidak valid.");
            }
        }
        
        scanner.close();

        // Output total
        System.out.println("\n======================================");
        System.out.println("Program Selesai.");
        System.out.printf(" TOTAL PENDAPATAN PARKIR HARI INI: Rp %,d%n", total);
        System.out.println("======================================");
    }
}