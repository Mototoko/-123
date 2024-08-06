public class GamblerMochihara {
    private int money; // 現在の所持金

    /**
     * コンストラクタ
     * @param initialMoney 初期所持金
     */
    public GamblerMochihara(int initialMoney) {
        this.money = initialMoney;
    }

    /**
     * ゲームをプレイするメソッド
     * @param game プレイするギャンブルゲーム
     */
    public void playGame(GamblingGame game) {
        // 所持金が賭け金未満の場合、プレイできない
        if (money < game.getStake()) {
            System.out.println("所持金が足りません。");
            return;
        }

        // ゲームをプレイして勝敗を決定
        boolean win = game.play();
        if (win) {
            money += game.getStake();
            System.out.println("賭けに"+"勝ちました！現在の所持金: " + money+"円");
        } else {
            money -= game.getStake();
            System.out.println("賭けに"+"負けました。現在の所持金: " + money+"円");
        }
    }

    /**
     * ギャンブル生活をシミュレートするメソッド
     */
    public void perform() {
        GamblingGame pachinkoGame = new PachinkoGame(1000); // パチンコゲームの賭け金100
        GamblingGame casinoGame = new CasinoGame(2000); // カジノゲームの賭け金200

        // 所持金が尽きるまでゲームをプレイ
        while (money > 0) {
            // 賭け金に応じてプレイするゲームを選択
            if (money < 200) {
                playGame(pachinkoGame);
            } else {
                if (Math.random() < 0.5) {
                    playGame(pachinkoGame);
                } else {
                    playGame(casinoGame);
                }
            }
        }

        // 所持金が尽きた時のメッセージ...
        System.out.println("人生終了...");
    }

    
   
}


