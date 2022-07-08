import javax.swing.JFrame; //JFrameクラスをインポート

class JFrame_Sample {
  public static void main(String[] args) {

    JFrame frame1 = new JFrame(); // JFrameクラスからオブジェクト(frame)を作成
    frame1.setTitle("Flame1"); // frameのタイトルを設定
    frame1.setSize(500, 500); // サイズを指定
    frame1.setLocation(100, 100); // 表示位置の設定
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ボタンクリックでflameを終了
    frame1.setVisible(true); // trueでフレームを表示する(デフォルトでは非表示)

    JFrame frame2 = new JFrame("Flame2"); // オブジェクト作成時にタイトル設定
    frame2.setSize(600, 400);
    frame2.setLocationRelativeTo(null); // nullでセンター表示
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setVisible(true); 

  }
}