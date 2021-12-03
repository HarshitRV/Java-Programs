# Java Programs 

![Banner Image](https://i.imgur.com/AXuQOPH.png)

This repository is the collection of all the java programs that has been done in college as well as the collection of the program that were done while learning and understanding 
java . 

This repo has divided into three main categories and each of them have sub-categories
that covers various topics and challenges.

Feel free to contribute to this repo while following the standard contribution rules.

## Contributors
<a href = "https://github.com/HarshitRV/Java-Programs/graphs/contributors">
  <img src = "https://contrib.rocks/image?repo=HarshitRV/Java-Programs">
</a>

# Instructions

## Compiling and Running the code
1. Create a new folder named `bin` inside of the Java-Programs folder.
2. Open your terminal at location where the Java-Programs is saved.
3. Run the following command to compile the code within a specific folder.
```bash
    javac -d bin src/college/understanding_interface/*.java
```
- In the above command `-d` is a flag which means directory, specifying where to keep the compiled java programs. In this case we are specifying the `bin` folder.
- The next part `src/college/understanding_interface/*.java` is the location of the java files we want to compile. `*.java` means include all the files with extension `.java`. If we wanted to compile the code within another folder we would have used different location for example `src/learning/understanding_super/*.java`
5. Open new terminal and change your directory to bin.
```bash
    cd bin
```
4. Use `java <pakage name>.<class name>` to run the code in terminal.
- For example I want to run ArrayException.java which is at location `src/college/understanding_exceptions` so I will use 
```bash
    java src.college.understanding_exceptions.ArrayException
```
- which is basically `java <pakage name>.<class name>`


# College Programs

1. **[UserInput.java:](src/college/UserInput.java)** Program to show how to take user input.

2. **[Table.java:](src/college/Table.java)** Printing table of any number using the loops.

3. **[RevNum.java:](src/college/RevNum.java)** Finding the reverse of any number using the loops.

4. **[DiffHighLow.java:](src/college/DiffHighLow.java)** Finding the difference between the highest and the lowest number in an array.

5. **[StringLetter.java:](src/college/StringLetter.java)** Take name as input string and display each letter at new line.

6. **[Palindrome.java:](src/college/PalindromeString.java)** Checks whether a given word is palindrome or not?

7. **[Vowels.java:](src/college/Vowels.java)** Program that counts number of vowels in a string.

8. **[StringSearch.java:](src/college/StringSearch.java)** Program that searches for query string in main string.

### [9.Understanding Inheritance](src/college/understanding_inheritence) 
1. **[Inheritence1.java:](src/college/understanding_inheritence/Inheritence1.java)** Program to demonstrate Inheritence in java.
2. **[Abstraction.java:](src/college/understanding_inheritence/Abstraction.java)** Program to demonstrate Abstraction in java.
### [10.Understanding Interfaces](src/college/understanding_interface) 

1. **[Interface.java:](src/college/Interface.java)** A program that shows the implementation of Interface in java with the help of taking input from the user, the program calculates the area of Square and Rectangle.
2. **[InterfaceEx1.java:](src/college/understanding_interface/InterfaceEx1.java)** This program demonstrates the interfaces in java.
    Interface are very similar to abstract classes
3. **[InterfaceEx2.java:](src/college/understanding_interface/InterfaceEx2.java)** This program demostrates the indirect way of
    achiving the multiple inheritance in java.
4. **[InterfaceEx3.java::](src/college/understanding_interface/InterfaceEx3.java)** This program demostrates the inheritence in Interfaces.

### [11.Understanding Exceptions](src/college/understanding_exceptions) 
1. **[ExceptionEx1.java:](src/college/understanding_exceptions/ExceptionEx1.java)** This program domonstrate the Exceptions in java.
2. **[ExceptionEx2.java:](src/college/understanding_exceptions/ExceptionEx2.java)** This program demonstrate the handling of multiple exceptions in java.    
3. **[ArrayException.java:](src/college/understanding_exceptions/ArrayException.java)** This program demonstrate the handling of multiple exceptions in an array in java. 
4. **[FinallyEx1.java:](src/college/understanding_exceptions/FinallyEx1.java)** Program to demonstrate the finally block.
5. **[ThrowsEx1.java:](src/college/understanding_exceptions/ThrowsEx1.java)** Code to demonstrate the use of throws keyword.
6. **[ThrowEx1.java:](src/college/understanding_exceptions/ThrowEx1.java)** Code to demonstrate the use of throw keywords.
7. **[CustomExceptionEx1.java:](src/college/understanding_exceptions/CustomExceptionEx1.java)** Sample code to demonstrate on how to raise your own exceptions.
8. **[CustomExceptionEx2.java:](src/college/understanding_exceptions/CustomExceptionEx2.java)** Program given in college to raise your own exception when two string are same.

### [12. Understanding GUI](src/college/understanding_GUI)
1. **[MyFrame.java:](src/college/understanding_GUI/MyFrame.java)** Sample code to show on how to create window using java.awt.
2. **[FrameButtons.java:](src/college/understanding_GUI/FrameButtons.java)** Program to demonstrate button in java.awt.
3. **[FlowLayoutEx1.java:](src/college/understanding_GUI/FlowLayoutEx1.java)** Program to demonstrate flow layout in java.
4. **[CustomLayout.java:](src/college/understanding_GUI/CustomLayout.java)** Program to demonstrate custom layout in java.
5. **[ActionListenerEx1.java:](src/college/understanding_GUI/ActionListenerEx1.java)** Program to demonstrate ActionListener in java.awt.event.
6. **[PalindromeEx1.java:](src/college/understanding_GUI/PalindromeEx1.java)** GUI program to check whether a number or a string is palindrome or not.
7. **[ReverseStringEx1.java:](src/college/understanding_GUI/ReverseStringEx1.java)** GUI program to reverse a string.
8. **[NumToWords.java](src/college/understanding_GUI/NumToWords.java)** GUI program to convert number to words.
#  Intro Programs
1. **[Example.java:](src/learning/Example.java)** Very first Java program.

2. **[Example2.java:](src/learning/Example2.java)** Understanding about variables and various data types.

3. **[IFsample.java:](src/learning/IFsample.java)** Understanding conditional if statement in java.

4. **[FORtest.java:](src/learning/FORtest.java)** Understanding for loops in java.

5. **[SpeedDS.java:](src/learning/SpeedDS.java)** Understanding about long data type and its use 
with a simple program.

6. **[Area.java:](src/learning/Area.java)** Understanding about double data type and its use.

7. **[CharDemo.java:](src/learning/CharDemo.java)** Understanding about char data type in java.

8. **[BoolTest.java:](src/learning/BoolTest.java)** Understanding about bool data type. 

9. **[DynInit.java:](src/learning/DynInit.java)** Dynamically assigning the value to a variable.

10. **[Conversion.java:](src/learning/Conversion.java)** Program to demonstrate type conversions.

11. **[Promote.java:](src/learning/Promote.java)** Self promotions of data types in java.

12. **[Array.java:](src/learning/Array.java)** Simple program to demonstrate arrays in java.

13. **[Fibonacci.java:](src/learning/Fibonacci.java)** Get n number of elements in Fibonacc Series.

14. **[LowerCaseVSUpperCase.java:](src/learning/LowerCaseVSUpperCase.java)** Check if the entered char is lowercase or uppercase.

15. **[IncrementDecrement.java:](src/learning/IncrementDecrement.java)** Understanding the increment and decrement operator assignments.

16. **[Shadowing.java:](src/learning/Shadowing.java)** Understanding the concept of Shadowing in java.

17. **[Test1.java:](src/learning/Test1.java)** Program to demonstrate how to pass the objects a parameter to a method.

18. **[ReturningObjects.java:](src/learning/ReturningObjects.java)** Program to demonstrate how to return objects from a function.

19. **[CallByReferenceVsValue.java:](src/learning/CallByReferencVsValue.java)** Program to demostrate whether java uses call by reference or call by value.

20. **[ConstructorOverloading:](src/learning/ConstructorOverloading.java)** Program to demonstrate construtor overloading in java.

21. **[Recursion.java:](src/learning/Recursion.java)** Program to demonstrate recursion in java.
22. **[Figure.java:](src/learning/Recursion.java)** Program to demonstrate method overriding in 
23. **[VarArgs.java:](src/learning/VarArgs.java)** A function that can take n number of arguments is explained in this program.
## Understanding Static
1. **[UseStatic.java:](src/learning/understanding_static/UseStatic.java)** Program to demonstrate the use of static variables , methods and blocks. 
2. **[StaticDemo.java:](src/learning/understanding_static/StaticDemo.java)** Program to demonstrate on how to call the static members of one class into another. 

## Understanding super keyword
1. **[SuperEx1.java](src/learning/understanding_super/SuperEx1.java)** Program to demonstrate the use of super keyword in inheritance.
2. **[SuperEx1.java](src/learning/understanding_super/SuperEx1.java)** 
Program to demonstrate the use of super keyword in inheritance when member of super class is overridden.

## Understanding GUI
1. **[ReverseStringEx1.java:](src/learning/GUI_programs/RevNumFrame.java)** GUI program to reverse a string or a number and to check if it's a palindrome or not.

# [Challenges Programs](src/challenges/README.md)

