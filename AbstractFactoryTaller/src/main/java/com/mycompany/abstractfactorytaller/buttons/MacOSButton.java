/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorytaller.buttons;

import com.mycompany.abstractfactorytaller.buttons.Button;

/**
 *
 * @author mauro
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Han sido creados Botones para mac.");
    }
}
