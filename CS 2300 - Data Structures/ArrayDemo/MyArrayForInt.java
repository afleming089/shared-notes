public class MyArrayForInt {
    private int[] elements;
    private int numElements;

    public MyArrayForInt() { // c1 = O(1)
        numElements = 0;
        elements = new int[5];
    }

    // double size of the array 'elements'
    void enlarge() { // O(N)
        int[] newArr = new int[2 * elements.length]; // want double because you will need to copy every time if just
        // add one index
        for (int i = 0; i < numElements; i++)
            newArr[i] = elements[i];
        elements = newArr;
    }

    void add(int val) { // O(N) average O(1)
        // if it is full, increase size of the array `elements'
        if (isFull()) // is full
            enlarge(); // O(N)

        elements[numElements++] = val; // O(1)
        // equals elements[numsElements] then plus 1
    }

    // remove
    void remove(int val) { // O(N)
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
    int search(int val) { // O(N)
        // unsorted
        return linearSearch(val);

        // sorted
        // return binarySearch(val);
    }

    private int linearSearch(int val) { // O(N)
        for (int i = 0; i < numElements; i++) {
            if (val == elements[i]) {
                return i;
            }
        }

        return -1;
    }

    private int binarySearch(int val) { // O(log(N))
        int start = 0, end = numElements - 1;
        while (start <= end) {
            int mid = end - start / 2;
            if (val == elements[mid])
                return mid;
            else if (val < elements[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    int get(int index) { // O(1)
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
