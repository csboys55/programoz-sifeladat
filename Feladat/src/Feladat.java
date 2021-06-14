import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
/*
 * 1. feladat – Programozás Összesen: 60 pont
Európa legmagasabb épületei
A következő feladatban Európa legmagasabb épületeinek adataival kell dolgoznia.
A megoldás során vegye figyelembe a következőket:
 A képernyőre írást igénylő részfeladatok eredményének megjelenítése előtt írja a
képernyőre a feladat sorszámát (például:3. feladat:)!
 Az egyes feladatokban a kiírásokat a minta szerint készítse el!
 Az ékezetmentes kiírás is elfogadott.
 A program megírásakor a fájlban lévő adatok helyes szerkezetét nem kell
ellenőriznie, feltételezheti, hogy a rendelkezésre álló adatok a leírtaknak
megfelelnek.
 Megoldását úgy készítse el, hogy az azonos szerkezetű, de tetszőleges bemeneti
adatok mellett is helyes eredményt adjon!
1. A feladat megoldásához hozzon létre grafikus vagy konzolalkalmazást (projektet)
Legmagasabb azonosítóval!
2. Az UTF-8 kódolású legmagasabb.txt állomány Európa legmagasabb épületeinek
adatait tartalmazza.
Az épület nevét, városát és országát az épület magassága (m, valós szám), az emeletek
száma és az épület építésének éve követi. Az adatokat pontosvessző választja el.
Olvassa be a legmagasabb.txt állományban lévő adatokat és tárolja el egy olyan
adatszerkezetben, amely a további feladatok megoldására alkalmas! A fájlban
legfeljebb 1000 sor lehet. Ügyeljen arra, hogy az állomány első sora az adatok fejlécét
tartalmazza!
3. Határozza meg és írja ki a képernyőre a minta szerint, hogy hány épület található az
állományban!
4. Határozza meg és írja ki a képernyőre a minta szerint az állományban található
épületek emeleteinek összegét!
5. Határozza meg és írja ki a képernyőre a minta szerint a legmagasabb épület adatait!
Feltételezheti, hogy nem alakult ki holtverseny.
 */
public class Feladat {

	public static void main(String[] args) {
		
		Épület[] épületek= new Épület[1000];
		
		
		try {
			System.setProperty("fájl beolvasás", "UTF-8");
			BufferedReader br = new BufferedReader(new FileReader("legmagasabb.txt"));
			String sor="";
			br.readLine();
			int szamlalo=0;
			while (sor!=null) {
				sor=br.readLine();
				if ((sor!=null)&&szamlalo<1000) {   //1000-nél kevesebb sornak kell lennie.
					String[] db=sor.split(";"); //split feldarabolásra
					épületek[szamlalo]=new Épület(db[0], db[1], db[2], Integer.parseInt(db[3]), 
							Integer.parseInt(db[4]), Integer.parseInt(db[5]));
				
				}
				szamlalo++;
			}
			
					br.close();
		} catch (IOException e) {}
//		for (int i = 0; i<1000; i++) {
//			
//		if (épületek[i]!=null) {
//		System.out.println(épületek[i].toString());
//				}
		
//			}
		int összesépület=0;
		for (int i = 0; i<1000; i++) {
			
			if (épületek[i]!=null) {
			összesépület++;
				}
			}
		System.out.println("3. feladat: Épületek száma: " + összesépület + " db");
		//meg kell határozni az épületek emeleteinek összegét
		int emeletekösszege=0;
		for (int i = 0; i<összesépület; i++) {
			emeletekösszege=emeletekösszege+épületek[i].getEmelet();
			
			
		}
		System.out.println("4. feladat: Emeletek összege: " + emeletekösszege);
	
		// ki kell iratni a legmagasabb épület adatait
		int legmagasabbépület=0;
		for (int i = 0; i<összesépület; i++) {
			if (épületek[i].getMagasság()>épületek[legmagasabbépület].getMagasság()) {
				legmagasabbépület=i;
				
				
			}
		
		}
		System.out.println(épületek[legmagasabbépület].toString());
		
	}
}