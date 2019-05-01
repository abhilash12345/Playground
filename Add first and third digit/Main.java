import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = num1%10;
      int num3 = num1/100;
      int num4 = num2+num3;
      System.out.println(num4);
		
	}
}