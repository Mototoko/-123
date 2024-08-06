abstract class GamblingGame {
    protected int stake; // 賭け金

    public GamblingGame(int stake) {
        this.stake = stake;
    }

    // ゲームのプレイ方法を定義する抽象メソッド
    public abstract boolean play();

    // 賭け金を取得するメソッド
    public int getStake() {
        return stake;
    }
}

