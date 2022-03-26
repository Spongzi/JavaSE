package data_structure.array;

public class arrayDelete {
    public static void main(String[] args) throws Exception {
        myArray_delete myArray = new myArray_delete(3);
        myArray.insert(0, 2);
        myArray.insert(1, 21);
        myArray.insert(2, 22);
        myArray.insert(3, 12);
        myArray.insert(1, 21231);
        System.out.println("被删除的元素是：" + myArray.delete(1));
        myArray.output();
    }
}

class myArray_delete {
    private int[] array;
    private int size;

    public myArray_delete(int capacity) {
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
        // 如果实际长度大于了数组长度，那么就要对数组进行扩容
        if (size >= array.length) {
            resize();
        }
        // 2. 循环遍历，将元素向后挪动一位
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    /**
     * 扩容技术
     */
    public void resize() {
        int[] newArr = new int[array.length * 2];
        // 从旧的数组中copy到新数组中
        System.arraycopy(array, 0, newArr, 0, array.length);
        // 赋值
        array = newArr;
    }

    /**
     * 删除元素
     * @param index 要删除的元素下标
     * @throws Exception 抛出异常
     */
    public int delete(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组的实际长度");
        }
        int deleteElement = array[index];
        // 把数组的每个元素向前一个
//              arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return deleteElement;
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}