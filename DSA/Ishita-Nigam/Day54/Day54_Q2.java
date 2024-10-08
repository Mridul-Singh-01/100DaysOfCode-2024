// Find Minimum in Rotated Sorted Array II
public class Day54_Q2 {
    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum value: " + solution.findMin(nums));
    }
}

class Solution {
    public int findMin(int[] nums) {
        int pivot = pivot(nums);
        if(pivot < nums.length - 1) {
            return nums[pivot + 1];
        }
        return nums[0];
    }

    static int pivot(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        while(si <= ei) {
            int mid = si + (ei - si) / 2;
            if(mid < ei && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > si && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[si] == arr[mid] && arr[mid] == arr[ei]) {
                // Check if starting index is pivot or not
                if(si < ei && arr[si] > arr[si + 1]) {
                    return si;
                }
                si++;

                // Check if ending index is pivot or not
                if(ei > si && arr[ei] < arr[ei - 1]) {
                    return ei - 1;
                }
                ei--;
            } else if(arr[si] < arr[mid] || (arr[si] == arr[mid] && arr[mid] > arr[ei])) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }
}
