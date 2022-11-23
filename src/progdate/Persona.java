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

public class Persona 
{
   
	private String nome;
	private GregorianCalendar datan;

	public Persona(String n, GregorianCalendar d) 
        {
		this.nome = n;
		this.datan = d;
	}
        
        public String compareTo(Persona persona1, Persona persona2) {
            String confronto;
            if(persona1.)
            return persona1 + " è " + confronto + " di " + persona2;
        }
        
	public String dammi_nome() 
        {
		return(this.nome);
	}

	public GregorianCalendar get_datan() {
		return(this.datan);
	}

	public String dammi_data() 
        {
		String data="-";
		int gg,mm,aaaa;
		if(this.datan!=null) 
                {
			gg=this.datan.get(Calendar.DAY_OF_MONTH);
			mm=this.datan.get(Calendar.MONTH)+1;
			aaaa=this.datan.get(Calendar.YEAR);
			data=String.valueOf(gg)+"-"+String.valueOf(mm)+"-"+String.valueOf(aaaa);
		}
		return(data);
	}

	public int diff(GregorianCalendar est) 
        {
           int diff = (int) this.datan.compareTo(est);
           return(diff);
	}

	public long anni(GregorianCalendar est) 
        {
           long diff = -(this.datan.getTimeInMillis() - est.getTimeInMillis()) / 1000;
           diff = diff/(60*60*24*365);
           return(diff);
	}
 
}
