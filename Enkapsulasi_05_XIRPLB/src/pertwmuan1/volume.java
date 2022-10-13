/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertwmuan1;
import javax.swing.JOptionPane;
/**
 *
 * @author A N A N D A
 */
public class volume {
       private int sisi1;
       private int sisi2;
       private int sisi3;
    
       public void VolumeKubus(){
           sisi1= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi1"));
           sisi2= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi2"));
           sisi3= Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi3"));
        int hitung= sisi1*sisi2*sisi3;
        String tampil="Hasil hitung Volume Balok adalah " + hitung + " satuan volume";
        JOptionPane.showMessageDialog(null, tampil,"Hasil Hitung" ,JOptionPane.INFORMATION_MESSAGE);
    }
}

 
