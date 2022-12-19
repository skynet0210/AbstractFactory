/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorytaller.app;

/**
 *
 * @author mauro
 */

import com.mycompany.abstractfactorytaller.buttons.Button;
import com.mycompany.abstractfactorytaller.checkboxes.Checkbox;
import com.mycompany.abstractfactorytaller.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
