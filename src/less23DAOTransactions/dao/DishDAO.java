package less23DAOTransactions.dao;

import less23DAOTransactions.ConnectionManager;
import less23DAOTransactions.entity.Dish;
import less23DAOTransactions.entity.Restaurant;

import java.sql.*;

/**
 * Created by Tom on 14.12.2017.
 */
public class DishDAO {
    private static DishDAO INSTANCE = null;

    public static DishDAO getInstance() {
        if (INSTANCE == null) {
            synchronized (DishDAO.class) {
                INSTANCE = new DishDAO();
            }
        }
        return INSTANCE;
    }


    public  void saveDishToRestaurant(Restaurant restaurant, Dish dish) throws SQLException {
        try (Connection connection = ConnectionManager.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO dish (name, restaurant_id) VALUES (?, ?)");
            preparedStatement.setString(1, dish.getName());
            preparedStatement.setLong(2, restaurant.getId());
            preparedStatement.executeUpdate();
        }
    }
}
