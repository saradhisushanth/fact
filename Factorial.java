import java.util.Scanner;

public class Factorial{
	public static void main(String[] args)
{
		Scanner scanner=new
Scanner(System.in);
	System.out.print("Enter a number");
	int number= scanner.nextInt();
	long factorial=calculatedFactorial(number);
	System.out.println("The factorial of" + "is"+factorial);
	scanner.close();
	}
public static long calculatedFactorial(int n){
	if (n<0){
		System.out.println("Factorial is not defined for negative numbers.");
		return -1:
		}
	long result=1;
	for(int i=1; i<=n;i++){
		result *=i;
		}
	return result:
	}
}