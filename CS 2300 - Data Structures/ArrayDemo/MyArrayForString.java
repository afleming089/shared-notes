public class MyArrayForString {
    private String[] elements;
    private int numElements;

    public MyArrayForString() { // c1 = O(1)
        numElements = 0;
        elements = new String[5];
    }

    // String size of the array 'elements'
    void enlarge() { // O(N)
        String[] newArr = new String[2 * elements.length]; // want String because you will need to copy every time if
                                                           // just
        // add one index
        for (int i = 0; i < numElements; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    void add(String val) { // O(N) average O(1)
        // if it is full, increase size of the array `elements'
        if (isFull()) // is full
            enlarge(); // O(N)

        elements[numElements++] = val; // O(1)
        // equals elements[numsElements] then plus 1
    }

    // remove
    void remove(String val) { // O(N)
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
    int search(String val) { // O(N)
        // unsorted
        return linearSearch(val);

        // sorted
        // return binarySearch(val);
    }

    private int linearSearch(String val) { // O(N)
        for (int i = 0; i < numElements; i++) {
            if (val.equals(elements[i])) {
                return i;
            }
        }

        return -1;
    }

    private int binarySearch(String val) { // O(log(N))
        int start = 0, end = numElements - 1;
        while (start <= end) {
            int mid = end - start / 2;
            if (val == elements[mid])
                return mid;
            else if (val.compareTo(elements[mid]) < 0)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    String get(int index) { // O(1)
        return elements[index];
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
