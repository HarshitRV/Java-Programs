package src.learning;

class Box1 {
    int height;
    int width;                            
    int length;

    Box1(int h, int w, int l){
        this.height = h;
        this.width = w;
        this.length = l;
    }
}

class CreateBox {
    public static void main(String[] args) {
        Box1 b1 = new Box1(10, 12, 14);
        Box1 b2 = new Box1(12,16,18);

        System.out.println("Width b1:"+ b1.width+" Width b2:"+ b2.width);
        System.out.println("height b1:"+ b1.height+" height b2:"+ b2.height);
        System.out.println("length b1:"+ b1.length+" length b2:"+ b2.length);
    }
}
