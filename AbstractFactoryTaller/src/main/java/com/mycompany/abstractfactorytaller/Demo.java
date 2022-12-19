/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactorytaller;

/**
 *
 * @author mauro
 */

import com.mycompany.abstractfactorytaller.app.Application;
import com.mycompany.abstractfactorytaller.factories.GUIFactory;
import com.mycompany.abstractfactorytaller.factories.MacOSFactory;
import com.mycompany.abstractfactorytaller.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println("Sistema Operativo:" + osName);
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
        
    }
}
