public class TwoDimensionalArray {
    public static void main(String[] args) {
        int arr[][]={{4,7,8,9},
                         {9,4,1,0},
                          {8,5,1,8}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
