/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GATEWAY1-
 */
public class Serverprod {

    private final String URL8 = "jdbc:sqlserver://192.168.6.8\\SQLEXPRESS:9205;databaseName=";
    private final String urlB = "jdbc:sqlserver://192.168.90.1\\datos620:1433;database=";

    private final String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection getconexionB(String bd) throws ClassNotFoundException, IOException, SQLException {
        Class.forName(drive);
        Connection conB;
        conB = DriverManager.getConnection(urlB+bd, "sa", "Admin1305");
        System.out.println("Conectado a server B");
        return conB;
    }

    public Connection getconexionserver8(String bd) throws ClassNotFoundException, IOException, SQLException {
        Class.forName(drive);
        Connection connect8= DriverManager.getConnection(URL8 + bd, "sa", "Prok2001");
        System.out.println("Conectado a server 8" + bd);
        return connect8;
    }

    
}
