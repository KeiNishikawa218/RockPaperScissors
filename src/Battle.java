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

        //ジャンケンの乱数用の変数
        int num = 0;

        //ジャンケンの入力用の変数
        int hand = 0;

        for (int i=1; i <= count; i++){
            System.out.println("手を入力してください（１、２、３）");
            //ユーザからの入力
            System.out.print(">");
            hand = scan.nextInt();

            //ジャンケン乱数
            num = rand.nextInt(3)+1;

            if((hand-num+2)%3 == 1){
                System.out.println("あなたの勝ちです");
            } else if((hand-num+2)%3 == 2) {
                System.out.println("あいこです");
            } else {
                System.out.println("あなたの負けです");
            }
        }
    }
}