package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.RegleLegale;

public class Controler_RegleLegale {

	public List<RegleLegale> getDataFromTable() {
		List<RegleLegale> reglelegales = new ArrayList<RegleLegale>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM RegleLegale");

				while (rs.next()) {
					RegleLegale reglelegale = new RegleLegale();
					reglelegale.setId(rs.getInt("id"));
					reglelegale.setDateDebut(rs.getDate("dateDebut"));
					reglelegale.setDateFin(rs.getDate("dateFin"));
					reglelegale.setTauxHeureSup1(rs.getFloat("tauxHeureSup1"));
					reglelegale.setTauxHeureSup2(rs.getFloat("tauxHeureSup2"));
					reglelegale.setBaseHebdo(rs.getFloat("baseHebdo"));
					reglelegale.setPlafondSecu(rs.getFloat("plafondSecu"));
					reglelegale.setBaseMensuelle(rs.getFloat("baseMensuelle"));
					reglelegale.setSalaireMensuel(rs.getFloat("salaireMensuel"));
					reglelegale.setTauxHoraire(rs.getFloat("tauxHoraire"));
					reglelegale.setSmicHoraire(rs.getFloat("smicHoraire"));
					reglelegale.setTauxTransport(rs.getFloat("tauxTransport"));
					reglelegale.setTauxCotisAccTravail(rs.getFloat("tauxCotisAccTravail"));
					reglelegale.setPartFormation(rs.getFloat("partFormation"));
					reglelegale.setTaxeApprentissage(rs.getFloat("taxeApprentissage"));
					reglelegale.setEffectif(rs.getInt("effectif"));
					reglelegales.add(reglelegale);
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

		return reglelegales;
	}
	
}
