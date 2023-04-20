import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class JavaVotingSystem 
{
    static JFrame f,f1,f2;
    static Panel p,p1,p2;
    static ImageIcon img1, img2, img3, img4, i1, i2, i3, i4, i5;
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, L1, L2, L3, L4, L5, L6, 
                    R1, R2, R3, R4, R5, Thanks;
    static JButton b1, b2, b3, b4, b5, b6, prty1, prty2, prty3, prty4, prty5, NV;
    static boolean age = false;
    static Dimension size1,size2, size3, size4, size5, size6, size7, s1, s2, s3, s4, s5, s6, 
                  ts, r1, r2, r3, r4, r5;
    static int P=0, K=0, V=0, A=0, S=0;
    
    public static void restart1(){
        f1.remove(p1);
        p1 = new Panel();
        p1.setLayout(null);
        l3 = new JLabel("Are You 18+?");
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Georgia",Font.BOLD,20));
        size1 = l3.getPreferredSize();
        l3.setBounds(250,50, size1.width, size1.height);
        p1.add(l3);
        
        l4 = new JLabel("Are You Indian?");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Georgia",Font.BOLD,20));
        size2 = l4.getPreferredSize();
        l4.setBounds(230,200, size2.width, size2.height);
        p1.add(l4);
        
        b1 = new JButton("Yes");
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.cyan);
        b1.setBounds(230, 100, 80, 30);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                b1.setBackground(Color.RED);
                b1.setForeground(Color.WHITE);
                age = true;
                l5 = new JLabel("You clicked Yes.");
                l5.setForeground(Color.PINK);
                l5.setFont(new Font("Georgia",Font.BOLD,20));
                size3 = l5.getPreferredSize();
                l5.setBounds(250,150, size3.width, size3.height);
                p1.add(l5);
            }
        });
        p1.add(b1);
        
        
        b2 = new JButton("No");
        b2.setForeground(Color.RED);
        b2.setBackground(Color.cyan);
        b2.setBounds(320, 100, 80, 30);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                b2.setBackground(Color.GREEN);
                age = false;
                l6 = new JLabel("You clicked No.");
                l6.setForeground(Color.PINK);
                l6.setFont(new Font("Georgia",Font.BOLD,20));
                size4 = l6.getPreferredSize();
                l6.setBounds(250,150, size4.width, size4.height);
                p1.add(l6);
            }
        });
        p1.add(b2);
        
        
        b3 = new JButton("Yes");
        b3.setForeground(Color.BLUE);
        b3.setBackground(Color.cyan);
        b3.setBounds(230, 250, 80, 30);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                b3.setBackground(Color.RED);
                b3.setForeground(Color.WHITE);
                if (age == true)
                {
                    l7 = new JLabel("You are eligible for Voting!");
                    l7.setForeground(Color.BLUE);
                    l7.setFont(new Font("Georgia",Font.BOLD,20));
                    size5 = l7.getPreferredSize();
                    l7.setBounds(180, 320, 400,350);
                    p1.add(l7);
                    
                    b5 = new JButton("Proceed to Vote");
                    b5.setForeground(Color.BLUE);
                    b5.setBackground(Color.cyan);
                    b5.setBounds(220, 350, 190, 30);
                    b5.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            b5.setBackground(Color.red);
                            b5.setForeground(Color.WHITE);
                            f2.setVisible(true);
                        }
                        
                    });
                    p1.add(b5);
                    
                }
                if(age == false)
                {
                    l8 = new JLabel("You are not eligible for Voting!");
                    l8.setForeground(Color.RED);
                    l8.setFont(new Font("Georgia",Font.BOLD,22));
                    l8.setBounds(160,320, 400, 350);
                    p1.add(l8);
                    
                    b6 = new JButton("Next Voter");
                    b6.setForeground(Color.BLUE);
                    b6.setBackground(Color.cyan);
                    b6.setBounds(250, 350, 120, 30);
                    b6.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            b6.setBackground(Color.red);
                            b6.setForeground(Color.WHITE);
                            f.setVisible(true);
                        }
                        
                    });
                    p1.add(b6);
                }
            }
        });
        p1.add(b3);
        
        
        b4 = new JButton("No");
        b4.setForeground(Color.RED);
        b4.setBackground(Color.cyan);
        b4.setBounds(320, 250, 80, 30);
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                b4.setBackground(Color.GREEN);
                l8 = new JLabel("You are not eligible for Voting!");
                    l8.setForeground(Color.RED);
                    l8.setFont(new Font("Georgia",Font.BOLD,22));
                    l8.setBounds(160,320,400,350);
                    p1.add(l8);
                    
                    b6 = new JButton("Next Voter");
                    b6.setBackground(Color.cyan);
                    b6.setForeground(Color.BLUE);
                    b6.setBounds(250, 350, 120, 30);
                    b6.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            b6.setBackground(Color.red);
                            b6.setForeground(Color.WHITE);
                            f.setVisible(true);
                        }
                        
                    });
                    p1.add(b6);
            }
        });
        p1.add(b4);
        f1.add(p1);
        f1.revalidate();
    }
    public static void main(String args[]) 
    {
        f = new JFrame("VOTING SYSTEM");
        p = new Panel();
        p.setLayout(null);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.BLACK);
        f.setSize(700,700);
        img1 = new ImageIcon("Voting System Icon.jpeg");
        f.setIconImage(img1.getImage());
        
        
        img2 = new ImageIcon("voting-system-title.gif");
        l1 = new JLabel("Welcome To VOTING SYSTEM!!!");
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Georgia",Font.BOLD,22));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(200, 190, 400,300);
        p.add(l1);
        
        
        
        l2 = new JLabel("Hi!!",img2,JLabel.CENTER);
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setVerticalTextPosition(JLabel.BOTTOM);
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("Georgia",Font.BOLD,22));
        l2.setBounds(300,130,150,200);
        p.add(l2);
        
        f1 = new JFrame("VOTING SYSTEM");
        p1 = new Panel();
        p1.setLayout(null);
        f1.add(p1);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(Color.BLACK);
        f1.setSize(700,700);
        img3 = new ImageIcon("Voting System Icon.jpeg");
        f1.setIconImage(img3.getImage());
        
        
        
        
        
        l3 = new JLabel("Are You 18+?");
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Georgia",Font.BOLD,20));
        size1 = l3.getPreferredSize();
        l3.setBounds(250,50, size1.width, size1.height);
        p1.add(l3);
        
        l4 = new JLabel("Are You Indian?");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Georgia",Font.BOLD,20));
        size2 = l4.getPreferredSize();
        l4.setBounds(230,200, size2.width, size2.height);
        p1.add(l4);
        
        
        f2 = new JFrame("VOTING SYSTEM");
        p2 = new Panel();
        p2.setLayout(null);
        f2.add(p2);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.getContentPane().setBackground(Color.BLACK);
        f2.setSize(800,800);
        img4 = new ImageIcon("Voting System Icon.jpeg");
        f2.setIconImage(img4.getImage());

        L1 = new JLabel("Tap the following button for Voting the respective Party : ");
        L1.setForeground(Color.RED);
        L1.setFont(new Font("Georgia",Font.PLAIN,22));
        s1 = L1.getPreferredSize();
        L1.setBounds(10, 30, s1.width, s1.height);
        p2.add(L1);
        
        
        
        i1 = new ImageIcon("p.jpg");
        i2 = new ImageIcon("k.jpg");
        i3 = new ImageIcon("v.jpg");
        i4 = new ImageIcon("a.jpg");
        i5 = new ImageIcon("s.jpg");
        
        L2 = new JLabel("1.Party \"P\" : ");
        L2.setForeground(Color.CYAN);
        L2.setFont(new Font("Georgia",Font.PLAIN,20));
        s2 = L2.getPreferredSize();
        L2.setBounds(10,120,300,120);
        p2.add(L2);
        prty1 = new JButton(i1);
        prty1.setBounds(250, 150, 60, 60);
        
        prty1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                P+=1;
                p2.remove(R1);
                R1 = new JLabel("P party got " + P + " vote.");
                R1.setForeground(Color.RED);
                R1.setFont(new Font("Georgia",Font.PLAIN,20));
                R1.setBounds(350,150,200,80);
                p2.add(R1);
                
                NV = new JButton("Next Voter");
                NV.setBounds(670,630,100,40);
                NV.setBackground(Color.GREEN);
                NV.setForeground(Color.red);
                NV.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        NV.setBackground(Color.CYAN);
                        f.setVisible(true);
                    }
                }
                
                );
                p2.add(NV);

                Thanks = new JLabel("Thanks for Voting!!");
                Thanks.setForeground(Color.RED);
                Thanks.setFont(new Font("Georgia",Font.PLAIN,22));
                ts = Thanks.getPreferredSize();
                Thanks.setBounds(50, 600, 250, 100);
                p2.add(Thanks);
                
            }

        });
        p2.add(prty1);
        
        L3 = new JLabel("2.Party \"K\" : ");
        L3.setForeground(Color.CYAN);
        L3.setFont(new Font("Georgia",Font.PLAIN,20));
        s3 = L3.getPreferredSize();
        L3.setBounds(10,190,300,120);
        p2.add(L3);
        prty2 = new JButton(i2);
        prty2.setBounds(250, 220, 60, 60);
        
        prty2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                K+=1;
                p2.remove(R2);
                R2 = new JLabel("K party got " + K + " vote.");
                R2.setForeground(Color.RED);
                R2.setFont(new Font("Georgia",Font.PLAIN,20));
                R2.setBounds(350,210,200,80);
                p2.add(R2);


                NV = new JButton("Next Voter");
                NV.setBounds(670,630,100,40);
                NV.setBackground(Color.GREEN);
                NV.setForeground(Color.red);
                NV.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        NV.setBackground(Color.CYAN);
                        f.setVisible(true);
                    }
                }
                
                );
                p2.add(NV);

                Thanks = new JLabel("Thanks for Voting!!");
                Thanks.setForeground(Color.RED);
                Thanks.setFont(new Font("Georgia",Font.PLAIN,22));
                ts = Thanks.getPreferredSize();
                Thanks.setBounds(50, 600, 250, 100);
                p2.add(Thanks);
            }
        });
        p2.add(prty2);
        
        L4 = new JLabel("3.Party \"V\" : ");
        L4.setForeground(Color.CYAN);
        L4.setFont(new Font("Georgia",Font.PLAIN,20));
        s4 = L4.getPreferredSize();
        L4.setBounds(10,260,300,120);
        p2.add(L4);
        prty3 = new JButton(i3);
        prty3.setBounds(250, 290, 60, 60);
        prty3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                V+=1;
                p2.remove(R3);
                R3 = new JLabel("V party got " + V + " vote.");
                R3.setForeground(Color.RED);
                R3.setFont(new Font("Georgia",Font.PLAIN,20));
                R3.setBounds(350,280,200,80);
                p2.add(R3);

                NV = new JButton("Next Voter");
                NV.setBounds(670,630,100,40);
                NV.setBackground(Color.GREEN);
                NV.setForeground(Color.red);
                NV.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        NV.setBackground(Color.CYAN);
                        f.setVisible(true);
                    }
                }
                
                );
                p2.add(NV);

                Thanks = new JLabel("Thanks for Voting!!");
                Thanks.setForeground(Color.RED);
                Thanks.setFont(new Font("Georgia",Font.PLAIN,22));
                ts = Thanks.getPreferredSize();
                Thanks.setBounds(50, 600, 250, 100);
                p2.add(Thanks);
            }
        });
        p2.add(prty3);
        
        L5 = new JLabel("4.Party \"A\" : ");
        L5.setForeground(Color.CYAN);
        L5.setFont(new Font("Georgia",Font.PLAIN,20));
        s5 = L5.getPreferredSize();
        L5.setBounds(10,330,300,120);
        p2.add(L5);
        prty4 = new JButton(i4);
        prty4.setBounds(250, 360, 60, 60);
        prty4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                A+=1;
                p2.remove(R4);
                R4 = new JLabel("A party got " + A + " vote.");
                R4.setForeground(Color.RED);
                R4.setFont(new Font("Georgia",Font.PLAIN,20));
                R4.setBounds(350,350,200,80);
                p2.add(R4);

                NV = new JButton("Next Voter");
                NV.setBounds(670,630,100,40);
                NV.setBackground(Color.GREEN);
                NV.setForeground(Color.red);
                NV.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        NV.setBackground(Color.CYAN);
                        f.setVisible(true);
                    }
                }
                
                );
                p2.add(NV);

                Thanks = new JLabel("Thanks for Voting!!");
                Thanks.setForeground(Color.RED);
                Thanks.setFont(new Font("Georgia",Font.PLAIN,22));
                ts = Thanks.getPreferredSize();
                Thanks.setBounds(50, 600, 250, 100);
                p2.add(Thanks);
            }
        });
        p2.add(prty4);
        
        L6 = new JLabel("5.Party \"S\" : ");
        L6.setForeground(Color.CYAN);
        L6.setFont(new Font("Georgia",Font.PLAIN,20));
        s6 = L6.getPreferredSize();
        L6.setBounds(10,400,300,120);
        p2.add(L6);
        prty5 = new JButton(i5);
        prty5.setBounds(250, 430, 60, 60);
        prty5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                S+=1;
                p2.remove(R5);
                R5 = new JLabel("S party got " + S + " vote.");
                R5.setForeground(Color.RED);
                R5.setFont(new Font("Georgia",Font.PLAIN,20));
                R5.setBounds(350,420,200,80);
                p2.add(R5);

                NV = new JButton("Next Voter");
                NV.setBounds(670,630,100,40);
                NV.setBackground(Color.GREEN);
                NV.setForeground(Color.red);
                NV.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        NV.setBackground(Color.CYAN);
                        f.setVisible(true);
                    }
                }
                
                );
                p2.add(NV);

                Thanks = new JLabel("Thanks for Voting!!");
                Thanks.setForeground(Color.RED);
                Thanks.setFont(new Font("Georgia",Font.PLAIN,22));
                ts = Thanks.getPreferredSize();
                Thanks.setBounds(50, 600, 250, 100);
                p2.add(Thanks);
            }
        });
        p2.add(prty5);
        
        R1 = new JLabel("1.Party \"P\" got " + P + " votes.");
        R1.setForeground(Color.RED);
        R1.setFont(new Font("Georgia",Font.BOLD,20));
        r1 = R1.getPreferredSize();
        R1.setBounds(10, 100, r1.width, r1.height);
        
        R2 = new JLabel("2.Party \"K\" got "+K+" votes.");
        R2.setForeground(Color.RED);
        R2.setFont(new Font("Georgia",Font.BOLD,20));
        r2 = R2.getPreferredSize();
        R2.setBounds(10, 200, r2.width, r2.height);
        
        R3 = new JLabel("3.Party \"V\" got "+V+" votes.");
        R3.setForeground(Color.RED);
        R3.setFont(new Font("Georgia",Font.BOLD,20));
        r3 = R3.getPreferredSize();
        R3.setBounds(10, 180, r3.width, r3.height);
        
        R4 = new JLabel("4.Party \"A\" got "+A+" votes.");
        R4.setForeground(Color.RED);
        R4.setFont(new Font("Georgia",Font.BOLD,20));
        r4 = R4.getPreferredSize();
        R4.setBounds(10, 220, r4.width, r4.height);
        
        R5 = new JLabel("5.Party \"S\" got "+S+" votes.");
        R5.setForeground(Color.RED);
        R5.setFont(new Font("Georgia",Font.BOLD,20));
        r5 = R5.getPreferredSize();
        R5.setBounds(10, 260, r5.width, r5.height);
        
        b1 = new JButton("Yes");
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.cyan);
        b1.setBounds(230, 100, 80, 30);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                age = true;
                l5 = new JLabel("You clicked Yes.");
                l5.setForeground(Color.MAGENTA);
                l5.setFont(new Font("Georgia",Font.BOLD,20));
                size3 = l5.getPreferredSize();
                l5.setBounds(250,150, size3.width, size3.height);
                p1.add(l5);
            }
        });
        p1.add(b1);
        
        
        b2 = new JButton("No");
        b2.setForeground(Color.RED);
        b2.setBackground(Color.cyan);
        b2.setBounds(320, 100, 80, 30);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                age = false;
                l6 = new JLabel("You clicked No.");
                l6.setForeground(Color.PINK);
                l6.setFont(new Font("Georgia",Font.BOLD,20));
                size4 = l6.getPreferredSize();
                l6.setBounds(250,150, size4.width, size4.height);
                p1.add(l6);
            }
        });
        p1.add(b2);
        
        
        b3 = new JButton("Yes");
        b3.setForeground(Color.BLUE);
        b3.setBackground(Color.cyan);
        b3.setBounds(230, 250, 80, 30);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (age == true)
                {
                    l7 = new JLabel("You are eligible for Voting!");
                    l7.setForeground(Color.BLUE);
                    l7.setFont(new Font("Georgia",Font.BOLD,20));
                    size5 = l7.getPreferredSize();
                    l7.setBounds(210, 320, size5.height, size5.width);
                    p1.add(l7);
                    
                    b5 = new JButton("Proceed to Vote");
                    b5.setForeground(Color.BLUE);
                    b5.setBackground(Color.cyan);
                    b5.setBounds(220, 350, 190, 30);
                    b5.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            f2.setVisible(true);
                        }
                        
                    });
                    p1.add(b5);
                    
                }
                if(age == false)
                {
                    l8 = new JLabel("You are not eligible for Voting!");
                    l8.setForeground(Color.RED);
                    l8.setFont(new Font("Georgia",Font.BOLD,22));
                    size7 = l8.getPreferredSize();
                    l8.setBounds(210,320, size7.height, size7.width);
                    p1.add(l8);
                    
                    b6 = new JButton("Next Voter");
                    b6.setForeground(Color.BLUE);
                    b6.setBackground(Color.cyan);
                    b6.setBounds(250, 350, 120, 30);
                    b6.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            f.setVisible(true);
                        }
                        
                    });
                    p1.add(b6);
                }
            }
        });
        p1.add(b3);
        
        
        b4 = new JButton("No");
        b4.setForeground(Color.RED);
        b4.setBackground(Color.cyan);
        b4.setBounds(320, 250, 80, 30);
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                l8 = new JLabel("You are not eligible for Voting!");
                    l8.setForeground(Color.RED);
                    l8.setFont(new Font("Georgia",Font.BOLD,22));
                    size6 = l8.getPreferredSize();
                    l8.setBounds(210,320, size6.height, size6.width);
                    p1.add(l8);
                    
                    b6 = new JButton("Next Voter");
                    b6.setBackground(Color.cyan);
                    b6.setForeground(Color.BLUE);
                    b6.setBounds(250, 350, 120, 30);
                    b6.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                            f.setVisible(true);
                        }
                        
                    });
                    p1.add(b6);
            }
        });
        p1.add(b4);
        
        JButton b = new JButton("START");
        b.setBackground(Color.cyan);
        b.setForeground(Color.RED);
        b.setBounds(330, 370, 90, 40);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b)
                {
                    restart1();
                }
                f1.setVisible(true);
            }
        });
        p.add(b);
        f.setVisible(true);
        
    }
}
