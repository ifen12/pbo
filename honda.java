class Honda{
	String warna;
	int ban= 4;

	void belok(String belokke){
		System.out.println( " BELOK KE ARAH " + belokke);
	}

	void gerak(String arahke){
		System.out.println(" BERGERAK KE ARAH " +arahke);
	}
}

class objek{
	public static void main(String[] args) {
		
		Honda jazz = new Honda();
		jazz.warna = " merah ";
		jazz.belok("kiri");
		jazz.gerak("depan");


		Honda brio = new Honda();
		brio.warna = " hijau ";
		brio.belok(" kanan ");
		brio.gerak(" belakang ");
	}
}