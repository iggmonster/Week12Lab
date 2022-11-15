import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Week12Lab week12Lab = new Week12Lab();
        int[] array = {1, 5, 12, 11, 14, 15, 19};
        int target = 10;
        System.out.println(week12Lab.twoWayLinearSearch(array, target));

        int[] arraysort = {12, 3, 19, 2, 4, 5, 1};
        week12Lab.sort(arraysort);

        System.out.println(Arrays.toString(week12Lab.twoWayBubbleSort(arraysort)));
    }

}
