package fr.poec.gestion_rh.bdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditorBdd {

	public void createBdd() {
		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			ResultSet rs = statement.executeQuery("CREATE DATABASE Gimyps");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertInto() {
		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			ResultSet rs = statement.executeQuery("INSERT INTO " + this.getListTable());
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String getListTable() {
		// TODO Auto-generated method stub
		return null;
	}
}
