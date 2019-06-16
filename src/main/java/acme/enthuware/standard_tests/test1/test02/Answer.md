# Explanation

//1 and //2

Remember that HashMap supports adding null key as well as null values but ConcurrentHashMap does not. Inserting null key or null in a ConcurrentHashMap will throw a NullPointerException. Some candidates have reported getting a question on this aspect of ConcurrentHashMap.
