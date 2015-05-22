import java.io.*;
import java.util.Scanner;

public class StringDemo{
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int i = 1;
    System.out.println("Enter a word or phrase to translate: ");
    String phrase = keyboard.nextLine();
    for(String pygWord: phrase.split(" ")) {
      String newPygWord = new String (pygWord);
      if(pygWord.charAt(0) == 'a' ||
         pygWord.charAt(0) == 'e' ||
         pygWord.charAt(0) == 'i' ||
         pygWord.charAt(0) == 'o' ||
         pygWord.charAt(0) == 'u') {
        System.out.print(pygWord + "way ");
      } 
      else if (newPygWord.charAt(0) == 'q' && newPygWord.charAt(1) == 'u') {
        System.out.print(newPygWord.substring(2) + "" + pygWord.charAt(0) + pygWord.charAt(1) + "ay ");
      }
      else {
        while (pygWord.charAt(0) != 'a' &&
         pygWord.charAt(0) != 'e' &&
         pygWord.charAt(0) != 'i' &&
         pygWord.charAt(0) != 'o' &&
         pygWord.charAt(0) != 'u' && 
         i < 1000) {
          i++;
          if(i==1000) {
            System.out.print(newPygWord + "ay ");
          } else {
            pygWord = (pygWord.substring(1) + pygWord.substring(0,1));
          }
        }
        if(i<1000) {
        System.out.print(pygWord + "ay ");
        }
      } i=1;
    }
  }
}


  



      