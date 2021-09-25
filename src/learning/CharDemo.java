package src.learning;
class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 74; // unicode for x
        ch2 = 'Y';
        System.out.println("ch1 and ch2 are: "+ ch1 + ch2);
        
        ch2 = 'X';
        ch2 ++;
        System.out.println("ch2 is now: "+ ch2);
    }
}