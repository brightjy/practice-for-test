import java.util.Arrays;

public class ShuffleTheArray {
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

  public int[] shuffle(int[] nums, int n) {
    int[] arrayX = Arrays.copyOfRange(nums, 0, n);
    int[] arrayY = Arrays.copyOfRange(nums, n, nums.length);
    int[] arrayNew = new int[nums.length];

    for (int i=0; i<arrayX.length; i++) {
        arrayNew[i*2] = arrayX[i];
        arrayNew[i*2+1] = arrayY[i];
    }
    return arrayNew;
  }
}
