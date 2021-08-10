package test0810;


import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 :");
        int n = sc.nextInt();
        int [] cards = new int[n];

        System.out.println("합 : ");
        int m = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            System.out.println("숫자");
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i < n ; i++){
            for(int j = i+1; j < n ; j++){
                for(int k = j+1; k < n; k++){
                    int sum =cards[i] + cards[j] + cards[k];
                    if(sum <= m)
                }
            }
        }
    }

    }

