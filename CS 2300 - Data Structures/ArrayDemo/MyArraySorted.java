public class MyArraySorted {
    private int[] elements;
    private int numElements;

    public MyArraySorted() { // c1 = O(1)
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

        // insert val into right place
        // start comparing from the right most element backwards
        int i;
        for (i = numElements - 1; i >= 0 && elements[i] > val; i--) {
            elements[i + 1] = elements[i];
        }
        elements[i + 1] = val;
        numElements++;
    }

    // remove
    void remove(int val) { // O(N) // average O(N)
        int index = search(val); // O(N)

        if (index == -1)
            return; // O(1)
        else {
            for (int i = index; i < numElements; i++) {
                elements[i] = elements[i + 1];

            }
            numElements--;

            // same as
            // elements[index] = elements[--numElements];
        }
    }

    boolean isFull() { // O(1)
        return numElements == elements.length;
    }

    // searching
    int search(int val) { // O(log(N))
        // unsorted
        // return linearSearch(val);

        // sorted
        return binarySearch(val);
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
