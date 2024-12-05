package py.edu.facitec.final1practicalwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import py.edu.facitec.final1practicalwork.entities.Result;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView nametextView;
    TextView descriptionTextView;
    Result result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageViewDetail);
        nametextView = findViewById(R.id.textViewDetailName);
        descriptionTextView = findViewById(R.id.textViewDetailDesc);

        result = (Result) getIntent().getSerializableExtra("hero");

        showResult(result);
    }

    private void showResult(Result result){
        Picasso.get()
                .load(result.getThumbnail().toString())
                .into(imageView);
        nametextView.setText(result.getName());
        descriptionTextView.setText(result.getDescription());
    }

    public void toList(View view) {
        Intent intent = new Intent(DetailActivity.this, ComicsActivity.class);
        intent.putExtra("heroCommit", result);
        startActivity(intent);
    }
}