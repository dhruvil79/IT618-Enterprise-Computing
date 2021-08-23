package j2ee.lab02.ex04;
import java.util.Random;

public class FrequencyCalculator {
	public static void main(String args[])
	{
	    Random rand = new Random();
        int arr[]=new int[50]; 
        for( int i = 0; i <50; i++ )
        {
            arr[i] = rand.nextInt(11);
        }
        System.out.println("");
		System.out.println("Array Here :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Calculated frequencies :");
        int freq[]=calculateFrequencies(arr);  
        for(int i=0;i<freq.length;i++)
		{
			System.out.println(i+":"+freq[i]);
		}
	}

	private static int[] calculateFrequencies(int[] arr) {
		// TODO Auto-generated method stub
		int counter[]=new int[11];
		for(int item: arr)
		{
			counter[item] = counter[item] + 1;
		}
		return counter;
	}
}
