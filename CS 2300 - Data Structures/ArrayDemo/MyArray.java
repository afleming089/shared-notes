// handles ALL data types
// do this with <E> or <K> or <any letter>

public class MyArray<E> {
    private E[] elements;
    private int numElements;

    public MyArray() { // c1 = O(1)
        numElements = 0;
        // can not create a general array because of different byte size
        // Object is 8 byte and will fit all the sizes of different data types
        // Can cast to type E so it matches the general type
        elements = (E[]) new Object[5];
    }

    // E size of the array 'elements'
    void enlarge() { // O(N)
        E[] newArr = (E[]) new Object[2 * elements.length]; // want E because you will need to copy every time if
        // just
        // add one index
        for (int i = 0; i < numElements; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    void add(E val) { // O(N) average O(1)
        // if it is full, increase size of the array `elements'
        if (isFull()) // is full
            enlarge(); // O(N)

        elements[numElements++] = val; // O(1)
        // equals elements[numsElements] then plus 1
    }

    // remove
    void remove(E val) { // O(N)
        int index = search(val); // O(N)

        if (index == -1)
            return; // O(1)
        else {
            elements[index] = elements[numElements - 1]; // O(1)
            numElements--; // O(1)

            // same as
            // elements[index] = elements[--numElements];
        }
    }

    boolean isFull() { // O(1)
        return numElements == elements.length;
    }

    // searching
    int search(E val) { // O(N)
        // unsorted
        return linearSearch(val);

        // sorted
        // return binarySearch(val);
    }

    private int linearSearch(E val) { // O(N)
        for (int i = 0; i < numElements; i++) {
            if (val.equals(elements[i])) {
                return i;
            }
        }

        return -1;
    }

    private int binarySearch(E val) { // O(log(N))
        int start = 0, end = numElements - 1;
        while (start <= end) {
            int mid = end - start / 2;
            if (val == elements[mid])
                return mid;
            else if (((Comparable) val).compareTo(elements[mid]) < 0) // java has a Comparable class that allows
                                                                      // compareTo. You can cas val to that and then use
                                                                      // it for any data type.
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    E get(int index) { // O(1)
        return elements[index];
    }

    public E max() {
        E maxV = elements[0];
        for (int i = 0; i < numElements; i++) {
            if (((Comparable) elements[i]).compareTo(maxV) > 0)
                maxV = elements[i];
        }

        return maxV;
    }

    @Override
    public String toString() { // O(N)
        // TODO Auto-generated method stub
        String array = "";

        for (int i = 0; i < numElements; i++) {
            array += elements[i] + " ";
        }

        array += "\nArray Length: " + elements.length + "\n";

        return array;
    }

}
