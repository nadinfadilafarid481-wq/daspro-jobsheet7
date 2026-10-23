import java.util.Scanner;
/**
 * kafeDowhile26
 */
public class kafeDowhile26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000,totalHarga; 
        String namaPelangga;

        do {
            System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelangga = sc.nextLine();
            if (namaPelangga.equalsIgnoreCase("batal")){
                System.out.println("transaksi dibatalkan.");
                break;
            }
            System.out.println("jumla kopi: ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar: Rp"+ totalHarga);
            sc.nextLine();
        }while (true);
    }
}