package S20221129;

import java.awt.*;
import java.awt.event.*;


class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new EventHandler());

    }
}

class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent Occured!!!");
    }


}
