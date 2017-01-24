class Binatang{
	String nama;
	int kaki= 4;

	void makan(String a){
		System.out.println(nama + " bisa makan " + a);
	}

	void tidur(){
		System.out.println("bisa tidur");
	}

}



class java{
	public static void main(String[] args) {
		Binatang sapi =new Binatang();
		sapi.nama = " jainal ";
		sapi.makan( " rumput");

		Binatang serigala =new Binatang();
		serigala.nama=" fendi ";
		serigala.makan( " daging");

		Binatang onta =new Binatang();
		onta.nama=" krisna ";
		onta.makan( " jainal");
	}
}