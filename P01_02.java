//12S23029 - Sintong Hutapea
import java.util.*;
import java.lang.Math;

class P01_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;
        int kapasitasGudang;
        int jumlahBukuSaatIni;
        String aC;
        String lantai;
        String ketersediaanTeknologi;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBukuSaatIni = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi);
    }
}
