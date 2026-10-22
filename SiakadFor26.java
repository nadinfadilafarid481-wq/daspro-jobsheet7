import java.util.Scanner;

public class SiakadFor26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lulus =0, tidakLulus=0;
        double nilai,tertinggi = 0, terendah = 100;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("masukkan nilai mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            
        }
    System.out.println("nilai tertinggi: "+ tertinggi);
    System.out.println("nilai terendah: "+ terendah);

    } 
}