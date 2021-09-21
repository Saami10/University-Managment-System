package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {
    Project(){
        super("University Managment System");
        setSize(1920,1030);

        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/third.jpg"));
        Image i1=ic.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i1);
        JLabel l1=new JLabel(i3);
        add(l1);

        JMenuBar mb= new JMenuBar();

        JMenu m1= new JMenu("Master");
        JMenuItem m11= new JMenuItem("New Faculty");
        JMenuItem m12=new JMenuItem("New Student Admission");

        m1.setForeground(Color.BLACK);

        m11.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon1.png"));
        Image image1= icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m11.setIcon(new ImageIcon(image1));
        m11.setMnemonic('A');
        m11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m11.setBackground(Color.WHITE);

        m12.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon2.png"));
        Image image2= icon2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m12.setIcon(new ImageIcon(image2));
        m12.setMnemonic('B');
        m12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        m12.setBackground(Color.WHITE);

        m1.add(m11);
        m1.add(m12);
        m11.addActionListener(this);
        m12.addActionListener(this);

        JMenu m2= new JMenu("Details");
        JMenuItem m21= new JMenuItem("Student Deatils");
        JMenuItem m22=new JMenuItem("teacher Details");

        m2.setForeground(Color.darkGray);

        m21.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon3.png"));
        Image image5= icon5.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m21.setIcon(new ImageIcon(image5));
        m21.setMnemonic('C');
        m21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m21.setBackground(Color.WHITE);

        m22.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image image6= icon6.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m22.setIcon(new ImageIcon(image6));
        m22.setMnemonic('D');
        m22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m22.setBackground(Color.WHITE);

        m2.add(m21);
        m2.add(m22);
        m21.addActionListener(this);
        m22.addActionListener(this);

        JMenu m3= new JMenu("Attendance");
        JMenuItem m31= new JMenuItem("Student Attendance");
        JMenuItem m32=new JMenuItem("Teacher Attendance");

        m3.setForeground(Color.BLACK);

        m31.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image image7= icon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m31.setIcon(new ImageIcon(image7));
        m31.setMnemonic('M');
        m31.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m31.setBackground(Color.WHITE);

        m32.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image image8= icon8.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m32.setIcon(new ImageIcon(image8));
        m32.setMnemonic('N');
        m32.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m32.setBackground(Color.WHITE);

        m3.add(m31);
        m3.add(m32);
        m31.addActionListener(this);
        m32.addActionListener(this);

        JMenu m4= new JMenu("Attendance Details");
        JMenuItem m41= new JMenuItem("Student Attendance Deatils");
        JMenuItem m42=new JMenuItem("Teacher Attendance Details");

        m4.setForeground(Color.darkGray);

        m41.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icona=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon15.png"));
        Image imagea= icona.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m41.setIcon(new ImageIcon(imagea));
        m41.setMnemonic('O');
        m41.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m41.setBackground(Color.WHITE);
        m4.add(m41);

        m42.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconb=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image imageb= iconb.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m42.setIcon(new ImageIcon(imageb));
        m42.setMnemonic('P');
        m42.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m42.setBackground(Color.WHITE);
        m4.add(m42);


        m41.addActionListener(this);
        m42.addActionListener(this);

        JMenu m5= new JMenu("Examination");
        JMenuItem m51= new JMenuItem("Examination Deatils");
        JMenuItem m52=new JMenuItem("Enter Marks");

        m5.setForeground(Color.BLACK);

        m51.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconc=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon16.png"));
        Image imagec= iconc.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m51.setIcon(new ImageIcon(imagec));
        m51.setMnemonic('Q');
        m51.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m51.setBackground(Color.WHITE);
        m5.add(m51);

        m52.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icond=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image imaged= icond.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m52.setIcon(new ImageIcon(imaged));
        m52.setMnemonic('R');
        m52.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m52.setBackground(Color.WHITE);
        m5.add(m52);


        m51.addActionListener(this);
        m52.addActionListener(this);

        JMenu m6= new JMenu("Update Details");
        JMenuItem m61= new JMenuItem("Update Student");
        JMenuItem m62=new JMenuItem("Update Teacher");

        m6.setForeground(Color.darkGray);

        m61.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icone=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon5.png"));
        Image imagee= icone.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m61.setIcon(new ImageIcon(imagee));
        m61.setMnemonic('E');
        m61.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m61.setBackground(Color.WHITE);
        m6.add(m61);

        m62.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconf=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon6.png"));
        Image imagef= iconf.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m62.setIcon(new ImageIcon(imagef));
        m62.setMnemonic('P');
        m62.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m62.setBackground(Color.WHITE);
        m6.add(m62);


        m61.addActionListener(this);
        m62.addActionListener(this);

        JMenu m7= new JMenu("Fee Details");
        JMenuItem m71= new JMenuItem("Fee Structure");
        JMenuItem m72=new JMenuItem("Student Fee Form");

        m7.setForeground(Color.BLACK);

        m71.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icong=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon7.png"));
        Image imageg= icong.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m71.setIcon(new ImageIcon(imageg));
        m71.setMnemonic('G');
        m71.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        m71.setBackground(Color.WHITE);
        m7.add(m71);

        m72.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconh=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon8.png"));
        Image imageh= iconh.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        m72.setIcon(new ImageIcon(imageh));
        m72.setMnemonic('P');
        m72.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m72.setBackground(Color.WHITE);
        m7.add(m72);


        m71.addActionListener(this);
        m72.addActionListener(this);

        JMenu utility= new JMenu("Utility");
        JMenuItem ut1= new JMenuItem("Notepad");
        JMenuItem ut2=new JMenuItem("Calculator");
        JMenuItem ut3= new JMenuItem("Web Browser");
        utility.setForeground(Color.darkGray);

        ut1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon18=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image image18=icon18.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image18));
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        utility.add(ut1);

        ut2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon19=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon10.png"));
        Image image19=icon19.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image19));
        ut2.setMnemonic('J');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        utility.add(ut2);

        ut3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon20=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon11.png"));
        Image image20=icon20.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image20));
        ut3.setMnemonic('K');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        utility.add(ut3);

        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        JMenu about= new JMenu("About");
        JMenuItem aboutus= new JMenuItem("About Us");
        about.setForeground(Color.BLACK);

        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon9.png"));
        Image image21=icon21.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image21));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);

        aboutus.addActionListener(this);

        JMenu exit= new JMenu("Exit");
        JMenuItem ex= new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon22=new ImageIcon(ClassLoader.getSystemResource("com/company/icons/icon12.png"));
        Image image22=icon22.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image22));
        ex.setMnemonic('L');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        exit.add(ex);

        ex.addActionListener(this);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        mb.add(m6);
        mb.add(m7);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);

    }
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if (msg.equals("New Faculty")){
            new AddTeacher().f.setVisible(true);
        }
        else if (msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
        }
        else if (msg.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        }
        else if (msg.equals("Teacher Details")){
                new TeacherDetails().setVisible(true);
        }
        else if (msg.equals("Student Attendance")) {
            new StudentAttendance().setVisible(true);
        }
        else if (msg.equals("Teacher Attendance")) {
            new TeacherAttendance().setVisible(true);
        }
        else if (msg.equals("Student Attendance Details")) {
            new StudentAttendanceDetail().setVisible(true);
        }
        else if (msg.equals("Teacher Attendance Details")) {
            new TeacherAttendanceDetail().setVisible(true);
        }
        else if (msg.equals("Examination Details")) {
            new ExaminationDetails().setVisible(true);
        }
        else if (msg.equals("Enter Marks")) {
            new EnterMarks().setVisible(true);
        }
        else if (msg.equals("Update Student")) {
            new UpdateStudent().f.setVisible(true);
        }
        else if (msg.equals("Update Teacher")) {
            new UpdateTeacher().f.setVisible(true);
        }
        else if (msg.equals("Fee Structure")) {
            new FeeStructure().setVisible(true);
        }
        else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm().setVisible(true);
        }
        else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
            }
        }
        else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e)
            {}
        }
        else if (msg.equals("Web Browser")) {
            try{
                Runtime.getRuntime().exec("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
            }catch (Exception e){}
        }
       else if (msg.equals("About Us")) {
            new AboutUs().setVisible(true);
        }
        else if (msg.equals("Exit")) {
            System.exit(0);
        }

        }

        public static void main(String[] args){
        new Project().setVisible(true);
        }

    }
