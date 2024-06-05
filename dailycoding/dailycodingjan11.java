/* You have a lottery ticket, with ints a, b, and c on it. If the 
 * numbers are all different from each other, the result is 1. If all of the 
 * numbers are the same, the result is 10. If two of the numbers are the 
 * same, the result is 20.  
 */
public static void checkLottery (int a, int b, int c){
    if (a == b && b == c){
        return 10;
    }
    else if (a == b){
        return 20;
    }
    else if (b == c){
        return 20;
    }
    else if (a == c){
        return 20;
    }
    return 1;
}