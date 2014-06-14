package com.example.noterikkei.app;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DUYHUNG on 13-06-2014.
 */
public class NoteAdapter extends ArrayAdapter<NoteModel> {
    TextView txtTitle, txtContent, txtTimeSet;
    ImageView imgAlarm;
    ArrayList<NoteModel> arrNote = null;
    NoteModel noteItem;
    //
    Activity context =null;
    int layoutId;

    public NoteAdapter(Activity context, int resource, ArrayList<NoteModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutId = resource;
        this.arrNote = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        noteItem = new NoteModel();
        View view =( (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(layoutId,null,false);
        //LayoutInflater inflater = context.getLayoutInflater();
        //convertView = inflater.inflate(layoutId,parent,false);

        if (arrNote.size()>0) {


            Log.d("NoteAdataper","not nulll");
            NoteModel nodeItem = arrNote.get(position);

            txtTitle = (TextView) view.findViewById(R.id.txtTitle);
            txtContent = (TextView) view.findViewById(R.id.txtContent);
            txtTimeSet = (TextView) view.findViewById(R.id.txtTimeSet);
            imgAlarm = (ImageView) view.findViewById(R.id.imgAlarm);

            txtTitle.setText(nodeItem.getStrTitle() + "");
            txtContent.setText(nodeItem.getStrContent() + "");
            txtTimeSet.setText(nodeItem.getStrTimeSet() + "");

            if (nodeItem.getIsSetAlarm()) {
                imgAlarm.setImageResource(R.drawable.ic_action_alarms);
            }
        }
        return parent;
    }

}