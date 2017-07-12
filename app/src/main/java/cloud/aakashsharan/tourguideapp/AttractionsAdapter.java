package cloud.aakashsharan.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aakash on 7/10/2017.
 */

public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    private int mColorResourceId;

    public AttractionsAdapter(Activity context, ArrayList<Attractions> attraction, int colorResourceId) {
        super(context, 0, attraction);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attractions attraction = getItem(position);

        TextView titleTextView = (TextView)listItemView.findViewById(R.id.attractions_title);
        titleTextView.setText(attraction.getTitle());


        TextView descTextView = (TextView)listItemView.findViewById(R.id.description);
        descTextView.setText(attraction.getDescription());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        if(attraction.hasImage()){
            imageView.setImageResource(attraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        //View textContainer = listItemView.findViewById(R.id.description);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        descTextView.setBackgroundColor(color);

        return listItemView;
    }

    /*
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater vi = LayoutInflater.from(getContext());
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = vi.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder(listItemView);

        }
        else{
            holder = (ViewHolder) listItemView.getTag();
        }
        Attractions attraction = getItem(position);


        Log.i("holder is: "+holder, "");
        Log.v("holder is: "+holder, "test");

        Log.i("attraction is: "+attraction.getTitle(), "");
        Log.v("attraction is: "+attraction.getTitle(), "");

        String a = "ab";
        holder.title.setText(a);

        //holder.title.setText(attraction.getTitle());
        holder.description.setText(attraction.getDescription());


        if (attraction.hasImage()) {
            holder.image.setImageResource(attraction.getImageResourceId());
            holder.image.setVisibility(View.VISIBLE);
        } else {
            holder.image.setVisibility(View.GONE);
        }
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        holder.description.setBackgroundColor(color);

        return listItemView;

    }

    static class ViewHolder {
        @BindView(R.id.attractions_title)
        TextView title;
        @BindView(R.id.description)
        TextView description;
        @BindView(R.id.image)
        ImageView image;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }*/

}
