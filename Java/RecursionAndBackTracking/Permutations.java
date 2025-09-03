class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return recur(nums, nums.length);
    }

    List<List<Integer>> recur(int[] nums, int n) {
        List<List<Integer>> ls = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < nums.length; ++i) {
                ls.add(new ArrayList<>(Arrays.asList(nums[i])));

            }
            return ls;
        }

        List<List<Integer>> ls1 = recur(nums, n - 1);
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < ls1.size(); ++j) {
                List<Integer> temp = new ArrayList<>(ls1.get(i)); // Copy the list
                temp.add(nums[i]); // Add the new number
                ls.add(temp); // Add the new list to ls

            }
        }

        return ls;
    }
}