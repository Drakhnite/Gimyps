package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.Employee;

public class Controler_Employee {

	public List<Employee> getDataFromTable() {
		List<Employee> employees = new ArrayList<Employee>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM Employee");

				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt("id"));
					employee.setNom(rs.getString("nom"));
					employee.setPrenom(rs.getString("prenom"));
					employee.setDateEntree(rs.getDate("dateEntree"));
					employee.setDateSortie(rs.getDate("dateSortie"));
					employee.setTypeContrat(rs.getString("typeContrat"));
					employee.setSalaireHoraire(rs.getFloat("salaireHoraire"));
					employee.setDureeHebdomadaire(rs.getFloat("dureeHebdomadaire"));
					employee.setBulletinEmail(rs.getBoolean("bulletinEmail"));
					
					employees.add(employee);
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

		return employees;
	}
	
}
