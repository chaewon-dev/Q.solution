package algorithm.problem.programmers.highscorekit;
import java.util.*;
import java.util.stream.Collectors;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        int s1Len = s1.length;
        int s2Len = s2.length;
        int s3Len = s3.length;
        int[] countArr = new int[3];
        for(int i=0; i<answers.length; i++){
            if(answers[i] == s1[i%s1Len]){
                countArr[0]++;
            }
            if(answers[i] == s2[i%s2Len]){
                countArr[1]++;
            }
            if(answers[i] == s3[i%s3Len]){
                countArr[2]++;
            }
        }
        ArrayList<Integer> as = new ArrayList<>();
        int max = countArr[0];
        for(int i=1; i<3; i++){
            if(countArr[i] > max){
                max = countArr[i];
            }
        }

        for(int i=0; i<3; i++){
            if(max == countArr[i]){
                as.add(i+1);
            }
        }


        int asLen = as.size();
        int[] answer = as.stream().mapToInt(Integer::intValue).toArray();

        Arrays.stream(answer).boxed().collect(Collectors.toList());

        return answer;
    }
}
