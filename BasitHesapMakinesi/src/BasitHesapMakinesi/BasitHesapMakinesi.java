package BasitHesapMakinesi;

      import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner bilgi = new Scanner(System.in);
		
		
		System.out.println("1. Say�y� Giriniz = ");
		 double sayi1 = bilgi.nextDouble();
		
		System.out.println("2. Say�y� Giriniz = ");
		 double sayi2 = bilgi.nextDouble();

		System.out.println("");
		 
		System.out.println("1. Toplama");
		
		System.out.println("");

		System.out.println("2. ��karma");
		
		System.out.println("");

		System.out.println("3. �arpma");
		
		System.out.println("");

		System.out.println("4. B�lme");
		
		System.out.println("");


		
		
		System.out.println("��lem Se�iniz = ");
		int islem = bilgi.nextInt();
		
		
		switch( islem ) {
		case 1 :
			System.out.println("��lemin Toplam� = " + (sayi1+sayi2));
		break;
		
		case 2 :
			System.out.println("��lemin Toplam� = " + (sayi1-sayi2));
		break;

		case 3 :
			System.out.println("��lemin Toplam� = " + (sayi1*sayi2));
		break;
		

		case 4 :
			System.out.println("��lemin Toplam� = " + (sayi1/sayi2));
		break;
		
		default :
			System.out.println("Hatal� ��lem Yapt�n�z...");
		break;

		}

		
		

	}

}
