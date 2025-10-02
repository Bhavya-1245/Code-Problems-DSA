class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b)->{

            double gainA = calculateRatio(a[0],a[1]);
            double gainB = calculateRatio(b[0],b[1]);

            if(gainA>gainB) return -1;
            if(gainA<gainB) return 1;
            return 0;
        });


        for(int []cls:classes){
            maxHeap.offer(new double[]{(double)cls[0],(double)cls[1]});
        }

        for(int i=0; i<extraStudents; i++){
            double []stu = maxHeap.poll();

            double newPass = stu[0]+1.0;
            double newTotal = stu[1]+1.0;

            maxHeap.offer(new double[]{newPass,newTotal});
        }

        int numClasses = classes.length;
        double total_ratio = 0.0;

        for(double[] cls:maxHeap){
            total_ratio += cls[0]/cls[1];
        }

        return total_ratio/numClasses;
    }

    public static double calculateRatio(double pass, double ratio){
        return (pass+1.0)/(ratio+1.0)-pass/ratio;
    }
}