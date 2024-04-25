import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class QualityImportance extends JFrame implements ActionListener {
    Container cp;
    JLabel heading;
    JTextField qi1, qi2, qi3, qi4;
    JComboBox<String> imp1, imp2, imp3, imp4;
    JPanel p0, p1, p2, p3, p4, p5;
    File f;
    FileReader fr;
    BufferedReader br;
    JButton next;
    int q1, q2, q3, q4;
    Map<String, Integer> importanceMap;
    String qtf1, qtf2, qtf3, qtf4;

    public QualityImportance() {
        setImportanceLevels();
        Initial();
        setComponent();
        Finally();
        setTextField();
    }

    public void Initial() {
        cp = getContentPane();
        cp.setLayout(new GridLayout(6, 1));
        setPanels();
    }

    public void setComponent() {
        heading = new JLabel("<html>Decision Maker :<br/>Please input qualities</html>");
        heading.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        heading.setForeground(new Color(39, 55, 77));
        try {
            f = new File("ImportanceLevels.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            imp1 = new JComboBox<>();
            imp2 = new JComboBox<>();
            imp3 = new JComboBox<>();
            imp4 = new JComboBox<>();
            String s;
            while ((s = br.readLine()) != null) {
                imp1.addItem(s);
                imp2.addItem(s);
                imp3.addItem(s);
                imp4.addItem(s);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        qi1 = new JTextField(20);
        qi2 = new JTextField(20);
        qi3 = new JTextField(20);
        qi4 = new JTextField(20);
        next = new JButton("Next");
        next.setBackground(new Color(82, 109, 130));
        next.setPreferredSize(new Dimension(80, 40));
        next.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        qi1.addActionListener(this);
        qi2.addActionListener(this);
        qi3.addActionListener(this);
        qi4.addActionListener(this);
        imp1.addActionListener(this);
        imp2.addActionListener(this);
        imp3.addActionListener(this);
        imp4.addActionListener(this);
        next.addActionListener(this);
        p0.add(heading);
        p1.add(qi1);
        p1.add(imp1);
        p2.add(qi2);
        p2.add(imp2);
        p3.add(qi3);
        p3.add(imp3);
        p4.add(qi4);
        p4.add(imp4);
        p5.add(next);
        cp.add(p0);
        cp.add(p1);
        cp.add(p2);
        cp.add(p3);
        cp.add(p4);
        cp.add(p5);
    }

    public void Finally() {
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == imp1) {
            setq1();
        }
        if (e.getSource() == imp2) {
            setq2();
        }
        if (e.getSource() == imp3) {
            setq3();
        }
        if (e.getSource() == imp4) {
            setq4();
        }
        if (e.getSource() == next) {
            setTextField();
            this.setVisible(false);
            new Choice1(this);
        }
        if (e.getSource() == qi1 || e.getSource() == qi2 || e.getSource() == qi3 || e.getSource() == qi4) {
            heading.setForeground(Color.RED);
            heading.setText("<html>Decision Maker :<br/>Please press Next button</html>");
        }
    }

    public void setPanels() {
        p0 = new JPanel();
        p0.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p0.setBackground(new Color(157, 178, 191));
        p1.setBackground(new Color(157, 178, 191));
        p2.setBackground(new Color(157, 178, 191));
        p3.setBackground(new Color(157, 178, 191));
        p4.setBackground(new Color(157, 178, 191));
        p5.setBackground(new Color(157, 178, 191));
    }

    public void setImportanceLevels() {
        importanceMap = new HashMap<>();
        importanceMap.put("importance", 0);
        importanceMap.put("Unimportant", 1);
        importanceMap.put("Less important", 2);
        importanceMap.put("Moderately important", 3);
        importanceMap.put("Very important", 4);
        importanceMap.put("Extremely important", 5);
    }

    public void setq1() {
        String selectedItem = String.valueOf(imp1.getSelectedItem());
        q1 = importanceMap.get(selectedItem);
    }

    public void setq2() {
        String selectedItem = String.valueOf(imp2.getSelectedItem());
        q2 = importanceMap.get(selectedItem);
    }

    public void setq3() {
        String selectedItem = String.valueOf(imp3.getSelectedItem());
        q3 = importanceMap.get(selectedItem);
    }

    public void setq4() {
        String selectedItem = String.valueOf(imp4.getSelectedItem());
        q4 = importanceMap.get(selectedItem);
    }

    public void setTextField() {
        qtf1 = qi1.getText();
        qtf2 = qi2.getText();
        qtf3 = qi3.getText();
        qtf4 = qi4.getText();
    }
}
