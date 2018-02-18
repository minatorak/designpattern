package demo1.view;

import demo1.model.Model;

import javax.swing.JFrame;
import java.awt.*;

public class View extends JFrame{
    private Model model;
    public View(Model model) throws HeadlessException {
        this.model = model;
    }
}
