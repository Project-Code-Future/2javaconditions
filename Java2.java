import java.util.Scanner;

//Java Workshop 2: Boolean and Conditional Logic
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
*/

//@ The class and public static void main method are necessary for any Java file, but not necessary to fully understand for this workshop
class Calculations {

    public static void main(String[]args){

        /*Review of previous section*/
            int x = 5;
            int y = 6;
            //+ As we learned in the previous section, ints are Integers: numbers without decimals.
            //& Ask students which integer is greater. The correct answer is (y), because 6 > 5.

        /*COMPARISONS: Greater Than (or equal to) and Less Than (or equal to)*/
            //+ Java can actually compare numbers for us. We use the following operators:
            //+ > (greater than), < (less than), == (equal to), >= (greater than or equal to), <= (less than or equal to), and != (not equal to).
            //& Instead of asking you guys which integer is greater, I can ask Java by printing a comparison of two numbers

            System.out.println(y > x);
            //! 
            //@ The output of the statement is true because y is greater than x. What would happen if we reversed the comparison sign from greater than to less than?

            System.out.println(y < x);
            //!
            //@ The output of the statement is false because y is not less than x.

            System.out.println(y >= x);
            //!
            //@ The output of this statement is true because y is greater than or equal to x. What would happen if we added 1 to x, x became 6, and we ran this code again?

            x++;
            System.out.println(y >= x);
            //!
            //@ The output of this statement is still true because y is greater than or equal to x. In this case it is equal to x.
        
        /*BOOLEAN LOGIC, NOT, AND, & OR*/
            
            int v = 8;
            //+ What if we want to evaluate multiple conditions at the same time. Such as: y >= x AND y >= v. How would we do this?
            //+ In Java we do this using special operators. AND is && and OR is ||.
            //+ Thus, the code for the example y >= x AND y >= v would look like this:

            System.out.println(y >= x && y >= v);
            //& Before running, ask students what this will evaluate to. (The answer should be false because although y >= x, y is not >= v)
            //!

            System.out.println(y >= x || y >= v);
            //!
            //+ If we change this operator to || (or), only one of the conditions has to be true. So, since y >= x is true, this must returns true.


            //+ In Java, we can also put an exclamation point before a condition to take the opposite of the result. 
            //+ For example, 4 > 3 returns true, but if we put !(4 > 3), we take the opposite of true - which is false.

            System.out.println(!(y >= x));
            //!
            //+ This prints false because y is greater than or equal to x, so (y>=x) evaluates to true. Then, the ! operator takes the opposite of true, which is false.


        /*BOOLEANS*/
            //+ When a value can either be true or false, we call that value a boolean. To remember this, think BOO-lean sounds like TWO, and booleans only have two possible return values: true or false
            boolean z = true;
            boolean q = false;
            //+ We can declare boolean variables just like we declare integer, String, or any other type of variables.

            System.out.println(z);
            System.out.println(q);
            //+ As you can see, boolean z prints true and boolean q prints false.

        /*COMPARISONS: Equals and Not Equals*/
            //+ As you might have seen earlier, the operator for equal to is TWO equal signs, not ONE. This is because one equal sign is reserved for declaring variables.
            System.out.println(y == x);
            //!
            //@ The output of this statement is true because y is 6, x is 6, and 6 equals 6. Remember that we wrote x++; earlier to increment x by 1.
            System.out.println(z == q);
            //!
            //@ The output of this statement is false because boolean z is true, boolean q is false, and true doesn't equal false, making our statement false.

            //+ As you might have seen earlier, the operator for not equal to is an exclamation point and an equal sign (!=).
            System.out.println(z != q);
            //!
            //@ This statement is true because boolean z is true, boolean q is false, and true doesn't equal false, making our statement true.
            
        /*USER INPUT*/
            //+ When we have been running code earlier, the output has been displayed in a Terminal window. Did you know you can also provide INPUT to the terminal window?
            //+ Giving the computer information during the runtime of a program is called user input, and this next section will show you how user input works in Java.
            //+ To "scan" the input in the terminal window, we use an object called a Scanner.
            //+ At the top of the program, we need to add "import java.util.Scanner;" to import the Java utility Scanner class.

            Scanner myScanner = new Scanner(System.in);
            //! This is how we instantiate a Scanner.

            System.out.println("Enter your name:");
            //!
            //@ Now that the scanner has been instantiated, we'll print "Enter your name:" in the output window to direct the user to give us their name.

            String name = myScanner.nextLine();
            //@ We'll store the user's name in a String variable. We set name equal to the next line of our open scanner.

            System.out.println("Hi, "+name);
            //!
            //@ We'll greet the user by using string concatenation.

  
            //@ It's always good practice to close a scanner when you are done with it.

            //& Have the students import java.util.Scanner, instantiate a Scanner, and create a user input mechanism like the one above to display a message to a user.
            //& The students can be creative with both the message they display and the input they take.

        /*USER INPUT CONT., TYPECASTING, IF / ELSE STATEMENTS*/
            //+ In this next section we'll create a calculator that calculates values based on user input.
            //+ There's one challenge: user input is in the form of a String, and calculators work with Integers and Doubles.
            //+ We can use typecasting to convert a String to an Integer or Double.
            
            String numberInputInteger = "37";
            String numberInputDouble = "49.4";
            //@ Here we have two Strings that need to be converted to their respective numeric types

            int integerInput = Integer.parseInt(numberInputInteger);
            Double DoubleInput = Double.parseDouble(numberInputDouble);

            //!
            //@ The following methods: Integer.parseInt() and Double.parseDouble() convert Strings to integers and doubles, respectively.
            //@ These methods will be important to us when we construct our calculator

            Scanner Calculator = new Scanner(System.in);
            //@ Here we are instantiating a Scanner called Calculator.

            System.out.println("Enter an integer: ");
            int value1 = Integer.parseInt(Calculator.nextLine());
            //@ We will have the user enter an integer and store it as value1

            System.out.println("Enter an operator (+, -, *, or /): ");
            String operator = Calculator.nextLine();
            //@ We will have the user enter an operator and store it as operator

            System.out.println("Enter a Double: ");
            Double value2 = Double.parseDouble(Calculator.nextLine());
            //@ We will have the user enter a Double and store it as value2

            //+ There are four possible operators: +, -, *, and /.
            //& Ask the students and have them really think about this:
            //& How do we write code to account for each operator?


            //+ The answer is an if statement.
            //+ We use if statements in java to perform an operation only IF a condition is satisfied. The condition must be boolean: true or false.
            //+ Things to note: 
            //+ If statements can be followed by else if statements, and a final else statement at the end.
            //+ If, else if, and else chains of logic are always evaluated from top to bottom.
            //+ You don't always need else if statement(s). You are allowed to write an if statement followed by an else statement.

            if (operator.equals("+"))
            {
                System.out.println(value1 + value2);
            }
            else if (operator.equals("-"))
            {
                System.out.println(value1 - value2);
            }
            else if (operator.equals("*"))
            {
                System.out.println(value1 * value2);
            }
            else if (operator.equals("/"))
            {
                System.out.println(value1 / value2);
            }
            else
            {
                System.out.print("You entered an invalid operator. Please run the program again and try again.");
            }
            
            //@ If the operator String is a plus, then we add the numbers; else if the operator string is a minus, then we subtract the numbers, etc.
            //@ Finally, if none of the conditions are satisified, then the user entered the operator incorrectly, so we return an error.
        
            Calculator.close();
            
            //!
            //& Demo the calculator functionality to the students.
            //& For the time remaining, guide the students to create calculators like these on their own. Make sure they understand how if, else if, and else logic chains work.

            myScanner.close();
    }

}