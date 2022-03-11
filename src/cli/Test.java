/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cli;
import fileHandling.Process;
import java.util.ArrayList;
/**
 *
 * @author 19
 */
public class Test {
    public static void main(String[] args) {
        
        Process.setTheme(false);
        boolean isDarkMode = Process.isDarkTheme();
        
        if(isDarkMode) {
            System.out.println("SAVED THEME: DARK MODE");
        }
        else {
            System.out.println("SAVED THEME: LIGHT MODE");
        }

    }
}
