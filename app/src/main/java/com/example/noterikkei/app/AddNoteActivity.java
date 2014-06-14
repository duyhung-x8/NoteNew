package com.example.noterikkei.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class AddNoteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_note, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.action_setBackground:
                setBackground();
                break;

            case R.id.action_inSetImage:
                setImage();
                break;
            case R.id.action_save:
                saveNote();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void setBackground(){
        Intent i=new Intent(this, ChooseColorActivity.class);
        startActivity(i);
    }
    public void setImage(){
        Intent i=new Intent(this, InsertPictureActivity.class);
        startActivity(i);
    }
    public void saveNote(){}



}
