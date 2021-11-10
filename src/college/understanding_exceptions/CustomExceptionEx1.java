/*
    Sample code to demonstrate the use of custom exceptions.
    This code is not intended to be run.

    Points to remember:
    1. Exception class is a checked exception.
    2. Custom exceptions are not checked by the compiler.
    3. Checked exceptions are compulsory with the try-catch block.
    4. Unchecked exceptions are not compulsory with the try-catch block.

*/
package src.college.understanding_exceptions;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}
    
class UseCustomException {
    public static void main(String[] args) {
        try {
            int a = 1;
            if (a < 10) {
                throw new CustomException("a is less than 10");
            }
            System.out.println("Executed");
        } catch (CustomException e) {
            // .getMessgae() returns the message of the exception
            System.out.println(e.getMessage());
        }   
    }
}