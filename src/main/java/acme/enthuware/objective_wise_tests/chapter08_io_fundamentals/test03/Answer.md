# Explanation

F.

Remember that transient fields and static fields are never serialized. Constructor, instance blocks, and field initialization of the class being deserialized are also not invoked. So, when boo is deserialized, the value of ti is set to 0.

The class Boo is loaded as soon as the code refers to the class (here, it happens at Boo boo = new Boo(); ), and so the static int si is initialized to the value given in the class code i.e. 20 and then it is incremented to 21 because of boo.si++;. This part has nothing to do with serialization. So when you deserialize an instance of Boo, Boo.si is not affected and is not reset to 20.

Therefore, if you run the program again with just the deserialization part, you will see that si is 20 and not 21.
