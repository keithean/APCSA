class Main {
    public static void main(String[] args) {
        String [] words = {"Abraham", "John", "Tony"};
        System.out.println(concatArr(words));  // outputs "Abraham, John, and Tony"

        int [] newArr = arrAscending(5);
        for (int val : newArr) {
            System.out.print(val);
        }
        System.out.println();
    }

    public static String concatArr(String [] words) {
        String result = "";
        for (int i = 0; i < words.length-1; i++){
             result += words[i] + ", ";
        }
        result += "and " + words[words.length-1];
        return result;
    }

    public static int [] arrAscending(int num) {
        int [] arrToNum = new int[num];
        for (int i = 0; i < num; i++) {
            arrToNum[i] = i;
        }
        return arrToNum;
    }
}