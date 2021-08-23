package j2ee.lab02.ex04;

public class DataReverser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		double arr[]= {10.12,11.15,78.96,45.63,71.63,13.54,23.54,10.41};
		reverse(arr);
	}

	public static  void reverse(double[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Before Reverse");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		System.out.println("After reverse");
		
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			double temp=arr[low];
			arr[low++]=arr[high];
			arr[high--]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	

}
