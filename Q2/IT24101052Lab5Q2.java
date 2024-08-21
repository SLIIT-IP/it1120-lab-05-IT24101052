import java.util.Scanner;
public class IT24101052Lab5Q2
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int number;
		int type;
		System.out.println("Enter the number of members introduced:");
		number= input.nextInt();
		if(number< 0)
		{
			System.out.println("Input must be a number 0 or greater");
		}
		else
		{
			switch(number)
			{
				case 0 :System.out.println("No prize");
				break;
				case 1 :System.out.println("Prize is a : Pen");
				break;
				case 2 :System.out.println("Prize is a : Umbrella");
				break;
				case 3 :System.out.println("Prize is a : Bag");
				break;
				case 4 :System.out.println("Prize is a : Travelling chair");
				break;
				default :System.out.println("Prize is a : Headphone");
			}
		}
	}
}

				











