class Buku{
	
	String pengarang,judul;
	
}




public class LatihanPert6_bagianD_1
{
	public static void main(String[]args){
		Buku a,b;
		a=new Buku();
		b=new Buku();
		
		
		a.pengarang="Felix siauw";
		a.judul="Beyond The Inspiration";
		b.pengarang="Budi Raharjo";
		
		b.judul="mudah belajar java";
		System.out.println("Judul: "+a.judul+"pengarang:"+a.pengarang);
		System.out.println("Judul: "+b.judul+"pengarang:"+b.pengarang);
	}
	
}
