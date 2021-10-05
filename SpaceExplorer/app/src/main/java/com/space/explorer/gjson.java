package com.space.explorer;


import java.util.ArrayList;


public class gjson{
	
	static String gjson_str;
	static String[] gjson_list;
	static String val;
	
	static ArrayList<String> val_names=new ArrayList<>();
	static ArrayList<String> ids=new ArrayList<>();
	static ArrayList<String> names=new ArrayList<>();
    static ArrayList<String> properties=new ArrayList<>();
	static ArrayList<String> values=new ArrayList<>();
	static ArrayList<String> priority=new ArrayList<>();
	static ArrayList<String> types=new ArrayList<>();
	
	static double length;
	static int pos;
	static int pos_name;
	static int pos_id;
	static int pos_type;

  
  	public static void main(String[] args){
  	  
  	
  	  
  }
  
  	public static void setString(String str){
  	 
  	  gjson_list=str.split(";");
  	  length=Double.parseDouble(gjson_list[0]);
  	  findIDs();
  	  findTypes();
  	  findNames();
  	  findValues();
  	  
  }
  	public static String getVal(int nb){
  	  
  	  val=gjson_list[nb].substring(gjson_list[nb].indexOf(":")+1,gjson_list[nb].indexOf("_"));
  	  return val;
  }
  	public static String getVal(String name){
      	
      	pos=0;
      	for(double i=0;i<length;i+=1.00){
      	  
      	  if(gjson_list[pos].contains(name)){
      	    val=gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_"));
      	    break;
      }
      	  pos+=1;
      }
      	return val;
      }
      public static ArrayList getIDs(){
        
        return ids;
        
      }
      public static String getID(int nb){
        
        return ids.get(nb);
        
      }
      public static ArrayList getNames(){
        
        return names;
        
      }
      public static String getName(int nb){
        
        return names.get(nb);
        
      }
      public static ArrayList getPriorities(){
        
        return priority;
        
      }
      public static String getPriority(int nb){
        
        return priority.get(nb);
        
      }
      public static ArrayList getPropertiesByName(String name){
        
      	pos=-1;
      	for(int i=0;i<names.size();i+=0){
      	  
      	  pos+=1;
      	  if(names.contains(name)){
      	  	if((names.get(pos)).contains(name) ){
      	    
      	 	   try{
      	 	   	properties.add(ids.get(pos));
      	 	   }
      	 	   catch (Exception e){
      		      properties.add(e.toString());
      }
      		    try{
      		    	properties.add(types.get(pos));
      		    }
      		    catch (Exception e){
      	    	  properties.add(e.toString());
      		}
      	    	try{
      	    		properties.add(names.get(pos));
      	    	}
      	    	catch (Exception e){
      	      	properties.add(e.toString());
      		}
      		    try{
      	    		properties.add(values.get(pos));
      	    	}
      	    	catch (Exception e){
      	      	properties.add(e.toString());
      }
      	    	try{
      	    		properties.add(priority.get(pos));
      	    }
      	    	catch (Exception e){
      	      	properties.add(e.toString());
      }
      	    	break;
      	    
      }
      }
      }
      	if(properties.isEmpty()){
      	  
      	  properties.add("nothing found");
      	  
      }
      	return properties;
        
      }
      
      
      private static void findIDs(){
        
        pos=0;
        for(double i=0.00;i<length;i+=1.00){
          
          if(gjson_list[pos].contains("id")){
            
            	ids.add(gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_")));
            
          }
          pos+=1;
          
        }
        
      }
      private static void findTypes(){
        
        pos=0;
        for(double i=0.00;i<length;i+=1.00){
          
          if(gjson_list[pos].contains("type")){
            
            	types.add(gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_")));
            
          }
          pos+=1;
          
        }
        
      }
      private static void findNames(){
        
        pos=0;
        for(double i=0.00;i<length;i+=1.00){
          
          if(gjson_list[pos].contains("name")){
            
            	names.add(gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_")));
            
          }
          pos+=1;
          
        }
        
      }
      private static void findValues(){
        
        pos=-1;
        for(double i=0.00;i<length;i+=1.00){
          pos+=1;
          
          if(gjson_list[pos].contains("value")){
            
            	values.add(gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_")));
            	continue;
            
          }
          if(gjson_list[pos].contains("priority")){
            
            	priority.add(gjson_list[pos].substring(gjson_list[pos].indexOf(":")+1,gjson_list[pos].indexOf("_")));
            	continue;
            
          }
          
          
        }
        
      }
      private static boolean Check(){
        
        pos=0;
        for(double i=0.00;i<length;i+=1.00){}
        	return true;
      }
}
