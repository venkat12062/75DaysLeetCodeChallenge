class Solution {
    public boolean asteroidsDestroyed(long mass, int[] asteroids) {
        int n=asteroids.length;
        Arrays.sort(asteroids);
       // int cur=mass;
        for(int i=0;i<n;i++){
            if(mass<asteroids[i]){
                return false;
            }
                mass+=asteroids[i];
        }
        return true;
    }
}