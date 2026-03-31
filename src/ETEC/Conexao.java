package ETEC;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static String status = "Não conectou...";

    public Conexao() {
    }

    public static Connection getConexao() {
        Connection connection = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            Properties props = new Properties();
            props.load(new FileInputStream("db.properties"));

            String serverName = props.getProperty("DB_HOST");
            String port = props.getProperty("DB_PORT");
            String database = props.getProperty("DB_NAME");
            String username = props.getProperty("DB_USER");
            String password = props.getProperty("DB_PASSWORD");

            String url = "jdbc:mariadb://" + serverName + ":" + port + "/" + database;

            System.out.println("URL: " + url);
            System.out.println("USER: " + username);
            System.out.println("PASS: [" + password + "]");

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = "STATUS--->Conectado com sucesso!";
            } else {
                status = "STATUS--->Não foi possível realizar conexão";
            }

            return connection;

        } catch (ClassNotFoundException e) {
            status = "Driver não encontrado: " + e.getMessage();
            System.out.println(status);
            return null;

        } catch (SQLException e) {
            status = "Erro SQL: " + e.getMessage();
            System.out.println(status);
            return null;

        } catch (IOException e) {
            status = "Erro ao ler db.properties: " + e.getMessage();
            System.out.println(status);
            return null;
        }
    }

    public static String statusConection() {
        return status;
    }
}