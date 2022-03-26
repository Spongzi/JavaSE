package data_structure.array;

public class arrayBasisDemo1 {
    public static void main(String[] args) throws Exception {
        myArray myArray = new myArray(10);
        myArray.insert(0, 2);
        myArray.insert(1, 21);
        myArray.insert(2, 22);
        myArray.insert(3, 12);
        myArray.insert(1, 2);
        myArray.output();

    }
}

class myArray {
    private int[] array;
    private int size;

    public myArray(int capacity) {
        this.array = new int[capacity];
        size = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 插入元素
     * @param index 要插入元素的下标
     * @param element 要插入的元素
     */
    public void insert(int index, int element) throws Exception {
        // 1. 判断下标是否超出范围
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组时间元素范围");
        }
        // 2. 循环遍历，将元素向后挪动一位
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
