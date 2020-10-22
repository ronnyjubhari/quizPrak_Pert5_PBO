import java.util.Scanner;

public class quizPrak{
	public static void main(String[] args)
	{
		String nama;
		char merek, tipe;
		int jUnit;
		long harga = 0;
		long bayar, totHarga, kembalian;
		boolean loop = true;

		Scanner input = new Scanner(System.in);		
		
		System.out.println("Merek       Tipe            Harga   ");
		System.out.println("          Meja (M)       Rp. 95.000 ");
		System.out.println("  G  	  Kursi (K)      Rp. 125.000");
		System.out.println("    	  Lemari (L)     Rp. 450.000");
		System.out.println("    	  Meja (M)       Rp. 115.000");
		System.out.println("  O  	  Kursi (K)      Rp. 135.000");
		System.out.println("    	  Lemari (L)     Rp. 550.000");
		
		System.out.println("");
		System.out.print("Masukkan Nama : ");
		nama= input.nextLine();
		
		while(loop)
    	{
    		System.out.print("Masukkan Merek (G/O) : ");
			merek= input.next().charAt(0);
    		switch(merek)
	    	{
	    		case 'G' :
	    			System.out.print("Silahkan pilih Tipe (M/K/L) : ");
              		tipe = input.next().charAt(0);
              		if (tipe == 'M'){
              			harga = 95000;
              		}
              		else if (tipe == 'K'){
              			harga = 125000;
              		}
              		else if (tipe == 'L'){
              			harga = 450000;
              		}
              		else{
              			System.out.println("Tipe yg anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;              			
              		}
              		              		
	    			loop = false;
	    			break;
	    			
	    		case 'O' :
	    			System.out.print("Silahkan pilih Tipe (M/K/L) : ");
              		tipe = input.next().charAt(0);
              		if (tipe == 'M'){
              			harga = 115000;
              		}
              		else if (tipe == 'K'){
              			harga = 135000;
              		}
              		else if (tipe == 'L'){
              			harga = 550000;
              		}
              		else{
              			System.out.println("Tipe yg anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;
              			
              		}
              		
	    			loop = false;
	    			break;
	    			
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
    	}
    	
		System.out.print("Jumlah Unit Yang Diinginkan : ");
		jUnit= input.nextInt();
		
		totHarga = jUnit * harga;
		System.out.println("Total Harga : Rp. " + totHarga);
		
		System.out.print("Uang Pembayaran : Rp. ");
		bayar = input.nextLong();
		kembalian = bayar - totHarga; 
		
		System.out.print("\n\n"); 	   	
    	System.out.println("-------------STRUK-------------");    	
		System.out.println("Nama         : " + nama);
		System.out.println("Total Harga  : Rp. " + totHarga);
		System.out.println("Bayar        : Rp. " + bayar);
		System.out.println("Kembalian    : Rp. " + kembalian);		
	}
}