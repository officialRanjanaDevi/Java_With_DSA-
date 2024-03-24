class Day44 {
    public int findDuplicate(int[] nums) {
        
    boolean[] present = new boolean[nums.length];
    for (int num : nums) {
      if (present[num]) {
        return num;
      }
      present[num] = true;
    }
    return 0;
    
    }
}