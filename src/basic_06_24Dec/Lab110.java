package src.basic_06_24Dec;

public class Lab110 {
    public static void main(String[] args) {

        // 1D
        int a[] = {1, 2, 3}; // Hori ->

        // 2D
        int[][] arr = new int[3][3];
        //int arr2[][] = new int[3][3];

//                (0,0)  (0,1)  (0,2)
//                (1,0)  (1,1)  (1,2)
//                (2,0)  (2,1)  (2,2)

        // row 0 to 2
        // Initializing 1st Array/1st Row
        arr[0][0] = 12;
        arr[0][1] = 3;
        arr[0][2] = 34;

        // Initializing 2nd Array/2nd Row
        arr[1][0] = 22;
        arr[1][1] = 3;
        arr[1][2] = 43;

        // Initializing 3nd Array/3rd Row
        arr[2][0] = 11;
        arr[2][1] = 44;
        arr[2][2] = 42;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + "\t");  // print -> to get all in one line, \t with 1 tab space.
            }
            System.out.println("");  // to get in 3,3 row column
        }



    }
}


