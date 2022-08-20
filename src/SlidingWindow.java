
public class SlidingWindow {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int windowSize = 4;
		
		System.out.println(maxSum(arr, windowSize));
	}

	public static int maxSum(int arr[], int windowSize) {
		
		int maxSum = 0;
		
		for(int i = 0 ; i < windowSize; i ++) {
			maxSum += arr[i];
		}
		
		int windowSum = maxSum;
		
		for(int i = windowSize; i < arr.length; i ++) {
			windowSum += arr[i] - arr[i - windowSize];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
}
