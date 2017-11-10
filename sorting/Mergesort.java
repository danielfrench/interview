import java.util.Arrays;

public class Mergesort {

	public Mergesort() {

	}

	public static void main(String[] args) {
		int[] ret = mergesort(new int[] { 43, 5, 5, 4343, 6, 9, 34, 2,888, 5});
		System.out.println(Arrays.toString(ret));

	}

   static int[] mergesort(int[] nums){
	   System.out.println(Arrays.toString(nums));
	   if (nums.length<2){
		   return nums;
	   }
	   int[] arrL = mergesort(Arrays.copyOfRange(nums, 0, nums.length/2));
	   int[] arrR = mergesort(Arrays.copyOfRange(nums, nums.length/2, nums.length));
	   return merge(arrL, arrR);
	    
   }
   
   static int[] merge(int[] arr1, int[] arr2){
	   int arr1L = arr1.length;
	   int arr2L = arr2.length;
	   int index1 = 0;
	   int index2 = 0;
	   int n = arr1L+arr2L;
	   int [] arr = new int[n];
	   for (int i= 0; i<n;i++){
		  
		   if (index1==arr1L){
			arr[i] = arr2[index2++];   
		   } else if(index2==arr2L){
			  arr[i] = arr1[index1++];  
		   } else if(arr1[index1]<arr2[index2]){
			   arr[i] = arr1[index1++];
			   System.out.println("reac here");
		   } else{
			   arr[i] = arr2[index2++];
			   System.out.println("reac here2");
		   }
		  
	   }
	   return arr;
   }
}
