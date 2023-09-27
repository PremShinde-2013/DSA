
public class ClearLastiBit {

    public static int setIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(15, 2));

    }
}
