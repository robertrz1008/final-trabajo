package py.edu.facitec.final1practicalwork;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import py.edu.facitec.final1practicalwork.entities.Item;
import py.edu.facitec.final1practicalwork.entities.Result;

public class ComicsActivity extends AppCompatActivity {

    ListView commicListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_comics);

        commicListView = findViewById(R.id.listViewComics);

        Result result = (Result) getIntent().getSerializableExtra("heroCommit");

        ArrayAdapter<Item> adapter = new ArrayAdapter<>(ComicsActivity.this, android.R.layout.simple_list_item_1, result.getComics().getItems());
        commicListView.setAdapter(adapter);
    }
}