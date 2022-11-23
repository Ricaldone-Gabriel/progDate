/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progdate;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * - Importare dentro la classe la funzionalità per stabilire tra due persone chi è più vecchio: deve restituire una stringa che risponda con "più vecchio di" o "più giovane di" in riferimento a chi riceve.
 * - Testare con il metodo add() il passaggio di data incrementando la parte oraria.
 * - Ordinare un elenco di persone create con la classe Persone dal più giovane al più vecchio.
 * - Creare un elenco di prodotti con data di scadenza e cercare cosa scade in un intervallo tra due date.
 * @author gabriel.ricaldone
 */
public class ProgDate {

   public static String vedi_data(GregorianCalendar est) 
   {
	String data="-";
	int gg,mm,aaaa;
	if(est!=null) 
        {
	   gg=est.get(Calendar.DAY_OF_MONTH);
	   mm=est.get(Calendar.MONTH)+1;
	   aaaa=est.get(Calendar.YEAR);
	   data=String.valueOf(gg)+"-"+String.valueOf(mm)+"-"+String.valueOf(aaaa);
	}
	return(data);
   }


   public static void main(String args[])
   {

      int i=0; 

      Persona[] p = new Persona[5];
      p[0] = new Persona("Marco",new GregorianCalendar(1966,(2-1),10));
      p[1] = new Persona("Gianni",new GregorianCalendar(1968,(1-1),7));
      p[2] = new Persona("Mario",new GregorianCalendar(1965,(8-1),22));
      p[3] = new Persona("Luca",new GregorianCalendar(1964,(10-1),15));
      p[4] = new Persona("Luigi",new GregorianCalendar(1968,(12-1),31));

      System.out.println();
      for(i=0;i<5;i++)
      {
         System.out.println(p[i].dammi_nome()+" "+p[i].dammi_data());
      } 

         
      GregorianCalendar nuovo = new GregorianCalendar();   
      System.out.println();
      System.out.println("Oggi   : "+vedi_data(nuovo));
      nuovo.add(Calendar.DAY_OF_MONTH,-1);
      System.out.println("Ieri   : "+vedi_data(nuovo));
      nuovo.add(Calendar.DAY_OF_MONTH,+2);
      System.out.println("Domani : "+vedi_data(nuovo));
            

      GregorianCalendar oggi = new GregorianCalendar();   
      System.out.println();
      for(i=0;i<5;i++)
      {
         System.out.println(p[i].dammi_nome()+" ha "+p[i].anni(oggi)+" anni");
      } 
      

      GregorianCalendar old = new GregorianCalendar();   
      String oldname = ""; 
      System.out.println();
      for(i=0;i<5;i++)
      {
         if(i>0)
         {
            if(p[i].diff(old)>0) 
                System.out.println(p[i].dammi_nome()+" è più giovane di "+oldname);
            else
                System.out.println(p[i].dammi_nome()+" è più vecchio di "+oldname);
         }
         old = p[i].get_datan();
         oldname = p[i].dammi_nome();
      } 

   }
    
}
