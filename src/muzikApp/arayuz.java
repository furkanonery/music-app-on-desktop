package muzikApp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class arayuz extends JFrame {

	/**
	 * 
	 */

	JList<Object> userpoplist = new JList<Object>();
	JList<Object> usercazlist = new JList<Object>();
	JList<Object> userklasiklist = new JList<Object>();
	JList<Object> otherpoplist = new JList<Object>();
	JList<Object> othercazlist = new JList<Object>();
	JList<Object> otherklasiklist = new JList<Object>();

	DefaultListModel<Object> userPop = new DefaultListModel<Object>();
	DefaultListModel<Object> userCaz = new DefaultListModel<Object>();
	DefaultListModel<Object> userKlasik = new DefaultListModel<Object>();
	DefaultListModel<Object> otherPop = new DefaultListModel<Object>();
	DefaultListModel<Object> otherCaz = new DefaultListModel<Object>();
	DefaultListModel<Object> otherKlasik = new DefaultListModel<Object>();

	JScrollPane allPopPane = new JScrollPane();
	JScrollPane allCazPane = new JScrollPane();
	JScrollPane allKlasikPane = new JScrollPane();

	JList<Object> allpoplist = new JList<Object>();
	JList<Object> allcazlist = new JList<Object>();
	JList<Object> allklasiklist = new JList<Object>();

	DefaultListModel<Object> allPop = new DefaultListModel<Object>();
	DefaultListModel<Object> allCaz = new DefaultListModel<Object>();
	DefaultListModel<Object> allKlasik = new DefaultListModel<Object>();

	JScrollPane allAlbumPane = new JScrollPane();
	JScrollPane allUserPane = new JScrollPane();

	JList<Object> allAlbumlist = new JList<Object>();
	JList<Object> allUserlist = new JList<Object>();

	DefaultListModel<Object> allAlbum = new DefaultListModel<Object>();
	DefaultListModel<Object> allUser = new DefaultListModel<Object>();

	JScrollPane sanatciSarkiPane1 = new JScrollPane();
	JScrollPane sanatciSarkiPane2 = new JScrollPane();

	JList<Object> sanatciSarkiList1 = new JList<Object>();
	JList<Object> sanatciSarkiList2 = new JList<Object>();

	DefaultListModel<Object> sanatciSarkiDefaultList1 = new DefaultListModel<Object>();
	DefaultListModel<Object> sanatciSarkiDefaultList2 = new DefaultListModel<Object>();

	JScrollPane popTop10Pane = new JScrollPane();
	JList<Object> popTop10List = new JList<Object>();
	DefaultListModel<Object> popTop10DefaultList = new DefaultListModel<Object>();

	JScrollPane cazTop10Pane = new JScrollPane();
	JList<Object> cazTop10List = new JList<Object>();
	DefaultListModel<Object> cazTop10DefaultList = new DefaultListModel<Object>();

	JScrollPane klasikTop10Pane = new JScrollPane();
	JList<Object> klasikTop10List = new JList<Object>();
	DefaultListModel<Object> klasikTop10DefaultList = new DefaultListModel<Object>();

	JScrollPane genelTop10Pane = new JScrollPane();
	JList<Object> genelTop10List = new JList<Object>();
	DefaultListModel<Object> genelTop10DefaultList = new DefaultListModel<Object>();

	JScrollPane albumPane = new JScrollPane();
	JList<String> albumlistesi = new JList<String>();
	DefaultListModel<String> albumModel = new DefaultListModel<String>();

	JScrollPane sanatciPane = new JScrollPane();
	JList<String> sanatcilistesi = new JList<String>();
	DefaultListModel<String> sanatciModel = new DefaultListModel<String>();

	JScrollPane sanatciSilPane = new JScrollPane();
	JList<String> sanatciSilmeListesi = new JList<String>();
	DefaultListModel<String> sanatciSilModel = new DefaultListModel<String>();

	JScrollPane albumSilPane = new JScrollPane();
	JList<String> albumSilListesi = new JList<String>();
	DefaultListModel<String> albumSilModel = new DefaultListModel<String>();

	JScrollPane sarkiSilPane = new JScrollPane();
	JList<String> sarkiSilListesi = new JList<String>();
	DefaultListModel<String> sarkiSilModel = new DefaultListModel<String>();

	JLabel dinlenenSarkiLabel = new JLabel("");

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userNameText;
	private JPasswordField userPasswordText;
	private JLabel userNameLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
	private JLabel userPswLabel = new JLabel("\u015Eifre:");
	private JButton userGirisButton = new JButton("Giri\u015F Yap");
	private JButton userKayitButton = new JButton("Kay\u0131t Ol");
	private JLabel userKayitLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
	private JLabel userKayitLabel2 = new JLabel("E-Mail:");
	private JLabel userKayitLabel3 = new JLabel("\u015Eifre:");
	private JLabel userKayitLabel4 = new JLabel("Abonelik T\u00FCr\u00FC:");
	private JLabel userKayitLabel5 = new JLabel("\u00DClke:");
	private final JPanel loginPanel = new JPanel();
	private final JPanel adminPanel = new JPanel();
	private final JPanel userPanel = new JPanel();
	private final JPanel anaSayfa = new JPanel();
	private JTextField sanatciEkleAd;
	private JTextField sanatciEkleUlke;
	private JTextField sarkiText;
	private JTextField tarihText;
	private JTextField sanatciText;
	private JTextField albumText;
	private JTextField turText;
	private JTextField sureText;
	private JTextField sayiText;
	@SuppressWarnings("unused")
	private int ekleme = 0;
	JLabel sarkiLabel1 = new JLabel("\u015Eark\u0131 Ad\u0131:");
	JLabel sarkiLabel2 = new JLabel("Tarih:");
	JLabel sarkiLabel3 = new JLabel("Sanatçý:");
	JLabel sarkiLabel4 = new JLabel("Albüm:");
	JLabel sarkiLabel5 = new JLabel("Tür:");
	JLabel sarkiLabel6 = new JLabel("Süre:");
	JLabel sarkiLabel7 = new JLabel("Dinlenme Sayýsý:");
	String girisYapanKullanici = "";
	private final JButton sarkiEkle = new JButton("Ekle");
	JLabel ayniKullaniciLabel = new JLabel("Bu kullan\u0131c\u0131 ad\u0131 daha \u00F6nce al\u0131nm\u0131\u015F");

	ArrayList<user> users = new ArrayList<user>();

	private JTextField albumAdiText;
	private JTextField albumTarihText;
	private JTextField albumTurText;
	JButton albumEkleButton = new JButton("Alb\u00FCm Ekle");
	JLabel albumLabel1 = new JLabel("Alb\u00FCm Ad\u0131:");
	JLabel albumLabel4 = new JLabel("Tarih:");
	JLabel albumLabel5 = new JLabel("T\u00FCr:");
	JButton albumEkle = new JButton("Ekle");
	private final JLabel hataliGirisLabel = new JLabel(
			"Kullan\u0131c\u0131 ad\u0131 ya da \u015Fifre yanl\u0131\u015F");
	private final JButton cikisYapButton = new JButton("\u00C7\u0131k\u0131\u015F Yap");
	private final JButton userpoplistButton = new JButton("Dinle");
	private final JButton usercazlistButton = new JButton("Dinle");
	private final JButton othercazlistButton = new JButton("Dinle");
	private final JButton userklasiklistButton = new JButton("Dinle");
	private final JButton otherklasiklistButton = new JButton("Dinle");
	private final JButton otherpoplistButton = new JButton("Dinle");
	private final JButton sanatciSilBtn = new JButton("Sil");
	private final JButton sarkiSilBtn = new JButton("Sil");
	private final JButton albumSilBtn = new JButton("Sil");

	JLabel girisYapanLabel = new JLabel("");
	private final JButton otherpoplistAddButton = new JButton("Ekle");
	private final JButton othercazlistAddButton = new JButton("Ekle");
	private final JButton otherklasiklistaddButton = new JButton("Ekle");
	private final JButton otherpoplistAllAddButton = new JButton("T\u00FCm\u00FCn\u00FC Ekle");
	private final JButton othercazlistAllAddButton = new JButton("T\u00FCm\u00FCn\u00FC Ekle");
	private final JButton otherklasiklistAlladdButton = new JButton("T\u00FCm\u00FCn\u00FC Ekle");
	private final JLabel lblNewLabel_1 = new JLabel("POP");
	private final JLabel lblCaz = new JLabel("CAZ");
	private final JLabel lblKlasik = new JLabel("KLAS\u0130K");
	private JTextField userKayitUsername;
	private JTextField userKayitEmail;
	private JTextField userKayitSifre;
	private JTextField userKayitTur;
	private JTextField userKayitUlke;
	private final JButton userKayitBtn = new JButton("Kayd\u0131 Tamamla");
	JButton[] kullanicilar = new JButton[50];
	private final JButton btnNewButton_1 = new JButton("Geri D\u00F6n");
	private final JButton anaToSarkilar = new JButton("T\u00FCm \u015Eark\u0131lar");
	private final JPanel sarkilarPanel = new JPanel();
	private final JButton sarkilarToAna = new JButton("Geri D\u00F6n");
	private final JButton anaToAlbum = new JButton("Alb\u00FCmleri Takip Et");
	private final JButton anaToSanatci = new JButton("Sanat\u00E7\u0131lar\u0131 Takip Et");
	private final JPanel albumlerPanel = new JPanel();
	private final JButton albumlerToAna = new JButton("Geri D\u00F6n");
	private final JPanel sanatcilarPanel = new JPanel();
	private final JButton sanatcilarToAna = new JButton("Geri D\u00F6n");
	private final JLabel dinlenenSarkiLabel2 = new JLabel("");
	private final JButton allAlbumListButton = new JButton("Alb\u00FCmdeki \u015Fark\u0131lar\u0131 listele");
	private final JButton btnListeyeEkle = new JButton("Listeye Ekle");
	private final JButton btnDinle = new JButton("Dinle");
	private final JLabel dinlenenSarkiLabel3 = new JLabel("");
	private final JButton sanatciSarkiDinleButton = new JButton("Dinle");
	private final JButton sanatciSarkiEkleButton = new JButton("Ekle");
	private final JLabel dinlenenSarkiLabel4 = new JLabel("");
	private final JLabel dinlenenSarkiLabel5 = new JLabel("");

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arayuz frame = new arayuz();
					frame.setVisible(true);
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public arayuz() throws Exception {
		// baglanti.connect("sarki");
		setType(Type.POPUP);
		setTitle("M\u00FCzik Uygulamas\u0131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		anaSayfa.add(cikisYapButton);

		cikisYapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginPanel.setVisible(true);
				anaSayfa.setVisible(false);
				hataliGirisLabel.setVisible(false);

				for (int i = 0; i < users.size(); i++) {
					kullanicilar[i].setForeground(Color.PINK);
				}

				otherCaz.clear();
				otherPop.clear();
				otherKlasik.clear();
				otherpoplistButton.setVisible(false);
				otherpoplistAddButton.setVisible(false);
				othercazlistButton.setVisible(false);
				othercazlistAddButton.setVisible(false);
				otherklasiklistButton.setVisible(false);
				otherklasiklistaddButton.setVisible(false);
				otherpoplistAllAddButton.setVisible(false);
				othercazlistAllAddButton.setVisible(false);
				otherklasiklistAlladdButton.setVisible(false);
			}
		});

		userPanel.setBackground(Color.PINK);
		userPanel.setBounds(0, 0, 1482, 953);
		contentPane.add(userPanel);
		userPanel.setLayout(null);

		// baglanti.sarkiIsimBul(740);

		JLabel userLabel = new JLabel("User");
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		userLabel.setBounds(636, 0, 270, 55);
		userPanel.add(userLabel);
		userPanel.setVisible(false);

		JScrollPane userPopPane = new JScrollPane();
		userPopPane.setBounds(257, 80, 323, 373);
		userPanel.add(userPopPane);

		JScrollPane userCazPane = new JScrollPane();
		userCazPane.setBounds(668, 80, 337, 373);
		userPanel.add(userCazPane);

		JScrollPane userKlasikPane = new JScrollPane();
		userKlasikPane.setBounds(1082, 80, 323, 373);
		userPanel.add(userKlasikPane);

		JScrollPane otherPopPane = new JScrollPane();
		otherPopPane.setBounds(257, 500, 323, 370);
		userPanel.add(otherPopPane);

		JScrollPane otherCazPane = new JScrollPane();
		otherCazPane.setBounds(668, 500, 337, 373);
		userPanel.add(otherCazPane);

		JScrollPane otherKlasikPane = new JScrollPane();
		otherKlasikPane.setBounds(1082, 500, 323, 373);
		userPanel.add(otherKlasikPane);

		otherpoplist = new JList<Object>();
		otherpoplist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		otherpoplist.setModel(otherPop);
		otherpoplist.setBounds(152, 379, 526, 200);
		otherPopPane.setViewportView(otherpoplist);

		othercazlist = new JList<Object>();
		othercazlist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		othercazlist.setModel(otherCaz);
		othercazlist.setBounds(152, 379, 526, 200);
		otherCazPane.setViewportView(othercazlist);

		otherklasiklist = new JList<Object>();
		otherklasiklist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		otherklasiklist.setModel(otherKlasik);
		otherklasiklist.setBounds(152, 379, 526, 200);
		otherKlasikPane.setViewportView(otherklasiklist);

		userpoplist = new JList<Object>();
		userpoplist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userpoplist.setModel(userPop);
		userpoplist.setBounds(152, 379, 526, 200);
		userPopPane.setViewportView(userpoplist);

		usercazlist = new JList<Object>();
		usercazlist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usercazlist.setModel(userCaz);
		usercazlist.setBounds(152, 379, 526, 200);
		userCazPane.setViewportView(usercazlist);

		userklasiklist = new JList<Object>();
		userklasiklist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userklasiklist.setModel(userKlasik);
		userklasiklist.setBounds(152, 379, 526, 200);
		userKlasikPane.setViewportView(userklasiklist);

		dinlenenSarkiLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		dinlenenSarkiLabel.setBounds(136, 903, 1317, 38);
		userPanel.add(dinlenenSarkiLabel);

		otherpoplistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(otherpoplist.getSelectedValue());
				try {
					baglanti.sarkiDinle(otherpoplist.getSelectedValue().toString());
					dinleLabel(otherpoplist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherpoplistButton.setForeground(Color.PINK);
		otherpoplistButton.setBackground(Color.DARK_GRAY);
		otherpoplistButton.setBounds(585, 504, 71, 26);

		userPanel.add(otherklasiklistButton);

		userPanel.add(otherpoplistButton);
		userpoplistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(userpoplist.getSelectedValue());
				try {
					baglanti.sarkiDinle(userpoplist.getSelectedValue().toString());
					dinleLabel(userpoplist.getSelectedValue().toString());

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		userpoplistButton.setForeground(Color.PINK);
		userpoplistButton.setBackground(Color.DARK_GRAY);
		userpoplistButton.setBounds(585, 84, 71, 26);

		userPanel.add(userpoplistButton);
		usercazlistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(usercazlist.getSelectedValue());
				try {
					baglanti.sarkiDinle(usercazlist.getSelectedValue().toString());
					dinleLabel(usercazlist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		usercazlistButton.setForeground(Color.PINK);
		usercazlistButton.setBackground(Color.DARK_GRAY);
		usercazlistButton.setBounds(1006, 84, 71, 26);

		userPanel.add(usercazlistButton);
		othercazlistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(othercazlist.getSelectedValue());
				try {
					baglanti.sarkiDinle(othercazlist.getSelectedValue().toString());
					dinleLabel(othercazlist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		othercazlistButton.setForeground(Color.PINK);
		othercazlistButton.setBackground(Color.DARK_GRAY);
		othercazlistButton.setBounds(1006, 504, 71, 26);

		userPanel.add(othercazlistButton);
		userklasiklistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(userklasiklist.getSelectedValue());
				try {
					baglanti.sarkiDinle(userklasiklist.getSelectedValue().toString());
					dinleLabel(userklasiklist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		userklasiklistButton.setForeground(Color.PINK);
		userklasiklistButton.setBackground(Color.DARK_GRAY);
		userklasiklistButton.setBounds(1405, 84, 71, 26);

		userPanel.add(userklasiklistButton);
		otherklasiklistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println(otherklasiklist.getSelectedValue());
				try {
					baglanti.sarkiDinle(otherklasiklist.getSelectedValue().toString());
					dinleLabel(otherklasiklist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherklasiklistButton.setForeground(Color.PINK);
		otherklasiklistButton.setBackground(Color.DARK_GRAY);
		otherklasiklistButton.setBounds(1405, 504, 71, 26);
		otherpoplistAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherpoplist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userPop.size(); i++) {
						if (userPop.get(i).toString().equals(otherpoplist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userPop.add(userPop.size(), otherpoplist.getSelectedValue().toString());
						userpoplist.setModel(userPop);
						String ekleme = "";
						for (int i = 0; i < userPop.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
						}
						baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherpoplistAddButton.setForeground(Color.PINK);
		otherpoplistAddButton.setBackground(Color.DARK_GRAY);
		otherpoplistAddButton.setBounds(585, 542, 71, 26);

		userPanel.add(otherpoplistAddButton);
		othercazlistAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(othercazlist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userCaz.size(); i++) {
						if (userCaz.get(i).toString().equals(othercazlist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userCaz.add(userCaz.size(), othercazlist.getSelectedValue().toString());
						usercazlist.setModel(userCaz);
						String ekleme = "";
						for (int i = 0; i < userCaz.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
						}
						baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		othercazlistAddButton.setForeground(Color.PINK);
		othercazlistAddButton.setBackground(Color.DARK_GRAY);
		othercazlistAddButton.setBounds(1006, 542, 71, 26);

		userPanel.add(othercazlistAddButton);
		otherklasiklistaddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherklasiklist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userKlasik.size(); i++) {
						if (userKlasik.get(i).toString().equals(otherklasiklist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userKlasik.add(userKlasik.size(), otherklasiklist.getSelectedValue().toString());
						userklasiklist.setModel(userKlasik);
						String ekleme = "";
						for (int i = 0; i < userKlasik.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
						}
						baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherklasiklistaddButton.setForeground(Color.PINK);
		otherklasiklistaddButton.setBackground(Color.DARK_GRAY);
		otherklasiklistaddButton.setBounds(1405, 542, 71, 26);

		userPanel.add(otherklasiklistaddButton);

		otherpoplistAllAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherpoplist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					for (int i = 0; i < otherPop.size(); i++) {
						int flag = 1;
						for (int j = 0; j < userPop.size(); j++) {
							if (otherPop.get(i).toString().equals(userPop.get(j).toString())) {
								flag = 0;
								break;
							}
						}
						if (flag == 1) {
							userPop.add(userPop.size(), otherPop.get(i).toString());
						}
					}

					userpoplist.setModel(userPop);
					String ekleme = "";
					for (int i = 0; i < userPop.size(); i++) {
						ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
					}
					baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
					// System.out.println(ekleme);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherpoplistAllAddButton.setFont(new Font("Dialog", Font.BOLD, 18));
		otherpoplistAllAddButton.setForeground(Color.PINK);
		otherpoplistAllAddButton.setBackground(Color.DARK_GRAY);
		otherpoplistAllAddButton.setBounds(297, 870, 235, 35);
		userPanel.add(otherpoplistAllAddButton);

		othercazlistAllAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					for (int i = 0; i < otherCaz.size(); i++) {
						int flag = 1;
						for (int j = 0; j < userCaz.size(); j++) {
							if (otherCaz.get(i).toString().equals(userCaz.get(j).toString())) {
								flag = 0;
								break;
							}
						}
						if (flag == 1) {
							userCaz.add(userCaz.size(), otherCaz.get(i).toString());
						}
					}
					usercazlist.setModel(userCaz);
					String ekleme = "";
					for (int i = 0; i < userCaz.size(); i++) {
						ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
					}
					baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
					// System.out.println(ekleme);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		othercazlistAllAddButton.setForeground(Color.PINK);
		othercazlistAllAddButton.setFont(new Font("Dialog", Font.BOLD, 18));
		othercazlistAllAddButton.setBackground(Color.DARK_GRAY);
		othercazlistAllAddButton.setBounds(727, 870, 235, 35);
		userPanel.add(othercazlistAllAddButton);

		otherklasiklistAlladdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					for (int i = 0; i < otherKlasik.size(); i++) {
						int flag = 1;
						for (int j = 0; j < userKlasik.size(); j++) {
							if (otherKlasik.get(i).toString().equals(userKlasik.get(j).toString())) {
								flag = 0;
								break;
							}
						}
						if (flag == 1) {
							userKlasik.add(userKlasik.size(), otherKlasik.get(i).toString());
						}
					}
					userklasiklist.setModel(userKlasik);
					String ekleme = "";
					for (int i = 0; i < userKlasik.size(); i++) {
						ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
					}
					baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
					// System.out.println(ekleme);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		otherklasiklistAlladdButton.setForeground(Color.PINK);
		otherklasiklistAlladdButton.setFont(new Font("Dialog", Font.BOLD, 18));
		otherklasiklistAlladdButton.setBackground(Color.DARK_GRAY);
		otherklasiklistAlladdButton.setBounds(1137, 870, 235, 35);
		userPanel.add(otherklasiklistAlladdButton);

		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setBounds(404, 451, 47, 48);

		userPanel.add(lblNewLabel_1);
		lblCaz.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCaz.setBounds(820, 451, 47, 48);

		userPanel.add(lblCaz);
		lblKlasik.setFont(new Font("Dialog", Font.BOLD, 18));
		lblKlasik.setBounds(1198, 451, 78, 48);

		userPanel.add(lblKlasik);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userPanel.setVisible(false);
				anaSayfa.setVisible(true);
				try {
					top10ListeGuncelle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setBounds(257, 12, 134, 56);

		userPanel.add(btnNewButton_1);

		otherpoplistAddButton.setVisible(false);
		othercazlistAddButton.setVisible(false);
		otherklasiklistaddButton.setVisible(false);
		otherpoplistAllAddButton.setVisible(false);
		othercazlistAllAddButton.setVisible(false);
		otherklasiklistAlladdButton.setVisible(false);
		otherpoplistButton.setVisible(false);
		othercazlistButton.setVisible(false);
		otherklasiklistButton.setVisible(false);
		sarkilarPanel.setBackground(Color.PINK);
		sarkilarPanel.setBounds(0, 0, 1482, 953);

		contentPane.add(sarkilarPanel);

		sarkilarPanel.setVisible(false);
		sarkilarPanel.setLayout(null);
		sarkilarToAna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					top10ListeGuncelle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				sarkilarPanel.setVisible(false);
				anaSayfa.setVisible(true);
			}
		});
		sarkilarToAna.setForeground(Color.PINK);
		sarkilarToAna.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkilarToAna.setBackground(Color.DARK_GRAY);
		sarkilarToAna.setBounds(39, 12, 134, 56);

		sarkilarPanel.add(sarkilarToAna);

		JLabel lblNewLabel_3 = new JLabel("POP");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel_3.setBounds(277, 237, 82, 56);
		sarkilarPanel.add(lblNewLabel_3);

		JLabel lblCaz_1 = new JLabel("CAZ");
		lblCaz_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblCaz_1.setBounds(679, 235, 95, 61);
		sarkilarPanel.add(lblCaz_1);

		JLabel lblKlasik_1 = new JLabel("KLAS\u0130K");
		lblKlasik_1.setFont(new Font("Dialog", Font.BOLD, 24));
		lblKlasik_1.setBounds(1085, 232, 122, 61);
		sarkilarPanel.add(lblKlasik_1);

		allPopPane.setBounds(143, 305, 350, 419);
		sarkilarPanel.add(allPopPane);
		allCazPane.setBounds(543, 305, 350, 419);
		sarkilarPanel.add(allCazPane);
		allKlasikPane.setBounds(952, 305, 350, 419);
		sarkilarPanel.add(allKlasikPane);

		JButton allPopDinleButton = new JButton("Dinle");
		allPopDinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					baglanti.sarkiDinle(allpoplist.getSelectedValue().toString());
					dinleLabel(allpoplist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		allPopDinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allPopDinleButton.setForeground(Color.PINK);
		allPopDinleButton.setBackground(Color.DARK_GRAY);
		allPopDinleButton.setBounds(143, 736, 122, 46);
		sarkilarPanel.add(allPopDinleButton);

		JButton allCazDinleButton = new JButton("Dinle");
		allCazDinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					baglanti.sarkiDinle(allcazlist.getSelectedValue().toString());
					dinleLabel(allcazlist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		allCazDinleButton.setForeground(Color.PINK);
		allCazDinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allCazDinleButton.setBackground(Color.DARK_GRAY);
		allCazDinleButton.setBounds(543, 736, 122, 46);
		sarkilarPanel.add(allCazDinleButton);

		JButton allKlasikDinleButton = new JButton("Dinle");
		allKlasikDinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					baglanti.sarkiDinle(allklasiklist.getSelectedValue().toString());
					dinleLabel(allklasiklist.getSelectedValue().toString());
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		allKlasikDinleButton.setForeground(Color.PINK);
		allKlasikDinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allKlasikDinleButton.setBackground(Color.DARK_GRAY);
		allKlasikDinleButton.setBounds(952, 736, 122, 46);
		sarkilarPanel.add(allKlasikDinleButton);
		dinlenenSarkiLabel2.setFont(new Font("Dialog", Font.BOLD, 22));
		dinlenenSarkiLabel2.setBounds(39, 867, 1431, 38);

		sarkilarPanel.add(dinlenenSarkiLabel2);

		JButton allPopEkleButton = new JButton("Listeye Ekle");
		allPopEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherpoplist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userPop.size(); i++) {
						if (userPop.get(i).toString().equals(allpoplist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userPop.add(userPop.size(), allpoplist.getSelectedValue().toString());
						userpoplist.setModel(userPop);
						String ekleme = "";
						for (int i = 0; i < userPop.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
						}
						baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		allPopEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allPopEkleButton.setBackground(Color.DARK_GRAY);
		allPopEkleButton.setForeground(Color.PINK);
		allPopEkleButton.setBounds(277, 736, 216, 46);
		sarkilarPanel.add(allPopEkleButton);

		JButton allCazEkleButon = new JButton("Listeye Ekle");
		allCazEkleButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(othercazlist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userCaz.size(); i++) {
						if (userCaz.get(i).toString().equals(allcazlist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userCaz.add(userCaz.size(), allcazlist.getSelectedValue().toString());
						usercazlist.setModel(userCaz);
						String ekleme = "";
						for (int i = 0; i < userCaz.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
						}
						baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		allCazEkleButon.setForeground(Color.PINK);
		allCazEkleButon.setFont(new Font("Dialog", Font.BOLD, 18));
		allCazEkleButon.setBackground(Color.DARK_GRAY);
		allCazEkleButon.setBounds(677, 736, 216, 46);
		sarkilarPanel.add(allCazEkleButon);

		JButton allKlasikEkleButton = new JButton("Listeye Ekle");
		allKlasikEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherklasiklist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userKlasik.size(); i++) {
						if (userKlasik.get(i).toString().equals(allklasiklist.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userKlasik.add(userKlasik.size(), allklasiklist.getSelectedValue().toString());
						userklasiklist.setModel(userKlasik);
						String ekleme = "";
						for (int i = 0; i < userKlasik.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
						}
						baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		allKlasikEkleButton.setForeground(Color.PINK);
		allKlasikEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allKlasikEkleButton.setBackground(Color.DARK_GRAY);
		allKlasikEkleButton.setBounds(1085, 736, 216, 46);
		sarkilarPanel.add(allKlasikEkleButton);

		adminPanel.setBackground(Color.PINK);
		adminPanel.setBounds(0, 0, 1482, 953);
		contentPane.add(adminPanel);
		adminPanel.setLayout(null);

		JLabel adminLabel = new JLabel("Admin");
		adminLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		adminLabel.setBounds(636, 0, 270, 55);
		adminPanel.add(adminLabel);

		JLabel sanatciLabel1 = new JLabel("Sanat\u00E7\u0131 Ad\u0131:");
		sanatciLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciLabel1.setBackground(Color.DARK_GRAY);
		sanatciLabel1.setBounds(477, 167, 106, 55);
		adminPanel.add(sanatciLabel1);
		sanatciLabel1.setVisible(false);

		JLabel sanatciLabel2 = new JLabel("\u00DClkesi:");
		sanatciLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciLabel2.setBackground(Color.DARK_GRAY);
		sanatciLabel2.setBounds(514, 244, 69, 55);
		adminPanel.add(sanatciLabel2);
		sanatciLabel2.setVisible(false);

		sanatciEkleAd = new JTextField();
		sanatciEkleAd.setFont(new Font("Dialog", Font.BOLD, 20));
		sanatciEkleAd.setBounds(585, 166, 137, 55);
		adminPanel.add(sanatciEkleAd);
		sanatciEkleAd.setColumns(10);
		sanatciEkleAd.setVisible(false);

		sanatciEkleUlke = new JTextField();
		sanatciEkleUlke.setFont(new Font("Dialog", Font.BOLD, 20));
		sanatciEkleUlke.setColumns(10);
		sanatciEkleUlke.setBounds(585, 243, 137, 55);
		adminPanel.add(sanatciEkleUlke);
		sanatciEkleUlke.setVisible(false);

		JButton sanatciEkle = new JButton("Ekle");
		sanatciEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sanatciLabel1.setVisible(false);
				sanatciLabel2.setVisible(false);
				sanatciEkleAd.setVisible(false);
				sanatciEkleUlke.setVisible(false);
				sanatciEkle.setVisible(false);

				try {
					sanatciSilModel.add(sanatciSilModel.size(), sanatciEkleAd.getText());
					sanatciSilmeListesi.setModel(sanatciSilModel);
					baglanti.SanatciEkle(sanatciEkleAd.getText(), sanatciEkleUlke.getText());
					sanatciModel.add(sanatciModel.size(), sanatciEkleAd.getText());
					sanatcilistesi.setModel(sanatciModel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}

				sanatciEkleAd.setText("");
				sanatciEkleUlke.setText("");
			}
		});
		sanatciEkle.setForeground(Color.PINK);
		sanatciEkle.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciEkle.setBackground(Color.DARK_GRAY);
		sanatciEkle.setBounds(577, 311, 146, 76);
		adminPanel.add(sanatciEkle);
		sanatciEkle.setVisible(false);

		JButton sanatciEkleButton = new JButton("Sanat\u00E7\u0131 Ekle");
		sanatciEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (sanatciLabel1.isVisible() == false) {
					sanatciLabel1.setVisible(true);
					sanatciLabel2.setVisible(true);
					sanatciEkleAd.setVisible(true);
					sanatciEkleUlke.setVisible(true);
					sanatciEkle.setVisible(true);
				} else {
					sanatciLabel1.setVisible(false);
					sanatciLabel2.setVisible(false);
					sanatciEkleAd.setVisible(false);
					sanatciEkleUlke.setVisible(false);
					sanatciEkle.setVisible(false);
				}

			}
		});
		sanatciEkleButton.setForeground(Color.PINK);
		sanatciEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciEkleButton.setBackground(Color.DARK_GRAY);
		sanatciEkleButton.setBounds(577, 53, 159, 76);
		adminPanel.add(sanatciEkleButton);

		JButton adminToMain = new JButton("Geri D\u00F6n");
		adminToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminPanel.setVisible(false);
				loginPanel.setVisible(true);
			}
		});
		adminToMain.setForeground(Color.PINK);
		adminToMain.setFont(new Font("Dialog", Font.BOLD, 18));
		adminToMain.setBackground(Color.DARK_GRAY);
		adminToMain.setBounds(34, 53, 117, 76);
		adminPanel.add(adminToMain);

		sarkiLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel1.setBounds(784, 167, 95, 55);
		adminPanel.add(sarkiLabel1);

		sarkiLabel2.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel2.setBounds(819, 244, 60, 55);
		adminPanel.add(sarkiLabel2);

		sarkiLabel3.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel3.setBounds(803, 356, 76, 55);
		adminPanel.add(sarkiLabel3);

		sarkiLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel4.setBounds(810, 472, 69, 55);
		adminPanel.add(sarkiLabel4);

		sarkiLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel5.setBounds(1065, 689, 52, 55);
		adminPanel.add(sarkiLabel5);

		sarkiLabel6.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel6.setBounds(819, 573, 60, 55);
		adminPanel.add(sarkiLabel6);

		sarkiLabel7.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiLabel7.setBounds(712, 640, 159, 55);
		adminPanel.add(sarkiLabel7);

		sarkiText = new JTextField();
		sarkiText.setFont(new Font("Dialog", Font.BOLD, 20));
		sarkiText.setBounds(877, 166, 170, 55);
		adminPanel.add(sarkiText);
		sarkiText.setColumns(10);

		tarihText = new JTextField();
		tarihText.setFont(new Font("Dialog", Font.BOLD, 20));
		tarihText.setColumns(10);
		tarihText.setBounds(877, 243, 170, 55);
		adminPanel.add(tarihText);
		// adminPanel.add(sanatciText);

		sanatciPane.setBounds(877, 325, 240, 110);
		adminPanel.add(sanatciPane);
		sanatciPane.setVisible(false);

		sanatcilistesi = new JList<String>();
		sanatcilistesi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sanatcilistesi.setModel(sanatciModel);
		sanatcilistesi.setBounds(877, 404, 170, 55);
		sanatciPane.setViewportView(sanatcilistesi);
		// adminPanel.add(albumText);//dfýohawoshhhýahsdþoýASHFÞOIASHFÞOUSDHÞUIS<DVIUSDVIUS<VPIUGSIUVDGS<PUGDCUS<GCUSGPIU<XGC

		albumPane.setBounds(877, 450, 240, 110);
		adminPanel.add(albumPane);

		albumSilPane.setBounds(490, 513, 240, 230);
		sarkiSilPane.setBounds(232, 513, 246, 230);
		sanatciSilPane.setBounds(12, 513, 207, 230);

		albumSilPane.setVisible(false);
		sarkiSilPane.setVisible(false);
		sanatciSilPane.setVisible(false);

		adminPanel.add(albumSilPane);
		adminPanel.add(sarkiSilPane);
		adminPanel.add(sanatciSilPane);
		albumPane.setVisible(false);
		// albumList.close();

		albumlistesi = new JList<String>();
		albumlistesi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		albumlistesi.setModel(albumModel);
		albumlistesi.setBounds(877, 404, 170, 55);
		albumPane.setViewportView(albumlistesi);

		turText = new JTextField();
		turText.setFont(new Font("Dialog", Font.BOLD, 20));
		turText.setColumns(10);
		turText.setBounds(1118, 688, 95, 55);
		adminPanel.add(turText);

		sureText = new JTextField();
		sureText.setFont(new Font("Dialog", Font.BOLD, 20));
		sureText.setColumns(10);
		sureText.setBounds(877, 572, 95, 55);
		adminPanel.add(sureText);

		sayiText = new JTextField();
		sayiText.setFont(new Font("Dialog", Font.BOLD, 20));
		sayiText.setColumns(10);
		sayiText.setBounds(877, 639, 95, 55);
		adminPanel.add(sayiText);

		JButton sarkiEkleButton = new JButton("\u015Eark\u0131 Ekle");
		sarkiEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (sarkiLabel1.isVisible() == false) {
					sarkiEkleLabels(true);
				} else {
					sarkiEkleLabels(false);
				}

			}
		});
		sarkiEkleButton.setForeground(Color.PINK);
		sarkiEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiEkleButton.setBackground(Color.DARK_GRAY);
		sarkiEkleButton.setBounds(877, 53, 137, 76);
		adminPanel.add(sarkiEkleButton);
		sarkiEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				sarkiEkleLabels(false);
				try {
					sarkiSilModel.add(sarkiSilModel.size(), sarkiText.getText());
					sarkiSilListesi.setModel(sarkiSilModel);
					turText.setText(baglanti.albumTurBul(albumlistesi.getSelectedValue().toString()));
					baglanti.SarkiEkle(sarkiText.getText(), tarihText.getText(),
							baglanti.sanatciIDBul(sanatcilistesi.getSelectedValue().toString()),
							baglanti.albumIDBul(albumlistesi.getSelectedValue().toString()), turText.getText(),
							sureText.getText(), Integer.parseInt("0" + sayiText.getText()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				sarkiTextTemizle();
			}

		});
		sarkiEkle.setBackground(Color.DARK_GRAY);
		sarkiEkle.setForeground(Color.PINK);
		sarkiEkle.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiEkle.setBounds(867, 707, 131, 76);

		adminPanel.add(sarkiEkle);

		albumEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (albumLabel1.isVisible() == false) {
					albumEkleLabels(true);
				} else {
					albumEkleLabels(false);
				}
			}
		});

		albumEkleButton.setForeground(Color.PINK);
		albumEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		albumEkleButton.setBackground(Color.DARK_GRAY);
		albumEkleButton.setBounds(1187, 53, 137, 76);
		adminPanel.add(albumEkleButton);

		albumLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		albumLabel1.setBounds(1080, 167, 98, 55);
		adminPanel.add(albumLabel1);

		albumLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
		albumLabel4.setBounds(1118, 244, 60, 55);
		adminPanel.add(albumLabel4);

		albumLabel5.setFont(new Font("Dialog", Font.BOLD, 18));
		albumLabel5.setBounds(1128, 322, 36, 55);
		adminPanel.add(albumLabel5);

		albumAdiText = new JTextField();
		albumAdiText.setFont(new Font("Dialog", Font.BOLD, 18));
		albumAdiText.setBounds(1187, 167, 176, 55);
		adminPanel.add(albumAdiText);
		albumAdiText.setColumns(10);

		albumTarihText = new JTextField();
		albumTarihText.setFont(new Font("Dialog", Font.BOLD, 18));
		albumTarihText.setColumns(10);
		albumTarihText.setBounds(1187, 244, 176, 55);
		adminPanel.add(albumTarihText);

		albumTurText = new JTextField();
		albumTurText.setFont(new Font("Dialog", Font.BOLD, 18));
		albumTurText.setColumns(10);
		albumTurText.setBounds(1187, 322, 89, 55);
		adminPanel.add(albumTurText);
		albumEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				albumEkleLabels(false);

				try {
					albumSilModel.add(albumSilModel.size(), albumAdiText.getText());
					albumSilListesi.setModel(albumSilModel);
					baglanti.AlbumEkle(albumAdiText.getText(), albumTarihText.getText(), albumTurText.getText());
					albumModel.add(albumModel.size(), albumAdiText.getText());
					albumlistesi.setModel(albumModel);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}

				albumTextTemizle();
			}
		});

		albumEkle.setFont(new Font("Dialog", Font.BOLD, 18));
		albumEkle.setForeground(Color.PINK);
		albumEkle.setBackground(Color.DARK_GRAY);
		albumEkle.setBounds(1187, 405, 131, 70);
		adminPanel.add(albumEkle);

		adminPanel.setVisible(false);

		JButton sarkilariListeleButton = new JButton(
				"T\u00FCm Tablolar\u0131 G\u00F6r\u00FCnt\u00FCle ve G\u00FCncelle");
		sarkilariListeleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				adminPanel.setVisible(false);

				try {
					tablo();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}

			}

		});

		sarkilariListeleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkilariListeleButton.setForeground(Color.PINK);
		sarkilariListeleButton.setBackground(Color.DARK_GRAY);
		sarkilariListeleButton.setBounds(34, 141, 382, 82);
		adminPanel.add(sarkilariListeleButton);
		sanatciSilmeListesi = new JList<String>();
		sanatciSilmeListesi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sanatciSilmeListesi.setModel(sanatciSilModel);
		sanatciSilmeListesi.setBounds(877, 404, 170, 55);
		sanatciSilPane.setViewportView(sanatciSilmeListesi);
		sarkiSilListesi = new JList<String>();
		sarkiSilListesi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sarkiSilListesi.setModel(sarkiSilModel);
		sarkiSilListesi.setBounds(877, 404, 170, 55);
		sarkiSilPane.setViewportView(sarkiSilListesi);
		albumSilListesi = new JList<String>();
		albumSilListesi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		albumSilListesi.setModel(albumSilModel);
		albumSilListesi.setBounds(877, 404, 170, 55);
		albumSilPane.setViewportView(albumSilListesi);

		// asdfghjklþiiþlkjhasdfghjklþasdfghjklþsdfghjklþsdfghjklþisdfghjklþidfghjk
		sanatciSilBtn.setVisible(false);
		JButton sanatciSilButton = new JButton("Sanat\u00E7\u0131 Sil");
		sanatciSilButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sanatciSilModel.clear();
				try {
					ResultSet sanatciSilList = baglanti.sanatcilariListele();
					int counter3 = 0;
					while (sanatciSilList.next()) {
						sanatciSilModel.add(counter3, sanatciSilList.getString("sanatciAdi"));
						counter3++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (sanatciSilPane.isVisible()) {
					sanatciSilPane.setVisible(false);
					sanatciSilBtn.setVisible(false);
				} else {
					sanatciSilPane.setVisible(true);
					sanatciSilBtn.setVisible(true);
				}

			}
		});
		sanatciSilButton.setForeground(Color.PINK);
		sanatciSilButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciSilButton.setBackground(Color.DARK_GRAY);
		sanatciSilButton.setBounds(45, 425, 159, 76);
		adminPanel.add(sanatciSilButton);

		sarkiSilBtn.setVisible(false);
		JButton sarkiSilButton = new JButton("\u015Eark\u0131 Sil");
		sarkiSilButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet sarkiSilList;
				try {
					sarkiSilModel.clear();
					sarkiSilList = baglanti.sarkilariListele();
					int counter4 = 0;
					while (sarkiSilList.next()) {
						sarkiSilModel.add(counter4, sarkiSilList.getString("sarkiAdi"));
						counter4++;
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
				}

				if (sarkiSilPane.isVisible()) {
					sarkiSilPane.setVisible(false);
					sarkiSilBtn.setVisible(false);
				} else {
					sarkiSilPane.setVisible(true);
					sarkiSilBtn.setVisible(true);
				}
			}
		});
		sarkiSilButton.setForeground(Color.PINK);
		sarkiSilButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiSilButton.setBackground(Color.DARK_GRAY);
		sarkiSilButton.setBounds(293, 425, 159, 76);
		adminPanel.add(sarkiSilButton);

		albumSilBtn.setVisible(false);
		JButton albumSilButton = new JButton("Alb\u00FCm Sil");
		albumSilButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					albumSilModel.clear();
					ResultSet albumSilList = baglanti.albumleriListele();
					int counter5 = 0;
					while (albumSilList.next()) {
						albumSilModel.add(counter5, albumSilList.getString("albumAdi"));
						counter5++;
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				if (albumSilPane.isVisible()) {
					albumSilPane.setVisible(false);
					albumSilBtn.setVisible(false);
				} else {
					albumSilPane.setVisible(true);
					albumSilBtn.setVisible(true);
				}
			}
		});
		albumSilButton.setForeground(Color.PINK);
		albumSilButton.setFont(new Font("Dialog", Font.BOLD, 18));
		albumSilButton.setBackground(Color.DARK_GRAY);
		albumSilButton.setBounds(529, 425, 159, 76);
		adminPanel.add(albumSilButton);
		sanatciSilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(sanatciSilmeListesi.getSelectedValue().toString());
				try {
					baglanti.sanatciSil(sanatciSilmeListesi.getSelectedValue().toString());
					sanatciModel.removeElement(sanatciSilmeListesi.getSelectedValue());
					sanatcilistesi.setModel(sanatciModel);
					sanatciSilModel.removeElement(sanatciSilmeListesi.getSelectedValue());
					sanatciSilmeListesi.setModel(sanatciSilModel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		sanatciSilBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		sanatciSilBtn.setBackground(Color.DARK_GRAY);
		sanatciSilBtn.setForeground(Color.PINK);
		sanatciSilBtn.setBounds(53, 756, 98, 55);

		adminPanel.add(sanatciSilBtn);
		sarkiSilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(sarkiSilListesi.getSelectedValue().toString());
				try {
					baglanti.sarkiSil(sarkiSilListesi.getSelectedValue().toString());
					sarkiSilModel.removeElement(sarkiSilListesi.getSelectedValue());
					sarkiSilListesi.setModel(sarkiSilModel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		sarkiSilBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		sarkiSilBtn.setForeground(Color.PINK);
		sarkiSilBtn.setBackground(Color.DARK_GRAY);
		sarkiSilBtn.setBounds(318, 756, 98, 55);

		adminPanel.add(sarkiSilBtn);
		albumSilBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// System.out.println(albumSilListesi.getSelectedValue().toString());
				try {
					baglanti.albumSil(albumSilListesi.getSelectedValue().toString());
					albumModel.removeElement(albumSilListesi.getSelectedValue().toString());
					albumlistesi.setModel(albumModel);
					albumSilModel.removeElement(albumSilListesi.getSelectedValue());
					albumSilListesi.setModel(albumSilModel);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		albumSilBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		albumSilBtn.setForeground(Color.PINK);
		albumSilBtn.setBackground(Color.DARK_GRAY);
		albumSilBtn.setBounds(560, 756, 98, 55);

		adminPanel.add(albumSilBtn);

		girisYapanLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		girisYapanLabel.setBounds(1034, 0, 270, 55);
		anaSayfa.add(girisYapanLabel);
		cikisYapButton.setBackground(Color.DARK_GRAY);
		cikisYapButton.setForeground(Color.PINK);
		cikisYapButton.setFont(new Font("Dialog", Font.BOLD, 15));
		cikisYapButton.setBounds(1304, 16, 120, 35);

		anaSayfa.setBackground(Color.PINK);
		anaSayfa.setBounds(0, 0, 1482, 953);
		contentPane.add(anaSayfa);
		anaSayfa.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("AnaSayfa");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_2.setBounds(609, 12, 128, 60);
		anaSayfa.add(lblNewLabel_2);

		JButton anaToUser = new JButton("Kullan\u0131c\u0131lar\u0131 takip et");
		anaToUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					kullanicilariGuncelle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				userPanel.setVisible(true);
				anaSayfa.setVisible(false);
			}
		});
		anaToUser.setForeground(Color.PINK);
		anaToUser.setBackground(Color.DARK_GRAY);
		anaToUser.setFont(new Font("Dialog", Font.BOLD, 18));
		anaToUser.setBounds(59, 87, 230, 60);
		anaSayfa.add(anaToUser);

		anaToSarkilar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ResultSet tumPoplar = baglanti.poplariListele();
					ResultSet tumCazlar = baglanti.cazlariListele();
					ResultSet tumKlasikler = baglanti.klasikleriListele();
					allPop.clear();
					while (tumPoplar.next()) {
						allPop.add(allPop.size(), tumPoplar.getString("sarkiAdi"));
					}
					allpoplist.setModel(allPop);
					allPopPane.setViewportView(allpoplist);

					allCaz.clear();
					while (tumCazlar.next()) {
						allCaz.add(allCaz.size(), tumCazlar.getString("sarkiAdi"));
					}
					allcazlist.setModel(allCaz);
					allCazPane.setViewportView(allcazlist);

					allKlasik.clear();
					while (tumKlasikler.next()) {
						allKlasik.add(allKlasik.size(), tumKlasikler.getString("sarkiAdi"));
					}
					allklasiklist.setModel(allKlasik);
					allKlasikPane.setViewportView(allklasiklist);

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				sarkilarPanel.setVisible(true);
				anaSayfa.setVisible(false);

			}
		});
		anaToSarkilar.setForeground(Color.PINK);
		anaToSarkilar.setFont(new Font("Dialog", Font.BOLD, 18));
		anaToSarkilar.setBackground(Color.DARK_GRAY);
		anaToSarkilar.setBounds(352, 87, 195, 60);

		anaSayfa.add(anaToSarkilar);
		anaToAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					allAlbum.clear();
					ResultSet albumListesi = baglanti.albumleriListele();
					while (albumListesi.next()) {
						allAlbum.add(allAlbum.size(), albumListesi.getString("albumAdi"));
					}
					allAlbumlist.setModel(allAlbum);
					allAlbumPane.setViewportView(allAlbumlist);
					albumListesi.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				albumlerPanel.setVisible(true);
				anaSayfa.setVisible(false);
			}
		});
		anaToAlbum.setForeground(Color.PINK);
		anaToAlbum.setFont(new Font("Dialog", Font.BOLD, 18));
		anaToAlbum.setBackground(Color.DARK_GRAY);
		anaToAlbum.setBounds(634, 87, 224, 60);

		anaSayfa.add(anaToAlbum);
		anaToSanatci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anaSayfa.setVisible(false);
				sanatcilarPanel.setVisible(true);
				try {
					ResultSet sanatciListesi = baglanti.sanatcilariListele();
					sanatciSarkiDefaultList1.clear();
					while (sanatciListesi.next()) {
						sanatciSarkiDefaultList1.add(sanatciSarkiDefaultList1.size(),
								sanatciListesi.getString("sanatciAdi"));
					}
					sanatciListesi.close();
					sanatciSarkiList1.setModel(sanatciSarkiDefaultList1);
					sanatciSarkiPane1.setViewportView(sanatciSarkiList1);

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		anaToSanatci.setForeground(Color.PINK);
		anaToSanatci.setFont(new Font("Dialog", Font.BOLD, 18));
		anaToSanatci.setBackground(Color.DARK_GRAY);
		anaToSanatci.setBounds(922, 87, 291, 60);

		anaSayfa.add(anaToSanatci);
		dinlenenSarkiLabel4.setFont(new Font("Dialog", Font.BOLD, 22));
		dinlenenSarkiLabel4.setBounds(33, 865, 1369, 38);

		anaSayfa.add(dinlenenSarkiLabel4);

		JLabel lblNewLabel_4 = new JLabel("POP TOP 10");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4.setBounds(158, 253, 120, 35);
		anaSayfa.add(lblNewLabel_4);

		JLabel lblCazTop = new JLabel("CAZ TOP 10");
		lblCazTop.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCazTop.setBounds(530, 253, 120, 35);
		anaSayfa.add(lblCazTop);

		JLabel lblKlasikTop = new JLabel("KLAS\u0130K TOP 10");
		lblKlasikTop.setFont(new Font("Dialog", Font.BOLD, 18));
		lblKlasikTop.setBounds(883, 253, 143, 35);
		anaSayfa.add(lblKlasikTop);

		JLabel lblGenelTop = new JLabel("GENEL TOP 10");
		lblGenelTop.setFont(new Font("Dialog", Font.BOLD, 18));
		lblGenelTop.setBounds(1237, 253, 172, 35);
		anaSayfa.add(lblGenelTop);
		anaSayfa.setVisible(false);

		popTop10Pane.setBounds(33, 300, 347, 337);
		cazTop10Pane.setBounds(406, 300, 347, 337);
		klasikTop10Pane.setBounds(800, 300, 324, 337);
		genelTop10Pane.setBounds(1135, 300, 324, 337);

		anaSayfa.add(popTop10Pane);
		anaSayfa.add(cazTop10Pane);
		anaSayfa.add(klasikTop10Pane);
		anaSayfa.add(genelTop10Pane);

		JButton poptopdinleButton = new JButton("Dinle");
		poptopdinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sarki = popTop10List.getSelectedValue().toString();
					baglanti.sarkiDinle(popTop10List.getSelectedValue().toString());
					dinleLabel(popTop10List.getSelectedValue().toString());
					top10ListeGuncelle();
					popTop10List.setSelectedValue(sarki, true);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		poptopdinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		poptopdinleButton.setForeground(Color.PINK);
		poptopdinleButton.setBackground(Color.DARK_GRAY);
		poptopdinleButton.setBounds(33, 649, 120, 55);
		anaSayfa.add(poptopdinleButton);

		JButton caztopdinleButton = new JButton("Dinle");
		caztopdinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sarki = cazTop10List.getSelectedValue().toString();
					baglanti.sarkiDinle(cazTop10List.getSelectedValue().toString());
					dinleLabel(cazTop10List.getSelectedValue().toString());
					top10ListeGuncelle();
					cazTop10List.setSelectedValue(sarki, true);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		caztopdinleButton.setForeground(Color.PINK);
		caztopdinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		caztopdinleButton.setBackground(Color.DARK_GRAY);
		caztopdinleButton.setBounds(406, 649, 120, 55);
		anaSayfa.add(caztopdinleButton);

		JButton klasiktopdinleButton = new JButton("Dinle");
		klasiktopdinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sarki = klasikTop10List.getSelectedValue().toString();
					baglanti.sarkiDinle(klasikTop10List.getSelectedValue().toString());
					dinleLabel(klasikTop10List.getSelectedValue().toString());
					top10ListeGuncelle();
					klasikTop10List.setSelectedValue(sarki, true);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		klasiktopdinleButton.setForeground(Color.PINK);
		klasiktopdinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		klasiktopdinleButton.setBackground(Color.DARK_GRAY);
		klasiktopdinleButton.setBounds(800, 649, 120, 55);
		anaSayfa.add(klasiktopdinleButton);

		JButton geneltopdinleButton = new JButton("Dinle");
		geneltopdinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sarki = genelTop10List.getSelectedValue().toString();
					baglanti.sarkiDinle(genelTop10List.getSelectedValue().toString());
					dinleLabel(genelTop10List.getSelectedValue().toString());
					top10ListeGuncelle();
					genelTop10List.setSelectedValue(sarki, true);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		geneltopdinleButton.setForeground(Color.PINK);
		geneltopdinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		geneltopdinleButton.setBackground(Color.DARK_GRAY);
		geneltopdinleButton.setBounds(1135, 649, 120, 55);
		anaSayfa.add(geneltopdinleButton);

		JButton poptopeklebutton = new JButton("Ekle");
		poptopeklebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherpoplist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userPop.size(); i++) {
						if (userPop.get(i).toString().equals(popTop10List.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userPop.add(userPop.size(), popTop10List.getSelectedValue().toString());
						userpoplist.setModel(userPop);
						String ekleme = "";
						for (int i = 0; i < userPop.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
						}
						baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.
				}
			}
		});
		poptopeklebutton.setForeground(Color.PINK);
		poptopeklebutton.setBackground(Color.DARK_GRAY);
		poptopeklebutton.setFont(new Font("Dialog", Font.BOLD, 18));
		poptopeklebutton.setBounds(260, 649, 120, 55);
		anaSayfa.add(poptopeklebutton);

		JButton caztopekleButton = new JButton("Ekle");
		caztopekleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(othercazlist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userCaz.size(); i++) {
						if (userCaz.get(i).toString().equals(cazTop10List.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userCaz.add(userCaz.size(), cazTop10List.getSelectedValue().toString());
						usercazlist.setModel(userCaz);
						String ekleme = "";
						for (int i = 0; i < userCaz.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
						}
						baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		caztopekleButton.setForeground(Color.PINK);
		caztopekleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		caztopekleButton.setBackground(Color.DARK_GRAY);
		caztopekleButton.setBounds(633, 649, 120, 55);
		anaSayfa.add(caztopekleButton);

		JButton klasiktopekleButton = new JButton("Ekle");
		klasiktopekleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// int
					// ekle=baglanti.sarkiIDBul(otherklasiklist.getSelectedValue().toString());
					// System.out.println(baglanti.sarkiIsimBul(ekle));
					// System.out.println(girisYapanKullanici);
					int flag = 1;
					for (int i = 0; i < userKlasik.size(); i++) {
						if (userKlasik.get(i).toString().equals(klasikTop10List.getSelectedValue().toString())) {
							flag = 0;
						}
					}
					if (flag == 1) {
						userKlasik.add(userKlasik.size(), klasikTop10List.getSelectedValue().toString());
						userklasiklist.setModel(userKlasik);
						String ekleme = "";
						for (int i = 0; i < userKlasik.size(); i++) {
							ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
						}
						baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
						// System.out.println(ekleme);
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		klasiktopekleButton.setForeground(Color.PINK);
		klasiktopekleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		klasiktopekleButton.setBackground(Color.DARK_GRAY);
		klasiktopekleButton.setBounds(1004, 649, 120, 55);
		anaSayfa.add(klasiktopekleButton);

		JButton geneltopekleButton = new JButton("Ekle");
		geneltopekleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String albumTur = baglanti.sarkiTurBul(genelTop10List.getSelectedValue().toString());
					if (albumTur.equals("pop")) {
						int flag = 1;
						for (int i = 0; i < userPop.size(); i++) {
							if (userPop.get(i).toString().equals(genelTop10List.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userPop.add(userPop.size(), genelTop10List.getSelectedValue().toString());
							userpoplist.setModel(userPop);
							String ekleme = "";
							for (int i = 0; i < userPop.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
							}
							baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						}
					} else if (albumTur.equals("caz")) {
						int flag = 1;
						for (int i = 0; i < userCaz.size(); i++) {
							if (userCaz.get(i).toString().equals(genelTop10List.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userCaz.add(userCaz.size(), genelTop10List.getSelectedValue().toString());
							usercazlist.setModel(userCaz);
							String ekleme = "";
							for (int i = 0; i < userCaz.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
							}
							baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}

					} else if (albumTur.equals("klasik")) {
						int flag = 1;
						for (int i = 0; i < userKlasik.size(); i++) {
							if (userKlasik.get(i).toString().equals(genelTop10List.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userKlasik.add(userKlasik.size(), genelTop10List.getSelectedValue().toString());
							userklasiklist.setModel(userKlasik);
							String ekleme = "";
							for (int i = 0; i < userKlasik.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
							}
							baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		geneltopekleButton.setForeground(Color.PINK);
		geneltopekleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		geneltopekleButton.setBackground(Color.DARK_GRAY);
		geneltopekleButton.setBounds(1339, 649, 120, 55);
		anaSayfa.add(geneltopekleButton);
		albumlerPanel.setBackground(Color.PINK);
		albumlerPanel.setBounds(0, 0, 1482, 953);

		contentPane.add(albumlerPanel);
		albumlerPanel.setLayout(null);
		albumlerToAna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				albumlerPanel.setVisible(false);
				anaSayfa.setVisible(true);
				try {
					top10ListeGuncelle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		albumlerToAna.setBounds(49, 12, 111, 52);
		albumlerToAna.setForeground(Color.PINK);
		albumlerToAna.setFont(new Font("Dialog", Font.BOLD, 18));
		albumlerToAna.setBackground(Color.DARK_GRAY);

		albumlerPanel.add(albumlerToAna);

		albumlerPanel.setVisible(false);
		allAlbumPane.setBounds(115, 120, 319, 432);
		allUserPane.setBounds(552, 120, 420, 432);
		albumlerPanel.add(allUserPane);
		albumlerPanel.add(allAlbumPane);
		allAlbumListButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ResultSet sarkiListesi = baglanti
							.albumdekiSarkilariListele(allAlbumlist.getSelectedValue().toString());
					allUser.clear();
					while (sarkiListesi.next()) {
						allUser.add(allUser.size(), sarkiListesi.getString("sarkiAdi"));
					}
					sarkiListesi.close();
					allUserlist.setModel(allUser);
					allUserPane.setViewportView(allUserlist);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		allAlbumListButton.setFont(new Font("Dialog", Font.BOLD, 18));
		allAlbumListButton.setBackground(Color.DARK_GRAY);
		allAlbumListButton.setForeground(Color.PINK);
		allAlbumListButton.setBounds(115, 564, 319, 64);

		albumlerPanel.add(allAlbumListButton);
		btnListeyeEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String albumTur = baglanti.sarkiTurBul(allUserlist.getSelectedValue().toString());
					if (albumTur.equals("pop")) {
						int flag = 1;
						for (int i = 0; i < userPop.size(); i++) {
							if (userPop.get(i).toString().equals(allUserlist.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userPop.add(userPop.size(), allUserlist.getSelectedValue().toString());
							userpoplist.setModel(userPop);
							String ekleme = "";
							for (int i = 0; i < userPop.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
							}
							baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						}
					} else if (albumTur.equals("caz")) {
						int flag = 1;
						for (int i = 0; i < userCaz.size(); i++) {
							if (userCaz.get(i).toString().equals(allUserlist.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userCaz.add(userCaz.size(), allUserlist.getSelectedValue().toString());
							usercazlist.setModel(userCaz);
							String ekleme = "";
							for (int i = 0; i < userCaz.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
							}
							baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}

					} else if (albumTur.equals("klasik")) {
						int flag = 1;
						for (int i = 0; i < userKlasik.size(); i++) {
							if (userKlasik.get(i).toString().equals(allUserlist.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userKlasik.add(userKlasik.size(), allUserlist.getSelectedValue().toString());
							userklasiklist.setModel(userKlasik);
							String ekleme = "";
							for (int i = 0; i < userKlasik.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
							}
							baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block

				}
			}
		});
		btnListeyeEkle.setForeground(Color.PINK);
		btnListeyeEkle.setFont(new Font("Dialog", Font.BOLD, 18));
		btnListeyeEkle.setBackground(Color.DARK_GRAY);
		btnListeyeEkle.setBounds(552, 564, 278, 64);

		albumlerPanel.add(btnListeyeEkle);
		btnDinle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					baglanti.sarkiDinle(allUserlist.getSelectedValue().toString());
					dinleLabel(allUserlist.getSelectedValue().toString());

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
		});
		btnDinle.setForeground(Color.PINK);
		btnDinle.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDinle.setBackground(Color.DARK_GRAY);
		btnDinle.setBounds(842, 564, 132, 64);

		albumlerPanel.add(btnDinle);
		dinlenenSarkiLabel3.setFont(new Font("Dialog", Font.BOLD, 22));
		dinlenenSarkiLabel3.setBounds(115, 709, 1221, 38);

		albumlerPanel.add(dinlenenSarkiLabel3);
		sanatciSarkiPane1.setBounds(162, 139, 321, 416);
		sanatcilarPanel.add(sanatciSarkiPane1);
		sanatciSarkiPane2.setBounds(542, 139, 519, 416);
		sanatcilarPanel.add(sanatciSarkiPane2);
		sanatcilarPanel.setBackground(Color.PINK);
		sanatcilarPanel.setBounds(0, 0, 1482, 953);

		contentPane.add(sanatcilarPanel);
		sanatcilarPanel.setLayout(null);
		sanatcilarPanel.setVisible(false);
		sanatcilarToAna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					top10ListeGuncelle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
				sanatcilarPanel.setVisible(false);
				anaSayfa.setVisible(true);
			}
		});
		sanatcilarToAna.setForeground(Color.PINK);
		sanatcilarToAna.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatcilarToAna.setBackground(Color.DARK_GRAY);
		sanatcilarToAna.setBounds(43, 12, 111, 52);

		sanatcilarPanel.add(sanatcilarToAna);
		JButton sanatciSarkiListeleButton = new JButton("Sanat\u00E7\u0131ya Ait \u015Eark\u0131lar\u0131 Listele");
		sanatciSarkiListeleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ResultSet sanatci = baglanti.sanatciSarkiListele(sanatciSarkiList1.getSelectedValue().toString());
					sanatciSarkiDefaultList2.clear();
					while (sanatci.next()) {
						sanatciSarkiDefaultList2.add(sanatciSarkiDefaultList2.size(), sanatci.getString("sarkiAdi"));
					}
					sanatciSarkiList2.setModel(sanatciSarkiDefaultList2);
					sanatciSarkiPane2.setViewportView(sanatciSarkiList2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}

			}
		});
		sanatciSarkiListeleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciSarkiListeleButton.setBackground(Color.DARK_GRAY);
		sanatciSarkiListeleButton.setForeground(Color.PINK);
		sanatciSarkiListeleButton.setBounds(162, 567, 321, 42);
		sanatcilarPanel.add(sanatciSarkiListeleButton);
		sanatciSarkiDinleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					baglanti.sarkiDinle(sanatciSarkiList2.getSelectedValue().toString());
					dinleLabel(sanatciSarkiList2.getSelectedValue().toString());

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		sanatciSarkiDinleButton.setForeground(Color.PINK);
		sanatciSarkiDinleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciSarkiDinleButton.setBackground(Color.DARK_GRAY);
		sanatciSarkiDinleButton.setBounds(598, 567, 149, 42);

		sanatcilarPanel.add(sanatciSarkiDinleButton);
		sanatciSarkiEkleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String albumTur = baglanti.sarkiTurBul(sanatciSarkiList2.getSelectedValue().toString());
					if (albumTur.equals("pop")) {
						int flag = 1;
						for (int i = 0; i < userPop.size(); i++) {
							if (userPop.get(i).toString().equals(sanatciSarkiList2.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userPop.add(userPop.size(), sanatciSarkiList2.getSelectedValue().toString());
							userpoplist.setModel(userPop);
							String ekleme = "";
							for (int i = 0; i < userPop.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userPop.get(i).toString()) + " ";
							}
							baglanti.kullaniciPopGuncelle(ekleme, girisYapanKullanici);
						}
					} else if (albumTur.equals("caz")) {
						int flag = 1;
						for (int i = 0; i < userCaz.size(); i++) {
							if (userCaz.get(i).toString().equals(sanatciSarkiList2.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userCaz.add(userCaz.size(), sanatciSarkiList2.getSelectedValue().toString());
							usercazlist.setModel(userCaz);
							String ekleme = "";
							for (int i = 0; i < userCaz.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userCaz.get(i).toString()) + " ";
							}
							baglanti.kullaniciCazGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}

					} else if (albumTur.equals("klasik")) {
						int flag = 1;
						for (int i = 0; i < userKlasik.size(); i++) {
							if (userKlasik.get(i).toString().equals(sanatciSarkiList2.getSelectedValue().toString())) {
								flag = 0;
							}
						}
						if (flag == 1) {
							userKlasik.add(userKlasik.size(), sanatciSarkiList2.getSelectedValue().toString());
							userklasiklist.setModel(userKlasik);
							String ekleme = "";
							for (int i = 0; i < userKlasik.size(); i++) {
								ekleme += baglanti.sarkiIDBul(userKlasik.get(i).toString()) + " ";
							}
							baglanti.kullaniciKlasikGuncelle(ekleme, girisYapanKullanici);
							// System.out.println(ekleme);
						}
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					// e1.printStackTrace();
				}
			}
		});
		sanatciSarkiEkleButton.setForeground(Color.PINK);
		sanatciSarkiEkleButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciSarkiEkleButton.setBackground(Color.DARK_GRAY);
		sanatciSarkiEkleButton.setBounds(845, 567, 149, 42);

		sanatcilarPanel.add(sanatciSarkiEkleButton);
		dinlenenSarkiLabel5.setFont(new Font("Dialog", Font.BOLD, 22));
		dinlenenSarkiLabel5.setBounds(43, 748, 1368, 38);

		sanatcilarPanel.add(dinlenenSarkiLabel5);
		loginPanel.setBackground(Color.PINK);
		loginPanel.setBounds(0, 0, 1482, 953);

		contentPane.add(loginPanel);
		loginPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("M\u00DCZ\u0130K DOSYAM");
		lblNewLabel.setBounds(636, 0, 270, 55);
		loginPanel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		userNameLabel.setBounds(551, 444, 152, 43);
		loginPanel.add(userNameLabel);

		userNameLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		userPswLabel.setBounds(551, 503, 152, 43);
		loginPanel.add(userPswLabel);

		userPswLabel.setFont(new Font("Tahoma", Font.BOLD, 22));

		userNameText = new JTextField();
		userNameText.setBounds(726, 444, 180, 44);
		loginPanel.add(userNameText);
		userNameText.setFont(new Font("Tahoma", Font.BOLD, 22));
		userNameText.setBackground(Color.LIGHT_GRAY);
		userNameText.setColumns(10);

		userPasswordText = new JPasswordField();
		userPasswordText.setBounds(726, 503, 180, 44);
		loginPanel.add(userPasswordText);
		userPasswordText.setFont(new Font("Tahoma", Font.BOLD, 22));
		userPasswordText.setBackground(Color.LIGHT_GRAY);
		userGirisButton.setBounds(624, 588, 170, 55);
		loginPanel.add(userGirisButton);

		JButton adminLoginButton = new JButton("Admin Giri\u015Fi");
		adminLoginButton.setBounds(465, 211, 270, 155);
		loginPanel.add(adminLoginButton);
		adminLoginButton.setForeground(Color.PINK);
		adminLoginButton.setBackground(Color.DARK_GRAY);
		adminLoginButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		JButton userLoginButton = new JButton("Kullan\u0131c\u0131 Giri\u015Fi");
		userLoginButton.setBounds(810, 211, 270, 155);
		loginPanel.add(userLoginButton);
		userLoginButton.setForeground(Color.PINK);
		userLoginButton.setBackground(Color.DARK_GRAY);

		userLoginButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		hataliGirisLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		hataliGirisLabel.setBounds(571, 655, 270, 30);

		loginPanel.add(hataliGirisLabel);

		JButton loginToMain = new JButton("Geri D\u00F6n");
		loginToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hataliGirisLabel.setVisible(false);
				loginToMain.setVisible(false);
				adminLoginButton.setVisible(true);
				userLoginButton.setVisible(true);
				girisAktif(false);
				kayitAktif(false);
				ayniKullaniciLabel.setVisible(false);
			}
		});

		loginToMain.setVisible(false);
		loginToMain.setForeground(Color.PINK);
		loginToMain.setFont(new Font("Dialog", Font.BOLD, 18));
		loginToMain.setBackground(Color.DARK_GRAY);
		loginToMain.setBounds(12, 21, 117, 76);
		loginPanel.add(loginToMain);

		userLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginToMain.setVisible(true);
				adminLoginButton.setVisible(false);
				userLoginButton.setVisible(false);
				girisAktif(true);
			}
		});
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginToMain.setVisible(false);
				loginPanel.setVisible(false);
				adminPanel.setVisible(true);

			}
		});

		hataliGirisLabel.setVisible(false);

		userGirisButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					top10ListeGuncelle();
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					// e3.printStackTrace();
				}
				kullaniciTakipButton();
				dinlenenSarkiLabel.setText("");
				dinlenenSarkiLabel2.setText("");
				try {
					kullanicilariGuncelle();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					// e2.printStackTrace();
				}
				for (int k = 0; k < users.size(); k++) {
					if (userNameText.getText().equals(users.get(k).username)
							&& userPasswordText.getText().equals(users.get(k).password)) {

						try {
							kullanicilariGuncelle();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							// e1.printStackTrace();
						}

						loginPanel.setVisible(false);
						anaSayfa.setVisible(true);
						girisYapanKullanici = users.get(k).username;
						girisYapanLabel.setText(users.get(k).username + " kullanýcýsý giriþ yaptý!!");
						hataliGirisLabel.setVisible(false);

						for (int i = 0; i < users.size(); i++) {
							if (users.get(i).username.equals(userNameText.getText())) {
								userPop.clear();
								for (int j = 0; j < users.get(i).popList.size(); j++) {
									userPop.add(j, users.get(i).popList.get(j));
								}
								userCaz.clear();
								for (int j = 0; j < users.get(i).cazList.size(); j++) {
									userCaz.add(j, users.get(i).cazList.get(j));
								}
								userKlasik.clear();
								for (int j = 0; j < users.get(i).klasikList.size(); j++) {
									userKlasik.add(j, users.get(i).klasikList.get(j));
								}

							}
						}

					} else {
						hataliGirisLabel.setVisible(true);
					}

				}

			}
		});

		userGirisButton.setForeground(Color.PINK);
		userGirisButton.setBackground(Color.DARK_GRAY);
		userGirisButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		userKayitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kayitAktif(true);
				girisAktif(false);
				hataliGirisLabel.setVisible(false);
			}
		});

		userKayitButton.setForeground(Color.PINK);
		userKayitButton.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitButton.setBackground(Color.DARK_GRAY);
		userKayitButton.setBounds(624, 697, 170, 68);
		loginPanel.add(userKayitButton);

		userKayitLabel.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitLabel.setBounds(31, 408, 152, 55);
		loginPanel.add(userKayitLabel);

		userKayitLabel2.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitLabel2.setBounds(31, 476, 152, 55);
		loginPanel.add(userKayitLabel2);

		userKayitLabel3.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitLabel3.setBounds(31, 543, 152, 55);
		loginPanel.add(userKayitLabel3);

		userKayitLabel4.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitLabel4.setBounds(31, 611, 152, 43);
		loginPanel.add(userKayitLabel4);

		userKayitLabel5.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitLabel5.setBounds(31, 678, 152, 43);
		loginPanel.add(userKayitLabel5);

		userKayitUsername = new JTextField();
		userKayitUsername.setBackground(Color.LIGHT_GRAY);
		userKayitUsername.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitUsername.setBounds(188, 420, 195, 43);
		loginPanel.add(userKayitUsername);
		userKayitUsername.setColumns(10);

		userKayitEmail = new JTextField();
		userKayitEmail.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitEmail.setColumns(10);
		userKayitEmail.setBackground(Color.LIGHT_GRAY);
		userKayitEmail.setBounds(188, 476, 195, 43);
		loginPanel.add(userKayitEmail);

		userKayitSifre = new JTextField();
		userKayitSifre.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitSifre.setColumns(10);
		userKayitSifre.setBackground(Color.LIGHT_GRAY);
		userKayitSifre.setBounds(188, 543, 195, 43);
		loginPanel.add(userKayitSifre);

		userKayitTur = new JTextField();
		userKayitTur.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitTur.setColumns(10);
		userKayitTur.setBackground(Color.LIGHT_GRAY);
		userKayitTur.setBounds(188, 609, 195, 43);
		loginPanel.add(userKayitTur);

		userKayitUlke = new JTextField();
		userKayitUlke.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitUlke.setColumns(10);
		userKayitUlke.setBackground(Color.LIGHT_GRAY);
		userKayitUlke.setBounds(188, 675, 195, 43);
		loginPanel.add(userKayitUlke);
		userKayitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int flag = 0;
				try {
					for (int i = 0; i < users.size(); i++) {
						if (userKayitUsername.getText().equals(users.get(i).username)) {
							flag = 1;
						}
					}
					if (flag == 0) {
						kayitAktif(false);
						girisAktif(true);
						ayniKullaniciLabel.setVisible(false);
						baglanti.kullaniciEkle(userKayitUsername.getText(), userKayitEmail.getText(),
								userKayitSifre.getText(), userKayitTur.getText(), userKayitUlke.getText());
						kullanicilariGuncelle();

						kullanicilar[users.size() - 1] = new JButton("" + users.get(users.size() - 1).username);
						kullanicilar[users.size() - 1].setForeground(Color.PINK);
						kullanicilar[users.size() - 1].setBackground(Color.DARK_GRAY);
						kullanicilar[users.size() - 1].setFont(new Font("Tahoma", Font.BOLD, 22));
						contentPane.remove(kullanicilar[users.size() - 1]);
						contentPane.revalidate();
						contentPane.repaint();

						for (int i = 0; i < users.size(); i++) {

							kullanicilar[i].setBounds(70 + 50, i * 60 + 50, 120, 60);
							userPanel.add(kullanicilar[i]);
							kullanicilar[i].repaint();

						}
					} else if (flag == 1) {
						ayniKullaniciLabel.setVisible(true);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// System.out.println("hata");
				}

			}
		});
		userKayitBtn.setFont(new Font("Dialog", Font.BOLD, 22));
		userKayitBtn.setBackground(Color.DARK_GRAY);
		userKayitBtn.setForeground(Color.PINK);
		userKayitBtn.setBounds(115, 733, 211, 68);

		loginPanel.add(userKayitBtn);

		ayniKullaniciLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		ayniKullaniciLabel.setBounds(77, 813, 306, 30);
		loginPanel.add(ayniKullaniciLabel);
		ayniKullaniciLabel.setVisible(false);
		sanatciSarkiList1.setFont(new Font("Dialog", Font.BOLD, 22));
		sanatciSarkiList2.setFont(new Font("Dialog", Font.BOLD, 22));

		allpoplist.setFont(new Font("Tahoma", Font.PLAIN, 25));
		allcazlist.setFont(new Font("Tahoma", Font.PLAIN, 25));
		allklasiklist.setFont(new Font("Tahoma", Font.PLAIN, 25));
		allUserlist.setFont(new Font("Tahoma", Font.PLAIN, 25));
		allAlbumlist.setFont(new Font("Tahoma", Font.PLAIN, 25));

		sanatciText = new JTextField();
		sanatciText.setFont(new Font("Dialog", Font.BOLD, 20));
		sanatciText.setColumns(10);
		sanatciText.setBounds(877, 325, 170, 55);

		ResultSet sanatciList = baglanti.sanatcilariListele();

		int counter2 = 0;
		while (sanatciList.next()) {
			sanatciModel.add(counter2, sanatciList.getString("sanatciAdi"));
			counter2++;
		}

		albumText = new JTextField();
		albumText.setFont(new Font("Dialog", Font.BOLD, 20));
		albumText.setColumns(10);
		albumText.setBounds(877, 404, 170, 55);

		ResultSet albumList = baglanti.albumleriListele();

		int counter = 0;
		while (albumList.next()) {
			albumModel.add(counter, albumList.getString("albumAdi"));
			counter++;
		}

		kullanicilariGuncelle();

		/*
		 * for(int i=0;i<users.get(0).klasikList.size();i++){
		 * System.out.println(users.get(0).klasikList.get(i)); }
		 */

		for (int i = 0; i < users.size(); i++) {

			kullanicilar[i] = new JButton("" + users.get(i).username);
			kullanicilar[i].setForeground(Color.PINK);
			kullanicilar[i].setBackground(Color.DARK_GRAY);
			kullanicilar[i].setFont(new Font("Tahoma", Font.BOLD, 22));
			contentPane.remove(kullanicilar[i]);
			contentPane.revalidate();
			contentPane.repaint();
		}

		for (int i = 0; i < users.size(); i++) {

			kullanicilar[i].setBounds(70 + 50, i * 60 + 50, 120, 60);
			userPanel.add(kullanicilar[i]);
			kullanicilar[i].repaint();

		}

		// kullaniciTakipButton();

		/*
		 * JButton btnNewButton = new JButton("New button");
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent arg0) { } }); btnNewButton.setBounds(73,
		 * 96, 98, 26); userPanel.add(btnNewButton);
		 */

		/*
		 * for (int i = 0; i < users.size(); i++) {
		 * System.out.println(users.get(i).username + " " +
		 * users.get(i).password + " " + users.get(i).tur + " " +
		 * users.get(i).ulke); }
		 */

		sarkiEkleLabels(false);

		albumEkleLabels(false);

		girisAktif(false);
		kayitAktif(false);

	}

	private void top10ListeGuncelle() throws Exception {
		// TODO Auto-generated method stub
		ResultSet top10Pop = baglanti.top10Listele("pop");
		ResultSet top10Caz = baglanti.top10Listele("caz");
		ResultSet top10Klasik = baglanti.top10Listele("klasik");
		ResultSet top10 = baglanti.top10Listele();

		popTop10DefaultList.clear();
		cazTop10DefaultList.clear();
		klasikTop10DefaultList.clear();
		genelTop10DefaultList.clear();

		popTop10List.setFont(new Font("Dialog", Font.BOLD, 18));
		cazTop10List.setFont(new Font("Dialog", Font.BOLD, 18));
		klasikTop10List.setFont(new Font("Dialog", Font.BOLD, 18));
		genelTop10List.setFont(new Font("Dialog", Font.BOLD, 18));

		for (int i = 0; i < 10; i++) {
			top10Pop.next();
			popTop10DefaultList.add(i, top10Pop.getString("sarkiAdi"));
		}
		top10Pop.close();
		popTop10List.setModel(popTop10DefaultList);
		popTop10Pane.setViewportView(popTop10List);

		for (int i = 0; i < 10; i++) {
			top10Caz.next();
			cazTop10DefaultList.add(i, top10Caz.getString("sarkiAdi"));
		}
		top10Caz.close();
		cazTop10List.setModel(cazTop10DefaultList);
		cazTop10Pane.setViewportView(cazTop10List);

		for (int i = 0; i < 10; i++) {
			top10Klasik.next();
			klasikTop10DefaultList.add(i, top10Klasik.getString("sarkiAdi"));
		}
		top10Klasik.close();
		klasikTop10List.setModel(klasikTop10DefaultList);
		klasikTop10Pane.setViewportView(klasikTop10List);

		for (int i = 0; i < 10; i++) {
			top10.next();
			genelTop10DefaultList.add(i, top10.getString("sarkiAdi"));
		}
		top10.close();
		genelTop10List.setModel(genelTop10DefaultList);
		genelTop10Pane.setViewportView(genelTop10List);
	}

	private void kullaniciTakipButton() {
		// TODO Auto-generated method stub
		for (int i = 0; i < users.size(); i++) {

			kullanicilar[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						kullanicilariGuncelle();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						// System.out.println("hata");
					}
					String user = arg0.getActionCommand();
					// System.out.println(user);
					for (int i = 0; i < users.size(); i++) {
						kullanicilar[i].setForeground(Color.PINK);
						if (users.get(i).username.equals(user)) {
							kullanicilar[i].setForeground(Color.GREEN);
							if (users.get(i).tur.equals("premium")) {
								otherpoplistAddButton.setVisible(true);
								othercazlistAddButton.setVisible(true);
								otherklasiklistaddButton.setVisible(true);
								otherpoplistAllAddButton.setVisible(true);
								othercazlistAllAddButton.setVisible(true);
								otherklasiklistAlladdButton.setVisible(true);
								otherpoplistButton.setVisible(true);
								othercazlistButton.setVisible(true);
								otherklasiklistButton.setVisible(true);
								otherPop.clear();
								for (int j = 0; j < users.get(i).popList.size(); j++) {
									otherPop.add(j, users.get(i).popList.get(j));
								}
								otherCaz.clear();
								for (int j = 0; j < users.get(i).cazList.size(); j++) {
									otherCaz.add(j, users.get(i).cazList.get(j));
								}
								otherKlasik.clear();
								for (int j = 0; j < users.get(i).klasikList.size(); j++) {
									otherKlasik.add(j, users.get(i).klasikList.get(j));
								}
							} else {
								otherpoplistAddButton.setVisible(false);
								othercazlistAddButton.setVisible(false);
								otherklasiklistaddButton.setVisible(false);
								otherklasiklistAlladdButton.setVisible(false);
								otherpoplistAllAddButton.setVisible(false);
								othercazlistAllAddButton.setVisible(false);
								otherpoplistButton.setVisible(false);
								othercazlistButton.setVisible(false);
								otherklasiklistButton.setVisible(false);
								otherPop.clear();
								otherCaz.clear();
								otherKlasik.clear();
								otherPop.add(0, users.get(i).username + " kullanýcýsý premium üye deðil");
								otherCaz.add(0, users.get(i).username + " kullanýcýsý premium üye deðil");
								otherKlasik.add(0, users.get(i).username + " kullanýcýsý premium üye deðil");
							}

						}
					}
				}
			});

		}

	}

	protected void dinleLabel(String string) throws Exception {
		// TODO Auto-generated method stub
		ResultSet rs = baglanti.sarkiGetir(string);
		rs.next();
		dinlenenSarkiLabel5
				.setText("Dinlenen Þarký: " + rs.getString("sarkiAdi") + "    " + baglanti.albumBul(rs.getInt("album"))
						+ "     " + baglanti.sanatciBul(rs.getInt("sanatci")) + " " + rs.getString("tur") + " "
						+ rs.getString("sure") + " dinlenme sayýsý:" + rs.getString("dinlenmeSayisi"));
		dinlenenSarkiLabel4
				.setText("Dinlenen Þarký: " + rs.getString("sarkiAdi") + "    " + baglanti.albumBul(rs.getInt("album"))
						+ "     " + baglanti.sanatciBul(rs.getInt("sanatci")) + " " + rs.getString("tur") + " "
						+ rs.getString("sure") + " dinlenme sayýsý:" + rs.getString("dinlenmeSayisi"));
		dinlenenSarkiLabel3
				.setText("Dinlenen Þarký: " + rs.getString("sarkiAdi") + "    " + baglanti.albumBul(rs.getInt("album"))
						+ "     " + baglanti.sanatciBul(rs.getInt("sanatci")) + " " + rs.getString("tur") + " "
						+ rs.getString("sure") + " dinlenme sayýsý:" + rs.getString("dinlenmeSayisi"));
		dinlenenSarkiLabel2
				.setText("Dinlenen Þarký: " + rs.getString("sarkiAdi") + "    " + baglanti.albumBul(rs.getInt("album"))
						+ "     " + baglanti.sanatciBul(rs.getInt("sanatci")) + " " + rs.getString("tur") + " "
						+ rs.getString("sure") + " dinlenme sayýsý:" + rs.getString("dinlenmeSayisi"));
		dinlenenSarkiLabel
				.setText("Dinlenen Þarký: " + rs.getString("sarkiAdi") + "    " + baglanti.albumBul(rs.getInt("album"))
						+ "     " + baglanti.sanatciBul(rs.getInt("sanatci")) + " " + rs.getString("tur") + " "
						+ rs.getString("sure") + " dinlenme sayýsý:" + rs.getString("dinlenmeSayisi"));
		rs.close();
	}

	private void kullanicilariGuncelle() throws Exception {
		// TODO Auto-generated method stub
		ResultSet userList = baglanti.kullanicilariListele();

		users.clear();

		while (userList.next()) {

			user user = new user(userList.getString("kullaniciAdi").toString(), userList.getString("sifre").toString(),
					userList.getString("pop").toString(), userList.getString("caz").toString(),
					userList.getString("klasik").toString(), userList.getString("abonelikTuru").toString(),
					userList.getString("ulke").toString());
			users.add(user);
		}
	}

	protected void tablo() throws Exception {
		// TODO Auto-generated method stub
		JPanel tabloPane;

		JTable sarkiTablosu;
		JTable albumTablosu;
		JTable sanatciTablosu;
		JTable kullaniciTablosu;

		DefaultTableModel sarkilar = new DefaultTableModel();
		DefaultTableModel albumler = new DefaultTableModel();
		DefaultTableModel sanatcilar = new DefaultTableModel();
		DefaultTableModel kullanicilar = new DefaultTableModel();
		Object[] sarkiKolonlari = { "ID", "Adý", "Tarih", "Sanatçý", "Albüm", "Tür", "Süre", "Dinlenme Sayýsý" };
		Object[] albumKolonlari = { "ID", "Adý", "Tarih", "Tür" };
		Object[] sanatciKolonlari = { "ID", "Adý", "Ülke" };
		Object[] kullaniciKolonlari = { "ID", "Kullanýcý Adý", "E-Mail", "Þifre", "Abonelik Türü", "Ülke", "pop", "caz",
				"klasik" };
		tabloPane = new JPanel();
		tabloPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		tabloPane.setBackground(Color.PINK);
		setContentPane(tabloPane);

		JButton tabloToAdmin = new JButton("Geri Dön");
		tabloToAdmin.setBounds(36, 13, 117, 76);
		tabloToAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adminPanel.setVisible(true);
				setContentPane(contentPane);

			}
		});
		tabloPane.setLayout(null);
		tabloPane.add(tabloToAdmin);
		tabloToAdmin.setForeground(Color.PINK);
		tabloToAdmin.setFont(new Font("Dialog", Font.BOLD, 18));
		tabloToAdmin.setBackground(Color.DARK_GRAY);

		ResultSet rs = baglanti.sarkilariListele();
		ResultSet rs2 = baglanti.albumleriListele();
		ResultSet rs3 = baglanti.sanatcilariListele();
		ResultSet rs4 = baglanti.kullanicilariListele();

		sarkilar.setColumnIdentifiers(sarkiKolonlari);
		albumler.setColumnIdentifiers(albumKolonlari);
		sanatcilar.setColumnIdentifiers(sanatciKolonlari);
		kullanicilar.setColumnIdentifiers(kullaniciKolonlari);

		while (rs.next()) {

			Object[] sarkiSatirlari = { rs.getInt("sarkiID"), rs.getString("sarkiAdi"), rs.getString("tarih"),
					rs.getString("Sanatci"), rs.getString("Album"), rs.getString("tur"), rs.getString("sure"),
					rs.getString("dinlenmeSayisi") };
			sarkilar.addRow(sarkiSatirlari);
		}

		while (rs2.next()) {

			Object[] albumSatirlari = { rs2.getInt("albumID"), rs2.getString("albumAdi"), rs2.getString("tarih"),
					rs2.getString("tur") };
			albumler.addRow(albumSatirlari);
		}

		while (rs3.next()) {

			Object[] sanatciSatirlari = { rs3.getInt("sanatciID"), rs3.getString("sanatciAdi"), rs3.getString("ulke") };
			sanatcilar.addRow(sanatciSatirlari);
		}

		while (rs4.next()) {

			Object[] kullaniciSatirlari = { rs4.getInt("kullaniciID"), rs4.getString("kullaniciAdi"),
					rs4.getString("email"), rs4.getString("sifre"), rs4.getString("abonelikTuru"),
					rs4.getString("ulke"), rs4.getString("pop"), rs4.getString("caz"), rs4.getString("klasik") };
			kullanicilar.addRow(kullaniciSatirlari);
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 140, 980, 332);
		scrollPane.setBackground(Color.pink);
		tabloPane.add(scrollPane);

		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(873, 576, 597, 225);
		tabloPane.add(scrollPane2);

		JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(1036, 140, 434, 332);
		tabloPane.add(scrollPane3);

		JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(44, 576, 817, 225);
		tabloPane.add(scrollPane4);

		sarkiTablosu = new JTable();
		sarkiTablosu.setSurrendersFocusOnKeystroke(true);
		sarkiTablosu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sarkiTablosu.setModel(sarkilar);
		sarkiTablosu.setBounds(152, 379, 526, 200);
		scrollPane.setViewportView(sarkiTablosu);

		albumTablosu = new JTable();
		albumTablosu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		albumTablosu.setModel(albumler);
		albumTablosu.setBounds(152, 379, 526, 200);
		scrollPane2.setViewportView(albumTablosu);

		sanatciTablosu = new JTable();
		sanatciTablosu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		sanatciTablosu.setModel(sanatcilar);
		sanatciTablosu.setBounds(152, 379, 526, 200);
		scrollPane3.setViewportView(sanatciTablosu);

		kullaniciTablosu = new JTable();
		kullaniciTablosu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		kullaniciTablosu.setModel(kullanicilar);
		kullaniciTablosu.setBounds(152, 379, 526, 200);
		scrollPane4.setViewportView(kullaniciTablosu);

		sarkiTablosu.setRowHeight(40);
		albumTablosu.setRowHeight(40);
		sanatciTablosu.setRowHeight(40);
		kullaniciTablosu.setRowHeight(40);

		JLabel lblNewLabel = new JLabel("\u015Eark\u0131 Tablosu");
		lblNewLabel.setBounds(46, 102, 141, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		tabloPane.add(lblNewLabel);

		JLabel lblAlbmTablosu = new JLabel("Alb\u00FCm Tablosu");
		lblAlbmTablosu.setBounds(876, 545, 160, 34);
		lblAlbmTablosu.setFont(new Font("Tahoma", Font.BOLD, 20));
		tabloPane.add(lblAlbmTablosu);

		JLabel lblSanatTablosu = new JLabel("Sanat\u00E7\u0131 Tablosu");
		lblSanatTablosu.setBounds(1036, 102, 181, 34);
		lblSanatTablosu.setFont(new Font("Tahoma", Font.BOLD, 20));
		tabloPane.add(lblSanatTablosu);

		JLabel lblKullancTablosu = new JLabel("Kullan\u0131c\u0131 Tablosu");
		lblKullancTablosu.setBounds(44, 545, 181, 34);
		lblKullancTablosu.setFont(new Font("Tahoma", Font.BOLD, 20));
		tabloPane.add(lblKullancTablosu);

		JButton sarkiUpdateButton = new JButton("\u015Eark\u0131lar\u0131 G\u00FCncelle");
		sarkiUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while (i < sarkilar.getRowCount()) {
					try {
						baglanti.sarkiGuncelle(Integer.parseInt(sarkilar.getValueAt(i, 0).toString()),
								sarkilar.getValueAt(i, 1) + "", sarkilar.getValueAt(i, 2) + "",
								sarkilar.getValueAt(i, 3) + "", sarkilar.getValueAt(i, 4) + "",
								sarkilar.getValueAt(i, 5) + "", sarkilar.getValueAt(i, 6) + "",
								Integer.parseInt(sarkilar.getValueAt(i, 7).toString()));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						// e1.printStackTrace();
					}
					i++;
					/*
					 * System.out.print(sarkilar.getValueAt(i, 0)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 1)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 2)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 3)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 4)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 5)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 6)+" ");
					 * System.out.print(sarkilar.getValueAt(i, 7)+" ");
					 */

				}
			}
		});
		sarkiUpdateButton.setForeground(Color.PINK);
		sarkiUpdateButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sarkiUpdateButton.setBackground(Color.DARK_GRAY);
		sarkiUpdateButton.setBounds(360, 485, 351, 34);
		tabloPane.add(sarkiUpdateButton);

		JButton sanatciUpdateButton = new JButton("Sanat\u00E7\u0131lar\u0131 G\u00FCncelle");
		sanatciUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while (i < sanatcilar.getRowCount()) {
					/*
					 * System.out.print(sanatcilar.getValueAt(i, 0)+"");
					 * System.out.print(sanatcilar.getValueAt(i, 1)+"");
					 * System.out.print(sanatcilar.getValueAt(i, 2)+"");
					 * System.out.println();
					 */
					try {
						baglanti.sanatciGuncelle(Integer.parseInt(sanatcilar.getValueAt(i, 0).toString()),
								sanatcilar.getValueAt(i, 1) + "", sanatcilar.getValueAt(i, 2) + "");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						// e1.printStackTrace();
					}
					i++;
				}
			}
		});
		sanatciUpdateButton.setForeground(Color.PINK);
		sanatciUpdateButton.setFont(new Font("Dialog", Font.BOLD, 18));
		sanatciUpdateButton.setBackground(Color.DARK_GRAY);
		sanatciUpdateButton.setBounds(1076, 485, 351, 34);
		tabloPane.add(sanatciUpdateButton);

		// baglanti.kullaniciGuncelle(4,"furkan","furkan@gmail","12345",
		// "premium", "türkiye");

		JButton kullaniciUpdateButton = new JButton("Kullan\u0131c\u0131lar\u0131 G\u00FCncelle");
		kullaniciUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while (i < kullanicilar.getRowCount()) {
					/*
					 * System.out.print(kullanicilar.getValueAt(i, 0)+" ");
					 * System.out.print(kullanicilar.getValueAt(i, 1)+" ");
					 * System.out.print(kullanicilar.getValueAt(i, 2)+" ");
					 * System.out.print(kullanicilar.getValueAt(i, 3)+" ");
					 * System.out.print(kullanicilar.getValueAt(i, 4)+" ");
					 * System.out.print(kullanicilar.getValueAt(i, 5)+" ");
					 * System.out.println();
					 */
					try {
						baglanti.kullaniciGuncelle(Integer.parseInt(kullanicilar.getValueAt(i, 0).toString()),
								kullanicilar.getValueAt(i, 1) + "", kullanicilar.getValueAt(i, 2) + "",
								kullanicilar.getValueAt(i, 3) + "", kullanicilar.getValueAt(i, 4) + "",
								kullanicilar.getValueAt(i, 5) + "", kullanicilar.getValueAt(i, 6) + "",
								kullanicilar.getValueAt(i, 7) + "", kullanicilar.getValueAt(i, 8) + "");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						// e1.printStackTrace();
					}
					i++;
				}

			}
		});
		kullaniciUpdateButton.setForeground(Color.PINK);
		kullaniciUpdateButton.setFont(new Font("Dialog", Font.BOLD, 18));
		kullaniciUpdateButton.setBackground(Color.DARK_GRAY);
		kullaniciUpdateButton.setBounds(267, 806, 351, 34);
		tabloPane.add(kullaniciUpdateButton);

		JButton albumUpdateButton = new JButton("Alb\u00FCmleri G\u00FCncelle");
		albumUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = 0;
				while (i < albumler.getRowCount()) {
					/*
					 * System.out.print(albumler.getValueAt(i, 0)+"");
					 * System.out.print(albumler.getValueAt(i, 1)+"");
					 * System.out.print(albumler.getValueAt(i, 2)+"");
					 * System.out.print(albumler.getValueAt(i, 3)+"");
					 * System.out.println();
					 */

					try {
						baglanti.albumGuncelle(Integer.parseInt(albumler.getValueAt(i, 0).toString()),
								albumler.getValueAt(i, 1) + "", albumler.getValueAt(i, 2) + "",
								albumler.getValueAt(i, 3) + "");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						// e1.printStackTrace();
					}
					i++;
				}
			}
		});
		albumUpdateButton.setForeground(Color.PINK);
		albumUpdateButton.setFont(new Font("Dialog", Font.BOLD, 18));
		albumUpdateButton.setBackground(Color.DARK_GRAY);
		albumUpdateButton.setBounds(1036, 806, 351, 34);
		tabloPane.add(albumUpdateButton);

		/*
		 * JButton btnNewButton = new JButton("New button");
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { int i = 0;
		 * 
		 * while (i < kullanicilar.getRowCount()) {
		 * System.out.print(kullanicilar.getValueAt(i, 0)+" ");
		 * System.out.print(kullanicilar.getValueAt(i, 1)+" ");
		 * System.out.print(kullanicilar.getValueAt(i, 2)+" ");
		 * System.out.print(kullanicilar.getValueAt(i, 3)+" ");
		 * System.out.print(kullanicilar.getValueAt(i, 4)+" ");
		 * System.out.println(); i++; } } }); btnNewButton.setBounds(247, 65,
		 * 117, 64); tabloPane.add(btnNewButton);
		 */
	}

	private void albumEkleLabels(boolean b) {
		// TODO Auto-generated method stub

		albumLabel1.setVisible(b);
		albumLabel4.setVisible(b);
		albumLabel5.setVisible(b);

		albumAdiText.setVisible(b);
		albumTarihText.setVisible(b);
		albumTurText.setVisible(b);

		albumEkle.setVisible(b);

	}

	protected void albumTextTemizle() {
		// TODO Auto-generated method stub
		albumAdiText.setText("");
		tarihText.setText("");
		albumTarihText.setText("");
		albumTurText.setText("");
	}

	protected void sarkiTextTemizle() {
		// TODO Auto-generated method stub
		sarkiText.setText("");
		tarihText.setText("");
		sanatciText.setText("");
		albumText.setText("");
		turText.setText("");
		sureText.setText("");
		sayiText.setText("");
	}

	private void sarkiEkleLabels(boolean b) {
		// TODO Auto-generated method stub
		sarkiText.setVisible(b);
		tarihText.setVisible(b);
		sanatciText.setVisible(b);
		albumText.setVisible(b);
		turText.setVisible(false);
		sureText.setVisible(b);
		sayiText.setVisible(b);

		albumPane.setVisible(b);
		sanatciPane.setVisible(b);

		sarkiLabel1.setVisible(b);
		sarkiLabel2.setVisible(b);
		sarkiLabel3.setVisible(b);
		sarkiLabel4.setVisible(b);
		sarkiLabel5.setVisible(false);
		sarkiLabel6.setVisible(b);
		sarkiLabel7.setVisible(b);

		sarkiEkle.setVisible(b);

	}

	private void girisAktif(boolean b) {
		// TODO Auto-generated method stub
		userPswLabel.setVisible(b);
		userNameLabel.setVisible(b);
		userNameText.setVisible(b);
		userPasswordText.setVisible(b);
		userGirisButton.setVisible(b);
		userKayitButton.setVisible(b);
	}

	private void kayitAktif(boolean b) {
		// TODO Auto-generated method stub
		userKayitLabel.setVisible(b);
		userKayitLabel2.setVisible(b);
		userKayitLabel3.setVisible(b);
		userKayitLabel4.setVisible(b);
		userKayitLabel5.setVisible(b);

		userKayitUsername.setVisible(b);
		userKayitEmail.setVisible(b);
		userKayitSifre.setVisible(b);
		userKayitTur.setVisible(b);
		userKayitUlke.setVisible(b);
		userKayitBtn.setVisible(b);

	}
}