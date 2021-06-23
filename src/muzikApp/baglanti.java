package muzikApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {

	static int x = 1;

	static ResultSet sanatcilariListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}
		String sql = "select * from sanatci";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet sanatciSarkiListele(String sanatci) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}
		String sql = String.format("select * from sarki where sanatci=%d", sanatciIDBul(sanatci));

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet sarkilariListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from sarki";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet top10Listele(String tur) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where tur='%s' order by dinlenmeSayisi desc", tur);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet top10Listele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from sarki ORDER BY dinlenmeSayisi desc";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet albumdekiSarkilariListele(String album) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where album=%d", albumIDBul(album));

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// conn.close();
		return rs;
	}

	static ResultSet poplariListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from sarki where tur='pop'";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet cazlariListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from sarki where tur='caz'";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet klasikleriListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from sarki where tur='klasik'";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet sarkiGetir(String sarkiAdi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where sarkiAdi='%s'", sarkiAdi);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet albumleriListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}
		String sql = "select * from album";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static ResultSet kullanicilariListele() throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from kullanici";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		// conn.close();
		return rs;
	}

	static void kullaniciGuncelle(int id, String ad, String email, String sifre, String abonelikTuru, String ulke,
			String pop, String caz, String klasik) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format(
				"update kullanici set kullaniciAdi='%s', email='%s',sifre='%s',abonelikTuru='%s',ulke='%s',pop='%s',caz='%s',klasik='%s' where kullaniciId=%d",
				ad, email, sifre, abonelikTuru, ulke, pop, caz, klasik, id);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void kullaniciEkle(String ad, String email, String sifre, String abonelikTuru, String ulke)
			throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format(
				"INSERT INTO kullanici (kullaniciAdi,email,sifre,abonelikTuru,ulke) VALUES('%s','%s','%s','%s','%s')",
				ad, email, sifre, abonelikTuru, ulke);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void kullaniciPopGuncelle(String liste, String kullaniciAdi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("update kullanici set pop='%s' where kullaniciAdi='%s'", liste, kullaniciAdi);

		Statement st = conn.createStatement();

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		conn.close();
	}

	static void kullaniciCazGuncelle(String liste, String kullaniciAdi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("update kullanici set caz='%s' where kullaniciAdi='%s'", liste, kullaniciAdi);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void kullaniciKlasikGuncelle(String liste, String kullaniciAdi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("update kullanici set klasik='%s' where kullaniciAdi='%s'", liste, kullaniciAdi);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void sanatciGuncelle(int id, String ad, String ulke) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("update sanatci set sanatciAdi='%s', ulke='%s' where sanatciId=%d", ad, ulke, id);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void sarkiGuncelle(int id, String ad, String tarih, String sanatci, String album, String tur, String sure,
			int sayi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format(
				"update sarki set sarkiAdi='%s', tarih='%s',sanatci='%s',album='%s',tur='%s',sure='%s',dinlenmeSayisi=%d where sarkiId=%d",
				ad, tarih, sanatci, album, tur, sure, sayi, id);

		Statement st = conn.createStatement();

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO: handle exception

		}

		// conn.close();
	}

	static void sarkiDinle(String sarkiAdi) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		int count = 0;
		count = dinlenmeSayisi(sarkiAdi);

		count++;

		String sql = String.format("update sarki set dinlenmeSayisi=%d where sarkiAdi='%s'", count, sarkiAdi);

		Statement st = conn.createStatement();

		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Hata");
		}

		conn.close();
	}

	static int dinlenmeSayisi(String sarki) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where sarkiAdi='%s'", sarki);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		count = rs.getInt("dinlenmeSayisi");

		conn.close();

		return count;
	}

	static void albumGuncelle(int id, String ad, String tarih, String tur) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("update album set albumAdi='%s', tarih='%s',tur='%s' where albumId=%d", ad, tarih,
				tur, id);

		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	static void sanatciSil(String sanatci) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("delete from sanatci where sanatciAdi='%s'", sanatci);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	static void albumSil(String album) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql2 = String.format("delete from sarki where album=%d", albumIDBul(album));

		String sql = String.format("delete from album where albumAdi='%s'", album);
		
		Statement st2 = conn.createStatement();
		st2.executeUpdate(sql2);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	static void sarkiSil(String sarki) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("delete from sarki where sarkiAdi='%s'", sarki);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	static void SanatciEkle(String ad, String ulke) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("INSERT INTO sanatci (sanatciAdi,ulke) VALUES('%s','%s')", ad, ulke);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	static void SarkiEkle(String ad, String tarih, int sanatci, int album, String tur, String sure, int sayi)
			throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format(
				"INSERT INTO sarki (sarkiAdi,tarih,sanatci,album,tur,sure,dinlenmeSayisi) VALUES('%s','%s','%d','%d','%s','%s',%d)",
				ad, tarih, sanatci, album, tur, sure, sayi);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();

		/*
		 * if (albumVarMi(album) == 1) { AlbumEkle(album, tarih, tur); } if
		 * (sanatciVarMi(sanatci) == 1) { SanatciEkle(sanatci, null); }
		 */
	}

	static void AlbumEkle(String albumAd, String tarih, String tur) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("INSERT INTO album (albumAdi,tarih,tur) VALUES('%s','%s','%s')", albumAd, tarih,
				tur);

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	static void connect(String tablo) throws Exception {

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from " + tablo;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {

			System.out.println(rs.getInt("sarkiID") + " " + rs.getString("sarkiAdi") + " " + rs.getString("tarih") + " "
					+ rs.getString("Sanatci") + " " + rs.getString("Album") + " " + rs.getString("tur") + " "
					+ rs.getString("sure") + " " + rs.getString("dinlenmeSayisi"));
		}

		conn.close();
	}

	static int albumVarMi(String albumAdi) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from album");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			if (rs.getString("albumAdi").compareTo(albumAdi) > 0) {
				conn.close();
				return 0;
			}
		}

		conn.close();

		return 1;
	}

	static int sanatciVarMi(String sanatciAdi) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}
		String sql = String.format("select * from sanatci");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			if (rs.getString("sanatciAdi").compareTo(sanatciAdi) > 0) {
				// rs.getString("sanatciAdi").equals(sanatciAdi)==false
				conn.close();
				return 0;
			}
		}

		conn.close();

		return 1;
	}

	static boolean sarkiVarMi(int sarkiID) throws Exception {
		// TODO Auto-generated method stub

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}
		String sql = String.format("select * from sarki");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			if (rs.getInt("sarkiID") == sarkiID) {
				conn.close();
				return true;
			}
		}

		conn.close();

		return false;
	}

	static String albumBul(int albumID) throws Exception {
		// TODO Auto-generated method stub
		String album = null;

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = "select * from album where albumID=" + albumID;

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		album = rs.getString("albumAdi");

		conn.close();

		return album;
	}

	static int albumIDBul(String albumAdi) throws Exception {
		// TODO Auto-generated method stub
		int albumID = 0;

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from album where albumAdi='%s'", albumAdi);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		albumID = rs.getInt("albumID");

		conn.close();

		return albumID;
	}

	static String albumTurBul(String albumAdi) throws Exception {
		// TODO Auto-generated method stub
		String tur = "";

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from album where albumAdi='%s'", albumAdi);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		tur = rs.getString("tur");

		conn.close();

		return tur;
	}

	static String sanatciBul(int sanatciID) throws Exception {
		// TODO Auto-generated method stub
		String sanatci = null;

		Connection conn = null;

		

		try {
			if (x == 1) {
				conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
			} else {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
						"root");
			}

			String sql = "select * from sanatci where sanatciID=" + sanatciID;
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			rs.next();

			sanatci = rs.getString("sanatciAdi");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			sanatci="Silinen Sanatçý";
		}

		return sanatci;
	}

	static int sanatciIDBul(String sanatci) throws Exception {
		// TODO Auto-generated method stub
		int sanatciID = 0;

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sanatci where sanatciAdi='%s'", sanatci);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		sanatciID = rs.getInt("sanatciID");

		conn.close();

		return sanatciID;
	}

	static int sarkiIDBul(String sarki) throws Exception {
		// TODO Auto-generated method stub
		int sarkiID = 0;

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where sarkiAdi= '%s'", sarki);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		sarkiID = rs.getInt("sarkiID");

		conn.close();

		return sarkiID;
	}

	static String sarkiIsimBul(int sarkiID) throws Exception {
		// TODO Auto-generated method stub
		String sarkiAdi = "";

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where sarkiID= %d", sarkiID);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		try {
			sarkiAdi = rs.getString("sarkiAdi");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		conn.close();

		return sarkiAdi;
	}

	public static String sarkiTurBul(String sarki) throws Exception {
		// TODO Auto-generated method stub
		String tur = "";

		Connection conn = null;

		if (x == 1) {
			conn = DriverManager.getConnection("jdbc:sqlite:database/music.db");
		} else {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/music?serverTimezone=Turkey", "root",
					"root");
		}

		String sql = String.format("select * from sarki where sarkiAdi= '%s'", sarki);

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		rs.next();

		tur = rs.getString("tur");

		conn.close();

		return tur;
	}
}
