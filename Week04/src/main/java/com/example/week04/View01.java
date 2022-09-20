package com.example.week04;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;



@Route(value = "calPage")
public class View01 extends VerticalLayout {
    private Button btn1;
    public View01(){
        btn1 = new Button("Submit");
        add(btn1);
    }

}
