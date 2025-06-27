public class removeDuplicates2 {
        public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int slow = 0;
        int i = 0;
        while (i < n) {
            int val = nums[i];
            nums[slow++] = val;
            do {
                i++;
            } while (i < n && nums[i] == val);
        }
        return slow;
    }
}
