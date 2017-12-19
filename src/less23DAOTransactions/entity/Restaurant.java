package less23DAOTransactions.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 14.12.2017.
 */
public class Restaurant {
    private long id;
    private String name;
    List<Review> reviewList = new ArrayList<>();
    List<Dish> dishList = new ArrayList<>();


    public void addReview(Review review) {
        reviewList.add(review);
    }

    public void addDish(Dish dish) {
        dishList.add(dish);
    }

    public Restaurant() {
    }

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(long id) {
        this.id = id;
    }

    public Restaurant(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reviewList=" + reviewList +
                '}';
    }
}
