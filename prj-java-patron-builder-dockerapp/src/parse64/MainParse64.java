package parse64;

import javax.xml.bind.DatatypeConverter;

public class MainParse64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String header = "esto es un header";
		String payload = "esto es un payload";
		
	    byte[] headerBase64 = DatatypeConverter.parseBase64Binary(header);
	    byte[] headerHex = DatatypeConverter.parseHexBinary(header);
	    
	    
	    System.out.println("apiKeySecretBytes: " + headerBase64);
	    System.out.println("headerHex: " + headerHex);
	  
	    for(int i=0; i<headerBase64.length;i++) {
	    	//System.out.println(headerBase64[i] );
	    	
	    	//c= (char)headerBase64[i];
	    	//System.out.println(headerBase64[i] + " --> " + c );
	    }
	    
	    
	    
	}

}
