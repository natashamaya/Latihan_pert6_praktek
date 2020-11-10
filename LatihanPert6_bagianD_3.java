class acaraTV {
	private String StasiunTV;
	private String Acara;

public void setStasiunTV(String StasiunTV){
	this.StasiunTV=StasiunTV;
}
public void setAcara(String Acara){
	this.Acara=Acara;
}

public String getAcara(){
	return this.Acara;
}
public String getStasiunTV(){
	 return this.StasiunTV;
}
 void cetak(){
	System.out.println("Acara"+ Acara +" Stasiun TV "+
	StasiunTV);
	}

}

public class LatihanPert6_bagianD_3{
	public static void main(String [] args){
		acaraTV a;
		a=new acaraTV();
		
		a.setStasiunTV("TransTV");
		a.setAcara("Mozaik islam");
		a.cetak();
	}
}
