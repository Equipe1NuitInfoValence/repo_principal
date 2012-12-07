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
	
	private void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
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
	 */
	public GestionBdD(String url, String login, String mdp)
	{
		super();
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

}


