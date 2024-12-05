package py.edu.facitec.final1practicalwork.entities;

import java.io.Serializable;

public class Result implements Serializable{
    private int id;
    private String modified;
    private Thumbnail thumbnail;
    private String name;
    private String description;
    private Comic comics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comic getComics() {
        return comics;
    }

    public void setComics(Comic comics) {
        this.comics = comics;
    }
}
