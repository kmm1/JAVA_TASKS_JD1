package less23DAOTransactions.dao;

import less23DAOTransactions.ConnectionManager;
import less23DAOTransactions.entity.Dish;
import less23DAOTransactions.entity.Restaurant;
import less23DAOTransactions.entity.Review;

import java.sql.*;

/**
 * Created by Tom on 14.12.2017.
 */
public class ReviewDAO {
    private static ReviewDAO INSTANCE = null;

    public static ReviewDAO getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (ReviewDAO.class) {
                INSTANCE = new ReviewDAO();
            }
        }
        return INSTANCE;
    }


    public  Review saveReview(Review review, Restaurant restaurant) throws SQLException {
        try (Connection connection = ConnectionManager.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO review (text, restaurant_id) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, review.getText());
            preparedStatement.setLong(2, restaurant.getId());
            preparedStatement.executeUpdate();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                review.setId(generatedKeys.getLong(1));
                return review;
            }
            return null;
        }
    }
}
