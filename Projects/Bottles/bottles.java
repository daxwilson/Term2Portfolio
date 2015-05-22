public class bottles {
  public static void main(String[] args) {
    int y = 99;
      while(y > 1) {
      System.out.println(y + " bottles of beer on the wall,");
      System.out.println(y + " bottles of beer!");
      System.out.println("Take one down, pass it around,");
      System.out.println(y-1 + " bottles of beer on the wall!");
      y--;
      }
      if(y == 1) {
      System.out.println(y + " bottle of beer on the wall,");
      System.out.println(y + " bottle of beer!");
      System.out.println("Take one down, pass it around,");
      System.out.println(y-1 + " bottles of beer on the wall!");
      }
  }
}