package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//değişken isimlendirmeleri java'da camelCase yazılır
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu ="";
		
		if(dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		} else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı kredi","Maaşını halkbanktan","mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		int x = 115;
		int y = 90;
		int z = 25;
		z = x%z;
		System.out.println(z);
		
		y = x/y;
		System.out.println(y);
         
	}

}
