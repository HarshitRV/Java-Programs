package src.ds.Array_ds;

class StackDS {
    int stackArr[] = new int[10];
    int tos;

    StackDS(){
        tos = -1;
    }

    void push(int n){
        if (tos == 9)
            System.out.println("Stack is full");
        else
            stackArr[++tos] = n;
    }

    int pop(){
        if (tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        }
        else
            return stackArr[tos--];
    }
}

class ImplementingStack {
    public static void main(String[] args) {
        StackDS s1 = new StackDS();

        for (int i=0; i<10; i++){
            s1.push(i);
        }
        for (int i=0; i<10; i++){
            System.out.print("  "+s1.pop());
        }
    }
}