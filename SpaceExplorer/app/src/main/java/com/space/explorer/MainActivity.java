package com.space.explorer;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.space.explorer.R;
import com.space.explorer.gjson;
import java.io.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

public class MainActivity extends Activity {
	
	
	gjson gjson = new gjson();
	
	Intent act1 =new Intent();
	Intent act2 = new Intent();
	
	File save=new File("/storage/emulated/0/Android/data/com.space.explorer/Save");
	File file=new File("/storage/emulated/0/Android/data/com.space.explorer/File");
	File blocks=new File("/storage/emulated/0/Android/data/com.space.explorer/File/Blocks");
	File hero=new File("/storage/emulated/0/Android/data/com.space.explorer/File/Hero");
	File maps=new File("/storage/emulated/0/Android/data/com.space.explorer/File/Maps");
	
	
	String save_f, tile_1,tile_2,tile_3;
	String up_t_1;
	String trooper,mage,tsoutient, sniper;
	String salle_1;
	
	ProgressBar pb;
	ImageView img_title;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
    }
    @Override
    public void onStart(){
      super.onStart();
      init();
      
      
      
      
    }
    public void init(){
      
  
      act1.setClass(this,error1.class);
      act2.setClass(this,Name.class);
      
      pb=(ProgressBar)findViewById(R.id.pb_title);
      img_title=(ImageView)findViewById(R.id.img_title);
      
      pb.setProgress(0);
      img_title.setImageResource(R.drawable.fer_1);
      
      if(!save.isDirectory()){
        save.mkdirs();
        pb.setProgress(pb.getProgress()+1);
		img_title.setTranslationX(pb.getProgress()*40);
        file.mkdirs();
        pb.setProgress(pb.getProgress()+1);
		img_title.setTranslationX(pb.getProgress()*40);
        blocks.mkdirs();
        pb.setProgress(pb.getProgress()+1);
		img_title.setTranslationX(pb.getProgress()*40);
        hero.mkdirs();
        pb.setProgress(pb.getProgress()+1);
		img_title.setTranslationX(pb.getProgress()*40);
		maps.mkdirs();
		pb.setProgress(pb.getProgress()+1);
		img_title.setTranslationX(pb.getProgress()*40);
        MakeText("dossier créés");
        init_String();
        init_File();
      }
      else {
        MakeText("dossier déjà créés");
        pb.setProgress(pb.getProgress()+4);
        init_String();
        startActivity(act2);
      }
      
      
    }
    private void init_String(){
      
      save_f="/save.txt";
      pb.setProgress(pb.getProgress()+1);
      img_title.setTranslationX(pb.getProgress()*40);
      tile_1="/tile_1_1.gjson";
      pb.setProgress(pb.getProgress()+1);
      img_title.setTranslationX(pb.getProgress()*40);
      tile_2="/tile_1_2.gjson";
      pb.setProgress(pb.getProgress()+1);
      img_title.setTranslationX(pb.getProgress()*40);
      tile_3="/tile_1_3.gjson";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress()+1);
      
      up_t_1="/up_1_1.gjson";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress()+1);
      
      trooper="/trooper.txt";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress()+1); 
      mage="/mage.txt";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress());
      tsoutient="/t_soutient.txt";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress());
      sniper="/sniper.txt";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress());
      
      salle_1="/salle_1.txt";
      img_title.setTranslationX(pb.getProgress()*40);
      pb.setProgress(pb.getProgress());
      
      MakeText("String_initié");
      
    }
    private void init_File(){
      
      if(write("12.00;1.00;2.00;0.00",hero.toString()+trooper)){
           write("10.00;2.10;4.00;200.00",hero.toString()+mage);
     	 write("17.00;3.00;1.00;400.00",hero.toString()+tsoutient);
      	write("8.00;4.00;1.00;500.00",hero.toString()+sniper);
      
     	 write("6_;\nid:block_;\ntype:tile_;\nname:floor1_;znvalue:1_;\npriotity:0_;",blocks.toString()+tile_1);
     	 write("6_;\nid:block_;\ntype:tile_;\nname:floor2_;znvalue:2_;\npriotity:0_;",blocks.toString()+tile_2);
      	
     	 write("6_;\nid:block_;\ntype:uptile_;\nname:blood1_;znvalue:10_;\npriotity:1_;",blocks.toString()+up_t_1);
     	 
     	 write("0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;0;",maps.toString()+salle_1);
     
     	 startActivity(act2);
      }
      else{
      	startActivity(act1);
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
