package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Urban on 6/7/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourcesID;

    public WordAdapter(Context context, ArrayList<Word> pWords, int colorResourcesID) {
        super(context,0, pWords);
        mColorResourcesID = colorResourcesID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getDefaultTranslation());

        ImageView imgIcon = (ImageView) listItemView.findViewById(R.id.image);
        if(local_word.hasImage()) {
            imgIcon.setImageResource(local_word.getImageResourceId());
        } else {
            imgIcon.setVisibility(View.GONE);
        }

        LinearLayout text_container = (LinearLayout)listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourcesID);
        text_container.setBackgroundColor(color);

        return listItemView;
    }
}
