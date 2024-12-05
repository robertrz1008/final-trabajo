package py.edu.facitec.final1practicalwork.entities;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Charapter implements Serializable {
    private int code;
    private String status;
    private String copyright;
    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @NonNull
    @Override
    public String toString() {
        return this.status;
    }
}
