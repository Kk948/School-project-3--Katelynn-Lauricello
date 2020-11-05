import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int [] seats = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

     Scanner Scanner= new Scanner(System.in);
   for(int i=0; i<14; i++)
    {
      System.out.println("What's your name?");
      String name = Scanner.next();
      System.out.println(name + "you will sit at " + name [i]);
    }

  }
}