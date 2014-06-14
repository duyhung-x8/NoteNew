package com.example.noterikkei.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {
    // khai bao request va result code
//    public  static final int
    NoteModel nodeItem;
    ArrayList<NoteModel> arrNote;
    ArrayAdapter<NoteModel> arrAdapter = null;

    Integer[] arrImag = new Integer[]{R.drawable.ic_action_accept, R.drawable.ic_action_alarms,
            R.drawable.ic_action_back, R.drawable.ic_action_camera, R.drawable.ic_action_new};

    ArrayAdapter<Integer> adapterInt;
    GridView gvNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvNote = (GridView) findViewById(R.id.gvNote);
        arrNote = new ArrayList<NoteModel>();
        arrAdapter = new ArrayAdapter<NoteModel>(this, R.layout.custom_grid_item, arrNote);
        gvNote.setAdapter(arrAdapter);
        //adapterInt = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arrImag);
        fakeData();
        //gvNote.setAdapter(adapterInt);
        gvNote.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "ddd" + i, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void fakeData() {

        nodeItem = new NoteModel();

        nodeItem.setStrTitle("Cong viec");
        nodeItem.setStrContent("Tao app moi");
        nodeItem.setStrTimeSet("ddddd");
        nodeItem.setIsSetAlarm(true);

        arrNote.add(nodeItem);
        arrAdapter.notifyDataSetChanged();
        Log.d("Inset Data", nodeItem.getStrTitle());
        arrAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_addNote) {
            addNewNote();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addNewNote() {
        Intent i = new Intent(MainActivity.this, AddNoteActivity.class);
        startActivity(i);
    }

}
