package src.ds.Linear_Search;

// import java.util.Arrays;

public class Q6MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,100},{2,2,4},{100,2},{200}};
        Q6MaxWealth obj = new Q6MaxWealth();

        System.out.println("Max wealth = "+ obj.maxWealth(accounts));
    }

    public int maxWealth(int[][] accounts){
        int sum = Integer.MAX_VALUE, max = accounts[0][0];
        for(int i = 0; i<accounts.length; i++){
            for(int j = 0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(max < sum){
                max = sum;
            }
            sum = 0;
        }

        // int max = accounts[0][0];

        // for (int account[]: accounts){
        //     for (int bal : account){
        //         if (max < bal){
        //             max = bal;
        //         }
        //     }
        // }

        // for(int a[]: accounts){
        //     for(int ele: a){
        //         System.out.println(ele);
        //     }
        // }
        
        return max;
        
    }
}
