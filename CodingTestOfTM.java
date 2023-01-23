public class CodingTestOfTM {
  public int solution(int[] numbers) {
    //문제
    // 1. 숫자 배열이 주어짐 (예: {3, 5, 7, 9})
    // 2. 배열의 원소를 주어진 배열의 길이만큼(?)의 이진수화 (예: 3 -> 0011)
    // 3. 뒤에서부터 배열의 원소의 위치(?)의 비트 뽑기 (예: 3이면, 1)
    // 4. 뽑은 숫자들을 다시 이진수화(?) (예: {3, 5, 7, 9} -> 1011)
    // 5. answer = 이진수를 십진수로 (예: 1011 -> 11)

    //나의 풀이
    int answer = -1;
    int numbersLength = numbers.length;
    String answerBinary = "";
    String zero = "0";

    for (int i=0; i<numbersLength; i++){
      //배열의 원소를 주어진 배열의 길이만큼(?)의 이진수화
      String binary = Integer.toBinaryString(numbers[i]);
      int binaryLength = binary.length();    
      zero = ( numbersLength - binaryLength == 0) ? zero : zero.repeat(numbersLength - binaryLength);
      StringBuilder stringBuilder = new StringBuilder(zero);
      stringBuilder.append(binary);
      //뒤에서부터 배열의 원소의 위치(?)의 비트 뽑기
      StringBuffer stringBuffer = new StringBuffer(binary);
      binary = stringBuffer.reverse().toString().substring(i, i+1);
      //뽑은 숫자들을 다시 이진수화
      StringBuilder stringBuilder2 = new StringBuilder(binary);
      stringBuilder2.append(answerBinary);
    }
    //이진수 -> 십진수
    answer = Integer.parseInt(answerBinary, 2);

    return answer;

    //새롭게 알게된 것
    // - 숫자 -> 이진수String : Integer.toBianryString(숫자);
    // - string을 특정 개수만큼 곱하기(?) : 문자.repeat(곱할숫자); (예: "k".repeat(2); -> "kk")
    // - 문자열 뒤집기 : 
    //   StringBuffer stringBuffer = new StringBuffer("문자");
    //   stringBuffer.reverse().toString();
    // - 이진수 -> 십진수 : Integer.parseInt(문자열이진수, 2);
  }
}
