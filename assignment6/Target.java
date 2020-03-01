package assignment6;

public class Target {
    public static int target(int[] A, int t) {

        if (A == null || A.length == 0) {
            throw new ArrayIndexOutOfBoundsException("There is no element in the Array!");
        }

        if (A[0] >= t) return 0;
        if (A[A.length - 1] <= t) return A.length - 1;

        int min = Integer.MAX_VALUE;
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            if(Math.abs(A[i] - t) < min) {
                min = Math.abs(A[i] - t);
                a = i;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3, 3, 4};
        int t1 = 2;
        System.out.println(target(test1, t1));
        System.out.println("The non-empty array test is finished!" + "\n");

        int[] test2 = {};
        int t2 = 2;
        System.out.println(target(test2, t2));
        System.out.println("The empty array test is finished!");

    }
}
