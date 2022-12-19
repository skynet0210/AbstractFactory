/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorytaller.factories;

/**
 *
 * @author mauro
 */

import com.mycompany.abstractfactorytaller.buttons.Button;
import com.mycompany.abstractfactorytaller.buttons.MacOSButton;
import com.mycompany.abstractfactorytaller.checkboxes.Checkbox;
import com.mycompany.abstractfactorytaller.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
