package important;

public class SubarraySum {
	public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        int currSum = 0, start = 0;
        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];
            while (currSum > sum && start <= end) {
                currSum -= arr[start++];
            }
            if (currSum == sum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray with given sum");
    }

}
