class Solution {
    public double largestTriangleArea(int[][] points) {
        int N  = points.length;
        double maxArea = 0.0;

        for(int i =0; i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    int x1 = points[i][0];
                    int x2 = points[j][0];
                    int x3 = points[k][0];
                    int y1 = points[i][1];
                    int y2 = points[j][1];
                    int y3 = points[k][1];

                    double calArea = max(x1,x2,x3,y1,y2,y3);

                    maxArea = maxArea<calArea ? calArea:maxArea;

                }
            }
        }
        return maxArea;
    }

    public static double max(int x1, int x2, int x3, int y1, int y2, int y3){
        return 0.5 * Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
    }
}