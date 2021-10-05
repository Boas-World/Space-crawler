package com.space.explorer;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.LogPrinter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.Toast;
import com.space.explorer.R;
import com.space.explorer.gjson;
import java.io.*;
import java.io.File;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.LogManager;


public class test extends Activity{
 
  ImageView img,img_2,img_3,img_4,img_5,img_6;
  
  AnimationDrawable anim1, anim2,anim3,anim4,anim5,anim6;
  
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testl);
        
        img=(ImageView)findViewById(R.id.img);
        
        img.setBackgroundResource(R.drawable.animation_trooper);
        img_2=(ImageView)findViewById(R.id.img_2);
        
        img_2.setBackgroundResource(R.drawable.animation_trooper_2);
        img_3=(ImageView)findViewById(R.id.img_3);
        
        img_3.setBackgroundResource(R.drawable.animation_balle_m);
        img_4=(ImageView)findViewById(R.id.img_4);
        
        img_4.setBackgroundResource(R.drawable.animation_balle_p);
        img_5=(ImageView)findViewById(R.id.img_5);
        
        img_5.setBackgroundResource(R.drawable.animation_balle_f);
        img_6=(ImageView)findViewById(R.id.img_6);
        
        img_6.setBackgroundResource(R.drawable.animation_balle_g);
        
        
    }
    @Override
    public void onStart(){
      super.onStart();
      
      anim1=(AnimationDrawable)img.getBackground();
      anim1.start();
      anim2=(AnimationDrawable)img_2.getBackground();
      anim2.start();
      anim3=(AnimationDrawable)img_3.getBackground();
      anim3.start();
      anim4=(AnimationDrawable)img_4.getBackground();
      anim4.start();
      anim5=(AnimationDrawable)img_5.getBackground();
      anim5.start();
      anim6=(AnimationDrawable)img_6.getBackground();
      anim6.start();
      
    }
  
}
