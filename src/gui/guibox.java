package gui;

import java.awt.*;

public class guibox {
    public static void main(String ...args){
        Frame f= new Frame("Dialog box");
        f.setVisible(true);
        f.setSize(300,300);

        Button b = new Button("Submit");
        f.add(b);



    }
}
