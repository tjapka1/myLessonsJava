import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel extends JPanel {
    private JTextField output= new JTextField();
    private JButton[] numbers = new JButton[10];
    private JButton backSpase= new JButton("<"),  equ = new JButton("=");
    private JButton plus= new JButton("+"), minus= new JButton("-"), multi= new JButton("*"), div= new JButton("/");
    private Font font=new Font("SanSerif", Font.BOLD, 20);



    public Panel(){
      setLayout(null);
      setFocusable(true);
      grabFocus();

      plus.setBounds(190, 70, 50,50);
      plus.setFont(font);
      add(plus);

      minus.setBounds(190, 130, 50,50);
      minus.setFont(font);
      add(minus);

      multi.setBounds(190, 190, 50,50);
      multi.setFont(font);
      add(multi);

      div.setBounds(190, 250, 50,50);
      div.setFont(font);
      add(div);


      backSpase.setBounds(10, 250, 50,50);
      backSpase.setFont(font);
      add(backSpase);

        equ.setBounds(130, 250, 50,50);
        equ.setFont(font);
        add(equ);


        numbers[0]= new JButton("0");
        numbers[0].setBounds(70, 250,50,50);
        numbers[0].setFont(font);
        output.setFont(font);
        add(numbers[0]);


      for (int x=0; x<3; x++){
          for (int y=0; y<3; y++){
              numbers[x*3+y+1]= new JButton((x*3+y+1)+"");
              numbers[x*3+y+1].setBounds(x*(50+10)+10, y*(50+10)+70,50,50);
              numbers[x*3+y+1].setFont(font);
              add(numbers[x*3+y+1]);
          }
      }

      output.setBounds(10,10,230,50);
      output.setEditable(false);
      add(output);


        ActionListener l =  (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            output.setText(output.getText() + b.getText());
        };
        for (JButton  b: numbers){
            b.addActionListener(l);
        }
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    char symbol = e.getKeyChar();
                    if (!Character.isDigit(symbol))return;
                    output.setText(output.getText() + symbol);
                }
        });

          }
}
