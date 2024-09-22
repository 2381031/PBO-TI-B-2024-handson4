public class ContohMethodStaticDanNonStatic {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public void tampilkanPesanSelamatDatang(String nama) {
        System.out.println("Selamat datang " + nama + "!");
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi: " + luasPersegi);

        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanPesanSelamatDatang("John");
        objek.hitungLuas(5);
    }
}
