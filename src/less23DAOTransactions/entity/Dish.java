package less23DAOTransactions.entity;

/**
 * Created by Tom on 14.12.2017.
 */
public class Dish {
    long id;
    String name;
    Restaurant restaurant;

    public Dish(long id, String name, Restaurant restaurant) {
        this.id = id;
        this.name = name;
        this.restaurant = restaurant;
    }

    public Dish(String name) {
        this.name = name;
    }

    public Dish(long id, String name) {
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
