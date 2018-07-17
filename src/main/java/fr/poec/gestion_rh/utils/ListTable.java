package fr.poec.gestion_rh.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSetMetaData;
import fr.poec.gestion_rh.bdd.ConnectionToBdd;
import fr.poec.gestion_rh.table.Table;

public class ListTable {

	private String[] listTable;
	private int i;
	private String name;
	private List<Table> list = new ArrayList<Table>();

	public void getListColumn() {

		setListTable();

		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			ResultSet rs1 = statement.executeQuery("SELECT * FROM " + listTable[i]);
			ResultSetMetaData resultMeta = rs1.getMetaData();

			for (i = 0; i < resultMeta.getColumnCount(); i++) {
				String column = resultMeta.getColumnName(i).toUpperCase();
				Table.getColumn().add(new String(column));
			}
			rs1.close();
		} catch (SQLException e)

		{
			e.printStackTrace();
		}
	}

	public void setListTable() {
		try (Connection conn = ConnectionToBdd.createConnection(); Statement statement = conn.createStatement()) {
			ResultSet rs = statement.executeQuery("SHOW TABLES");

			for (i = 0; rs.next(); i++) {

				String name = rs.getString("Tables_in_gimyps");

				listTable[i] = name;
			}

			rs.close();
		} catch (SQLException e)

		{
			e.printStackTrace();
		}
	}
	
	public String getListTable(String name) {
		for (i = 0; i<listTable.length; i++) {

			if (name.equals(listTable[i])) {
				name = listTable[i];
			}
		}return name;
	}
}
