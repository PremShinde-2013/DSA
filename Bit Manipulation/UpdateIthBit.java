public class UpdateIthBit {
    public static int ClearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return ClearIthBit(n, i);
        // } else {
        // return setIthBit(n, newBit);
        // }
        n = ClearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 0));

    }
}