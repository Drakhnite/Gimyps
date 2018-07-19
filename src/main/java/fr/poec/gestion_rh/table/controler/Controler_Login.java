package fr.poec.gestion_rh.table.controler;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.Login;

public class Controler_Login {
	Scanner sc = new Scanner(System.in);
	
	public void createTable() {

		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			statement.executeUpdate(
					"create table login(id bigint unsigned auto_increment primary key not null unique," + "id_employe bigint unsigned not null,"
							+ "foreign key(id_employe) references employe(id)," + "role varchar(50)," + "login varchar(50)," + "mdp varchar(50))");
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

	public void insertIntoTable() {
		// Todo references.
		String id_employe, mdp, role, login;
		String concat1 = "";
		String concat2 = "";
		System.out.println("Id_employe = ");
		id_employe = sc.nextLine();
		System.out.println("mdp = ");
		mdp = sc.nextLine();
		System.out.println("role = ");
		role = sc.nextLine();
		System.out.println("login = ");
		login = sc.nextLine();

		concat1 = id_employe.equals("") ? concat1 : concat1 + id_employe;
		concat1 = mdp.equals("") ? concat1 : concat1 + "'" + mdp + "'";
		concat1 = role.equals("") ? concat1 : concat1 + "'" + role + "'";
		concat1 = login.equals("") ? concat1 : concat1 + "'" + login + "'";

		concat2 = id_employe.equals("") ? concat2 : concat2 + "id_employe";
		concat2 = mdp.equals("") ? concat2 : concat2 + "mdp";
		concat2 = role.equals("") ? concat2 : concat2 + "role";
		concat2 = login.equals("") ? concat2 : concat2 + "login";

		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("INSERT INTO Login (" + concat2 + ") VALUES (" + concat1 + ")");

				rs.close();
			} catch (SQLException e)

			{
				e.printStackTrace();
			}

		} catch (SQLException e)

		{
			e.printStackTrace();
		}
		return;
	}

	public void updateTable() {
		// Todo references.
		String id_employe, mdp, role, login;
		String concat1 = "";
		String concat2 = "";
		System.out.println("Id_employe = ");
		id_employe = sc.nextLine();
		System.out.println("mdp = ");
		mdp = sc.nextLine();
		System.out.println("role = ");
		role = sc.nextLine();
		System.out.println("login = ");
		login = sc.nextLine();

		concat1 = id_employe.equals("") ? concat1 : concat1 + id_employe;
		concat1 = mdp.equals("") ? concat1 : concat1 + "'" + mdp + "'";
		concat1 = role.equals("") ? concat1 : concat1 + "'" + role + "'";
		concat1 = login.equals("") ? concat1 : concat1 + "'" + login + "'";

		concat2 = id_employe.equals("") ? concat2 : concat2 + "id_employe";
		concat2 = mdp.equals("") ? concat2 : concat2 + "mdp";
		concat2 = role.equals("") ? concat2 : concat2 + "role";
		concat2 = login.equals("") ? concat2 : concat2 + "login";

		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				// Todo récupérer l'ID lors de la modification selon le nom de la table
				// employee.
				// via l'id_employe qui renvoie à l'ID de la table Login.
				ResultSet rs = statement.executeQuery("UPDATE Login SET " + concat2 + " = " + concat1 + " WHERE id = ");

				rs.close();
			} catch (SQLException e)

			{
				e.printStackTrace();
			}

		} catch (SQLException e)

		{
			e.printStackTrace();
		}
		return;
	}

	public void deleteData() {

		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				// Todo récupérer l'ID lors de la modification selon le nom de la table
				// employee.
				// via l'id_employe qui renvoie à l'ID de la table Login.
				ResultSet rs = statement.executeQuery("DELETE FROM Login WHERE id = ");

				rs.close();
			} catch (SQLException e)

			{
				e.printStackTrace();
			}

		} catch (SQLException e)

		{
			e.printStackTrace();
		}
		return;
	}
}
