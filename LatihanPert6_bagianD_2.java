class lat4{
	private int nrp;
	private String nama;
	
	
public void setNRP(int nrp){
	this.nrp = nrp;
}	
public void setNama(String nama){
	this.nama = nama; 
}

  
   public String getNama(){
   	return nama;
   }
   public int getNRP(){
   	return nrp;
   }
   


public static void main(String [] args){
		lat4 mhs = new lat4();
		mhs.setNRP(7201);
		mhs.setNama("Muhammad Ali");
		System.out.println("Nama mahasiswa "+mhs.getNama()+ "NRP  "+mhs.getNRP());
	}
}