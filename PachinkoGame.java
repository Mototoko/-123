import java.util.Random;

/**
 * パチンコゲームクラス
 * GamblingGameを継承
 */
class PachinkoGame extends GamblingGame {
    private Random random;

    /**
     * コンストラクタ
     * @param stake 賭け金
     */
    public PachinkoGame(int stake) {
        super(stake);
        random = new Random();
    }

    /**
     * パチンコゲームのプレイ方法を定義
     * @return 30%の確率で勝利
     */
    @Override
    public boolean play() {
        int outcome = random.nextInt(100); // 0から99までの乱数
        return outcome < 30; // 30%の確率で勝ち
    }
}
