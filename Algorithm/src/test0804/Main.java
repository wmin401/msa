package test0804;

import java.io.*;
import java.util.*;



public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static class Elem implements Comparable<Elem> {

        public String name;
        public int korean, english, math;

        @Override
        public int compareTo(Elem other) {
            // 국어 내림차순
            if (korean != other.korean) return other.korean - korean;
            // 영어 점수 오름차순
            if (english != other.english) return english - other.english;
            // 수학 점수 내림차순
            if (math != other.math) return other.math - math;
            return name.compareTo(other.name);

            // TODO
            // 국어, 영어, 수학, 이름 값을 가지고 정렬 기준 정의 하기
        }
    }

    static int N;
    static Elem[] a;

    static void input() {
        System.out.println("갯 수 입력 :");
        N = scan.nextInt();
        a = new Elem[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Elem();
            System.out.println("이름 :");
            a[i].name = scan.next();
            System.out.println("한국어 :");
            a[i].korean = scan.nextInt();
            System.out.println("영어 :");
            a[i].english = scan.nextInt();
            System.out.println("수학 :");
            a[i].math = scan.nextInt();
        }
    }

    static void pro() {
        // TODO
        // 기준을 통해 정렬하기
        Arrays.sort(a);

        // 정답 출력하기
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}