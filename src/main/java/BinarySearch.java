public class BinarySearch {

    public static int search(int[] arr, int toFind) {
        int index = arr.length >> 1;
        int bottom = 0;
        int top = arr.length - 1;
        return bifurcate(arr,0,0,arr.length-1,toFind);
    }

    public static int bifurcate(int[] arr, int index, int bottom, int top, int toFind) {
        System.out.println(bottom + " " + index + " " + top);
        if (arr[index] == toFind) {
            return index;
        } else if (top == bottom || top < index || bottom > index) {
            return -1;
        } else {
            if (arr[index] > toFind) { // go left
                int newIndex = bottom+(index-bottom)>>1;
                return bifurcate(arr,newIndex, bottom, index, toFind);
            } else { //go right
                int newIndex = index+Math.max((top-index)>>1,1);
                return bifurcate(arr,newIndex, index, top, toFind);
            }
        }
    }




}
