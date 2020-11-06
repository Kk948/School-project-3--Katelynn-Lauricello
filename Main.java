import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int [] seats = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

    String [] names = new String [15];


     Scanner Scan= new Scanner(System.in);
   for(int i=0; i<=14; i++)
    {
      System.out.println("What's your name?");
      names[i] = Scan.next();
      System.out.println(names[i] + " you will sit at seat " + seats[i]);
    }
    int i = 0;
   while (i <= 14)
   {
      System.out.println(names[i] + " will sit at" + seats[i]);
    i++;
    
   }
      
  }
}