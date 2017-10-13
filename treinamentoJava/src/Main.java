public class Main {

    public static void main(String[] args){

        byte b = 127;
        short s = 32000;
        int i = 250000;
        long l = 50000 + (10*(b+s+i));
        short shortTotal = (short) (1000 + (10 * (b+s+i)));
        System.out.println(l);
        System.out.println(shortTotal);

    }
}
