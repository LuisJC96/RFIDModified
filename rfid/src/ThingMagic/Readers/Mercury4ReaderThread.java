/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThingMagic.Readers;

import java.io.IOException;
import rfid.swing.GUI;


/**
 *
 * @author luisj
 */
public class Mercury4ReaderThread extends Thread {
    
    private GUI app;
    private MercuryReader reader;
    
    /** Creates a new instance of Mercury4ReaderThread */
    public Mercury4ReaderThread(GUI app, MercuryReader reader) {
        this.app = app;
        this.reader = reader;
    }
    
    public void run() {
        while(true) {
            try {
                String response = reader.getBuffer().readLine();
                app.show(response);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

