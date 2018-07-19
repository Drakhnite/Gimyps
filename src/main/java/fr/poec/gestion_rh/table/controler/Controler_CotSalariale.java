package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.CotSalariale;

public class Controler_CotSalariale {

	public List<CotSalariale> getDataFromTable() {
		List<CotSalariale> cotsalariales = new ArrayList<CotSalariale>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM CotSalariale");

				while (rs.next()) {
					CotSalariale cotsalariale = new CotSalariale();
					cotsalariale.setId(rs.getInt("id"));
					cotsalariale.setDateDebut(rs.getDate("dateDebut"));
					cotsalariale.setDateFin(rs.getDate("dateFin"));
					cotsalariale.setsSMaladie(rs.getFloat("SSMaladie"));
					cotsalariale.setCompInval(rs.getFloat("CompInval"));
					cotsalariale.setCompSante(rs.getFloat("CompSante"));
					cotsalariale.setAccMadPro(rs.getFloat("AccMadPro"));
					cotsalariale.setRetSecuPlaf(rs.getFloat("RetSecuPlaf"));
					cotsalariale.setRetSecuNon(rs.getFloat("RetSecuNon"));
					cotsalariale.setCompTr1(rs.getFloat("CompTr1"));
					cotsalariale.setCompTr2(rs.getFloat("CompTr2"));
					cotsalariale.setFamSS(rs.getFloat("FamSS"));
					cotsalariale.setAssuChom(rs.getFloat("AssuChom"));
					cotsalariale.setForfaitSoc(rs.getFloat("ForfaitSoc"));
					cotsalariale.setAutresContr(rs.getFloat("AutresContr"));
					cotsalariale.setCotiConvColl(rs.getFloat("CotiConvColl"));
					cotsalariale.setCsgNonImpo(rs.getFloat("CSGNonImpo"));
					cotsalariale.setCgsCrds(rs.getFloat("CGS_CRDS"));
					cotsalariales.add(cotsalariale);
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

		return cotsalariales;
	}
	
}
