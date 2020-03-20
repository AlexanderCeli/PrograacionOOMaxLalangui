
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.cventana;

public class oyenteSalir implements ActionListener {
cventana vp;
    
    public oyenteSalir(cventana vp) {
        this.vp = vp;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       System.exit(0);
    }
    
}
