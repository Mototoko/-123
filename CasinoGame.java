import java.util.Random;

/**
 * カジノゲームクラス
 * GamblingGameを継承
 */
public class CasinoGame extends GamblingGame {
    private Random random;

    /**
     * コンストラクタ
     * @param stake 掛け金
     */
    public CasinoGame(int stake) {
        super(stake);
        random = new Random();
    }

    /**]
     * カジノゲームのプレイ方法を定義
     * @return ルーレットで0に当たれば勝利
     */
    public boolean play() {
        int outcome = random.nextInt(38); // 0から37までの乱数（アメリカンルーレット）
        return outcome == 0; // 0に当たれば勝ち
    }
}

    

