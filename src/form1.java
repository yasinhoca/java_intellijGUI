import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton ONAYLAButton;

    form1(){
        add(panel);
        setSize(400,200);
        setTitle("İlk UI");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ONAYLAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad,soyad;
                ad = textField1.getText();
                soyad = textField2.getText();
                System.out.println("Hoşgeldin "+ad+" "+soyad);
                form2 f2 = new form2();
                f2.setVisible(true);
            }
        });
    }


}
