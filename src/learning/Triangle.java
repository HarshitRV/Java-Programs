package src.learning;

public class Triangle {
    public static void main(String[] args) {
        int arr[][] = new int[4][], k = 0;
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        for (int i=0; i<4; i++){
            for(int j=0; j<i+1; j++){
                arr[i][j] = k;
                k++;
            }
        }
        System.out.println("Array values are");

        for (int i=0; i<4; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
