
// package CalPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorApplication implements ActionListener {
    double num1 = 0,num2 = 0,result = 0;
    int calculation;
    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    // JRadioButton onRadioButton = new JRadioButton("on");
    // JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("CLR");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("X^2");
    JButton buttonReciprocal = new JButton("1/X");
    JButton buttonSqrt = new JButton("^X");

    CalculatorApplication() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(420, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void addComponents() {
        label.setBounds(10, 0, 380, 50);
        label.setBackground(Color.green);
        label.setForeground(Color.black);
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(label);

        textField.setBounds(10, 40, 380, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        // onRadioButton.setBounds(10, 105, 60, 40);
        // onRadioButton.setSelected(true);
        // onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        // onRadioButton.setBackground(Color.gray);
        // onRadioButton.setForeground(Color.red);
        // onRadioButton.setFocusable(false);
        // frame.add(onRadioButton);

        // offRadioButton.setBounds(10, 130, 60, 40);
        // offRadioButton.setSelected(false);
        // offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        // offRadioButton.setBackground(Color.gray);
        // offRadioButton.setForeground(Color.red);
        // offRadioButton.setFocusable(false);
        // frame.add(offRadioButton);

        // ButtonGroup buttonGroup = new ButtonGroup();
        // buttonGroup.add(onRadioButton);
        // buttonGroup.add(offRadioButton);
        
        buttonClear.setBounds(110, 130, 80, 40);
        buttonClear.setBackground(Color.red);
        buttonClear.setFocusable(false);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonClear);

        buttonDelete.setBounds(210, 130, 80, 40);
        buttonDelete.setBackground(Color.red);
        buttonDelete.setFocusable(false);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDelete);
        
        buttonPlus.setBounds(310, 130, 80, 40);
        buttonPlus.setBackground(Color.pink);
        buttonPlus.setFocusable(false);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonPlus);
        
        buttonSqrt.setBounds(10, 180, 80, 40);
        buttonSqrt.setBackground(Color.pink);
        buttonSqrt.setFocusable(false);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSqrt);

        buttonSquare.setBounds(110, 180, 80, 40);
        buttonSquare.setBackground(Color.pink);
        buttonSquare.setFocusable(false);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(210, 180, 80, 40);
        buttonReciprocal.setBackground(Color.pink);
        buttonReciprocal.setFocusable(false);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonReciprocal);
        
        buttonMinus.setBounds(310, 180, 80, 40);
        buttonMinus.setBackground(Color.pink);
        buttonMinus.setFocusable(false);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMinus);

        buttonSeven.setBounds(10, 230, 80, 40);
        buttonSeven.setBackground(Color.orange);
        buttonSeven.setFocusable(false);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(110, 230, 80, 40);
        buttonEight.setBackground(Color.orange);
        buttonEight.setFocusable(false);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(210, 230, 80, 40);
        buttonNine.setBackground(Color.orange);
        buttonNine.setFocusable(false);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);
        
        buttonMul.setBounds(310, 230, 80, 40);
        buttonMul.setBackground(Color.pink);
        buttonMul.setFocusable(false);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonMul);

        buttonFour.setBounds(10, 280, 80, 40);
        buttonFour.setBackground(Color.orange);
        buttonFour.setFocusable(false);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(110, 280, 80, 40);
        buttonFive.setBackground(Color.orange);
        buttonFive.setFocusable(false);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(210, 280, 80, 40);
        buttonSix.setBackground(Color.orange);
        buttonSix.setFocusable(false);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);
        
        buttonDiv.setBounds(310, 280, 80, 40);
        buttonDiv.setBackground(Color.pink);
        buttonDiv.setFocusable(false);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDiv);

        buttonOne.setBounds(10, 330, 80, 40);
        buttonOne.setBackground(Color.orange);
        buttonOne.setFocusable(false);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(110, 330, 80, 40);
        buttonTwo.setBackground(Color.orange);
        buttonTwo.setFocusable(false);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(210, 330, 80, 40);
        buttonThree.setBackground(Color.orange);
        buttonThree.setFocusable(false);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);
        
        buttonEqual.setBounds(310, 330, 80, 90);
        buttonEqual.setBackground(Color.pink);
        buttonEqual.setFocusable(false);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEqual);

        buttonZero.setBounds(10, 380, 180, 40);
        buttonZero.setBackground(Color.orange);
        buttonZero.setFocusable(false);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonDot.setBounds(210, 380, 80, 40);
        buttonDot.setBackground(Color.orange);
        buttonDot.setFocusable(false);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);
    }
     
    public void addActionEvent(){   /// user defined method
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        // if(source == onRadioButton){
        //     enable();
        // }else if(source == offRadioButton){
        //     disable();
        // }
        if(source == buttonClear){
            label.setText("");
            textField.setText("");
        }else if(source == buttonDelete){
            int length = textField.getText().length();
            int number = length-1;
            if(length>0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith("")){
                label.setText("");
            }
        }else if(source == buttonZero){
            if(textField.getText().equals("0")){
                return;
            }
            else{
                textField.setText(textField.getText() + '0');
            }
        }else if(source == buttonOne){
            textField.setText(textField.getText() + '1');
        }else if(source == buttonTwo){
            textField.setText(textField.getText() + '2');
        }else if(source == buttonThree){
            textField.setText(textField.getText() + '3');
        }else if(source == buttonFour){
            textField.setText(textField.getText() + '4');
        }else if(source == buttonFive){
            textField.setText(textField.getText() + '5');
        }else if(source == buttonSix){
            textField.setText(textField.getText() + '6');
        }else if(source == buttonSeven){
            textField.setText(textField.getText() + '7');
        }else if(source == buttonEight){
            textField.setText(textField.getText() + '8');
        }else if(source == buttonNine){
            textField.setText(textField.getText() + '9');
        }else if(source == buttonDot){
            if(textField.getText().contains(".")){
                return;
            }else if(textField.getText().equals("")){
                textField.setText("0"+".");
            }else{
                textField.setText(textField.getText() + ".");
            }
        }else if(source == buttonPlus){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText(str+"+");
        }else if(source == buttonMinus){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText(str+"-");
        }else if(source == buttonMul){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText(str+"X");
        }else if(source == buttonDiv){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText(str+"/");
        }else if(source == buttonSquare){
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1,2);
            String str = Double.toString(square);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }
            else{
                textField.setText(str);
            }
        }else if(source == buttonSqrt){
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }else if(source == buttonReciprocal){
            num1 = Double.parseDouble(textField.getText());
            double reci = 1/num1;
            String str = Double.toString(reci);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }else{
                textField.setText(str);
            }
            textField.setText(str);
        }else if(source == buttonEqual){
            num2 = Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }else{
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        
    }
    
    // public void enable(){
    //     onRadioButton.setEnabled(false);
    //     offRadioButton.setEnabled(true);
    //     label.setEnabled(true);
    //     textField.setEnabled(true);
    //     buttonZero.setEnabled(true);
    //     buttonOne.setEnabled(true);
    //     buttonTwo.setEnabled(true);
    //     buttonThree.setEnabled(true);
    //     buttonFour.setEnabled(true);
    //     buttonFive.setEnabled(true);
    //     buttonSix.setEnabled(true);
    //     buttonSeven.setEnabled(true);
    //     buttonEight.setEnabled(true);
    //     buttonNine.setEnabled(true);
    //     buttonSqrt.setEnabled(true);
    //     buttonSquare.setEnabled(true);
    //     buttonDot.setEnabled(true);
    //     buttonMinus.setEnabled(true);
    //     buttonPlus.setEnabled(true);
    //     buttonDelete.setEnabled(true);
    //     buttonClear.setEnabled(true);
    //     buttonMul.setEnabled(true);
    //     buttonDiv.setEnabled(true);
    //     buttonEqual.setEnabled(true);
    //     buttonReciprocal.setEnabled(true);
    // }
    
    // public void disable(){
    //     offRadioButton.setEnabled(false);
    //     onRadioButton.setEnabled(true);
    //     label.setText("");
    //     textField.setText("");
    //     label.setEnabled(false);
    //     textField.setEnabled(false);
    //     buttonZero.setEnabled(false);
    //     buttonOne.setEnabled(false);
    //     buttonTwo.setEnabled(false);
    //     buttonThree.setEnabled(false);
    //     buttonFour.setEnabled(false);
    //     buttonFive.setEnabled(false);
    //     buttonSix.setEnabled(false);
    //     buttonSeven.setEnabled(false);
    //     buttonEight.setEnabled(false);
    //     buttonNine.setEnabled(false);
    //     buttonSqrt.setEnabled(false);
    //     buttonSquare.setEnabled(false);
    //     buttonDot.setEnabled(false);
    //     buttonMinus.setEnabled(false);
    //     buttonPlus.setEnabled(false);
    //     buttonDelete.setEnabled(false);
    //     buttonClear.setEnabled(false);
    //     buttonMul.setEnabled(false);
    //     buttonDiv.setEnabled(false);
    //     buttonEqual.setEnabled(false);
    //     buttonReciprocal.setEnabled(false); 
    // }
    
    public static void main(String args[]) {
        new CalculatorApplication();
    }
}

