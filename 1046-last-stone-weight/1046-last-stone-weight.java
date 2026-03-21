import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int x : stones) 
        list.add(x);

        while (list.size() > 1) {
            Collections.sort(list);
            int n = list.size();
            int a = list.remove(n - 1);
            int b = list.remove(n - 2);
            if (a != b) list.add(a - b);
        }

        return list.size() == 0 ? 0 : list.get(0);
    }
}