import java.util.Random;
public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums=new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums,1,10);
		print(nums);
		System.out.println(sum(nums,2));
		// test each method you create below.
		int[] rowSums=arraySums(nums,3);
		System.out.print("[\t");
		for(int i=0;i<rowSums.length;i++){
			System.out.print(rowSums[i]+"\t");
		}
		System.out.print("\t]");
		System.out.println(isUnique(nums,0));
		System.out.println(finding(nums,0,7));
		System.out.println(minimum(nums));
		System.out.println(maximum(nums));
	}
	
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	public static void fillRandom(int[][] nums,int low,int high){
		Random random=new Random();
		for(int row=0;row<nums.length;row++){
			for(int col=0;col<nums[0].length;col++){
				nums[row][col]=random.nextInt(high)+low;
			}
		}
	}
	
	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] nums){
	for(int row=0;row<nums.length;row++){
		System.out.print("{\t");
		for(int col=0;col<nums[0].length;col++){
			System.out.print(nums[row][col]+"\t");
		}
		System.out.print("\t}");
		System.out.println();
	}
	}
	
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sum(int[][] nums,int row){
		int total=0;
		for(int col=0;col<nums[row].length;col++){
			total+=nums[row][col];
		}
		return total;
	}
	

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	public static int[] arraySums(int[][] nums, int row){
		int[] sums=new int[row];
		for(int i=0;i<row;i++){
			sums[i]=sum(nums,i);
		}
		return sums;
	}

	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	public static boolean isUnique(int[][] nums, int row){
		for(int i =0;i<nums[row].length-1;i++){
			for(int j=1;j<nums[row].length;j++){
				if(nums[row][i]==nums[row][j]){
					return false;
				}
			}
		}
		return true;
	}


	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	public static int finding(int[][] nums, int row, int target){
			for(int col=0;col<nums[row].length;col++){
					if(nums[row][col]==target){
						return col;
					}
			}
		return -1;
	}
	
	
	/*
	 * return the min value in a 2D array
	 */
	public static int minimum(int[][] nums){
		int min=10000;
		for(int row=0;row<nums.length;row++){
			for(int col=0;col<nums[0].length;col++){
				min=Math.min(min,nums[row][col]);
			}
		}
		return min;
	}
	
	
	
	/*
	 * return the max value in a 2D array
	 */
	public static int maximum(int[][] nums){
	int max=-1;
	for(int row=0;row<nums.length;row++){
		for(int col=0;col<nums[0].length;col++){
			max=Math.max(max,nums[row][col]);
		}
	}
	return max;
	}

	
	
	
}
