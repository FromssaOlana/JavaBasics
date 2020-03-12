package JavaBasics.Selections;
/**
 * Author Fromssa Olana
 */

/*
write a program to count the occurrences of each letter in an array of
characters.
 */

import java.util.Random;

public class CountOccurrenceOfLatter {
    public static void main(String[] args) {
        char[] chars = createCharArray();
        printArray(chars);

       int[] counts = countOccurrences(chars);
        System.out.println();

        printOccurrences(counts);
    }

   private static void printOccurrences(int[] counts) {
       for (int i = 0; i < counts.length; i++) {
           if ((i+1)%7 == 0){
               System.out.println((char)(i+'a') +" = "+ counts[i] +" ");
           }else
               System.out.print((char)(i+'a') +" = "+ counts[i]+ " ");
       }
  }

  private static int[] countOccurrences(char[] chars) {
        int[] result = new int[26];

      for (char aChar : chars) {
          result[aChar - 'a']++; // takes a char from chars -> number add it to 'a'
      }
        return result;

   }

    private static  void printArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i +1)%20 == 0){
                System.out.println(chars[i]+" ");
            }else
                System.out.print(chars[i]+" ");
        }


    }

    private static char[] createCharArray() {
        char[] retArray = new char[100];
        Random rnd = new Random();
        for (int i = 0; i < retArray.length;i++){
            retArray[i] = (char) (rnd.nextInt(26) + 'a');
        }
        return retArray;
    }

}
