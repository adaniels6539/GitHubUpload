
public class workouts4 {
	{
	{
		public static void main (String args[])
		{
			String firstName = "Karol";
			String middleName = "Josef";
			String lastName = "Wojtyla";
			String fullName = join(firstName,middleName,lastName);
			System.out.println(fullName);
		}
		
		public static String join(String n1, String n2, String n3)
		{
			String n4 = n3 + ", " + n1;
			return n4;
		}
	} 

}
}