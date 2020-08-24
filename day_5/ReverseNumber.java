package day_5;



public class ReverseNumber {

	public static void  revNumber(int number) {
		if (number<10)
		{
			System.out.println(number);
			return;
		}
		else
		{
			System.out.println(number%10);
			revNumber(number/10);
		}
	}

}
