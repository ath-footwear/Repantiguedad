/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GATEWAY1-
 */
public class Serverylite {

    private Connection connectlite3;

    FileWriter fichero2 = null;
    private final String urliteusuario = "C:\\af\\prod\\usuarios.db";

    public Connection getconexionusuarios() throws ClassNotFoundException, IOException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connectlite3 = DriverManager.getConnection("jdbc:sqlite:" + urliteusuario);
        System.out.println("Conectado usuarios");
        return connectlite3;
    }
}
