# Explanation

A. You are allowed to use null with instanceof; it just prints false. The bus variable is
both a Vehicle and a Bus, so lines 18 and 19 print true. Then it gets interesting. We know
that bus is not an ArrayList or Collection. However, the compiler only knows that bus
is not an ArrayList because ArrayList is a concrete class. Line 20 does not compile. The
compiler can’t definitively state that bus is not a Collection. Some future program could
create a subclass of Bus that does implement Collection, so this line compiles. Therefore,
only line 20 fails to compile, and Option A is correct.
