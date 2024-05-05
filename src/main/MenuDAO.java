package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuDAO {
    private Connection connection;

    public MenuDAO() {
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertMenu(Menu menu) {
    }

    public List<Menu> getAllMenu() {
		return null;
    }

    public void updateMenu(Menu menu) {
    }

    public void deleteMenu(String kodeMenu) {
    }
}
