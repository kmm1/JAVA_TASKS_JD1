package less23DAOTransactions;

import less23DAOTransactions.dao.RestaurantDAO;
import less23DAOTransactions.dao.ReviewDAO;
import less23DAOTransactions.entity.Dish;
import less23DAOTransactions.entity.Restaurant;
import less23DAOTransactions.entity.Review;

import java.sql.*;
import java.util.Optional;

import static java.lang.Class.forName;

/**
 * Created by Tom on 14.12.2017.
 */
public class MyConnection {

    public static void main(String[] args) throws SQLException {
        //  Restaurant restaurant = RestaurantDAO.getInstance().saveRestaurant(new Restaurant("Test"));
        Optional<Restaurant> restaurant = RestaurantDAO.getInstance().findById(1);
        if (restaurant.isPresent()) {
            ReviewDAO.getINSTANCE().saveReview(new Review("nice place"), restaurant.get());
        }

    }


}
