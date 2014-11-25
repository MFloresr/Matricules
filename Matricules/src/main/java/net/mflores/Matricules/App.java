package net.mflores.Matricules;
import java.io.*;

public class App{
	private static final String FICHERO = "/matricula.txt";
	private static final String ERRORCERRAR= "Error al cerrar el fichero"+ FICHERO;
	private static final String ERRORFICHERO = "No se puede leer el fichero" + FICHERO;
	private static final String NOENCONTRADO = "El fichero"+ FICHERO + "no ha sido encontrado";

    public static void main( String[] args ){

    	BufferedReader inb = null;
    	InputStream in =App.class.getResourceAsStream(FICHERO);

    	if (in != null){
    		Reader r = new InputStreamReader(in);
    		inb = new BufferedReader(r);

    		String linia;
    		try{
    			linia = inb.readLine();
    			while( (linia != null)){
        			for(int i = linia.length()-1; i >= 0;i--){
        				System.out.print(linia.charAt(i));
        			}
        			System.out.println(" ");
       				linia = inb.readLine();

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





