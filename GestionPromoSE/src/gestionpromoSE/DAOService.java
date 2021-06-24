package gestionpromoSE;

import java.sql.*;

public class DAOService {

    private static Connection connection = null;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/centreformation";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection createConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connecton db ok");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void insertQuery (Connection connection) {
        String sql = "insert into apprenant (id_apprenant, nom, email) values (null, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "Julie");
            statement.setString(2, "julie@yahoo.fr");
            int response = statement.executeUpdate();
            if (response != 1) {
            	throw new RuntimeException("   oh oh oh ");
            }
            
  
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
