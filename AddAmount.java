import java.util.Scanner;
class AddAmount{
	int amount = 50;
	int profit;
	AddAmount()
	{
	this.profit = 0;
	System.out.println("Final Amount = $"+(amount+profit));
	}
	AddAmount(int profit)
	{
	this.profit = profit;
	System.out.println("Final Amount = $"+(amount+profit));
	}
	public void Repetition()
	{
		int Total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Amount to be Added:");
		for(int i = 0;;i++){
		int a = scanner.nextInt();
		if(a==0)
		{
			Total = (amount + a);
			break;
		}
		else
		{
			if(a==0)
			{
			Total = (amount + a);
			}
			else
			{
			Total = (amount+a);
			}
		}
		System.out.println("Updated Total Amount:"+Total);
		}
	}
	public static void main(String args[])
	{
	AddAmount obj1 = new AddAmount();
	AddAmount obj2 = new AddAmount(35);
	AddAmount function = new AddAmount();
	function.Repetition();
	}
	}