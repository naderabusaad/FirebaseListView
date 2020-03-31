package com.example.firebaselistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ImageListAdapter extends ArrayAdapter<ListImage> {
    private static final String TAG = "ImageListAdapter";
    private Context mContext;
    private int mResource;
    public ImageListAdapter(Context context, int resource, ArrayList<ListImage> list) {
        super(context, resource, list);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the image information
        String imageName = getItem(position).getImageName();
        int imageId = getItem(position).getImageId();

       //Create the employee object with the information
        ListImage listImage = new ListImage(imageName,imageId);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(this.mResource, parent,false);

        TextView tvId = convertView.findViewById(R.id.image_name);
        ImageView imgView= convertView.findViewById(R.id.image_View);
        tvId.setText(listImage.imageName);
        imgView.setImageResource(listImage.imageId);

        return convertView;
    }
}
