package less22JDBC;

import java.sql.*;

import static java.lang.Class.forName;

/**
 * Created by Tom on 14.12.2017.
 */
public class MyConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/music_store2";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//            insertIntoArtist(connection, "Lena");
//            insertIntoArtist(connection, "yyy" );
//            insertIntoSong(connection, "first", 20, 1);
//            insertIntoSong(connection, "second", 10, 2);
//            insertIntoSong(connection, "third", 5, 1);
//            insertIntoSong(connection, "forth", 35, 1);
            System.out.println(getArtistsWithSongsList(connection, 1));
            //System.out.println(selectSongById(connection, 2));
        }
    }

    public static void insertIntoArtist(Connection connection, String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO artist (name)VALUES (?)");
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
    }

    public static void insertIntoSong(Connection connection, String title, int length, int artist_id) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO song (title, length, artist_id)VALUES (?,?,?)");
        preparedStatement.setString(1, title);
        preparedStatement.setInt(2, length);
        preparedStatement.setInt(3, artist_id);
        preparedStatement.executeUpdate();
    }

    public static Song selectSongById(Connection connection, long id) throws SQLException {
        PreparedStatement preparedStatement =
                // connection.prepareStatement(" SELECT id, title, length, artist_id FROM song WHERE id=?");
                connection.prepareStatement("SELECT a.id, s.id, title, length, artist_id, name " +
                        "FROM artist AS a JOIN song AS s ON s.artist_id= a.id WHERE a.id =?");
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Song song = new Song();
        Artist artist = new Artist();
        while (resultSet.next()) {
            song.setId(resultSet.getLong("s.id"));
            song.setTitle(resultSet.getString("title"));
            song.setLength(resultSet.getInt("length"));
            artist.setId(resultSet.getLong("a.id"));
            artist.setName(resultSet.getString("name"));
            song.setArtist(artist);
        }
        return song;
    }


    public static Artist getArtistsWithSongsList(Connection connection, long id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT name, title, s.id FROM artist AS a JOIN song AS s ON s.artist_id=a.id WHERE a.id = ?; ");
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Artist artist = new Artist();
        while (resultSet.next()) {
            artist.setName(resultSet.getString("name"));
            Song song = new Song(resultSet.getString("title"));
            artist.addSongToSet(song);
        }
        return artist;



    }
}