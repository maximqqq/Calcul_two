import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;
    private JButton button;
    private JButton button1;
    private JButton button2;
    private JButton button3;



    JButton exitButton;

    public Calculator()
    {
        setTitle("КАЛЬКУЛЯТОР");
        this.setSize(300,150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu();
        menu.setText("File");

        JMenuItem open = new JMenuItem();
        open.setText("Open");
        JMenuItem save = new JMenuItem();
        save.setText("Save");
        JSeparator separator = new JSeparator();
        JMenuItem exit = new JMenuItem();
        exit.setText("EXIT");

        menu.add(open);
        menu.add(save);
        menu.add(exit);

        menuBar.add(menu);

        add(menuBar,BorderLayout.NORTH);

////////////////////////////////////////////////////////////////////////////////

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        textField1 = new JTextField(3);

        textField2 = new JTextField(3);

        //textField1.setSize(20,5);
       // textField2.setSize(10,5);

        panel.add(textField1,BorderLayout.WEST);
        panel.add(textField2,BorderLayout.CENTER);



////////////////////////////////////////////////////////////////////////////////



        label = new JLabel();




        button = new JButton("+");
        button1 = new JButton("-");
        button2 = new JButton("*");
        button3 = new JButton("/");

        button.addActionListener(new ButtonListoner());
        button1.addActionListener(new ButtonListoner1());
        button2.addActionListener(new ButtonListoner2());
        button3.addActionListener(new ButtonListoner3());


        panel.add(button,BorderLayout.EAST);
        panel.add(button1,BorderLayout.NORTH);
        panel.add(button2,BorderLayout.CENTER);
        panel.add(button3,BorderLayout.SOUTH);


        panel3.add(label,BorderLayout.SOUTH);

        exitButton = new JButton("Exit");
        exitButton.setSize(10,10);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });

        add(panel,BorderLayout.NORTH);
        add(panel3,BorderLayout.CENTER);
        add(panel2,BorderLayout.SOUTH);
        add(panel4,BorderLayout.EAST);



        panel2.add(exitButton,BorderLayout.EAST);



////////////////////////////////////////////////////////////////////////////////

        this.setVisible(true);
    }

//-------СОБЫТИЕ  СЛУШАТЕЛЬ СЛОЖЕНИЕ-----------------------------------------
        private class ButtonListoner implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ev) {

                int t1, t2;

                t1 = Integer.parseInt(textField1.getText());
                t2 = Integer.parseInt(textField2.getText());


                label.setText("answer :" + (t1 + t2));
                label.setVisible(true);

        }
    }
//-------------------------------------------------------------------------------

//-------СОБЫТИЕ  СЛУШАТЕЛЬ ВЫЧИТАНИЕ--------------------------------------------
private class ButtonListoner1 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ev) {

        int t1, t2;

        t1 = Integer.parseInt(textField1.getText());
        t2 = Integer.parseInt(textField2.getText());


        label.setText("answer :" + (t1 - t2));
        label.setVisible(true);

    }
}
//-------------------------------------------------------------------------------

//-------СОБЫТИЕ  СЛУШАТЕЛЬ УМНОЖЕНИЕ--------------------------------------------
private class ButtonListoner2 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ev) {

        int t1, t2;

        t1 = Integer.parseInt(textField1.getText());
        t2 = Integer.parseInt(textField2.getText());


        label.setText("answer :" + (t1 * t2));
        label.setVisible(true);

    }
}
//-------------------------------------------------------------------------------

//-------СОБЫТИЕ  СЛУШАТЕЛЬ ДЕЛЕНИЕ----------------------------------------------
private class ButtonListoner3 implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent ev) {

        int t1, t2;

        t1 = Integer.parseInt(textField1.getText());
        t2 = Integer.parseInt(textField2.getText());


        label.setText("answer :" + (t1 / t2));
        label.setVisible(true);

    }
}
//-------------------------------------------------------------------------------

}