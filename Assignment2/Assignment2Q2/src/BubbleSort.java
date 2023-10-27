import java.util.Arrays;

public class BubbleSort {
	public static int BubbleSortMethod(int arr[])
	{
		int comparisons=0;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				comparisons++;
				if(arr[j]>arr[j+1])
				{
					flag=1;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==0)
				break;
		}
		return comparisons;
	}
	public static void main(String[] args) {
		int arr[]= {70,40,30,90,50};
		int noOfComparaision=BubbleSortMethod(arr);
		System.out.println("Number of comaparions: "+noOfComparaision);
		System.out.println(Arrays.toString(arr));
	}

}
