package algorithm.problem.baekjoon;

import java.io.*;

public class B02438 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++){
            sb.append('*');

            System.out.println(sb);
        }
    }
}
