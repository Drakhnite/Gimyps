package fr.poec.gestion_rh.bdd;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionToBdd {

	public static Connection createConnection() {
        Connection conn = null;
        MysqlDataSource dataSource = new MysqlDataSource();

        // Add settings about the data source.
        dataSource.setServerName("127.0.0.1");
        dataSource.setUser("root");
        dataSource.setPassword("");
        dataSource.setDatabaseName("Gimpyps");

        // Create the connection to our database.
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Problème avec la base de données : " + e.getMessage());
            System.exit(-2);
        }

        return conn;
    }
}
