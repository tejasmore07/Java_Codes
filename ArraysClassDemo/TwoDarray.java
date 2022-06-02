package ArraysClassDemo;

public class TwoDarray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("First Matrix");
        for(int i = 0;i<3;i++) {
            for(int j = 0; j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int arr2[][] = {{11,12,13},{14,15,16},{17,18,19}};
        System.out.println("Second Matrix");
        for(int i = 0;i<arr2.length;i++) {
            for(int j = 0; j< arr2.length;j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int sum[][] = new int[3][3];
        System.out.println("Addition of Matrix");
        for(int i = 0;i<sum.length;i++) {
            for(int j = 0; j< sum.length;j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
