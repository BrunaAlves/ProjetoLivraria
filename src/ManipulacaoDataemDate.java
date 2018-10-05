/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunoces
 */
public class ManipulacaoDataemDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data = " +data);
        
        SimpleDateFormat frm = new SimpleDateFormat("dd/MM/yyy");
        
        String str = frm.format(data);
        
        System.out.println("Data convertida = " + str);
        
        str = "15/10/1994";
        
        try {
            data = frm.parse(str);
            System.out.println("Data nova em POSIX = "  + data);

        } catch (ParseException ex) {
            Logger.getLogger(ManipulacaoDataemDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
