import java.util.*
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd rane program");
		System.out.println("\nEnter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("\nOdd numbers are");
		for(int i=0;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
