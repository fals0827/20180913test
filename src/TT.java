import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TT extends JFrame{
    private JButton jbt = new JButton("Exit");

    public TT () {
        init ();
    }
    private void init () {
        this.setBounds(600,500,400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        jbt.setBounds(100,100,120,100);
        this.add(jbt);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
