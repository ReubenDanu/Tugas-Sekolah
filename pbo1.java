class Kendaraan{
	public int roda;
	public String warna;
	public String seriBus; 
	public Kendaraan(int roda,String warna){
		this.roda = roda;
		this.warna = warna;
	}

	public void berjalan(String objek){
		System.out.println(objek + " berjalan");
	}

	public void berhenti(String objek){
		System.out.println(objek + " berhenti");
	}

	public void display(){
		System.out.println("\n===Spesifikasi===");
		System.out.println(+ this.roda);
		System.out.println(this.warna);
	}
}

class Sepeda extends Kendaraan{
	public String seriSepeda;


	public Sepeda(int roda, String warna,String seriSepeda){
		super(roda,warna);
		this.seriSepeda = seriSepeda;
	}

	public void display(){
		super.display();
		System.out.println(this.seriSepeda + "\n");
	}
}

class Mobil extends Kendaraan{
	public String seriMobil;

	public Mobil(int roda, String warna,String seriMobil){
		super(roda,warna);
		this.seriMobil = seriMobil;
	}

	public void display(){
		super.display();
		System.out.println(this.seriMobil + "\n");
	}
}

class Bus extends Kendaraan{
	public String seriBus;

	public Bus(int roda, String warna,String seriBus){
		super(roda,warna);
		this.seriBus = seriBus;
	}

	public void display(){
		super.display();
		System.out.println(this.seriBus + "\n");
	}
}

public class pbo1{
	static void berjalan(){
		System.out.println("jalan");
	}
	public static void main(String[] args){
		
		Sepeda sepeda1 = new Sepeda(1, "merah", "bmx");

		Mobil mobil1 = new Mobil(4,"hitam", "BMW");

		Bus bus1 = new Bus(6, "design jogjatrans", "mercedes");


		sepeda1.berjalan("sepeda");
		sepeda1.berhenti("sepeda");
		sepeda1.display();

		mobil1.berjalan("sepeda");
		mobil1.berhenti("sepeda");
		mobil1.display();		

		bus1.berjalan("sepeda");
		bus1.berhenti("sepeda");
		bus1.display();


	}
}
	