/* Create a function called longestWordLen that receives a sentence and returns the length of the longest word in the sentence.
longestWordLen("What is the longest word in this sentence.") --> 8
longestWordLen("What you most thankful for?" --> 8
longestWordLen("Let's go Tigers!") --> 6
Couple things to consider:
A word is determined if it ends with a space except if it's the last word in a sentence.
Assuming the end of sentence will have a punctuation mark, you must ignore last character.
*/
public class dailycodingjan12 {
    public static void main(String[] args){
        longestWordLen("What do you think about this sentence?");
    }
    public int longestWordLen(String sentence) {
        String[] wordArray = sentence.split(" ");
        int currentLongestWordLength = 0;
        int length1;
        for (int i = 0; i < wordArray.length(); i++){
            if (i = wordArray.length()){
                length1 = wordArray[i].length() - 1; 
            }
            else {
                length1 = wordArray[i].length()
            }
            if (length1 >= currentLongestWordLength){
                currentLongestWordLength = length1;
            }
        }
        return currentLongestWordLength;
    }
    
}



