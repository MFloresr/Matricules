package net.mflores.Matricules;

import java.io.*;




public class App
{
    public static void main( String[] args )
    {

    	FileReader matricula=null;
    	StringBuffer str=new StringBuffer();
        try  {
           matricula=new FileReader(App.class.getResource("/matricula.txt").getPath());

           int c = 0 ;

           while( (c = matricula.read()) !=-1){
        	   str.append((char)c);
        	   //str.reverse();
               System.out.println(str);


           }
      }catch (FileNotFoundException e) {
    	  e.printStackTrace();
      }catch (IOException e){
    	  e.printStackTrace();
      }finally{
    	  try{
    		  matricula.close();
    	  }catch(IOException e){
    		  e.printStackTrace();
    	  }
      }


    }
}
