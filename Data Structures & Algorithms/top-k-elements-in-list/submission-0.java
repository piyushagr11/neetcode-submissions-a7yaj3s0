class Solution {
   public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> countMap = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(countMap::get).reversed());

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int key : countMap.keySet()) {
            pq.add(key);
        }

        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
