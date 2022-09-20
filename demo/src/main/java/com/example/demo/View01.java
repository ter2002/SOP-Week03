package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "index")
public class View01 extends VerticalLayout {
    private Button btn;
    public View01(){
        btn = new Button("555");

        this.add(btn);

    }
}
