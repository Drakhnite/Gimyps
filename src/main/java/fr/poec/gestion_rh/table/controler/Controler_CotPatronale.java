package fr.poec.gestion_rh.table.controler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.CotPatronale;

public class Controler_CotPatronale {

	public void createTable() {

		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			statement.executeUpdate(
					"create table cotPatronale(id bigint unsigned auto_increment primary key not null unique," + "dateDebut date," + "dateFin date," + "SSMaladie float," + "CompInval float," + "CompSante float," + "AccMadPro float," + 
			"RetSecuPlaf float," + "RetSecuNon float," + "CompTr1 float," + "CompTr2 float," + "FamSS float," + "AssuChom float," + "ForfaitSoc float," + "AutresContr float," + "CotiConvColl float," + "CSGNonImpo float," + "CGS_CRDS float)");
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<CotPatronale> getDataFromTable() {
		List<CotPatronale> cotpatronales = new ArrayList<CotPatronale>();
		try (Connection conn = ConnectionToBdd.createConnection()) {
			try (Statement statement = conn.createStatement()) {
				ResultSet rs = statement.executeQuery("SELECT * FROM CotPatronale");

				while (rs.next()) {
					CotPatronale cotpatronale = new CotPatronale();
					cotpatronale.setId(rs.getInt("id"));
					cotpatronale.setDateDebut(rs.getDate("dateDebut"));
					cotpatronale.setDateFin(rs.getDate("dateFin"));
					cotpatronale.setsSMaladie(rs.getFloat("SSMaladie"));
					cotpatronale.setCompInval(rs.getFloat("CompInval"));
					cotpatronale.setCompSante(rs.getFloat("CompSante"));
					cotpatronale.setAccMadPro(rs.getFloat("AccMadPro"));
					cotpatronale.setRetSecuPlaf(rs.getFloat("RetSecuPlaf"));
					cotpatronale.setRetSecuNon(rs.getFloat("RetSecuNon"));
					cotpatronale.setCompTr1(rs.getFloat("CompTr1"));
					cotpatronale.setCompTr2(rs.getFloat("CompTr2"));
					cotpatronale.setFamSS(rs.getFloat("FamSS"));
					cotpatronale.setAssuChom(rs.getFloat("AssuChom"));
					cotpatronale.setForfaitSoc(rs.getFloat("ForfaitSoc"));
					cotpatronale.setAutresContr(rs.getFloat("AutresContr"));
					cotpatronale.setCotiConvColl(rs.getFloat("CotiConvColl"));
					cotpatronale.setCsgNonImpo(rs.getFloat("CSGNonImpo"));
					cotpatronale.setCgsCrds(rs.getFloat("CGS_CRDS"));
					cotpatronales.add(cotpatronale);
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

		return cotpatronales;
	}
	
}
