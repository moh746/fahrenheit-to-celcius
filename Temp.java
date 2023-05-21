import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
		int temc;
 Scanner f = new Scanner(System.in);
 System.out.println("Enter the temperature in fahrenheit");
 String temf = f.nextLine();
 int i=Integer.parseInt(temf);  
   temc = (i-32) * 5/9;
   System.out.println(temc);
	}
}