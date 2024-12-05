package py.edu.facitec.final1practicalwork.entities;

import java.io.Serializable;
import java.util.List;

public class Comic implements Serializable {
    private int available;
    private List<Item> items;

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int avaliable) {
        this.available = avaliable;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
