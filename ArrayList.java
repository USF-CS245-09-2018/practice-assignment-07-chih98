public class ArrayList implements List {

	 private static int DEFAULT_SIZE = 1; // Default array size

    Object[] arr;
    int size; 


    public ArrayList() {
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(int pos, Object obj) {

        if(arr.length == size) {
            grow();
            add(pos, obj);
        }
        else {

            for(int i = size; i > pos; i--) {
                arr[i + 1] = arr[i];
            }

            arr[pos] = obj;
            size = size + 1;
        }

    }

    public void add(Object obj) {
        if(size == arr.length) {
            grow();
            add(obj);
        }
        else {
            arr[size] = obj;
            size = size + 1;
        }

    }


	public Object remove(int pos) {

        Object removingObject = arr[pos];

        for(int i = pos; i < size - 1; i ++) {
            arr[i] = arr[i + 1];
        }

        size--;
        return removingObject;
    }

	public Object get(int pos) {
        
        return arr[pos];

    }

	public int size() {

        return size;

    }

    public void grow() {
       
        int newLength = arr.length + 1;
        Object[] newArr = new Object[newLength];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;

    }

}