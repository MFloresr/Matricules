package net.mflores.Matricules;

import java.io.*;

import net.xaviersala.llegirfitxer.App;




public class App{
	private static final String FICHERO = "/matricula.txt";
	private static final String NOENCONTRADO = "El fichero"+ FICHERO + "no ha sido encontrado";
	private static final String ERRORABRIR = "Error al Abrir el fichero"+ FICHERO;
	private static final String ERRORFICHERO = "No se puede leer el fichero" + FICHERO;

    public static void main( String[] args ){

    	BufferedReader inb = null;
    	InputStream in =App.class.getResourceAsStream((FICHERO);

    	if (in != null){
    		Reader r = new InputStreamReader(in);
    		inb = new BufferedReader(r);

    		String linia;
    		try{
    			linia = inb.readLine();
    			while( (linia != null){
    	               System.out.println(linia);
    			}
    		}
    	}
        try  {
           matricula=new FileReader(App.class.getResource("/matricula.txt").getPath());

           int c = 0 ;




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

      try {
        linia = inb.readLine();

        while (linia != null) {
          System.out.println(linia);
          linia = inb.readLine();
        }



      } catch (IOException e1) {
        System.out.println(PROBLEMESFITXER);
        e1.printStackTrace();
      } finally {
        try {
          inb.close();
        } catch (IOException e) {
          System.out.println(PROBLEMESTANCAR);
        }
      }


    } else {
      System.out.println(NOTROBAT);
    }

  }

