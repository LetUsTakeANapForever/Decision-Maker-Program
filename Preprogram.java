import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Preprogram extends JFrame implements ActionListener {
    JLabel howto_l;
    JButton IUnderstand;
    JPanel p1, p2;
    Container cp;

    public Preprogram() {
        super("Decision Maker Program");
        Initial();
        setComponent();
        Finally();
    }

    public void Initial() {
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setPanels();
    }

    public void setComponent() {
        howto_l = new JLabel(
                "<html>How to use this program :<br/><br/>1.Input up to 4 aspects that<br/>you would like them to be considered<br/>and select importance of each aspect<br/>2.Rate each object for their qualities<br/>3.Press 'result' button to<br/>get to the result report page<br/><br/>P.S. You can only compare 2 choices at a time</html>");
        howto_l.setFont(new Font("Arundina Sans", Font.BOLD, 36));
        howto_l.setForeground(new Color(221, 230, 237));
        IUnderstand = new JButton("I understand");
        IUnderstand.setBackground(new Color(157, 178, 191));
        IUnderstand.setFont(new Font("Arundina Sans", Font.PLAIN, 30));
        IUnderstand.setPreferredSize(new Dimension(150, 50));
        IUnderstand.addActionListener(this);
        p1.add(howto_l);
        p2.add(IUnderstand, BorderLayout.EAST);
        cp.add(p1, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.SOUTH);

    }

    public void Finally() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == IUnderstand) {
            this.setVisible(false);
            new QualityImportance();
        }
    }

    public void setPanels() {
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(new Color(82, 109, 130));
        p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.setBackground(new Color(82, 109, 130));
    }
}
