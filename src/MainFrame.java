import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{

    private Button bt = new Button("EXIT");
    private Button bt1 = new Button("L");
    private Button bt2 = new Button("R");
    private int x = 50, y = 50;
    private Label lab = new Label("0");

    public MainFrame (){
        init();
    }

    private void init () {
        this.setBounds(50,100,600,400);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        bt.setBounds(100,100,150,50);
        this.add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        bt1.setBounds(250,180,100,60);
        this.add(bt1);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 10;
                lab.setLocation(x,y);
//                MainFrame.this.setTitle(Integer.toString(x));
//                lab.setText(Integer.toString(x));
            }
        });

        bt2.setBounds(400,180,100,60);
        this.add(bt2);

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 10;
                lab.setLocation(x,y);
//                MainFrame.this.setTitle(Integer.toString(x));
//                lab.setText(Integer.toString(x));
            }
        });

        lab.setBounds(50,50,60,30);
        this.add(lab);
    }
}
