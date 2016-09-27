package com.liuwan.gridview.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liuwan.gridview.R;

/**
 * Created by liuwan on 2016/9/24.
 */
public class GridAdapter extends BaseAdapter {

    private Context context = null;
    private LinearLayout gridViewLayout;
    private int[] image;
    private String[] text;
    public static int COL_NUMBER = 3;

    public GridAdapter(Context context, LinearLayout gridViewLayout, int[] image, String[] text) {
        this.context = context;
        this.gridViewLayout = gridViewLayout;
        this.image = image;
        this.text = text;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout item = new LinearLayout(context);
        item.setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                gridViewLayout.getHeight() / (image.length / COL_NUMBER)));
        item.setOrientation(LinearLayout.VERTICAL);
        item.setBackgroundColor(ContextCompat.getColor(context, R.color.color1));
        item.setGravity(Gravity.CENTER);

        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new AbsListView.LayoutParams(120, 120));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(image[position]);
        item.addView(imageView);

        TextView textView = new TextView(context);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, 15, 0, 0);
        textView.setLayoutParams(lp);
        textView.setTextSize(13);
        textView.setTextColor(ContextCompat.getColor(context, R.color.color2));
        textView.setText(text[position]);
        item.addView(textView);

        return item;
    }
}