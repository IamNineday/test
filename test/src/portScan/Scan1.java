package portScan;

import java.io.*;
import java.net.*;
public class Scan1 {
	 private static String hostName;
	    private static int startPoint;
	   private  static int endPoint;

	    {
	    	hostName="computer";
	    	startPoint=0;
	    	endPoint=100;
	    }
	    public static void scanPort(){
	    	try{
	    		InetAddress addr=InetAddress.getByName(hostName);
	    		System.out.println("****start of port scanning****");
	    		for(int i=startPoint;i<=endPoint;i++){
	    			try
	    			{ Socket socket=new Socket(hostName,i);
	    		      System.out.println("There is a server on port "+i+" on hostName "+hostName);
	    			}
	    			catch(IOException e){}
	    			System.out.println("*****end of Port scanning*****");
	    		}
	    	}
	    	catch(UnknownHostException e){
	    		System.out.println("host not found");
	    	}
	    }
	    
	    public static void main(String[] args){
	    	System.out.println("input hostname,startPort,endPort");
	    	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	    	String line=null;
	    	String[] lineArray=new String[3];
	    	try{
	            if((line=reader.readLine())!=null)
	    		{
	    			lineArray=line.split(",");
	    			hostName=lineArray[0];
	    			startPoint=Integer.parseInt(lineArray[1]);
	    			endPoint=Integer.parseInt(lineArray[2]);
	    		  scanPort();
	    		}
	    	}
	    	catch(Exception e){
	    		System.out.println("an exception has occured");
	    	}
	     }
	  
	}


