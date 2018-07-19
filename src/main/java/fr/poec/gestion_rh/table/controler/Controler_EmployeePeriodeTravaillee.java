package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.EmployeePeriodeTravaillee;

public class Controler_EmployeePeriodeTravaillee {

	public List<EmployeePeriodeTravaillee> getDataFromTable() {
		List<EmployeePeriodeTravaillee> employeeperiodetravaillees = new ArrayList<EmployeePeriodeTravaillee>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM EmployeePeriodeTravaillee");

				while (rs.next()) {
					EmployeePeriodeTravaillee employeeperiodetravaillee = new EmployeePeriodeTravaillee();
					employeeperiodetravaillee.setId(rs.getInt("id"));
					employeeperiodetravaillee.setIdEmployee(rs.getInt("id_employe"));
					employeeperiodetravaillee.setIdPeriodeTravaillee(rs.getInt("id_periodeTravaillee"));
					employeeperiodetravaillee.setNbHeures(rs.getFloat("nbHeures"));
					employeeperiodetravaillees.add(employeeperiodetravaillee);
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

		return employeeperiodetravaillees;
	}
	
}
