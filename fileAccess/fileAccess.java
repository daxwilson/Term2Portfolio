import java.io.*;
import java.util.*;

public class fileAccess {
  public static void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);
    String[] question = new String[10];
    Random random = new Random();  
    String questions = "";
    String answer = "";
    
    question[0] = "Is this the real life?";
    question[1] = "Is this just fantasy?";
    question[2] = "Where did you come from, where did you go?";
    question[3] = "What is love?";
    question[4] = "What is the airspeed velocity of an unladen sparrow?";
    question[5] = "What is consciousness?";
    question[6] = "Do you have free will?";
    question[7] = "What is the theory of everything?";
    question[8] = "Why is there something rather than nothing?";
    question[9] = "What is the answer to life, the universe and everything?";

    questions = question[random.nextInt(10)];
    System.out.println(questions);
    answer = keyboard.nextLine();
    
    File file = new File("output.txt");
    
    try {
        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        output.write(questions);
        output.newLine();
        output.write(answer);
        output.close();
      } catch ( IOException e ) {
         e.printStackTrace();
      }
   }
}