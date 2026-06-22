class Solution {
  public int[] twoSum(int[] nums, int target) {
    //create a Hashmap to storwe numbers and their indices
    Map<Integer, Integer> map = new HashMap<>();
    //iterarte through the array
    for (int i = 0; i < nums.length;i++) {
    //calculate the complement of the curent number
    int complement=target-nums[i];
    //check if the complement is already in the map
    if(map.containsKey(complement)){
        //If found return the indices of the component and the current  number
        return new int[]{map.get(complement),i};

    }
    //otherwise add the current number and its index to the map
    map.put(nums[i],i);
    }
    //return an empty array if nosolution is found 
    return new int[]{};
  }
}