import java.util.Scanner;
public class W03_P3{
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
//Use while loop to count number of digits in an integer

int count = 0;
  
      while (num != 0) {
        // num = num/10
        num /= 10;
        ++count;
      }
  
      System.out.print(count);
}
}