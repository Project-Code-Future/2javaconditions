import java.util.Scanner;

//Java Workshop 2: Boolean and Conditional Logic
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
() anything within parenthesis are notes for volunteers and do not have to be necessarily read out loud
*/

//@ The class and public static void main method are necessary for any Java file, but not necessary to fully understand for this workshop
class Conditions {

    public static void main(String[]args){

            int x = 5;
            int y = 6;
            //+ As we learned in the previous section, ints are Integers: numbers without decimals.
            //& Ask students which variable is greater. The correct answer is (y), because 6 > 5.

            //+ Java can actually compare numbers for us. We use the following operators:
            //+ > (greater than), < (less than), == (equal to), >= (greater than or equal to), <= (less than or equal to), and != (not equal to).
            //+ Instead of asking you all which integer is greater, I can ask Java by printing a comparison of two numbers

        /*COMPARISONS: Greater Than (or equal to) and Less Than (or equal to)*/
            System.out.println(y > x);
            //! 
            //@ The output of the statement is true because y is greater than x. 
            //& What would happen if we reversed the comparison sign from greater than to less than?

            System.out.println(y < x);
            //!
            //@ The output of the statement is false because y is not less than x.

            System.out.println(y >= x);
            //!
            //@ The output of this statement is true because y is greater than or equal to x. 
            //& What would happen if we added 1 to x, x became 6, and we ran this code again?

            x++;
            System.out.println(y >= x);
            //!
            //@ The output of this statement is still true because y is greater than or equal to x. In this case it is equal to x.
            //& Have students experiment with the different operators
        
        /*BOOLEAN LOGIC, NOT, AND, & OR*/
            
            int v = 8;
            //+ What if we want to evaluate multiple conditions at the same time. Such as: y >= x AND y >= v. How would we do this?
            //+ In Java we do this using special operators. AND is && and OR is ||.
            //+ Thus, the code for the example y >= x AND y >= v would look like this:   
            
            System.out.println(y >= x && y >= v);
            //& Remember that y = 6 and x = 6.
            //& Before running, ask students what this will evaluate to. (The answer should be false because although y >= x, y is not >= v) 
            //!

            System.out.println(y >= x || y >= v);
            //& Before running, ask students what this will evaluate to. (The answer should be true because y >= x)
            //!
            //+ If we change this operator to || (OR), only one of the conditions has to be true. So, since y >= x is true, this returns true.


            //+ In Java, we can also put an exclamation point before a condition to take the opposite of the result, think of the ! as the word NOT. 
            //+ For example, 4 > 3 returns true, but if we type !(4 > 3), we get NOT(true) — which is false.

            System.out.println(!(y >= x));
            //!
            //+ This prints false because y is greater than or equal to x, so (y>=x) evaluates to true. Then, the ! operator takes the opposite of true, which is false.


        /*BOOLEANS*/
        
            //+ When a value can either be true or false, we call that value a boolean. To remember this, think BOO-lean, the BOO rhymes with TWO, and booleans only have two possible return values: true or false
            boolean z = true;
            boolean q = false;
            //+ We can declare boolean variables just like we declare integer, String, or any other type of variables.

            System.out.println(z);
            System.out.println(q);
            //!
            //+ As you can see, boolean z prints true and boolean q prints false.

        /*COMPARISONS: Equals and Not Equals*/
            //+ As you might have seen earlier, the operator for equal to is TWO equal signs, not ONE. This is because one equal sign is reserved for declaring variables.
            System.out.println(x == y);
            //!
            //@ The output of this statement is true because y is 6, x is 6, and 6 equals 6. Remember that we wrote x++; earlier to increment x by 1.
            System.out.println(z == q);
            //!
            //@ The output of this statement is false because boolean z is true, boolean q is false, and true doesn't equal false, making our statement false.
            //+ As you might have seen earlier, the operator for not equal to is an exclamation point combined with an equal sign (!=).
            
            System.out.println(z != q);
            //!
            //@ This statement is true because boolean z is true, boolean q is false, and true doesn't equal false, making our statement true.
            
        /*USER INPUT*/
            //+ When we have been running code earlier, the output has been displayed in a Terminal window. Did you know you can also provide INPUT to the terminal window?
            //+ Giving the computer information during the runtime of a program is called user input, and this next section will show you how user input works in Java.
            //+ At the top of the program, we need to add "import java.util.Scanner;" to import the Java utility Scanner class.
            //+ Classes are something we will discuss later but you can think of the Scanner class as another person's code that we borrowed.

            Scanner myScanner = new Scanner(System.in);
            //! This is how we create a Scanner called myScanner.
            //+ myScanner will "scan" (or take in) for whatever the user types into the terminal.

            System.out.println("Enter your name: ");
            //!
            //@ Now that we have created a scanner, we'll print "Enter your name:" in the output window to direct the user to give us their name.
            //& Enter your name in the terminal.

            String name = myScanner.nextLine();
            //@ We'll store the user's name in a String variable. We set name equal to the next line of our open scanner.

            System.out.println("Hi, " + name);
            //!
            //@ We'll greet the user by using string concatenation, combining the phrase "Hi, " with the name variable.
            //& The students can be creative with both the message they display and the input they take.

        /*USER INPUT CONT., TYPECASTING, IF / ELSE STATEMENTS*/
            //+ In this next section we'll create a calculator that calculates values based on user input.
            //+ There's one challenge: user input is in the form of a String, and calculators work with Integers and Doubles.
            //+ We can use typecasting to convert a String to an Integer or Double.
            
            String numberInputInteger = "37";
            String numberInputDouble = "49.4";
            //@ Here we have two Strings that need to be converted to numbers, the first to an int and the second to a double.

            int integerInput = Integer.parseInt(numberInputInteger);
            Double doubleInput = Double.parseDouble(numberInputDouble);

            //!
            //@ The following methods: Integer.parseInt() and Double.parseDouble() convert Strings to integers and doubles, respectively.
            //@ integerInput contains the int version of "37" and doubleInput contains the double version of "49.4"

            Scanner Calculator = new Scanner(System.in);
            //@ Here we are creating a Scanner called Calculator.

            System.out.println("Enter an integer: ");
            int value1 = Integer.parseInt(Calculator.nextLine());
            //@ We will have the user enter a whole number 
            //@ The input is origanally a string, so we wrap it in Integer.parseInt to convert it to an integer
            
            System.out.println("Enter an operator (+, -, *, or /): ");
            String operator = Calculator.nextLine();
            //@ We will have the user enter an operator and store it as operator

            System.out.println("Enter a Double: ");
            Double value2 = Double.parseDouble(Calculator.nextLine());
            //@ We will have the user enter a Double and store it as value2

            //+ Remember there are four possible operators: + (additon), - (substraction), * (multiplication), and / (division).
            //& Ask the students and have them really think about this:
            //& How do we write code to account for each operator?


            //+ The answer is an if statement.
            //+ We use if statements in Java to perform an operation only IF a condition is satisfied. The condition must be true or false.
            //+ Things to note: 
            //+ If statements can be but don't have to be followed by else if statements, and a final else statement at the end.
            //+ If, else if, and else chains of logic are always evaluated from top to bottom.
            //+ You don't always need else if statement(s). You are allowed to write an if statement followed by an else statement.

            if(x == y) 
            {
              System.out.println("X and Y are equal");
            }

            //!
            //+ When writing if statements the condition lies inside the parenthesis and the output of the statement lies inside the curly brackets
            //+ The line only prints if X and Y are equal

            if(x == y) 
            {
              System.out.println("X and Y are equal")
            }
            else
            {
              System.out.println("X and Y are not equal")
            }

            //!
            //& Have students experiment with the values for x, y and the operators for a couple minutes (if the lesson is taking too long skip this step)


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
            //+ It's always good practice to close a scanner when you are done with it.
            
            //!
            //& Demo the calculator functionality to the students.
            //& For the time remaining, guide the students to create calculators like these on their own. Make sure they understand how if, else if, and else logic chains work.

            myScanner.close();
    }

}
