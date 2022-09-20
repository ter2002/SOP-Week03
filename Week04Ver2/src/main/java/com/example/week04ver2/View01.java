package com.example.week04ver2;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;



@Route(value = "calPage")
public class View01 extends VerticalLayout {
    private Button btn02;

    public View01(){
        Button btn01 = new Button("Submit");
        add(btn01);
    }

}
