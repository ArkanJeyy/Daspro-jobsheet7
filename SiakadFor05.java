
import java.util.Scanner;

public class SiakadFor05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai,jmlhLulus=0, jmlhTakLulus=0, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i +": ");
            nilai=sc.nextDouble(); 
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai <= 60) {
                jmlhLulus++;
            }else{
                jmlhTakLulus++;
            }
        }

        sc.close();

        System.out.println("Nilai tertinggi :" + tertinggi);
        System.out.println("Nilai terendah :" + terendah);
        System.out.println("Jumlah mahasiswa yang lulus :" + jmlhLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus :" + jmlhTakLulus);
    }
    
}