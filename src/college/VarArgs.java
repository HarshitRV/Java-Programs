package src.college;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        int sum = 0;
        for(int num: v){
            sum += num;
        }
        System.out.println(sum);
    }
}
