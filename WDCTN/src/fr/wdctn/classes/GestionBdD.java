package fr.wdctn.classes;
import java.sql.*;

/**
 * @author Loic
 *
 */
public class GestionBdD //implements InterBdD
{
	private final String SQL = "SELECT * FROM personne WHERE nom = ?";
	private String url;
	private String login;
	private String mdp;
	private PreparedStatement preparedStatement;
	private Connection connect;
	private String driver;
	
	private void connect()
	{
		try
		{
			Class.forName(driver);
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			this.connect = DriverManager.getConnection(url,login ,mdp );
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	/**
	 * @param url
	 * @param login
	 * @param mdp
	 * @param driver 
	 */
	public GestionBdD(String url, String login, String mdp, String driver)
	{
		super();
		this.driver = driver;
		this.url = url;
		this.login = login;
		this.mdp = mdp;
		preparedStatement = null;
		connect = null;
	}

	/**
	 * Méthode permettant de recupérer un évênement
	 */
	public void test()
	{
		this.connect();
		Evenement resEvenement = new Evenement();
		ResultSet rs = null;
		try
		{
			preparedStatement = connect.prepareStatement(SQL);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			preparedStatement.setString(1, "Martin");
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			rs = preparedStatement.executeQuery();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			while (rs.next())
			{
				String prenom = rs.getString("prenom");
				System.out.println(prenom);
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			connect.close();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//SELECT * 
	//FROM tag JOIN acttag ON tag.id_gout = acttag.gout JOIN activite ON acttag.act = activite.id
	//WHERE :typeact = activites.typeact;
	
	/**
	 * @return
	 * @throws SQLException 
	 */
	public void genererMapCat() throws SQLException
	{
		String reqTypes = "SELECT DISTINCT typeact FROM activite";
		String reqGout = "SELECT * FROM tag JOIN acttag ON tag.id_gout = acttag.tag JOIN activite ON acttag.act = activite.id WHERE ? = activite.typeact";
		MapCat mpCat = new MapCat();
		ResultSet rstype = null;
		this.connect();
		Statement stat = connect.createStatement();
		rstype = stat.executeQuery(reqTypes);
		int i = 0;
		ResultSet rsGout = null;
		while (rstype.next())
		{
			String type = rstype.getString("typeact");
			System.out.println("type : "+type);
			Categorie cate = new Categorie(type, i);
			preparedStatement = connect.prepareStatement(reqGout);
			preparedStatement.setString(1, type);
			rsGout = preparedStatement.executeQuery();
			int j = 0;
			while (rsGout.next())
			{
				int id = rsGout.getInt("id_gout");
				String libel = rsGout.getString("gout");
				System.out.println("gout: "+libel+" , "+id);
				cate.addTag(j, libel);
			}
			mpCat.addCategorie(cate);
			i++;
		}
		connect.close();
		//return mpCat;
		
		
	}

}



