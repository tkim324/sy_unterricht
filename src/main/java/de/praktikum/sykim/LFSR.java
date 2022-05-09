package de.praktikum.sykim;

public class LFSR {

    // 16 bitㄴ
    private static final int M = 16;
    private static final int[] TAPS = {2, 7, 12, 16};

    private final boolean[] bits = new boolean[M + 1];

    public LFSR(int seed) {
        for (int i = 0; i < M; i++) {
            bits[i] = (((1 << i) & seed) >>> i) == 1;
        }
    }

    /* generate a random int uniformly on the interval [-2^31 + 1, 2^31 - 1] */
    public int nextInt() {
        printBits();

        // calculate the integer value from the registers
        int next = 0;
        for (int i = 0; i < M; i++) {
            next |= (bits[i] ? 1 : 0) << i;
        }

        // allow for zero without allowing for -2^31
        if (next < 0) next++;

        // calculate the last register from all the preceding
        bits[M] = false;
        for (int i = 0; i < TAPS.length; i++) {
            bits[M] ^= bits[M - TAPS[i]];
        }

        // shift all the registers
        for (int i = 0; i < M; i++) {
            bits[i] = bits[i + 1];
        }

        return next;
    }

    private void printBits() {
        System.out.print(bits[M] ? 1 : 0);
        System.out.print(" -> ");
        for (int i = M - 1; i >= 0; i--) {
            System.out.print(bits[i] ? 1 : 0);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LFSR lfsr = new LFSR(0xFFFF);
        // (a)
        for (int i = 1; i <= 64; i++) {
            int next = lfsr.nextInt();
        }

//        // (B)
//        int i = 0;
//        while(true){
//            System.out.println("#" + i);
//            int next = lfsr.nextInt();
//            if(i > 1){
//                if(next == 0xFFFF) break;
//            }
//            i++;
//        }
    }

}
