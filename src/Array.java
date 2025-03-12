public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[5];
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "Java";
        stringArray[3] = "Program";
        stringArray[4] = "Java";

        for (String s : stringArray) {
            System.out.println(s + ", ");
        }

        System.out.println("=========================");

        String[] arrayBuah = {
                "Apel", "Melon", "Jeruk", "Mangga"
        };

        arrayBuah[0] = "Durian";
        arrayBuah[1] = null;
        // ARRAY TIDAK BISA DIHAPUS, NAMUN BISA DIKOSONGKAN TERGANTUNG NILAI DEFAULT PRIMITIFNYA

        long[] arrayLong = new long[]{
            100L, 200L, 300L, 400L,
        };
        arrayLong[0] = 0;

        //ARRAY DIDALAM ARRAY
        String[][] arrayWarna = {
                {"Merah", "Kuning"},
                {"Hijau", "Biru"},
                {"Putih", "Abu-abu", "Hitam"}
        };
        System.out.println(arrayWarna[0][1]);
        System.out.println(arrayWarna[1][1]);
        System.out.println(arrayWarna[2][2]);

    }
}
