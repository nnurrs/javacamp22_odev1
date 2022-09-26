package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "   Bugün hava çok güzel.   ";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayısı: "+mesaj.length());
		System.out.println("5. Eleman: "+mesaj.charAt(4)); //dizi olarak görüp parametredeki elemanı getirme
		System.out.println(mesaj.concat(" Yaşasın!")); //yeni bir string oldu(birleştirme)
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler,0); //karakterleri al // char array ister 
                                           //0 dan 4 e kadar elemanları karakterler arrayinin 0. indeksinden itibaren ata
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //karakterin kaçıncı elemanda olduğunu bulur
        System.out.println(mesaj.lastIndexOf("a")); //kaçıncı elemanda olduğunu bulmak için sağdan aramaya başlar
        */
        
		String yeniMesaj = mesaj.replace(' ','-'); //yeni bir metin verir, asıl metni değiştirmez
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); //bir metnin içinden parça almak (2. indexden itibaren al)
		System.out.println(mesaj.substring(2,5)); //2 den başla 4 e kadar al
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //küçük harflere dönüştür
		System.out.println(mesaj.toUpperCase()); 
		
		System.out.println(mesaj.trim()); //baştaki ve sondaki boşlukları atar
	}

}
