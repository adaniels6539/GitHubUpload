
public class workouts9 {

		public static void main (String args[])
		{
			System.out.println(qwerty1(qwerty2(100)));
			System.out.println(qwerty2(qwerty1(100)));
		}
		
		public static int qwerty1(int x)
		{
			x+=10;
			return x;
		}
		
		public static int qwerty2(int x)
		{
			x /= 2;
			return x;
		}	
	} 


