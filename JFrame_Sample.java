import javax.swing.JFrame; //JFrameクラスをインポート
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

class JFrame_Sample extends JFrame {
  public static void main(String[] args) {

    JFrame_Sample frame1 = new JFrame_Sample("FLAME1"); // JFrameクラスからオブジェクト(frame)を作成
    frame1.setVisible(true); // trueでフレームを表示する(デフォルトでは非表示)

  }

  // J Frameクラスを継承したサブクラスを作成
  JFrame_Sample(String title) {
    setTitle(title);
    setSize(600, 400);
    setLocationRelativeTo(null); // nullでセンター表示
    // setBounds(100, 100, 500, 500); // 位置とサイズを同時設定
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new FlowLayout());

    JPanel panel = new JPanel();

    JLabel label = new JLabel("Name");
    JTextField text = new JTextField(20);
    panel.add(label);
    panel.add(text);

    JPanel panel2 = new JPanel();

    JButton button1 = new JButton("Opne");
    JButton button2 = new JButton("Cancel");
    JButton button3 = new JButton("Help");

    panel2.add(button1);
    panel2.add(button2);
    panel2.add(button3);

    Container contentPane = getContentPane();
    contentPane.setBackground(Color.ORANGE);
    contentPane.add(panel, BorderLayout.NORTH);
    contentPane.add(panel2, BorderLayout.CENTER);
  }
}