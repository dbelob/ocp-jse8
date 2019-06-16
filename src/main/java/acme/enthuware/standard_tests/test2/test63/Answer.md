# Explanation

The input parameter has been specified as List<E>, where E has to be some class that extends CharSequence. So ArrayList<String>, List<String>, or List<CharSequence> are all valid as reference types for 'in'.

The output type of the method has been specified as List<? super E> , which means that it is a List that contains objects of some class that is a super class of E. Here, E will be typed to whatever is being used for 'in'. For example, if you declare ArrayList<String> in, E will be String.

The important concept here once the method returns, there is no way to know what is the exact class of objects stored in the returned List. So you cannot declare out in a way that ties it to any particular class, not even Object.

Thus, the only way to accomplish this is to either use non-typed reference type, such as:  List result; or use the same type as the return type mentioned in the method signature i.e. List<? super String> (because E will be bound to String in this case.)
