public class MakeOddArray {
  public int[] solution(int n) {
    int answerLength = (n%2==0) ? n/2 : n/2+1;
    int[] answer = new int[answerLength];
    int odd = 1;
    
    for (int i=0; i<answerLength; i++) {
        answer[i] = odd;
        odd = odd+2;
    }
    
    return answer;
  }
}
