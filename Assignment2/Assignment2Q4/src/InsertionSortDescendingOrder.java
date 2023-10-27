import java.util.Arrays;

public class InsertionSortDescendingOrder {
	public static int InsertionSortMethodDesc(int arr[])
	{
		int comparisions=0;
			for(int i=1;i<arr.length;i++)
			{
				int j=i-1;
				int temp=arr[i];
				while(j>=0 && arr[j]<temp)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=temp;
			}
		return comparisions;
	}
	public static void main(String[] args) {
		int arr[]= {70,40,30,90,50};
		int noOfComparaision=InsertionSortMethodDesc(arr);
		System.out.println("Number of comaparions: "+noOfComparaision);
		System.out.println(Arrays.toString(arr));
	}

}
