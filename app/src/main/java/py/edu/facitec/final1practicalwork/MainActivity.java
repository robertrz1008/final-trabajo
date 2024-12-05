package py.edu.facitec.final1practicalwork;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import py.edu.facitec.final1practicalwork.entities.Charapter;
import py.edu.facitec.final1practicalwork.entities.Result;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements Callback<Charapter> {

    ProgressBar progressBar;
    ListView charapterListView;
    TextView errorTextView;
    Button button;
    CharapterService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //variables
        progressBar = findViewById(R.id.progressBar);
        charapterListView = findViewById(R.id.listViewUsers);
        errorTextView = findViewById(R.id.textViewError);
        button = findViewById(R.id.buttonReintentar);

        button.setVisibility(View.GONE);

        //api setup
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://leodufer.github.io")
                .build();

        service = restAdapter.create(CharapterService.class);
        service.getCharacter(MainActivity.this);

        charapterListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Result result = (Result) adapterView.getAdapter().getItem(i);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("hero", result);
                startActivity(intent);
             //   Toast.makeText(MainActivity.this, result.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void success(Charapter charapter, Response response) {
        progressBar.setVisibility(View.GONE);
        errorTextView.setVisibility(View.GONE);
        charapterListView.setVisibility(View.VISIBLE);
        Log.i("JSON", "succes");

        CharacterAdapter adapter = new CharacterAdapter(this, charapter.getData().getResults());
        charapterListView.setAdapter(adapter);
    }

    @Override
    public void failure(RetrofitError error) {
        progressBar.setVisibility(View.GONE);
        button.setVisibility(View.VISIBLE);
        charapterListView.setVisibility(View.GONE);
        errorTextView.setVisibility(View.VISIBLE);
        errorTextView.setText(error.getLocalizedMessage());
        Log.e("API_ERROR", "Error: " + error.getMessage());
    }
}