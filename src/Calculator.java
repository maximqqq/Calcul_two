import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;
    private JButton button;
    JButton exitButton;

    public Calculator()
    {
        setTitle("КАЛЬКУЛЯТОР");
        this.setSize(200,300);
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

        textField1 = new JTextField(3);

        textField2 = new JTextField(3);

        //textField1.setSize(20,5);
       // textField2.setSize(10,5);

        panel.add(textField1,BorderLayout.WEST);
        panel.add(textField2,BorderLayout.CENTER);



////////////////////////////////////////////////////////////////////////////////

        label = new JLabel();




        button = new JButton("Сложить");

        button.addActionListener(new ButtonListoner());



        panel.add(button,BorderLayout.EAST);
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


                label.setText("answer:" + (t1 + t2));
                label.setVisible(true);

        }
    }
//-----------------------------------------------------------------------------




}