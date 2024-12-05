package py.edu.facitec.final1practicalwork.entities;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
