package Mang;

public class PhanTuBeNhatTrongMang {
    public static void main(String[] args) {
        int []arr1={3,4,5,6,7};
        int []arr2={1,2,8,9,5};
        int [][]arr3={
                arr1,arr2
        };
        int min = arr3[0][0];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (min>arr3[i][j]){
                    min =arr3[i][j];
                }
            }
        }
        System.out.println("The largest element in the array :"+min);
    }
}
