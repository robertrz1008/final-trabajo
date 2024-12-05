package py.edu.facitec.final1practicalwork;

import py.edu.facitec.final1practicalwork.entities.Charapter;
import retrofit.Callback;
import retrofit.http.GET;

public interface CharapterService {
    @GET("/marvel-hero/characters.json")
    void getCharacter(Callback<Charapter> characters);
}
