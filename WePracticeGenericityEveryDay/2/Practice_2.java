public class Practice_2
{
	private static double f(double i)
	{
		if (i==0)
		{
			return 1;
		}
		return i*f(i-1);
	}
	public static void main(String args[])
	{
		int i;
		i = 9;
		double result = f(170);
		System.out.println(result);
	}
}
/*
f(171)==
Infinity
f(170)==
7.257415615307994E306
*/