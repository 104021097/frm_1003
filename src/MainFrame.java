import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private Container cp;
    private JButton jbtn1= new JButton("範例");
    private JButton jbtn2= new JButton("加密");
    private JButton jbtn3= new JButton("清除");
    private JButton jbtn4= new JButton("離開");
    private JLabel jl= new JLabel("KEY");
    private JPanel jp=new JPanel(new GridLayout(6,1,3,3));
    private JTextArea jtL=new JTextArea();
    private JTextArea jtR=new JTextArea();
    private JScrollPane jsL=new JScrollPane(jtL);
    private JScrollPane jsR=new JScrollPane(jtR);
    private JTextField jtF=new JTextField();

    private int count=0;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100,100,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));

        jp.add(jbtn1);
        jp.add(jbtn2);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl);
        jp.add(jtF);
        jp.add(jbtn3);
        jp.add(jbtn4);


        jtL.setLineWrap(true);
        jtL.setPreferredSize(new Dimension(200,400));
        jtR.setPreferredSize(new Dimension(200,400));
        cp.add(jp,BorderLayout.CENTER);
        cp.add(jsR,BorderLayout.EAST);
        cp.add(jsL,BorderLayout.WEST);


        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtL.setText("The Department of Computer Science and Information Engineering," +
                        " formerly the Department of Information Technology," +
                        " was established in 2001." +
                        " The department first offered a Master program only." +
                        " In 2002, the undergraduate program was established." +
                        " The Doctoral program was established in 2006." +
                        " Each year the department admits about 80 undergraduates," +
                        " 15 graduate students and 3 Ph.D. students.");
            }
        });

        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[]=jtL.getText().toCharArray();
                int len=data.length, key=Integer.parseInt(jtF.getText());
                for (int i=0;i<=len;i++){
                    data[i] += key;
                }
                jtR.setText(new String(data));
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
