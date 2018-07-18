package fr.poec.gestion_rh.table.controler;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.Login;

public class Controler_Login {

	private List<Object> list = new ArrayList<Object>();

	public void createTable() {

		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			statement.executeUpdate("CREATE TABLE Login (id integer auto_increment primary key,)");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Login> getDataFromTable() {
		List<Login> logins = new ArrayList<Login>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM Login");
				// ResultSetMetaData resultMeta = rs.getMetaData();
				//
				// for (int i = 0; i < resultMeta.getColumnCount(); i++) {
				// String column = resultMeta.getColumnName(i).toUpperCase();
				// list.add(new String(column));
				// }
				while (rs.next()) {
					Login login = new Login();
					login.setId(rs.getInt("id"));
					login.setIdEmployee(rs.getInt("id_employe"));
					login.setPassword(rs.getString("mdp"));
					login.setRole(rs.getString("role"));
					login.setUser(rs.getString("login"));
					logins.add(login);
				}
				rs.close();
			} catch (SQLException e)

			{
				e.printStackTrace();
			}

		} catch (SQLException e)

		{
			e.printStackTrace();
		}

		return logins;
	}
}
