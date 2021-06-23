package muzikApp;

import java.util.ArrayList;

public class user {

	public String username;
	public String password;
	public String tur;
	public String ulke;

	public String pop = "0";
	public String caz = "0";
	public String klasik = "0";

	public ArrayList<String> popList = new ArrayList<String>();
	public ArrayList<String> cazList = new ArrayList<String>();
	public ArrayList<String> klasikList = new ArrayList<String>();

	public user(String username, String password, String pop, String caz, String klasik, String tur, String ulke) throws NumberFormatException, Exception {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.tur = tur;
		this.ulke = ulke;
		this.pop = pop;
		this.caz = caz;
		this.klasik = klasik;
		this.guncelle();
	}

	public void guncelle() throws NumberFormatException, Exception {
		// TODO Auto-generated method stub
		String[] popIds = this.pop.split(" ");
		String[] cazIds = this.caz.split(" ");
		String[] klasikIds = this.klasik.split(" ");
		for (int i = 0; i < popIds.length; i++) {
			if(!baglanti.sarkiVarMi(Integer.parseInt(popIds[i]))){
				popIds[i]="0";
			}
		}
		for (int i = 0; i < cazIds.length; i++) {
			if(!baglanti.sarkiVarMi(Integer.parseInt(cazIds[i]))){
				cazIds[i]="0";
			}
		}
		for (int i = 0; i < klasikIds.length; i++) {
			if(!baglanti.sarkiVarMi(Integer.parseInt(klasikIds[i]))){
				klasikIds[i]="0";
			}
		}
		for (int i = 0; i < popIds.length; i++) {
			if(Integer.parseInt(popIds[i]) != 0){
			try {
				String sarki = baglanti.sarkiIsimBul(Integer.parseInt(popIds[i]));
				popList.add(sarki);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// System.out.println("hata");
			}
			}
		}
		for (int i = 0; i < cazIds.length; i++) {
			if(Integer.parseInt(cazIds[i]) != 0){
			try {
				String sarki = baglanti.sarkiIsimBul(Integer.parseInt(cazIds[i]));
				cazList.add(sarki);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// System.out.println("hata");
			}
			}
		}
		for (int i = 0; i < klasikIds.length; i++) {
			if(Integer.parseInt(klasikIds[i]) != 0){
				try {
					String sarki = baglanti.sarkiIsimBul(Integer.parseInt(klasikIds[i]));
					klasikList.add(sarki);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					// System.out.println("hata");
				}
			}
			
		}
	}

}
