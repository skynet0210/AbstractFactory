/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.abstractfactorytaller.factories;

/**
 *
 * @author mauro
 */

import com.mycompany.abstractfactorytaller.buttons.Button;
import com.mycompany.abstractfactorytaller.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
