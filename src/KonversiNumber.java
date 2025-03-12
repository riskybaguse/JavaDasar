public class KonversiNumber {
    public static void main(String[] args) {

        // Widening Casting
        byte    iniByte     = 10;
        short   iniShort    = iniByte;
        int     iniInt      = iniShort;

        // Narrowing Casting
        byte    iniByte2    = (byte) iniInt;
        short   iniShort2   = (short) iniInt;

    }
}
