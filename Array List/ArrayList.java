import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListMethodsExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add(E element)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList after adding elements: " + numbers);

        // add(int index, E element)
        numbers.add(1, 15);
        System.out.println("ArrayList after adding at index 1: " + numbers);

        // addAll(Collection<? extends E> c)
        List<Integer> additionalNumbers = Arrays.asList(40, 50, 60);
        numbers.addAll(additionalNumbers);
        System.out.println("ArrayList after adding collection: " + numbers);

        // addAll(int index, Collection<? extends E> c)
        List<Integer> extraNumbers = Arrays.asList(5, 6, 7);
        numbers.addAll(2, extraNumbers);
        System.out.println("ArrayList after adding collection at index 2: " + numbers);

        // get(int index)
        int elementAtIndex = numbers.get(3);
        System.out.println("Element at index 3: " + elementAtIndex);

        // set(int index, E element)
        numbers.set(4, 25);
        System.out.println("ArrayList after setting element at index 4: " + numbers);

        // remove(int index)
        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);

        // remove(Object o)
        numbers.remove(Integer.valueOf(20)); // Removes the first occurrence of 20
        System.out.println("ArrayList after removing value 20: " + numbers);

        // clear()
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);

        // isEmpty()
        System.out.println("Is the ArrayList empty? " + numbers.isEmpty());

        // contains(Object o)
        System.out.println("Does the ArrayList contain 25? " + numbers.contains(25));

        // indexOf(Object o)
        System.out.println("Index of value 15: " + numbers.indexOf(15));

        // lastIndexOf(Object o)
        System.out.println("Last index of value 25: " + numbers.lastIndexOf(25));

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        // subList(int fromIndex, int toIndex)
        List<Integer> subList = numbers.subList(1, 2);
        System.out.println("Sublist: " + subList);

        // toArray()
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Array from ArrayList: " + Arrays.toString(array));
    }
}
