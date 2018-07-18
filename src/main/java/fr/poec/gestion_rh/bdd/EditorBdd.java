//package fr.poec.gestion_rh.bdd;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class EditorBdd {
//
//	public void createBdd() {
//		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
//			statement.executeUpdate("CREATE DATABASE Gimyps");
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void insertInto() {
//		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
//			statement.executeUpdate("INSERT INTO " + this.getListTable());
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void getData(String... args) {
//		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
//			ResultSet rs = statement.executeQuery("SELECT " + this.getListColumn() + " FROM " + this.getListTable());
//			rs.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
