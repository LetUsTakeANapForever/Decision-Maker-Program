import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ResultReport extends JFrame implements ActionListener {
    Container cp;
    JPanel p0, p1, p2, p3, p4;
    JButton support;
    JLabel heading, l1, l2, sum;

    public ResultReport(ResultCalcualtion display) {
        Initial();
        setComponent(display);
        Finally();
    }

    public void Initial() {
        cp = getContentPane();
        cp.setLayout(new GridLayout(5, 1));
        setPanels();
    }

    public void setComponent(ResultCalcualtion display) {
        heading = new JLabel("<html>Decision Maker :<br/>Result report</html>");
        heading.setFont(new Font("Arundina Sans", Font.BOLD, 36));
        heading.setForeground(new Color(221, 230, 237));
        // Choice1 total = 10
        // Choice2 total = 13
        sum = new JLabel(
                "<html>Choice total = " + display.getSum1() + "<br/>Choice2 total = " + display.getSum2() + "</html>");
        sum.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        sum.setForeground(new Color(221, 230, 237));
        l1 = new JLabel("<html>It seems like \"" + display.getSt()
                + "\" meets most expectations of yours.<br/>Therefore, we suggest you choose<br/>\"" + display.getSt()
                + "\" as your choice.</html>");
        l1.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        l1.setForeground(new Color(221, 230, 237));
        l2 = new JLabel("<html><br/>Thank you for using our program, we hope to see you again soon.</html>");
        l2.setFont(new Font("Arundina Sans", Font.BOLD, 25));
        l2.setForeground(new Color(221, 230, 237));
        support = new JButton("Support me");
        support.setPreferredSize(new Dimension(150, 50));
        support.setBackground(new Color(157, 178, 191));
        support.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        support.addActionListener(this);
        p0.add(heading);
        p1.add(sum);
        p2.add(l1);
        p3.add(l2);
        p4.add(support);
        cp.add(p0);
        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        cp.add(p4);
    }

    public void Finally() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == support) {
            popupBankAcc();
        }
    }

    public void popupBankAcc() {
        JDialog d = new JDialog();
        d.getContentPane().setLayout(new FlowLayout());
        d.getContentPane().add(new JLabel(
                "<html>Bank Account :<br/>123-456-789-0<br/>Just Kidding<br/><br/>Thank you,<br/>I appreciate your support.</html>"));
        d.setSize(200, 150);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }

    public void setPanels() {
        p0 = new JPanel();
        p0.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p4 = new JPanel();
        p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        p0.setBackground(new Color(82, 109, 130));
        p1.setBackground(new Color(82, 109, 130));
        p2.setBackground(new Color(82, 109, 130));
        p3.setBackground(new Color(82, 109, 130));
        p4.setBackground(new Color(82, 109, 130));
    }

}
