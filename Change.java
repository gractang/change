public class Change 
{
	public static final int PENNY = 1;
	public static final int NICKEL = 5;
	public static final int DIME = 10;
	public static final int QUARTER = 25;

	public static void main(String[] args)
	{
		System.out.println(numWaysMakeChange(0)); //1
		System.out.println(numWaysMakeChange(6)); //2
		System.out.println(numWaysMakeChange(11)); //4
	}


	public static int numWaysMakeChange(int cents)
	{
		return numWaysMakeChange(cents, QUARTER);
	}

	private static int numWaysMakeChange(int cents, int coin)
	{
		//System.out.println("cents:" + cents);
		if(cents == 0)
		{
			return 1;
		}
		if(cents < 0)
		{
			return 0;
		}
		int sum = 0;
		if (coin == QUARTER)
		{
			return numWaysMakeChange(cents - QUARTER, QUARTER) + 
			numWaysMakeChange(cents - DIME, DIME) + 
			numWaysMakeChange(cents - NICKEL, NICKEL) + 
			numWaysMakeChange(cents - PENNY, PENNY);
		}
		else if (coin == DIME)
		{
			return numWaysMakeChange(cents - DIME, DIME) + 
			numWaysMakeChange(cents - NICKEL, NICKEL) + 
			numWaysMakeChange(cents - PENNY, PENNY);
		}
		else if (coin == NICKEL)
		{
			return numWaysMakeChange(cents - NICKEL, NICKEL) + 
			numWaysMakeChange(cents - PENNY, PENNY);
		}
		else
		{
			return numWaysMakeChange(cents - PENNY, PENNY);
		}
	}
}
