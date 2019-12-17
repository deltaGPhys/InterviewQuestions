public class dupeFinder {

    public static int[] addToArray (int[] arr, int index, int toAdd) {
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (i < index) ? arr[i] : (i == index) ? toAdd : arr[i-1];
        }
        return newArr;
    }

    public static int[] findDupes (int[] arr) {
        int[] dupes = new int[] {};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dupes = addToArray(dupes,dupes.length,arr[i]);
                }
            }
        }
        return dupes;
    }
}
