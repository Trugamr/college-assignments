import java.awt.*;
import java.awt.event.*;

class InterestCalculator extends Frame {
    Label amountL, rateL, answerL;
    TextField amountT, rateT;
    Button calculateBtn;
    InterestCalculator() {
        //labels
        amountL = new Label("Total amount :  ");
        rateL = new Label("Interest rate :    ");
        answerL = new Label(" :  RESULT");

        //textfields
        amountT = new TextField(12);
        rateT = new TextField(12);

        //button
        calculateBtn = new Button("Calculate");

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Integer.parseInt(amountT.getText());
                double rate = Integer.parseInt(rateT.getText());
                double answer = (rate/100) * amount;
                answerL.setText(" :  Interest is " + answer);
            }
        });

        add(amountL); add(amountT);
        add(rateL); add(rateT);
        add(calculateBtn); add(answerL);

        setTitle("Interest Calcualtor");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(240,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InterestCalculator();
    }
}