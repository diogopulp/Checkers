package com.example.diogosantos.checkers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by diogosantos on 01/08/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10, 10, 10, 10);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.ck_black,R.drawable.ck_white
            /*R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,

            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,

            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,

            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw1,R.drawable.bg_bw2,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,
            R.drawable.bg_bw2,R.drawable.bg_bw1,*/
    };
}
