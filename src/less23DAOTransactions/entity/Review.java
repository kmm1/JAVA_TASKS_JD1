package less23DAOTransactions.entity;

/**
 * Created by Tom on 14.12.2017.
 */
public class Review {
    long id;
    String text;
    Restaurant restaurant;

    public Review() {
    }

    public Review(String text) {
        this.text = text;
    }

    public Review(long id, String text, Restaurant restaurant) {
        this.id = id;
        this.text = text;
        this.restaurant = restaurant;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", restaurant=" + restaurant +
                '}';
    }
}
