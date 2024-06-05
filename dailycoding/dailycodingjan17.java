/*Create a function that receives an array of Strings (popcorn, ice cream, cotton candy, licorice) 
and combines them into a string and returns it with , between them and for the last element includes "and"

String [] words = {"popcorn", "ice cream", "licorice", "cotton candy"}

concatArr(words) // returns popcorn, ice cream, licorice, and cotton candy.

*/
public static String concatArr(String [] words) {
    String result = "";
    for (int i = 0; i < words.length-1; i++){
         result += words[i] + ", ";
    }
    result += "and " + words[words.length-1];
    return result;
}