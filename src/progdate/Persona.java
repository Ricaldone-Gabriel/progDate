package progdate;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona 
{
   
	private String nome;
	private GregorianCalendar datan;

	public Persona(String n, GregorianCalendar d) 
        {
		this.nome = n;
		this.datan = d;
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
