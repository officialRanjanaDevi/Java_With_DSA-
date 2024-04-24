public class Day75 {
        private int helper(int n, Map<Integer, Integer> map) {
            if (map.containsKey(n)) {
                return map.get(n);
            }
            
            int res;
            if (n == 0) {
                res = 0;
            } else if (n == 1 || n == 2) {
                res = 1;
            } else {
                res = helper(n - 1, map) + helper(n - 2, map) + helper(n - 3, map);
            }
            
            map.put(n, res);
            return res;
        }
        public int tribonacci(int n) {
            Map<Integer, Integer> map = new HashMap<>();
            return helper(n, map);
        }
}
