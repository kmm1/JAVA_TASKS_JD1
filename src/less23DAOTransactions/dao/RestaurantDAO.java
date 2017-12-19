package less23DAOTransactions.dao;

import less23DAOTransactions.ConnectionManager;
import less23DAOTransactions.entity.Restaurant;

import java.sql.*;
import java.util.Optional;

/**
 * Created by Tom on 14.12.2017.
 */
public class RestaurantDAO {
    private static RestaurantDAO INSTANCE = null;

    public static RestaurantDAO getInstance() {
        if (INSTANCE == null) {
            synchronized (RestaurantDAO.class) {
                INSTANCE = new RestaurantDAO();
            }
        }
        return INSTANCE;
    }


    public Restaurant saveRestaurant(Restaurant restaurant) throws SQLException {
        try (Connection connection = ConnectionManager.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO restaurant (name) VALUES (?) ", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, restaurant.getName());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                restaurant.setId(generatedKeys.getLong(1));
                return restaurant;
            }
            return null;
        }
    }

    public Optional<Restaurant> findById(long id) throws SQLException {
        try (Connection connection = ConnectionManager.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT  name FROM restaurant WHERE id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(new Restaurant
                        (id, resultSet.getString("name")));
            }
        }
        return Optional.empty();
    }
}
