

import java.sql.*;

public class AuthService {

    private static Connection connection;
    private static Statement stmt;

    public static void main(String []args) throws ClassNotFoundException, SQLException{
       connect_DB();
        write_DB(0, "Iphone 5s", "red",25,35000);
        write_DB(1, "Iphone 7 Plus", "yellow",45,45000);
        write_DB(1, "Iphone 7 Plus", "yellow",45,45000);
        write_DB(1, "Iphone 7 Plus", "yellow",45,45000);
        write_DB(2, "Iphone 10", "blue",64,70000);
        changeSMF_DB("Iphone 5s");
        deleteSMF_DB(0);
       disconnect_DB();
    }

    public static void connect_DB() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:BD.db");
            stmt = connection.createStatement();

            System.out.println("База подключена!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public static void write_DB(Integer id, String name, String color, Integer amount, Integer price) throws SQLException {
         try {

            Statement stmt = connection.createStatement();

            String request = "INSERT INTO smf (id, name, color, amount, price) VALUES (" + id + "," + "'" + name + "',"+ "'" + color + "'," + amount + "," + price + ")";
            stmt.executeUpdate(request);

            System.out.println("Таблица обновлена!!!");
         }catch (Exception e) {
             e.printStackTrace();
         }
      }

    public static void deleteSMF_DB(int id) throws SQLException {
        //id  - это id товара, который нужно удалить
        try {
            Statement stmt = connection.createStatement();

            String request = "DELETE FROM smf WHERE id = " + id;
            stmt.executeUpdate(request);

            System.out.println("Информация была удалена");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void changeSMF_DB(String name) throws SQLException {
        //изменение количества товара у определенного name
        try {
            Statement stmt = connection.createStatement();

            String request = "UPDATE smf SET amount = 0 WHERE name = '" + name + "'";
            stmt.executeUpdate(request);

            System.out.println("Таблицы были оновлены");

            ResultSet rs = stmt.executeQuery("SELECT * FROM smf");
            System.out.println(rs.getString("amount"));

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect_DB() {
        try {
            connection.close();
            System.out.println("Соединения закрыты!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
