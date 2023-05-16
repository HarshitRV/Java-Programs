# Java Programs ☕

![Banner Image](https://i.imgur.com/AXuQOPH.png)

<br><b>
This repository is the collection of all the java programs that has been done in college as well as the collection of the program that were done while learning and understanding
java.

This repo has divided into three main categories and each of them have sub-categories
that covers various topics and challenges.
</b>

### Do join our [Discord](https://discord.gg/5PNFxQF2nz)

<hr>

### <i>Feel free to contribute to this repo while following the standard contribution rules.</i>

</b>
<br><br>

## Contributors 👥

<br>
<a href = "https://github.com/HarshitRV/Java-Programs/graphs/contributors">
  <img src = "https://contrib.rocks/image?repo=HarshitRV/Java-Programs">
</a>
<br><br><br>
<hr>

# Instructions 📝

## Compiling and Running the code

1. Create a new folder named `bin` inside of the Java-Programs folder.
2. Open your terminal at location where the Java-Programs is saved.
3. Run the following command to compile the code within a specific folder. For eg. I want to compile the code within `src/college/understanding_interface` folder.

```bash
    javac -d bin src/college/understanding_interface/*.java
```

- In the above command `-d` is a flag which means directory, specifying where to keep the compiled java programs. In this case we are specifying the `bin` folder.
- The next part `src/college/understanding_interface/*.java` is the location of the java files we want to compile. `*.java` means include all the files with extension `.java`. If we wanted to compile the code within another folder we would have used different location for example `src/learning/understanding_super/*.java`

5. Open **new** terminal and change your directory to bin.

```bash
    cd bin
```

4. Use `java <pakage name>.<class name>` to run the code in terminal.

- For example I want to run ArrayException.java which is at location `src/college/understanding_exceptions` so I will use

```bash
    java src.college.understanding_exceptions.ArrayException
```

- which is basically `java <pakage name>.<class name>`

<br><br>

<hr>

# Uni Programs (VIT Vellore)🎓

[Here](./src/uni/README.md) you will find all the programs that were done in the lab.

# Uni Assignments (VIT Vellore)🎓

[Here](./src/uni/assignments/README.md) you will find all the assignments that were done in the lab.

<br>
<br>

# College Programs 📚

| Programs                                                     | Discription                                                                   |
| ------------------------------------------------------------ | ----------------------------------------------------------------------------- |
| 1. **[UserInput.java:](src/college/UserInput.java)**         | Program to show how to take user input.                                       |
| 2. **[Table.java:](src/college/Table.java)**                 | Printing table of any number using the loops.                                 |
| 3. **[RevNum.java:](src/college/RevNum.java)**               | Finding the reverse of any number using the loops.                            |
| 4. **[DiffHighLow.java:](src/college/DiffHighLow.java)**     | Finding the difference between the highest and the lowest number in an array. |
| 5. **[StringLetter.java:](src/college/StringLetter.java)**   | Take name as input string and display each letter at new line.                |
| 6. **[Palindrome.java:](src/college/PalindromeString.java)** | Checks whether a given word is palindrome or not?                             |
| 7. **[Vowels.java:](src/college/Vowels.java)**               | Program that counts number of vowels in a string.                             |
| 8. **[StringSearch.java:](src/college/StringSearch.java)**   | Program that searches for query string in main string.                        |

<br>

### [9.Understanding Inheritance](src/college/understanding_inheritence)

| Programs                                                                             | Discription                                 |
| ------------------------------------------------------------------------------------ | ------------------------------------------- |
| 1. **[Inheritence1.java:](src/college/understanding_inheritence/Inheritence1.java)** | Program to demonstrate Inheritence in java. |
| 2. **[Abstraction.java:](src/college/understanding_inheritence/Abstraction.java)**   | Program to demonstrate Abstraction in java. |

<br>

### [10.Understanding Interfaces](src/college/understanding_interface)

| Programs                                                                            | Discription                                                                                                                                                        |
| ----------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 1. **[Interface.java:](src/college/understanding_interface/Interface.java)**        | A program that shows the implementation of Interface in java with the help of taking input from the user, the program calculates the area of Square and Rectangle. |
| 2. **[InterfaceEx1.java:](src/college/understanding_interface/InterfaceEx1.java)**  | This program demonstrates the interfaces in java. Interface are very similar to abstract classes                                                                   |
| 3. **[InterfaceEx2.java:](src/college/understanding_interface/InterfaceEx2.java)**  | This program demostrates the indirect way of achiving the multiple inheritance in java.                                                                            |
| 4. **[InterfaceEx3.java::](src/college/understanding_interface/InterfaceEx3.java)** | This program demostrates the inheritence in Interfaces.                                                                                                            |

<br>

### [11.Understanding Exceptions](src/college/understanding_exceptions)

| Programs                                                                                        | Discription                                                                       |
| ----------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| 1. **[ExceptionEx1.java:](src/college/understanding_exceptions/ExceptionEx1.java)**             | This program domonstrate the Exceptions in java.                                  |
| 2. **[ExceptionEx2.java:](src/college/understanding_exceptions/ExceptionEx2.java)**             | This program demonstrate the handling of multiple exceptions in java.             |
| 3. **[ArrayException.java:](src/college/understanding_exceptions/ArrayException.java)**         | This program demonstrate the handling of multiple exceptions in an array in java. |
| 4. **[FinallyEx1.java:](src/college/understanding_exceptions/FinallyEx1.java)**                 | Program to demonstrate the finally block.                                         |
| 5. **[ThrowsEx1.java:](src/college/understanding_exceptions/ThrowsEx1.java)**                   | Code to demonstrate the use of throws keyword.                                    |
| 6. **[ThrowEx1.java:](src/college/understanding_exceptions/ThrowEx1.java)**                     | Code to demonstrate the use of throw keywords.                                    |
| 7. **[CustomExceptionEx1.java:](src/college/understanding_exceptions/CustomExceptionEx1.java)** | Sample code to demonstrate on how to raise your own exceptions.                   |
| 8. **[CustomExceptionEx2.java:](src/college/understanding_exceptions/CustomExceptionEx2.java)** | Program given in college to raise your own exception when two string are same.    |

<br>

### [12. Understanding GUI | AWT and Swing](src/college/understanding_GUI)

### <b>AWT<b>

<hr>

| Programs                                                                               | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| 1. **[MyFrame.java:](src/college/understanding_GUI/MyFrame.java)**                     | Sample code to show on how to create window using java.awt.                                                                                  |
| 2. **[FrameButtons.java:](src/college/understanding_GUI/FrameButtons.java)**           | Program to demonstrate button in java.awt.                                                                                                   |
| 3. **[FlowLayoutEx1.java:](src/college/understanding_GUI/FlowLayoutEx1.java)**         | Program to demonstrate flow layout in java.                                                                                                  |
| 4. **[CustomLayout.java:](src/college/understanding_GUI/CustomLayout.java)**           | Program to demonstrate custom layout in java.                                                                                                |
| 5. **[ActionListenerEx1.java:](src/college/understanding_GUI/ActionListenerEx1.java)** | Program to demonstrate ActionListener in java.awt.event.                                                                                     |
| 6. **[Square.java:](src/college/understanding_GUI/Square.java)**                       | GUI program to display the square of a entered number.                                                                                       |
| 7. **[Addition.java:](src/college/understanding_GUI/Addition.java)**                   | GUI program to accept two numbers and then display the addition of those two numbers in the frame.                                           |
| 8. **[PalindromeEx1.java:](src/college/understanding_GUI/PalindromeEx1.java)**         | GUI program to check whether a number or a string is palindrome or not.                                                                      |
| 9. **[ReverseStringEx1.java:](src/college/understanding_GUI/ReverseStringEx1.java)**   | GUI program to reverse a string.                                                                                                             |
| 10. **[NumToWords.java](src/college/understanding_GUI/NumToWords.java)**               | GUI program to convert number to words.                                                                                                      |
| 11. **[ColorFrame.java](src/college/understanding_GUI/ColorFrame.java)**               | GUI program to change the background colors when you click on buttons.                                                                       |
| 12. **[SimpleCalculator.java](src/college/understanding_GUI/SimpleCalculator.java)**   | GUI program to accept two numbers from the user and calculate the sum,difference,multiplication & division on the clicks of specific button. |
| 13. **[Calculator.java](src/college/understanding_GUI/Calculator.java)**               | GUI program to accept two numbers from the user and calculate the sum,difference,multiplication & division on the clicks of specific button. |

### **Swing**

| Programs Swing                                                                       | Description                                                                             |
| ------------------------------------------------------------------------------------ | --------------------------------------------------------------------------------------- |
| 1. **[SwingDemo.java](src/uni/lessons/jswing/SwingDemo.java)**                       | Basic java program to demonstrate creating of Swing program                             |
| 2. **[SwingEventDemo.java](src/uni/lessons/jswing/SwingEventDemo.java)**             | This program demonstrates the use of event listener throgh a simple swing program       |
| 3. **[SwingLabelImage.java](src/uni/lessons/jswing/SwingLabelImage.java)**           | This program demonstrates the how to set a image to a label                             |
| 4. **[SwingOptionPane.java](src/uni/lessons/jswing/SwingOptionPane.java)**           | This program demonstrates the use of dialog boxes in Swing                              |
| 5. **[SwingTextField.java](src/uni/lessons/jswing/SwingTextField.java)**             | This program demonstrates the use of text fields                                        |
| 6. **[SwingTextAndPassword.java](src/uni/lessons/jswing/SwingTextAndPassword.java)** | This program demonstrates the use of password field in swing                            |
| 7. **[SwingCheckbox.java](src/uni/lessons/jswing/SwingCheckbox.java)**               | This program demonstrates the use of checkboxes                                         |
| 8. **[SwingComboBox.java](src/uni/lessons/jswing/SwingComboBox.java)**               | This program demonstrates the use of comboboxes                                         |
| 9. **[SwingCalculator.java](src/uni/lessons/jswing/SwingCalculator.java)**           | This program demonstrates the use of multiple frames and grid layouts to design the gui |

<hr>

<br>

### [13. Java-Server-Pages](https://github.com/HarshitRV/Java-Server-Pages)

### [14. Understating Databases Connectivity](https://github.com/HarshitRV/Java-Server-Pages)

Do read [README](src/college/understanding_DBConnectivity/README.md) to get started.

| Programs                                                                                              | Discription                                                                                   |
| ----------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| 1. **[ConnectionDB.java:](src/college/understanding_DBConnectivity/ConnectionDB.java)**               | This program demonstrates how to connect to the my sql database using JDBC Driver.            |
| 2. **[InsertingData.java:](src/college/understanding_DBConnectivity/InsertingData.java)**             | Program to demonstrate on how to insert data into the database.                               |
| 3. **[DynamicDataEntryEx1.java:](src/college/understanding_DBConnectivity/DynamicDataEntryEx1.java)** | Program to take data from the user and insert into the database.                              |
| 4. **[ReadDataEx1.java:](src/college/understanding_DBConnectivity/ReadDataEx1.java)**                 | Program to demonstrate on how to read data from the table in the sql database.                |
| 5. **[ReadDataEx2.java:](src/college/understanding_DBConnectivity/ReadDataEx2.java)**                 | Program to demonstrate on how to read specific data from table using userinput.               |
| 6. **[UpdateData.java:](src/college/understanding_DBConnectivity/UpdateData.java)**                   | Program to demonstrate on how to update a particular record in the database using user input. |
| 7. **[DeleteData.java:](src/college/understanding_DBConnectivity/DeleteData.java)**                   | Program to demonstrate on how to delete specific record from table using user input.          |
| 8. **[Crud.java:](src/college/understanding_DBConnectivity/Crud.java)**                               | Program that combined all the learned concepts into on single program.                        |

### [15. Understanding Mutithreading](src/uni/lessons/multithreading/)

| Programs                                                                          | Discription                                                                               |
| --------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| 1. **[MyThread.java](src/uni/lessons/multithreading/MyThread.java)**              | Intro program that demonstrates creating thread using Thread class and Runnable interface |
| 2. **[NewThread and MultiChild](src/uni/lessons/multithreading/NewThread.java)**  | Program to demonstrate creating multiple threads and running them simultaneously          |
| 3. **[SynchronizedBlock](src/uni/lessons/multithreading/SynchronizedBlock.java)** | Program to demonstrate synchonization in java                                             |

<br>
<hr>

# Intro Programs 🧑‍💻

| Programs                                                                        | Discription                                                                  |
| ------------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| 1. **[Example.java:](src/learning/Example.java)**                               | Very first Java program.                                                     |
| 2. **[Example2.java:](src/learning/Example2.java)**                             | Understanding about variables and various data types.                        |
| 3. **[IFsample.java:](src/learning/IFsample.java)**                             | Understanding conditional if statement in java.                              |
| 4. **[FORtest.java:](src/learning/FORtest.java)**                               | Understanding for loops in java.                                             |
| 5. **[SpeedDS.java:](src/learning/SpeedDS.java)**                               | Understanding about long data type and its use with a simple program.        |
| 6. **[Area.java:](src/learning/Area.java)**                                     | Understanding about double data type and its use.                            |
| 7. **[CharDemo.java:](src/learning/CharDemo.java)**                             | Understanding about char data type in java.                                  |
| 8. **[BoolTest.java:](src/learning/BoolTest.java)**                             | Understanding about bool data type.                                          |
| 9. **[DynInit.java:](src/learning/DynInit.java)**                               | Dynamically assigning the value to a variable.                               |
| 10. **[Conversion.java:](src/learning/Conversion.java)**                        | Program to demonstrate type conversions.                                     |
| 11. **[Promote.java:](src/learning/Promote.java)**                              | Self promotions of data types in java.                                       |
| 12. **[Array.java:](src/learning/Array.java)**                                  | Simple program to demonstrate arrays in java.                                |
| 13. **[Fibonacci.java:](src/learning/Fibonacci.java)**                          | Get n number of elements in Fibonacc Series.                                 |
| 14. **[LowerCaseVSUpperCase.java:](src/learning/LowerCaseVSUpperCase.java)**    | Check if the entered char is lowercase or uppercase.                         |
| 15. **[IncrementDecrement.java:](src/learning/IncrementDecrement.java)**        | Understanding the increment and decrement operator assignments.              |
| 16. **[Shadowing.java:](src/learning/Shadowing.java)**                          | Understanding the concept of Shadowing in java.                              |
| 17. **[Test1.java:](src/learning/Test1.java)**                                  | Program to demonstrate how to pass the objects a parameter to a method.      |
| 18. **[ReturningObjects.java:](src/learning/ReturningObjects.java)**            | Program to demonstrate how to return objects from a function.                |
| 19. **[CallByReferenceVsValue.java:](src/learning/CallByReferencVsValue.java)** | Program to demostrate whether java uses call by reference or call by value.  |
| 20. **[ConstructorOverloading:](src/learning/ConstructorOverloading.java)**     | Program to demonstrate construtor overloading in java.                       |
| 21. **[Recursion.java:](src/learning/Recursion.java)**                          | Program to demonstrate recursion in java.                                    |
| 22. **[Figure.java:](src/learning/Recursion.java)**                             | Program to demonstrate method overriding in                                  |
| 23. **[VarArgs.java:](src/learning/VarArgs.java)**                              | A function that can take n number of arguments is explained in this program. |

<br>

## Understanding Static

| Programs                                                                     | Discription                                                                         |
| ---------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| 1. **[UseStatic.java:](src/learning/understanding_static/UseStatic.java)**   | Program to demonstrate the use of static variables , methods and blocks.            |
| 2. **[StaticDemo.java:](src/learning/understanding_static/StaticDemo.java)** | Program to demonstrate on how to call the static members of one class into another. |

<br>

## Understanding super keyword

| Programs                                                               | Discription                                                                                              |
| ---------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| 1. **[SuperEx1.java](src/learning/understanding_super/SuperEx1.java)** | Program to demonstrate the use of super keyword in inheritance.                                          |
| 2. **[SuperEx1.java](src/learning/understanding_super/SuperEx1.java)** | Program to demonstrate the use of super keyword in inheritance when member of super class is overridden. |

<br>

## Understanding GUI

| Programs                                                                  | Discription                                                                           |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| 1. **[PalindromeGUI.java:](src/learning/GUI_programs/PalindromGUI.java)** | GUI program to reverse a string or a number and to check if it's a palindrome or not. |
| 2. **[Calculator.java:](src/learning/GUI_programs/PalindromGUI.java)**    | Calculator App.                                                                       |

<br>

<hr>

# [Challenges Programs](src/challenges/README.md) ⭐
