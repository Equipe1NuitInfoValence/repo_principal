package fr.wdctn.classes;
import java.sql.*;

/**
 * @author Loic
 *
 */
public class GestionBdD //implements InterBdD
{
	private String sql = "SELECT * FROM personne WHERE nom = ?";
	private String url = "109.69.193.29";
	private String login = "root";
	private String mdp = "nuOGUMtutBWjCVMBS4is";
	private PreparedStatement preparedStatement = null;
	private Connection connect = null;
	
	private void connect()
	{
		Connection connect = null;
		try
		{
			Class.forName("com.mysql.jdbc.driver");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			connect = DriverManager.getConnection(url,login ,mdp );
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
	}

	@Override
	public void getEvenement(Planning Parcours, Information Info)
	{
		Evenement resEvenement = new Evenement();
		ResultSet rs = null;
		try
		{
			preparedStatement = connect.prepareStatement(sql);
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			preparedStatement.setObject(1, "Martin");
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
		while (rs.next())
		{
			String prenom = rs.getString(")
			System.out.println(arg0)
		}
	}

}
