import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for (int i=0; i<array.length; i++){
            if (array[i]==value) return i;
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for (int i=0; i<list.size(); i++){
            if (list.get(i).equals(string)) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int high = array.length-1;
        int low = 0;
        int mid;

        while (low <= high){
            if (array[low]==value) return low;
            if (array[high]==value) return high;

            mid = (low + high) / 2;

            if (value > array[mid]) low = mid+1;
            else if (value < array[mid]) high = mid-1;
            else return mid;
        }

        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int high = array.length-1;
        int low = 0;
        int mid;
        while (low <= high){
            if (array[low].equals(string)) return low;
            if (array[high].equals(string)) return high;

            mid = (low + high) / 2;
            if (array[mid].compareTo(string) < 0) low = mid + 1;
            else if (array[mid].compareTo(string) > 0) high = mid - 1;
            else return mid;
        }

        return -1;

    }
}
