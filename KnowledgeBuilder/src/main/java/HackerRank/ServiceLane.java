package HackerRank;

public class ServiceLane {

    public static int[] serviceLane(int[] width, int[][] cases) {
        int[] result = new int[cases.length];
        for(int i = 0; i < cases.length; i++) {
            int enter = cases[i][0];
            int exit = cases[i][1];
            int min = 3;
            for (int j = enter; j <= exit; j++) {
                if (width[j] < min)
                    min = width[j];
                result[i] = min;
            }
        }
        return result;
    }
}
