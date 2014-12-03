package net.mflores.Matricules;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App{
	private static final String FICHERO = "/matricula.txt";
	private static final String ERRORCERRAR= "Error al cerrar el fichero"+ FICHERO;
	private static final String ERRORFICHERO = "No se puede leer el fichero" + FICHERO;
	private static final String NOENCONTRADO = "El fichero"+ FICHERO + "no ha sido encontrado";

    public static void main( String[] args ){

    	BufferedReader inb = null;
    	InputStream entrada =App.class.getResourceAsStream(FICHERO);

    	if (entrada != null){
    		Reader r = new InputStreamReader(entrada);
    		inb = new BufferedReader(r);
    		String linea;
    		try{
    			linea = inb.readLine();
    			while( (linea != null)){
    				if (!linea.trim().equals("")) {
        				Pattern pat = Pattern.compile("[0-9]{4,4}( )[a-zA-Z]{2,3}");
    					Matcher mat = pat.matcher(linea);
    					if (mat.matches()){
    						for(int i = linea.length()-1; i >= 0;i--){   //hashnext  hashnextdouble
    							System.out.print(linea.charAt(i));
    						}
    						System.out.println(" ");
    					}
    				}

       				linea = inb.readLine();

    			}
    		}catch(IOException e){
    	          System.out.println(ERRORFICHERO);
    	          e.printStackTrace();
    	    } finally {
    	          try {
    	        	  inb.close();
    	          } catch (IOException e) {
    	        	  System.out.println(ERRORCERRAR);
    	          }
    	    }
    	}else{
    		System.out.println(NOENCONTRADO);
    	}
    }
}





