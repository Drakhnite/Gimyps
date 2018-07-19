package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.PeriodeTravaillee;

public class Controler_PeriodeTravaillee {

	public List<PeriodeTravaillee> getDataFromTable() {
		List<PeriodeTravaillee> periodetravaillees = new ArrayList<PeriodeTravaillee>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM PeriodeTravaillee");

				while (rs.next()) {
					PeriodeTravaillee periodetravaillee = new PeriodeTravaillee();
					periodetravaillee.setId(rs.getInt("id"));
					periodetravaillee.setDate(rs.getDate("date"));
					periodetravaillee.setNbHeures(rs.getFloat("nbHeures"));
					periodetravaillee.setAbsence(rs.getBoolean("absence"));
					periodetravaillees.add(periodetravaillee);
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

		return periodetravaillees;
	}
	
}
