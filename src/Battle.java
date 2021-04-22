import java.util.Scanner;
import java.util.Random;

public class Battle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("1　→　グー、2　→　チョキ、3　→　パーに対応しています");
        System.out.println("ジャンケンゲームです。ゲームを行う回数を入力してください");

        //ユーザからの入力
        System.out.print(">");
        int count = scan.nextInt();

        System.out.println(count+"回対戦します");

        //ジャンケン用の乱数
        int num = 0;

        //ジャンケンの入力
        int hand = 0;

        for (int i=1; i <= count; i++){
            System.out.println("手を入力してください（１、２、３）");
            //ユーザからの入力
            System.out.print(">");
            hand = scan.nextInt();

            num = rand.nextInt(3)+1;
            if(hand == 1 && num == 1){
                System.out.println("グーでチョキに勝ちました");
            }

            //続きはまた4月22日
        }
    }
}

