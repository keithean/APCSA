//Given 2 ints, n1 and n2, return their sum. However, sums in the range 10..19 inclusive, are forbidden, 
//so in that case just return 20.
public static void kindaSum(int n1, int n2) {
    if((n1 + n2) <= 19 & (n1 + n2) >= 10){
        return 20;
    }
    return n1 + n2
}