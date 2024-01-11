//The number 7 is a truly great number. 
//Given two int values, n1 and n2, return true if either one is 7. Or if their sum or difference is 7. 
//Note: the function Math.abs(num) computes the absolute value of a number.

 

public boolean love7(int n1, int n2) {
    if (n1 == 7){
        return true;
    }
    else if (n2 == 7){
        return true;
    }
    else if ((n1 + n2 == 7)){
        return true;
    }
    else if ((math.abs(n1-n2)) == 7){
        return true;
    }
    return false;
}

