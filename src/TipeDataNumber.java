public class TipeDataNumber {
    public static void main(String[] args) {
        // INI TIPE DATA INT
        byte    iniByte     = 100;
        short   iniShort    = 10000;
        int     iniInt      = 1000000000;
        long    iniLong     = 1000000000; // tidak bisa lebih karena tidak ditandai dengan "L"
        long    iniLong2    = 1000000000000L;

        // INI TIPE DATA FLOAT
        float   iniFloat    = 10.17F;
        double  iniDouble   = 10.17;

        // KODE : LITERAL
        int     decimalInt      = 34;
        int     hexaDecimal     = 0XFFFFF;
        int     binaryDecimal   = 0b101010100;

        // KODE : UNDERSCORE (_)
        int balance = 1_000_000_000;
    }
}
