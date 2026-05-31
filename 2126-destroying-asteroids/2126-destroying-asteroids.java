class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        Arrays.sort(asteroids);
        long cur=mass;
        for(int i=0;i<n;i++){
            if(cur<asteroids[i]){
                return false;
            }
                cur+=asteroids[i];
        }
        return true;
    }
}