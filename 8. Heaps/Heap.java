import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // WRITE THE INSERT METHOD HERE //
    public void insert(int value) {
        heap.add(value);
        int index = heap.size() - 1;
        while (index > 0 && heap.get(index) > heap.get(parent(index))) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // We will be writing the sinkDown method in the next exercise.
    // But I need to include it here for the tests to work for remove.
    // So, don't peek at this one here.  :-)
    // private void sinkDown(int index) {
    //     int maxIndex = index;
    //     while (true) {
    //         int leftIndex = leftChild(index);
    //         int rightIndex = rightChild(index);

    //         if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
    //             maxIndex = leftIndex;
    //         }

    //         if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
    //             maxIndex = rightIndex;
    //         }

    //         if (maxIndex != index) {
    //             swap(index, maxIndex);
    //             index = maxIndex;
    //         } else {
    //             return;
    //         }
    //     }
    // }

    // WRITE THE REMOVE METHOD HERE //
    public Integer remove() {
        if (heap.size() == 0) return null;

        if (heap.size() == 1) return heap.remove(0);

        int val = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return val;
    }

    private void sinkDown(int index) {
        int checkIndex = index;

        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(index)) {
                checkIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(index)) {
                checkIndex = rightIndex;
            }

            if (checkIndex != index) {
                swap(index, checkIndex);
                index = checkIndex;
            } else {
                return;
            }
        }
    }
}






