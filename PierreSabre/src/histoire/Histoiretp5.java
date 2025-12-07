package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class Histoiretp5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("kumi", 10);
		Yakuza yaku = new Yakuza("yaku le noir ", "whisky", 30, "Warsang");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "Sake", "miyamoto", 80);
		Traitre mosako = new Traitre("Miyamoto", "whisky", "Mosako", 100);
		mosako.FaireLeGentil();;
		mosako.ranconner(kumi);
		mosako.ranconner(chonin);
		mosako.ranconner(marco);
		akimoto.Faireconnaissance(mosako);
		mosako.FaireLeGentil();
		mosako.Faireconnaissance(roro);
		
		
	}

}
