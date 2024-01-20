public class Trapped_Rainwater_Problem {
    public static int trappedwater(int height[]) {
        int n = height.length;
        // calculate the leftMax boundary-array___
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        for (int i = 1; i < n; i++) {
            leftMax[0] = height[0];
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        // Calculate the array rightMax boundary-array___
        for (int i = n - 2; i >= 0; i--) {
            rightMax[n - 1] = height[n - 1];
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        int trappedwater = 0;
        for (int i = 1; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trappedwater += (waterlevel - height[i]);

        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("trapped water : " + trappedwater(height));
    }
}
