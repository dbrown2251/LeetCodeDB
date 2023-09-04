class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int x = 0; // placeholder for the even numbers
        for (int i = 0; i < n; i++) {
            newArray[x] = nums[i];
            x += 2;
        }
        x = 1; // placeholder for the odd numbers
        for (int i = n; i < nums.length; i++) {
            newArray[x] = nums[i];
            x += 2;
        }
        return newArray;
    }
}
