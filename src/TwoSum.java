public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static void main(String[] args) {
        int[] i = new int[]{2,3,5,6,4};
        int[] result = twoSum(i, 5);
        System.out.println("result[0] : "+result[0]+ " & result[1] : "+result[1]);
    }
}