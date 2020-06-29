/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siapligarmukti;
import java.util.logging.Level;
import java.util.logging.Logger;

import tampilan.login;
import tampilan.splashscreen;
/**
 *
 * @author ASUS
 */
public class Siapligarmukti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login l = new login();
        splashscreen sc = new splashscreen();
        sc.setVisible(true);
        
        
            try {
                for (int i=0; i<=100; i++)
                {
                Thread.sleep(50);
                sc.time.setText(Integer.toString(i)+"%");
                sc.progresbar.setValue(i);
                if(i==100)
                    {
                        sc.setVisible(false);
                        l.setVisible(true);
                    } 
                } 
            } catch (InterruptedException ex) {
                Logger.getLogger(splashscreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
