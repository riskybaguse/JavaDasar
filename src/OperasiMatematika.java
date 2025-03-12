public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Operasi Matematika
        int penjumlahan = a + b;
        int pengurangan = a - b;
        int perkalian = a * b;
        int pembagian = a / b;

        // Operasi Augmented
        int penambahan = a += 10;
        int pengurangannya = a -= 10;
        int perkaliannya = a *= 10;
        int pembagiannya = a /= 10;

        // Operasi Unary
        int negatif = -a;
        int positif = +a;
        int penjumahanUnary = ++a;
        int penguranganUnary = --a;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("=".repeat(100));

        System.out.println("Operasi Matematika");
        System.out.println("Hasil Penjumlahan = " + penjumlahan);
        System.out.println("Hasil Pengurangan = " + pengurangan);
        System.out.println("Hasil Perkalian = " + perkalian);
        System.out.println("Hasil Pembagian =  " + pembagian);

        System.out.println("=".repeat(100));

        System.out.println("Operasi Augmented Nilai a");
        System.out.println("Hasil Penambahan = " + penambahan);
        System.out.println("Hasil Pengurangannya = " + pengurangannya);
        System.out.println("Hasil Perkaliannya = " + perkaliannya);
        System.out.println("Hasil Pembagiannya =  " + pembagiannya);

        System.out.println("=".repeat(100));

        System.out.println("Operasi Unary Nilai a");
        System.out.println("Hasil Negatif = " + negatif);
        System.out.println("Hasil Positif = " + positif);
        System.out.println("Hasil Penjumahan Unary = " + penjumahanUnary);
        System.out.println("Hasil Pengurangan Unary = " + penguranganUnary);
    }
}
