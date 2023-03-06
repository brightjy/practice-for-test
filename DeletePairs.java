import java.util.Stack;

//문제
// 짝지어 제거하기는, 알파벳 소문자로 이루어진 문자열을 가지고 시작합니다. 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다. 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다. 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지 반환하는 함수를 완성해 주세요. 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 됩니다.
// 예를 들어, 문자열 S = baabaa 라면
// b aa baa → bb aa → aa →
// 의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환합니다.

public class DeletePairs {
  public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i); // String s의 글자 하나씩 잘라(c)
            if (!stack.isEmpty() && stack.peek() == c) {	
            	//스택이 비어있지 않은 경우 하나를 꺼내어 비교해서 같으면
                stack.pop(); //스택에서 제거
            } else {
            	//다르면 스택에 넣는다.
                stack.push(c);
            }
        }
		//끝까지 반복한 뒤 스택이 비어있다 == 모두 짝지어 제거했다.
        answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }
}
