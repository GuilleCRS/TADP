package U1.MiPaint;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Guillermo Cruz on 13/09/2017.
 */

public class Archivos
{
	private static FileReader fr;
	private static BufferedReader br;
	private static FileWriter fw;
	private static PrintWriter pw;
	
	public static void Archivo(String nombre, char rw) throws IOException
	{
		File f = new File(nombre);
		if(!f.exists())
			f.createNewFile();
		if(rw=='r'||rw=='R') 
		{
			fr=new FileReader(f);
			br=new BufferedReader(fr);
		}
		else {
			fw=new FileWriter(f, true);
			pw=new PrintWriter(fw);
		}
		
	}
	public static void CerrarArchivo()throws IOException
	{
		if(fr !=null)
			fr.close();
		if(fw !=null)
			fw.close();
	}
    public static void AgregaRegistro(Figuras reg)throws IOException
    {
    	pw.println(reg.getFig() + "|" +
				reg.getX1() + "|" +
				reg.getY1() + "|" +
				reg.getX2() + "|" +
				reg.getY2() + "|" +
				reg.getAncho() + "|" +
				reg.getAlto() + "|" +
				reg.getColor().getRed() + "|" +
				reg.getColor().getGreen()+"|" +
    	        reg.getColor().getBlue() + "|" +
				(reg.isRelleno()?"1":"0"));
    }
    
    public static Figuras Line2Reg(String line)
    {
    	//convierte un renglon de donde esta guardada la imagen a un opjeto figra
    	int separador1 = line.indexOf('|');
    	int Fugura = Integer.parseInt(line.substring(0, separador1));
    	int separador2 = line.indexOf('|',separador1+1);
    	int X1 = Integer.parseInt(line.substring(separador1 + 1, separador2));
    	int separador3 = line.indexOf('|', separador2+1);
    	int Y1 = Integer.parseInt(line.substring(separador2 + 1, separador3));
    	int separador4 = line.indexOf('|',separador3+1);
    	int X2 = Integer.parseInt(line.substring(separador3 + 1, separador4));
    	int separador5 = line.indexOf('|',separador4+1);
    	int Y2 = Integer.parseInt(line.substring(separador4 + 1, separador5));
    	int separador6 = line.indexOf('|',separador5+1);
    	int Ancho = Integer.parseInt(line.substring(separador5 + 1, separador6));
    	int separador7 = line.indexOf('|',separador6+1);
    	int Alto = Integer.parseInt(line.substring(separador6 + 1, separador7));
    	int separador8 = line.indexOf('|',separador7+1);
    	int R = Integer.parseInt(line.substring(separador7 + 1, separador8));
    	int separador9 = line.indexOf('|',separador8+1);
    	int G = Integer.parseInt(line.substring(separador8 + 1, separador9));
    	int separador10 = line.indexOf('|',separador9+1);
    	int B = Integer.parseInt(line.substring(separador9 + 1, separador10));
    	boolean relleno;
    	if(line.substring(separador10+1).equals("1"))
    		relleno=true;
    	else
    		relleno=false;
    	return new Figuras(Fugura,X1,Y1,X2,Y2,Ancho,Alto,new Color(R, G, B),relleno);
    	
    }
    public static ArrayList<Figuras> LeeContenido()throws IOException{
		String Line = br.readLine();
		ArrayList<Figuras> contenido= new ArrayList<>();
		while (Line!=null){
			contenido.add(Line2Reg(Line));
			Line=br.readLine();
		}
		return contenido;
	}
}
