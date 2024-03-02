package Super;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class gui {
  public void $message(String word) {
    JOptionPane.showMessageDialog(null, word);
  }

  public int $confirmDialogue(String title, String word, int choiceType) {
    int optionResult = JOptionPane.showConfirmDialog(null, word, title, choiceType);
    return optionResult;
  }

  public String $inputDialogue(String message) {
    String inputResult = JOptionPane.showInputDialog(message);
    return inputResult;
  }

  JFrame jFrame = new JFrame();
  JLabel jLabel = new JLabel();
  JEditorPane jEditorPane = new JEditorPane();

  public void $frameTitle(String title) {
    jFrame.setTitle(title);
  }

  public void $frameStart() {
    jFrame.setVisible(true);
  }

  public void $setSize(int height, int width) {
    jFrame.setSize(width, height);
  }

  public void $addText(String word, int height, int width, boolean visible) {
    JLabel component;
    component = new JLabel(word);
    component.setSize(height, width);
    component.setVisible(visible);
    jLabel.add(component);
    jFrame.add(jLabel);
  }

  public void $addEditorPane() {
    jFrame.add(jEditorPane);
  }

  public void $menu(String item, String title) {
    JMenuItem jMenuItem = new JMenuItem(item);
    JMenu jMenu = new JMenu(title);
    JMenuBar jMenuBar = new JMenuBar();
    jMenu.add(jMenuItem);
    jMenuBar.add(jMenu);
    jFrame.setJMenuBar(jMenuBar);
  }
}

