public class MyList<T> {
    private int defaultCapacity = 10;
    private int size;
    private int index = 0;
    private Object[] arr;

    public MyList() {
        int defaultCapacity = this.defaultCapacity;
        this.arr = new Object[defaultCapacity];
        this.size = defaultCapacity;
    }

    public MyList(int capacity) {
        this.arr = new Object[capacity];
        this.size = capacity;
    }

    public void add(T entity) {
        this.arr[index++] = entity;
        size = index;

        if (arr.length <= index) {
            Object[] localArray = new Object[index];
            for (int i = 0; i < localArray.length; i++) {
                localArray[i] = arr[i];
            }
            arr = new Object[index * 2];
            for (int i = 0; i < localArray.length; i++) {
                arr[i] = localArray[i];
            }
        }
    }

    public Object get(int index) {
        Object[] newArr = new Object[this.index];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr[index];
    }

    public int size() {
        return size;
    }

    public Object remove(int index) {
        Object[] removedArr = new Object[arr.length - 1];
        size--;
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            removedArr[k++] = arr[i];
        }
        for (int i = 0; i < removedArr.length; i++) {
            arr[i] = removedArr[i];
        }
        return removedArr[index];
    }

    public boolean clear() {
        this.size = 0;
        return true;
    }

    public boolean isEmpty() {
        return arr[0] == null || size == 0;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }



}
