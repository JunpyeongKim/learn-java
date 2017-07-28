[Top 10 Mistakes Java Developers Make](http://www.programcreek.com/2014/05/top-10-mistakes-java-developers-make/)
=====================================
- http://www.programcreek.com/2014/05/top-10-mistakes-java-developers-make/

# 1. Convert Array to ArrayList

```java
List<String> list = Arrays.asList(arr);
```
- Arrays.asList() returns java.util.Arrays.ArrayList
    - private static class
        - not java.util.ArrayList
    - set(), get(), contains()
        - does not have any methods for adding elements, so its size is fixed.

To create a real ArrayList,
```java
ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
```
- can accept a Collection type


# 2. Check If an Array Contains a Value

```java
Set<String> set = new HashSet<String>(Arrays.asList(arr));
return set.contains(targetValue);
```
- Converting a list to a set requires extra time.

```java
Arrays.asList(arr).contains(targetValue);
```
_or_
```java
for (String s : arr) {
    if (s.equals(targetValue)) {
        return true;
    }
}

return false;
```
- The first one is more readable that the second one.


# 3. Remove an Element from a List Inside a Loop
```java
ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
for (int i = 0; i < list.size(); i++) {
    list.remove(i);
}
System.out.println(list);   // [b, d]
```
- a serious problem
    - the size of list shrinks and the index changes.
- using iterator is the right way to delete elements inside loops.

```java
ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
for (String s : list) {
    if (s.equals("a")) {
        list.remove(s);
    }
}
```
- throw out [ConcurrentModificationException](http://www.programcreek.com/2014/01/java-util-concurrentmodificationexception/)
- In the foreach loop, compiler will make the .next() called after the operation of removing element.

```java
ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    String s = iter.next();
    if (s.equals("a")) {
        iter.remove();
    }
}
```
- .next() must be called before .remove()
- [Deep Understanding of ArrayList.iterator()](http://www.programcreek.com/2014/01/deep-understanding-of-arraylist-iterator/)


# 4. Hashtable vs. HashMap
- One of the key differences
    - the _Hashtable_ is synchronized
- So very often you don't need _Hashtable_,
    - instead _HashMap_ should be used.
- [HashMap vs. TreeMap vs. Hashtable vs. LinkedHashMap](http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/)
- [Top 10 questions about Map](http://www.programcreek.com/2013/09/top-9-questions-for-java-map/)


# 5. Use Raw Type of Collection
- Set is raw type, while Set<?> is unbounded wildcard type.

```java
public static void add(List list, Object o) {
    list.add(o);
}

public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    add(list, 10);
    String s = list.get(0);
}
```
- java.lang.ClassCastException
    - as the raw type collections skip the generic type checking and not safe.
    - huge differences between Set, Set<?>, and Set<Object>
- [Raw type vs. Unbounded wildcard](http://www.programcreek.com/2013/12/raw-type-set-vs-unbounded-wildcard-set/) and [Type Erasure](http://www.programcreek.com/2011/12/java-type-erasure-mechanism-example/).


# 6. Access Level
- The rule of thumb is giving access level for members as low as possible.
- [public, default, protected, and private](http://www.programcreek.com/2011/11/java-access-level-public-protected-private/)


# 7. ArrayList vs. LinkedList
- there is a huge performance difference
- _LinkedList_ should be preferred
    - if there are a large number of add/remove operations and there are not a lot of random access operations.
- [ArrayList vs. LinkedList](http://www.programcreek.com/2013/03/arraylist-vs-linkedlist-vs-vector/)

# 8. Mutable vs. Immutable
- There should be a balance when choosing
- Immutable
    - simplicity, safety, etc.
    - requries a separate object for each distinct value.
    - too many objects might cause a high cost of garbage collection.
- Mutable
    - used to avoid producing too many intermediate objects.
    - passing mutable objects into methods
- [dasblinkenlight's answer](http://stackoverflow.com/questions/23616211/why-we-need-mutable-classes)
- [Why is String Immutable?](http://www.programcreek.com/2013/04/why-string-is-immutable-in-java/)


# 9. Constructor of Super and Sub
```java
class Super {
    String s;

    public Super(String s) {
        this.s = s;
    }
}

public class Sub extends Super {
    int x = 200;

    public Sub(String s) {

    }

    public Sub() {
        System.out.println("Sub");
    }

    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
```
- compilation error occurs
    - because the default super constructor is undefined.
    - In Java, if a class does not define a constructor, compiler will insert a default no-argument constructor for the class by default.
    - The constructors of the Sub class, either with-argument or no-argument, will call the no-argument Super constructor.
        - Since compiler tries to insert super() to the 2 constructors in the Sub class
- To fix
    - 1) define public Super()
    - 2) remove public Super(String s) if unnecessary
    - 3) add super(value) to sub constructors
- [Constructor of Super and Sub](http://www.programcreek.com/2013/04/what-are-the-frequently-asked-questions-about-constructors-in-java/)

# 10. "" or Constructor ?
```java
String a = "abcd";
String b = "abcd";
System.out.println(a == b); // true
System.out.println(a.equals(b));    // true

String c = new String("abcd");
String d = new String("abcd");
System.out.println(c == d); // false
System.out.println(c.equals(d));    // true
```
- [Create Java String Using ” ” or Constructor?](http://www.programcreek.com/2014/03/create-java-string-by-double-quotes-vs-by-constructor/)
