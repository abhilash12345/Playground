import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l_d = n%10;
      
      int f_d = n;
      while(n>=10)
      {
        n = n/10;
      }
      
      f_d =n;
      int sum = f_d+l_d;
      System.out.println(sum);
      
      
	}
}