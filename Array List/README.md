# Array List

ArrayList is a class in Java that is a part of the java.util package. It is an implementation of the List interface and provides dynamic array-like behavior. It allows you to store and manipulate a collection of elements. Here are some key features and points about ArrayList:
- Dynamic Sizing: Unlike regular arrays, ArrayList can dynamically grow and shrink in size as elements are added or removed. You don't need to specify a fixed size upfront.
- Generic: ArrayList is a generic class, which means it can hold elements of any data type. You specify the type of elements it will hold when creating an instance.
- Index-Based Access: Elements in an ArrayList are stored with indexes, and you can access elements using their index. The index starts from 0.
- Adding Elements: You can add elements to an ArrayList using the add() method. You can add elements at the end of the list or at a specific index.
- Removing Elements: Elements can be removed using methods like remove(), removeAt(), and others.
- Size and Capacity: The size() method returns the number of elements in the ArrayList. The ArrayList also has an internal capacity, which is the number of elements it can hold before it needs to be resized.
- Iteration: You can iterate over the elements of an ArrayList using traditional for loops, enhanced for loops, or using iterators.
- Performance: While ArrayList provides dynamic sizing, adding or removing elements from the middle of the list can be less efficient compared to adding or removing elements from the end, as it might involve shifting elements.

 ## Methods
 Here's a list of some common methods provided by the ArrayList class in Java:
- add(E element): Adds the specified element to the end of the list.
- add(int index, E element): Inserts the specified element at the specified position in the list, shifting the elements at that position and beyond to the right.
- addAll(Collection<? extends E> c): Adds all elements from the specified collection to the end of the list.
- addAll(int index, Collection<? extends E> c): Inserts all elements from the specified collection into the list, starting at the specified index.
- get(int index): Returns the element at the specified index.
- set(int index, E element): Replaces the element at the specified index with the specified element.
- remove(int index): Removes the element at the specified index and shifts any subsequent elements to the left.
- remove(Object o): Removes the first occurrence of the specified element from the list, if present.
- clear(): Removes all elements from the list.
- size(): Returns the number of elements in the list.
- isEmpty(): Returns true if the list contains no elements.
- contains(Object o): Returns true if the list contains the specified element.
- indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if the element is not present.
- lastIndexOf(Object o): Returns the index of the last occurrence of the specified element, or -1 if the element is not present.
- subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).
- toArray(): Returns an array containing all of the elements in the list in proper sequence.
- toArray(T[] a): Returns an array containing all of the elements in the list in the specified array, if it is large enough. Otherwise, a new array is allocated with the runtime type of the specified array and the size of the list.
