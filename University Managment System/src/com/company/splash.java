package com.company;
import java.awt.*;
import javax.swing.*;
public class splash {
    public static void main(String[] args){
        Frame f= new Frame();
        f.setVisible(true);
        int i;
        int x=1;
        for (i=2;i<=600;i++){
            f.setLocation((800-((i-x)/2) ),500-(i/2));
            f.setSize(i+3,i+x/2);

            try{
                Thread.sleep(3);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(){
        super("University Managment System");
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("com/company/icons/first.jpg"));
        Image i1=c1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
        ImageIcon i2= new ImageIcon(i1);

        JLabel m1= new JLabel(i2);
        add(m1);

        t1= new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            login f1=new login();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
