package zad6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton b10,b11,b12,b13,b14,b15;
    JButton[] b =new JButton[10];
    int i,r,n1,n2;
    JTextField res;
    char op;
    public Main(){
        super("zad 6");
        setLayout(new BorderLayout());
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(4,4));
        for(int i=0;i<=9;i++)
        {
            b[i]=new JButton(i+"");
            p.add(b[i]);
            b[i].addActionListener(this);
        }
        b10=new JButton("+");
        p.add(b10);
        b10.addActionListener(this);

        b11=new JButton("-");
        p.add(b11);
        b11.addActionListener(this);

        b12=new JButton("*");
        p.add(b12);
        b12.addActionListener(this);

        b13=new JButton("/");
        p.add(b13);
        b13.addActionListener(this);

        b14=new JButton("=");
        p.add(b14);
        b14.addActionListener(this);

        b15=new JButton("C");
        p.add(b15);
        b15.addActionListener(this);

        res=new JTextField(10);
        add(p,BorderLayout.CENTER);
        add(res,BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200,200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pb=(JButton)e.getSource();
        if(pb==b15)
        {
            r=n1=n2=0;
            res.setText("");
        }
        else
        if(pb==b14)
        {
            n2=Integer.parseInt(res.getText());
            eval();
            res.setText(""+r);
        }

        else
        {
            boolean opf=false;
            if(pb==b10)
            { op='+';
                opf=true;
            }
            if(pb==b11)
            { op='-';opf=true;}
            if(pb==b12)
            { op='*';opf=true;}
            if(pb==b13)
            { op='/';opf=true;}

            if(!opf)
            {
                for(i=0;i<10;i++)
                {
                    if(pb==b[i])
                    {
                        String t=res.getText();
                        t+=i;
                        res.setText(t);
                    }
                }
            }
            else
            {
                n1=Integer.parseInt(res.getText());
                res.setText("");
            }
        }
    }
    void eval()
    {
        switch (op) {
            case '+' -> r = n1 + n2;
            case '-' -> r = n1 - n2;
            case '*' -> r = n1 * n2;
            case '/' -> r = n1 / n2;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
