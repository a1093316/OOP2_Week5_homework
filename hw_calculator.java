import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //事件觸發套件

class Calculator extends JFrame implements ActionListener{
    private String str = ""; //輸入輸出框顯示內容
    JPanel top = new JPanel(); //輸入欄
    JPanel contentBtn = new JPanel(); //按鈕欄
    private JTextField t1 = new JTextField(30);
    private int number;
    private String command = null;

    public Calculator(){
        BorderLayout blt=new BorderLayout(5,5);
        setLayout(blt);
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("計算機");
        setBounds (100, 100, 330, 555);

        t1.setPreferredSize(new Dimension(100, 100)); //設定輸入框的長寬
        t1.setHorizontalAlignment(JTextField.RIGHT); //設定輸入為右對齊
        top.add(t1);

        contentBtn.setLayout(new BorderLayout());
        contentBtn.setLayout(new GridLayout(4, 4, 5, 5));
        setContentPane(contentBtn);
        //加入按鈕
        JButton btn1 = new JButton("7");
        btn1.addActionListener(this);
        contentBtn.add(btn1);

        JButton btn2 = new JButton("8");
        btn2.addActionListener(this);
        contentBtn.add(btn2);

        JButton btn3 = new JButton("9");
        btn3.addActionListener(this);
        contentBtn.add(btn3);

        JButton btnC = new JButton("C");
        btnC.addActionListener(this);
        contentBtn.add(btnC);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        contentBtn.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        contentBtn.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        contentBtn.add(btn6);

        JButton btnX = new JButton("*");
        btnX.addActionListener(this);
        contentBtn.add(btnX);

        JButton btn7 = new JButton("1");
        btn7.addActionListener(this);
        contentBtn.add(btn7);

        JButton btn8 = new JButton("2");
        btn8.addActionListener(this);
        contentBtn.add(btn8);

        JButton btn9 = new JButton("3");
        btn9.addActionListener(this);
        contentBtn.add(btn9);

        JButton btnD = new JButton("/");
        btnD.addActionListener(this);
        contentBtn.add(btnD);

        JButton btn10 = new JButton("+");
        btn10.addActionListener(this);
        contentBtn.add(btn10);

        JButton btn11 = new JButton("0");
        btn11.addActionListener(this);
        contentBtn.add(btn11);

        JButton btn12 = new JButton("-");
        btn12.addActionListener(this);
        contentBtn.add(btn12);

        JButton btnE = new JButton("=");
        btnE.addActionListener(this);
        contentBtn.add(btnE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        // JOptionPane.showMessageDialog(null, input);
        
        try{
            switch(input){
                case "C":
                    JOptionPane.showMessageDialog(null, 0);
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":  
                case "0":
                    t1.setText(input);
                    break;
                case "+":
                case "-":
                case "*":  
                case "/":
                    command = input; //紀錄+-*/
                    number = Integer.parseInt(t1.getText()); //第一個數
                    t1.setText(null);
                    break;
                case "=":
                    if(command != null){
                        int result = 0;
                        switch(command){
                            case "+":
                                result = number + Integer.parseInt(t1.getText());
                                JOptionPane.showMessageDialog(null, result);
                                break;
                            case "-":
                                result = number - Integer.parseInt(t1.getText());
                                JOptionPane.showMessageDialog(null, result);
                                break;
                            case "*":
                                result = number * Integer.parseInt(t1.getText());
                                JOptionPane.showMessageDialog(null, result);
                                break;
                            case "/":
                                result = number / Integer.parseInt(t1.getText());
                                JOptionPane.showMessageDialog(null, result);
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "您的輸入有誤");  
        }
    }  
}

public class hw_calculator {
    public static void main(String[] args){
        Calculator cal = new Calculator();   
    }
}
