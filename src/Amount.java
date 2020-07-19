import java.util.Scanner;

public class Amount {
public void Verify()
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>5000)
	{
		System.out.println("You can withdraw Amount");
	}
	
    else
	{
		try{
			throw new MinBalanceException();
		}
		catch(MinBalanceException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("close");
		}
	}
	
}

public static void main(string[] args)
{
	Amount s=new Amount();
	s.Verify();
}
}