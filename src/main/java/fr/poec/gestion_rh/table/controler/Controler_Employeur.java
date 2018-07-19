package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.Employeur;

public class Controler_Employeur {

	public List<Employeur> getDataFromTable() {
		List<Employeur> employeurs = new ArrayList<Employeur>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM Employeur");

				while (rs.next()) {
					Employeur employeur = new Employeur();
					employeur.setId(rs.getInt("id"));
					employeur.setNom(rs.getString("nom"));
					employeur.setAdresse(rs.getString("adresse"));
					employeur.setConvention(rs.getString("convention"));
					employeur.setSiren(rs.getString("siren"));
					employeurs.add(employeur);
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

		return employeurs;
	}
	
}
