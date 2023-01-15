public class FindGCDandLCM {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int gcd = getGCD(denom1, denom2);   //분모의 최대공약수
        
        int finalDenom = (denom1*denom2)/gcd; //분모(=최소공배수)
        
        int finalNumer = (finalDenom/denom1)*numer1 + (finalDenom/denom2)*numer2;
        
        int finalGCD = getGCD(finalNumer, finalDenom);
        
        answer[0] = finalNumer/finalGCD;
        answer[1] = finalDenom/finalGCD;
               
        return answer;
    }
    
    //최대공약수
    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        
        return getGCD(num2, num1%num2);
    } 
}
