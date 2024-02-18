package Superfunction;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class gui {
        public void $Message(String word) {
          JOptionPane.showMessageDialog(null, word);
        }
  
        public int $ConfirmDialogue(String Title, String Word, int ChoiceType) {
          int OptionResult = JOptionPane.showConfirmDialog(null, Word, Title, ChoiceType);
          return OptionResult;
        }
  
        public String $InputDialogue(String Message) {
          String InputResult = JOptionPane.showInputDialog(Message);
          return InputResult;
        }

        JFrame jf = new JFrame();
        JLabel jl = new JLabel();
        JEditorPane jep = new JEditorPane();
        public void $SFrameTitle(String title) {
            jf.setTitle(title);
        }

        public void $SFrameStart() {
            jf.setVisible(true);
        }

        public void $SetSize(int height, int width) {
            jf.setSize(width, height);
        }

        public void $AddText(String word, int height, int width, boolean visible) {
            JLabel component;
            component = new JLabel(word);
            component.setSize(height, width);
            component.setVisible(visible);
            jl.add(component);
            jf.add(jl);
        }

        public void $AddEditorPane() {
            jf.add(jep);
        }

        public void $Menu(String item, String title) {
          JMenuItem jmt = new JMenuItem(item);
          JMenu j = new JMenu(title);
          JMenuBar jm = new JMenuBar();
          j.add(jmt);
          jm.add(j);
          jf.setJMenuBar(jm);
        }
    }