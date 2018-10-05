/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunoces
 */
public class ManipulacaoDataemCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        System.out.println(data.get(Calendar.DAY_OF_YEAR));
        
        DateFormat frm = DateFormat.getDateInstance(DateFormat.MEDIUM); //Para data
        //DateFormat frm = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT); //Para data e hora
        //DateFormat frm = DateFormat.getTimeInstance(DateFormat.FULL); //Para hora
        
        String str = frm.format(data.getTime());
        System.out.println("Data convertida = " + str);
        
        str = "05/06/1998";
        try {
            data.setTime(frm.parse(str));
        } catch (ParseException ex) {
            Logger.getLogger(ManipulacaoDataemCalendar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Dia do ano = " + data.get(Calendar.DAY_OF_YEAR));
    }
    
}
