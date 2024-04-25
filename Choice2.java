import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Choice2 extends JFrame implements ActionListener {
    Container cp;
    JPanel p0, p1, p2, p3, p4, p5;
    JButton result;
    JLabel heading;
    Choice1 obj;
    JLabel q1, q2, q3, q4;
    JComboBox<String> rateq1, rateq2, rateq3, rateq4;
    int v1q1, v1q2, v1q3, v1q4, v2q1, v2q2, v2q3, v2q4, i1, i2, i3, i4;
    ResultCalcualtion printresult = new ResultCalcualtion();

    public Choice2(Choice1 v1) {
        Initial();
        setComponent(v1);
        storeValue(v1);
        Finally();
    }

    public void Initial() {
        cp = getContentPane();
        cp.setLayout(new GridLayout(6, 1));
        setPanels();
    }

    public void setComponent(Choice1 v1) {
        heading = new JLabel("<html>Decision Maker :<br/>Please rate \"Choice2\" regarding each quality<html/>");
        heading.setFont(new Font("Arundina Sans", Font.BOLD, 33));
        heading.setForeground(new Color(39, 55, 77));
        q1 = new JLabel(v1.q1toObj2 + "   :    ");
        q1.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        q2 = new JLabel(v1.q2toObj2 + "   :    ");
        q2.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        q3 = new JLabel(v1.q3toObj2 + "   :    ");
        q3.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        q4 = new JLabel(v1.q4toObj2 + "   :    ");
        q4.setFont(new Font("Arundina Sans", Font.BOLD, 30));
        rateq1 = new JComboBox<>();
        rateq1.addItem("Rate");
        rateq2 = new JComboBox<>();
        rateq2.addItem("Rate");
        rateq3 = new JComboBox<>();
        rateq3.addItem("Rate");
        rateq4 = new JComboBox<>();
        rateq4.addItem("Rate");
        for (int i = 1; i < 6; i++) {
            rateq1.addItem(i + "");
            rateq2.addItem(i + "");
            rateq3.addItem(i + "");
            rateq4.addItem(i + "");
        }
        rateq1.addActionListener(this);
        rateq2.addActionListener(this);
        rateq3.addActionListener(this);
        rateq4.addActionListener(this);
        result = new JButton("Result");
        result.addActionListener(this);
        result.setBackground(new Color(82, 109, 130));
        result.setPreferredSize(new Dimension(100, 40));
        result.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        p0.add(heading);
        p1.add(q1);
        p1.add(rateq1);
        p2.add(q2);
        p2.add(rateq2);
        p3.add(q3);
        p3.add(rateq3);
        p4.add(q4);
        p4.add(rateq4);
        p5.add(result);
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
        if (e.getSource() == result) {
            printresult.resultOfSum(this);
            this.setVisible(false);
            new ResultReport(printresult);
        }
        if (e.getSource() == rateq1) {
            setValueofRating1();
        }
        if (e.getSource() == rateq2) {
            setValueofRating2();
        }
        if (e.getSource() == rateq3) {
            setValueofRating3();
        }
        if (e.getSource() == rateq4) {
            setValueofRating4();
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

    public void setValueofRating1() {
        if (rateq1.getSelectedItem().equals("1")) {
            v2q1 = 1;
        } else if (rateq1.getSelectedItem().equals("2")) {
            v2q1 = 2;
        } else if (rateq1.getSelectedItem().equals("3")) {
            v2q1 = 3;
        } else if (rateq1.getSelectedItem().equals("4")) {
            v2q1 = 4;
        } else if (rateq1.getSelectedItem().equals("5")) {
            v2q1 = 5;
        } else if (rateq1.getSelectedItem().equals("Rate")) {
            v2q1 = 0;
        }
    }

    public void setValueofRating2() {
        if (rateq2.getSelectedItem().equals("1")) {
            v2q2 = 1;
        } else if (rateq2.getSelectedItem().equals("2")) {
            v2q2 = 2;
        } else if (rateq2.getSelectedItem().equals("3")) {
            v2q2 = 3;
        } else if (rateq2.getSelectedItem().equals("4")) {
            v2q2 = 4;
        } else if (rateq2.getSelectedItem().equals("5")) {
            v2q2 = 5;
        } else if (rateq2.getSelectedItem().equals("Rate")) {
            v2q2 = 0;
        }
    }

    public void setValueofRating3() {
        if (rateq3.getSelectedItem().equals("1")) {
            v2q3 = 1;
        } else if (rateq3.getSelectedItem().equals("2")) {
            v2q3 = 2;
        } else if (rateq3.getSelectedItem().equals("3")) {
            v2q3 = 3;
        } else if (rateq3.getSelectedItem().equals("4")) {
            v2q3 = 4;
        } else if (rateq3.getSelectedItem().equals("5")) {
            v2q3 = 5;
        } else if (rateq3.getSelectedItem().equals("Rate")) {
            v2q3 = 0;
        }
    }

    public void setValueofRating4() {
        if (rateq4.getSelectedItem().equals("1")) {
            v2q4 = 1;
        } else if (rateq4.getSelectedItem().equals("2")) {
            v2q4 = 2;
        } else if (rateq4.getSelectedItem().equals("3")) {
            v2q4 = 3;
        } else if (rateq4.getSelectedItem().equals("4")) {
            v2q4 = 4;
        } else if (rateq4.getSelectedItem().equals("5")) {
            v2q4 = 5;
        } else if (rateq4.getSelectedItem().equals("Rate")) {
            v2q4 = 0;
        }
    }

    public void storeValue(Choice1 v1) {
        i1 = v1.i1;
        i2 = v1.i2;
        i3 = v1.i3;
        i4 = v1.i4;
        this.v1q1 = v1.v1q1;
        this.v1q2 = v1.v1q2;
        this.v1q3 = v1.v1q3;
        this.v1q4 = v1.v1q4;
    }

    public void test() {
        System.out.println(v1q1);
    }
}