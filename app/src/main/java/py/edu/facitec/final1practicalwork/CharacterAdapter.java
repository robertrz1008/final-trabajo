package py.edu.facitec.final1practicalwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import py.edu.facitec.final1practicalwork.entities.Result;

public class CharacterAdapter extends BaseAdapter {

    Context context;
    List<Result> results;

    public CharacterAdapter(Context context, List<Result> results) {
        this.context = context;
        this.results = results;
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int i) {
        return results.get(i);
    }

    @Override
    public long getItemId(int i) {
        return results.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        ImageView resultImageView;
        TextView nameTextView;
        TextView descriptionTextView;

        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        }

        Result result = (Result) getItem(i);

        resultImageView = v.findViewById(R.id.imageViewItem);
        descriptionTextView = v.findViewById(R.id.textViewDescription);
        nameTextView = v.findViewById(R.id.textViewName);

        nameTextView.setText(result.getName());
        descriptionTextView.setText(result.getDescription());

        Picasso.get()
                .load(result.getThumbnail().toString())
                .into(resultImageView);

        return v;
    }
}
