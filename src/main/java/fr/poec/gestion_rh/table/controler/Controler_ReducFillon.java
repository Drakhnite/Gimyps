package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.ReducFillon;

public class Controler_ReducFillon {

	public void createTable() {

		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			statement.executeUpdate(
					"create table reducfillon(id bigint unsigned auto_increment primary key not null unique," + "TselonFnal float," + 
					"C float," + "LimiteSmic float," + "dateDebut date," + "dateFin date)");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ReducFillon> getDataFromTable() {
		List<ReducFillon> reducfillons = new ArrayList<ReducFillon>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM ReducFillon");

				while (rs.next()) {
					ReducFillon reducfillon = new ReducFillon();
					reducfillon.setId(rs.getInt("id"));
					reducfillon.settFnal(rs.getFloat("TselonFnal"));
					reducfillon.setCoeff(rs.getFloat("C"));
					reducfillon.setLimiteSmic(rs.getFloat("LimiteSmic"));
					reducfillon.setDateDebut(rs.getDate("dateDebut"));
					reducfillon.setDateFin(rs.getDate("dateFin"));
					reducfillons.add(reducfillon);
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

		return reducfillons;
	}
	
}
