class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int[] p1 = coordinates[0];
        int[] p2 = coordinates[1];
        float changey = p2[1] - p1[1];
        float changex = p2[0] - p1[0];
        float slope = (changex == 0)? Float.MAX_VALUE: (changey/changex);
        
        for(int i = 2; i < coordinates.length; i++){
            p2 = coordinates[i];
            p1 = coordinates[i-1];
            changey = p2[1] - p1[1];
            changex = p2[0] - p1[0];
            float currSlope = (changex == 0)? Float.MAX_VALUE: (changey/changex);
            if(currSlope != slope) return false;
        }
        
        return true;
    }
}
