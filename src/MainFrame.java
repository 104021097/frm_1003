import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private Container cp;
    private JButton jbtn1= new JButton("+");
    private JButton jbtn2= new JButton("-");
    private JButton jbtn3= new JButton("AC");
    private JButton jbtn4= new JButton("exit");
    private JLabel jl= new JLabel("0");
    private int count=0;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(5,1,2,2));
        cp.add(jbtn1);
        cp.add(jbtn2);
        jl.setHorizontalAlignment(JLabel.CENTER);
        cp.add(jbtn3);
        cp.add(jbtn4);
        cp.add(jl);


        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(Integer.toString(++count));
            }
        });

        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(Integer.toString(--count));
            }
        });

        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl.setText(Integer.toString(0));
            }
        });

        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
