package uDemyProjects;

public class DecimalComparator {



        public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
            //num1 = num1 * 1000;
            num1 = (int) (num1 * 1000) / 1000.0;

            num2 = (int) (num2 * 1000) / 1000.0;

            return num1 == num2;
        }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.123, -3.123));
    }

}
