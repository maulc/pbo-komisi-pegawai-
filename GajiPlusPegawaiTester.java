package gajipluspegawai;

public class GajiPlusPegawaiTester {
    public static void main(String[] args) {
         GajiPlusPegawai pegawai = new GajiPlusPegawai("maula","cahya", "222-22-2222", 10000.0, .06, 250.0);

        System.out.println("Informasi Pegawai berdasarkan method : \n");
        System.out.printf("%s %s\n", "Nama depan :", pegawai.getNamaDepan());
        System.out.printf("%s %s\n", "Nama belakang :", pegawai.getNamaBelakang());
        System.out.printf("%s %s\n", "Nomor KTP :", pegawai.getNomorKTP());
        System.out.printf("%s %.2f\n", "Penjualan :", pegawai.getPenjualan());
        System.out.printf("%s %.2f\n", "Komisi :", pegawai.getKomisi());
        System.out.printf("%s %.2f\n", "Pendapatan :", pegawai.pendapatan());
        System.out.printf("%s %.2f\n", "Gaji Pokok :", pegawai.getGajiPokok());

        pegawai.setGajiPokok(1000.0);

        System.out.printf("\n%s:\n\n%s\n", "Update Informasi Pegawai berdasarkan toString", pegawai);
    }   
}
