import java.util.Arrays;

public class FindMedian {

  public int solution(int[] array) {
      int answer = 0;
      
      Arrays.sort(array); //정렬 후
      int index = (array.length)/2; //사이즈를 2로 나눈 위치값
      answer = array[index];
      
      return answer;
  }

}
