package algorithm.problem.programmers.highscorekit;
import java.util.*;
public class FindPrimeNumber {


    static int answer = 0;
    static HashSet<Integer> sSet = new HashSet<>();


    static void permutation(String remain, String str){
        int strLen = str.length();
        if(!remain.equals("")){
            sSet.add(Integer.parseInt(remain));
        }
        for(int i=0; i<strLen; i++){
            permutation(remain+str.charAt(i), str.substring(0,i)+str.substring(i+1,strLen));
        }
    }

    static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i=3; i<=Math.sqrt(n); i=i+2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public int solution(String numbers) {

        permutation("",numbers);
        for(int x : sSet){
            if(x==2){
                answer++;
            }else{
                boolean isP = isPrime(x);
                if(x%2 != 0 && isP){
                    answer++;
                }

            }


        }

        return answer;
    }

}
