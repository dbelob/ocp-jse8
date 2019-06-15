# Explanation

Rule is: If evaluation of an argument expression completes abruptly, no part of any argument expression to its right is evaluated.

Initially, the values of i1, i2, i3 are all 0;

Now, the only important statement of this code is:

    test(i1 = 1, oops(i2=2), i3 = 3);

Before calling the method test, obviously, the parameters have to be evaluated. Therefore, 1 is assigned to i1, 2 is assigned to i2. Now before 3 is assigned to i3, oops(2) will be called (since i2 is now 2)

However, oops() throws an exception, so the JVM never gets a chance to execute i3 = 3; and neither is the method test() called (because of the exception in evaluating the params)

So, in the catch block it prints 1 2 0.
