import java.util.Arrays;

public class Week12Lab implements Week12LabInterface{
    @Override
    public int twoWayLinearSearch(int[] array, int target) {
        for (int i = 0; i < (array.length / 2); i++){
            if (array[i] == target){
                return i;
            } else if (array[array.length - i - 1] == target) {
                return array.length - i;
            }
        }
        if (array[array.length / 2] == target){
            return array.length / 2;
        }

        return -1;
    }

    @Override
    public int[] twoWayBubbleSort(int[] array) {
        //setting up new array
        int[] output = new int[array.length];
        System.arraycopy(array, 0, output, 0, array.length);

        int temp;
        boolean swap = true;

        while(swap) { //keeps passing through array until no changes are made
            int i=0;
            int j=array.length-1;
            swap = false;
            while (i < output.length - 1 && j >= 0) { //passes through array
                if (output[i] > output[i + 1]) {
                    temp = output[i];
                    output[i] = output[i + 1];
                    output[i + 1] = temp;
                    swap = true;
                }
                i++;
                if (output[j - 1] > output[j]) {
                    temp = output[j];
                    output[j] = output[j - 1];
                    output[j - 1] = temp;
                    swap = true;
                }
                j--;
            }
        }
        return output;
    }

    @Override
    public void sort(int[] array) {
        int var = 0;
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (array[i] > array[j]){
                    var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
        }
System.out.println(Arrays.toString(array));
    }
}
