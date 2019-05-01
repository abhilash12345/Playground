import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner Sc = new Scanner(System.in);
      int num1=Sc.nextInt();
      int num2 = num1/100;
    int num3 = (num1/10)%10;
    int num4 = num1%10;
    int num5 = num4*100+num3*10+num2;
      
      
      System.out.println(num5);
  }
}