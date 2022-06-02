package ArraysClassDemo;

public class ArrayByMethod {
    public static void main(String[] args) {
        int arr[] = Method();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr2[] = Method_Two();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        int arr3[][] = Method_Three();
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] Method() {
        return new int[]{1, 6, 2, 3, 3, 6};
    }
    public static int[] Method_Two() {
        return new int[]{162336};
    }
    public static int[][] Method_Three() {
        return new int[][] {{5,6,7},{1,2,3},{7,8,9}};
    }
}





