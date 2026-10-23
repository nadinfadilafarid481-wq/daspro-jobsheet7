import java.util.Scanner;
public class TiketBioskop26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml, hargaTiket = 50000, diskon, harga, totalHarga, totalDiskon;

        do {
            System.out.println("masukkan jumlah tiket (0 untuk selesai): ");
            jml = sc.nextInt();

            if (jml < 0){
                System.out.println("jumlah tidak valid!");
                continue;
            }
            if (jml == 0){
                break;
            }
            harga = jml * hargaTiket;

            if (jml > 10){
                diskon = 15;
            }else if (jml > 4){
                diskon = 10;
            }else{
                diskon = 0;
            }
            totalDiskon = harga * diskon / 100;
            totalHarga = harga - totalDiskon;

            System.out.println("harga sebelum diskon :Rp."+ harga);
            System.out.println("total diskon harga   :Rp."+ totalDiskon);
            System.out.println("harga setelan diskon :Rp."+ totalHarga);
            System.out.println("tottal tiket terjual :Rp."+ jml +"tiket");
            System.out.println("total harga tiket    :Rp."+ totalHarga);
        }while (true);
        System.out.println("transaksi selesai");
    }
}