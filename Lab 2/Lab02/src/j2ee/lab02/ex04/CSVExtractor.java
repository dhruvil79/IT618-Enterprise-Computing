package j2ee.lab02.ex04;

public class CSVExtractor {
	public static void main(String args[])
	{
		String s =new String("3.5, 12.9, 18.7, 121.54, 4.5, 78.9, 85.2");
		String[] sr=s.split(", ");
		double arr[]=new double[sr.length];
		System.out.println("Double Array Converted from String :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Double.valueOf(sr[i]);
			System.out.print(arr[i]+" ");
		}
	}
}
