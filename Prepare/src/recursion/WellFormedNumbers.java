package recursion;

public class WellFormedNumbers {
	static StringBuffer s=new StringBuffer();
	static void wellFormed(int index, int n)
	{
		int i;
		if(n>9)
		{
			System.out.println("Cannot form Well Formed NUmbers with the given size of n");
			return;
		}
		if(s.length()==n)
		{
			System.out.print(s.toString()+"\n");
			return;
		}
		for(i=index;i<10;i++)
		{
			s.append(i);
			wellFormed(i+1,n);
			s.delete(s.length()-1,s.length());
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(s.toString());
		wellFormed(1,3);
		System.out.println("\n\n"+s.toString());
	}
}
