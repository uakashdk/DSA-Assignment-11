class Solution {
public static int findDuplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
};