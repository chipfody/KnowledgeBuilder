package HackerRank;

public class CountingInversions {
    static long countInversions(int[] arr) {
        int count = 0;
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr [j + 1]) {
                    temp = arr[j];
                    arr [j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
        return count;
    }
}


//Needs to be updated - works on small data sets but times out on large scale data