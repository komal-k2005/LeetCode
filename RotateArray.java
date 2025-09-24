class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // handle k > n

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

class RotateArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        s.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
