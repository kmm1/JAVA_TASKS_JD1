package less22JDBC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tom on 14.12.2017.
 */
public class Artist {
    private long id;
    private String name;
    private List<Song> songList = new ArrayList<>();

    public void addSongToSet(Song song) {
        songList.add(song);
    }

    public Artist() {
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
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
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", songList=" + songList +
                '}';
    }
}
