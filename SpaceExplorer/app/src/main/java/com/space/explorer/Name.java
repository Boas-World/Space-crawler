package com.space.explorer;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.space.explorer.R;
import com.space.explorer.gjson;
import java.io.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

public class Name  extends Activity {
	
	TextView et;
	
	
	Button b;
	
	Intent act1=new Intent();
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
  	super.onCreate(savedInstanceState);
      setContentView(R.layout.name);
      
      act1.setClass(this, salle11.class);
      
      
      
      et=(TextView)findViewById(R.id.et);
      b=(Button)findViewById(R.id.b);
      
      b.setOnClickListener( new View.OnClickListener(){
        
        public void onClick(View v){
          
          if(et.getText().toString()==""||et.getText().toString()==null){
          	MakeText("Veuillez remplir le champ");
         }
         else{
           write(et.getText().toString(),"/storage/emulated/0/Android/data/com.space.explorer/Save/name.txt");
              startActivity(act1);
           
         }
          
        }
        
      });
      
	}
	
	private boolean write(String data, String dir){
      
      try{
      	FileOutputStream fos=new FileOutputStream(dir);
      	fos.write(data.getBytes());
      	fos.flush();
      	fos.close();
      	return true;
      }
      catch(Exception e){
        return false;
      }
      
    }
    private String read(String path){
    	
    	try{
    		String message;
    		StringBuffer out=new StringBuffer();
    		FileInputStream reader=new FileInputStream(path);
    		InputStreamReader str=new InputStreamReader(reader);
    		BufferedReader bufferedReader=new BufferedReader(str);
    		while ((message=bufferedReader.readLine())!=null){
    			out.append(message);
    		}
    		bufferedReader.close();
    		return out.toString();
    	}
    	catch(Exception e){
    		
    		return "";
    		
    	}
    }
    private void MakeText(String txt){
      
      Toast.makeText(this, txt, Toast.LENGTH_SHORT).show();
      
    }
}
