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
import java.util.Random;

public class salle11  extends Activity {
	
	String map[];
	String read;
	
	int pos;
	
	TextView txt_test;
	
	ImageView tile_26;
	ImageView tile_1,tile_2,tile_3,tile_4,tile_5,tile_6,tile_7,tile_8,tile_9,tile_10,tile_11,tile_12,tile_13,tile_14,tile_15,tile_16,tile_17,tile_18,tile_19,tile_20,tile_21,tile_22,tile_23,tile_24,tile_25;
	
	Random rand=new Random();
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
  	super.onCreate(savedInstanceState);
      setContentView(R.layout.salle_1_1);
      
      
      init();
      
      
    }
    private void init_view(){
      
      tile_1=(ImageView)findViewById(R.id.tile_1);
      tile_2=(ImageView)findViewById(R.id.tile_2);
      tile_3=(ImageView)findViewById(R.id.tile_3);
      tile_4=(ImageView)findViewById(R.id.tile_4);
      tile_5=(ImageView)findViewById(R.id.tile_5);
      tile_6=(ImageView)findViewById(R.id.tile_6);
      tile_7=(ImageView)findViewById(R.id.tile_7);
      tile_8=(ImageView)findViewById(R.id.tile_8);
      tile_9=(ImageView)findViewById(R.id.tile_9);
      tile_10=(ImageView)findViewById(R.id.tile_10);
      tile_11=(ImageView)findViewById(R.id.tile_11);
      tile_12=(ImageView)findViewById(R.id.tile_12);
      tile_13=(ImageView)findViewById(R.id.tile_13);
      tile_14=(ImageView)findViewById(R.id.tile_14);
      tile_15=(ImageView)findViewById(R.id.tile_15);
      tile_16=(ImageView)findViewById(R.id.tile_16);
      tile_17=(ImageView)findViewById(R.id.tile_17);
      tile_18=(ImageView)findViewById(R.id.tile_18);
      tile_19=(ImageView)findViewById(R.id.tile_19);
      tile_20=(ImageView)findViewById(R.id.tile_20);
      tile_21=(ImageView)findViewById(R.id.tile_21);
      tile_22=(ImageView)findViewById(R.id.tile_22);
      tile_23=(ImageView)findViewById(R.id.tile_23);
      tile_24=(ImageView)findViewById(R.id.tile_24);
      tile_25=(ImageView)findViewById(R.id.tile_25);
      tile_26=(ImageView)findViewById(R.id.tile_26);
      
    
    }
    private void init(){
      
      
      read=read("/storage/emulated/0/Android/data/com.space.explorer/File/Maps/salle_1.txt");
      map=read.split(";");
      
      init_view();
      tile_26.bringToFront();
    
      tile_26.setTranslationX((float)(256));
      tile_26.setTranslationY((float)(-455));
      
     
      pos=0;
      for(int i=0;i<25;i+=1){
        
        if(map[pos].contains("0")){
          
          if(pos==0){
            tile_1.setImageResource(R.drawable.fer_1);
          }
          if(pos==1){
            tile_2.setImageResource(R.drawable.fer_1);
          }
          if(pos==2){
            tile_3.setImageResource(R.drawable.fer_1);
          }
          if(pos==3){
            tile_4.setImageResource(R.drawable.fer_1);
          }
          if(pos==4){
            tile_5.setImageResource(R.drawable.fer_1);
          }
          if(pos==5){
            tile_6.setImageResource(R.drawable.fer_1);
          }
          if(pos==6){
            tile_7.setImageResource(R.drawable.fer_1);
          }
          if(pos==7){
            tile_8.setImageResource(R.drawable.fer_1);
          }
          if(pos==8){
            tile_9.setImageResource(R.drawable.fer_1);
          }
          if(pos==9){
            tile_10.setImageResource(R.drawable.fer_1);
          }
          if(pos==10){
            tile_11.setImageResource(R.drawable.fer_1);
          }
          if(pos==11){
            tile_12.setImageResource(R.drawable.fer_1);
          }
          if(pos==12){
            tile_13.setImageResource(R.drawable.fer_1);
          }
          if(pos==13){
            tile_14.setImageResource(R.drawable.fer_1);
          }
          if(pos==14){
            tile_15.setImageResource(R.drawable.fer_1);
          }
          if(pos==15){
            tile_16.setImageResource(R.drawable.fer_1);
          }
          if(pos==16){
            tile_17.setImageResource(R.drawable.fer_1);
          }
          if(pos==17){
            tile_18.setImageResource(R.drawable.fer_1);
          }
          if(pos==18){
            tile_19.setImageResource(R.drawable.fer_1);
          }
          if(pos==19){
            tile_20.setImageResource(R.drawable.fer_1);
          }
          if(pos==20){
            tile_21.setImageResource(R.drawable.fer_1);
          }
          if(pos==21){
            tile_22.setImageResource(R.drawable.fer_1);
          }
          if(pos==22){
            tile_23.setImageResource(R.drawable.fer_1);
          }
          if(pos==23){
            tile_24.setImageResource(R.drawable.fer_1);
          }
          if(pos==24){
            tile_25.setImageResource(R.drawable.fer_1);
          }
        }
         if(map[pos].contains("1")){
          
          if(pos==0){
            tile_1.setImageResource(R.drawable.fer_2);
          }
          if(pos==1){
            tile_2.setImageResource(R.drawable.fer_2);
          }
          if(pos==2){
            tile_3.setImageResource(R.drawable.fer_2);
          }
          if(pos==3){
            tile_4.setImageResource(R.drawable.fer_2);
          }
          if(pos==4){
            tile_5.setImageResource(R.drawable.fer_2);
          }
          if(pos==5){
            tile_6.setImageResource(R.drawable.fer_2);
          }
          if(pos==6){
            tile_7.setImageResource(R.drawable.fer_2);
          }
          if(pos==7){
            tile_8.setImageResource(R.drawable.fer_2);
          }
          if(pos==8){
            tile_9.setImageResource(R.drawable.fer_2);
          }
          if(pos==9){
            tile_10.setImageResource(R.drawable.fer_2);
          }
          if(pos==10){
            tile_11.setImageResource(R.drawable.fer_2);
          }
          if(pos==11){
            tile_12.setImageResource(R.drawable.fer_2);
          }
          if(pos==12){
            tile_13.setImageResource(R.drawable.fer_2);
          }
          if(pos==13){
            tile_14.setImageResource(R.drawable.fer_2);
          }
          if(pos==14){
            tile_15.setImageResource(R.drawable.fer_2);
          }
          if(pos==15){
            tile_16.setImageResource(R.drawable.fer_2);
          }
          if(pos==16){
            tile_17.setImageResource(R.drawable.fer_2);
          }
          if(pos==17){
            tile_18.setImageResource(R.drawable.fer_2);
          }
          if(pos==18){
            tile_19.setImageResource(R.drawable.fer_2);
          }
          if(pos==19){
            tile_20.setImageResource(R.drawable.fer_2);
          }
          if(pos==20){
            tile_21.setImageResource(R.drawable.fer_2);
          }
          if(pos==21){
            tile_22.setImageResource(R.drawable.fer_2);
          }
          if(pos==22){
            tile_23.setImageResource(R.drawable.fer_2);
          }
          if(pos==23){
            tile_24.setImageResource(R.drawable.fer_2);
          }
          if(pos==24){
            tile_25.setImageResource(R.drawable.fer_2);
          }
        }
        pos+=1;
      }
     
      
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
