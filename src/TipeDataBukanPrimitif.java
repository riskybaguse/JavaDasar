public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer nilai       = 10;
        Long    nilaiLong   = 10000L;

        Byte iniByte  = null;
        Short iniShort = null;

        System.out.println(iniShort);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt; //konversi dari data primitif ke data bukan primitif

        short   iniShort2 = iniObject.shortValue();
        long    iniLong = iniObject.longValue();
        float   iniFloat = iniObject.floatValue();

        Long amount = 10000L;
    }
}
