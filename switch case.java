import java.util.Scanner;
class switch_case{
 	public static void main (String[] args){
		Scanner masuk = new Scanner(System.in);
		int pilihan;
		System.out.println("1.Persigi Panjang");
		System.out.println("2.Lingkaran");
		System.out.print("Pilih Bangun Datar : ");
		pilihan = masuk.nextInt();

		switch (pilihan) {
		case 1:
			System.out.print("Panjang :" );
			int p = masuk.nextInt();
			System.out.print("Lebar : ");
			int l = masuk.nextInt();
			System.out.println("Hasil : " + p*l);
			break;
		case 2:
			System.out.print("Jari-Jari :" );
			double r = masuk.nextInt();
			r = Math.pow(r, 2);
			System.out.println("Hasil : " + 3.142857142857143*r);
			break;
		default:
			System.out.println("Input Yang Dimasukkan Salah!!");
		}
	}		
	
}