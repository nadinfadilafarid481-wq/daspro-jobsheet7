import java.util.Scanner;

public class TarifParkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do{
            System.out.println("masukkan jenis kendaraan (1 = mobil, 2 = motor, 0 untuk selesai):");
            jenis = sc.nextInt();
            
            if (jenis == 0){
                System.out.println("transaksi seleai");
                break;
            }
            if(jenis == 1 || jenis == 2){
                System.out.println("masukkan durasiparkir:");
                durasi = sc.nextInt();

                if (jenis == 1){
                    total += durasi * 3000;
                }else{
                    total += durasi * 2000;
                }
            }
            System.out.println("total biaya parkir adalah:Rp."+ total);
        } while (true);
    }
}