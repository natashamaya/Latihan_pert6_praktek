class Siswa{
	int nrp;
	String nama;
	
	public void setNrp(int i){
		nrp=i;
	}
	public void setNama(String i){
		nama=i;
	}
}

public class LatihanPert6_bagianC_2 {
	public static void main(String [] args){
		Siswa anak=new Siswa();
		anak.setNrp(5);
		anak.setNama("budi");
		System.out.println(anak.nrp);
		System.out.println(anak.nama);
		
	}
}