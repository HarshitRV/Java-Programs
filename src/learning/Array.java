package src.learning;
public class Array {
    public static void main(String[] args) {
         
        int arr[] = new int[12];   // declaring array named arr and allocating the memory 
       
        for(int i=0;i<12;i++){
            switch(i) {
                case 0:case 2:case 4: case 6: case 7: case 9: case 11:
                arr[i] = 31;break;

                case 1: arr[i] = 28;break;

                case 3: case 5: case 8: case 10:
                arr[i] = 30;break;
            }
        }
        for (int i=0;i<12;i++){
            System.out.println(arr[i]);
        }
    }
}
