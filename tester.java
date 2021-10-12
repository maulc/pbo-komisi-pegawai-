package inheritance;

public class tester {
     public static void main(String args[]){
        komisipegawai komisiPegawai = new komisipegawai("maula", "cahya", "222-22-2222", 10000, .06);
                gajipluspegawai gajiPlusKomisiPegawai = new gajipluspegawai("winter", "kurniawan",
                                "333-33-3333", 5000, .04, 300);
                 System.out.printf("%s %s:\n\n%s\n\n", "Memanggil KomisiPegawai dengan referensi superclass ",
                                "ke superclass object", komisiPegawai.toString());
                System.out.printf("%s %s:\n\n%s\n\n", "Memanggil GajiPlusKomisiPegawai toString dengan subclass",
                                "referensi ke subclass object", gajiPlusKomisiPegawai.toString());
                komisipegawai  komisiPegawai2 = gajiPlusKomisiPegawai;
                System.out.printf("%s %s:\n\n%s\n\n", "Memanggil GajiPlusKomisiPegawai toString dengan superclass",
                                "referensi ke subclass object", komisiPegawai2.toString());
    }
}
