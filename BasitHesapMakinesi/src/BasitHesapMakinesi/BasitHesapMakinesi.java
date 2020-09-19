package BasitHesapMakinesi;

      import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner bilgi = new Scanner(System.in);
		
		
		System.out.println("1. Sayýyý Giriniz = ");
		 double sayi1 = bilgi.nextDouble();
		
		System.out.println("2. Sayýyý Giriniz = ");
		 double sayi2 = bilgi.nextDouble();

		System.out.println("");
		 
		System.out.println("1. Toplama");
		
		System.out.println("");

		System.out.println("2. Çýkarma");
		
		System.out.println("");

		System.out.println("3. Çarpma");
		
		System.out.println("");

		System.out.println("4. Bölme");
		
		System.out.println("");


		
		
		System.out.println("Ýþlem Seçiniz = ");
		int islem = bilgi.nextInt();
		
		
		switch( islem ) {
		case 1 :
			System.out.println("Ýþlemin Toplamý = " + (sayi1+sayi2));
		break;
		
		case 2 :
			System.out.println("Ýþlemin Toplamý = " + (sayi1-sayi2));
		break;

		case 3 :
			System.out.println("Ýþlemin Toplamý = " + (sayi1*sayi2));
		break;
		

		case 4 :
			System.out.println("Ýþlemin Toplamý = " + (sayi1/sayi2));
		break;
		
		default :
			System.out.println("Hatalý Ýþlem Yaptýnýz...");
		break;

		}

		
		

	}

}
