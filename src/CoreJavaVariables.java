public class CoreJavaVariables {
    public static void main(String[] args) {

        //                               QUESTION 1
        // Write a program that declares 2 integer variables, assigns an integer to each,
        // and adds them together. Assign the sum to a variable. Print out the result.
        int a = 5;
        int b = 10;
        int sum = a + b;

        System.out.println("The sum of two integers a + b = " + sum);

        //                              Question 2
//        Write a program that declares 2 double variables, assigns a number to each,
//        and adds them together. Assign the sum to a variable. Print out the result.

        double c = 50.0;
        double d = 45.0;
        double sumOfDouble = c + d;

        System.out.println("The sum of two doubles c + d = " + sumOfDouble);

        //                              QUESTION 3
        //  Write a program that declares an integer variable and a double variable,
        //  assigns numbers to each, and adds them together. Assign the sum to a variable.
        //  Print out the result. What variable type must the sum be?

        int e = 9;
        double f = 50.0;
        double sumOfIntAndDouble = e + f;

        System.out.println("The sum of an int and a double e + f = " + sumOfIntAndDouble);
        //                              QUESTION 4
        // Write a program that declares 2 integer variables, assigns an integer to each,
        // and divides the larger number by the smaller number. Assign the result to a variable.
        // Print out the result. Now change the larger number to a decimal. What happens?
          // You receive the following error: java: incompatible types:
          // possible lossy conversion from double to int
        // What corrections are needed?
          // You need to change the larger number (decimal) to a double as well as the division variable.

        double largerNum = 20.5;
        int smallerNum = 10;
        double division = largerNum / smallerNum;

        System.out.println("The quotient of a larger int divided by a smaller int = " + division);

        //                              QUESTION 5
        // Write a program that declares 2 double variables, assigns a number to each,
        // and divides the larger by the smaller. Assign the result to a variable. Print out the result.
        // Now, cast the result to an integer. Print out the result again.

        double largerNumA = 50.0;
        double smallerNumB = 25.0;
        double divisionOfAB = largerNumA / smallerNumB;  //Prior to cast result was 2.0
        int result = (int)divisionOfAB;

        System.out.println("The quotient of a larger double divided by a smaller double = " + result);

        //                              QUESTION 6
//      // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
//      // Declare a variable q and assign y/x to it and print q.
//             // Result: 1.0
//      // Now, cast y to a double and assign to q.
//      // Print q again.
               // Result: 1.2 why?

        int x = 5;
        int y = 6;
        double q = ((double)y)/x;

        System.out.println("The quotient of dividing y by x = " + q);

        //                            QUESTION 7
//      // Write a program that declares a named constant and uses it in a calculation. Print the result.
            // Had to remove static from the beginning of constant declaration
            // due to illegal start of expression error.  Not sure why.
        final int CONSTANTINT = 10;
        int constantResult = CONSTANTINT + 5;
        System.out.println("This is the result of addition using a constant: " + constantResult);

        //                            QUESTION 8
//      /* Write a program where you create 3 variables that represent products at a cafe.
//        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//        Assign prices to each product.
//        Create 2 more variables called subtotal and totalSale and
//        complete an “order” for 3 items of the first product, 4 items of the second product,
//        and 2 items of the third product. Add them all together to calculate the subtotal.
//        Create a constant called SALES_TAX and
//        add sales tax to the subtotal to obtain the totalSale amount.
//        Be sure to format the results to 2 decimal places. */

        double coffee = 5.50;
        double donut = 2.95;
        double tea = 3.00;
        double subtotal = (coffee * 3) + (donut * 4) + (tea * 2);
        final double SALES_TAX = 0.08 * subtotal;
        double totalSale = subtotal + SALES_TAX;

        System.out.printf("Your total is: %.2f", totalSale);  // Why no need for the plus sign between the formatting and var?


    }
}
