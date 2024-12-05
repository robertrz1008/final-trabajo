package py.edu.facitec.final1practicalwork.entities;

import java.io.Serializable;

public class Thumbnail implements Serializable {
    private String path;
    private String extension;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.path + "."+this.extension;
    }
}
