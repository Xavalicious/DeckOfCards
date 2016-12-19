
public class Type {
	private String ando;
	private int bobo;
	public Type(String a, int b){
		ando=a;
		bobo=b;
	}
	public String getSuit(){
		return ando;
	}
	public int getValue(){
		return bobo;
	}
	public String getCard1(){
		String cardo=Integer.toString(bobo)+" ";
		if(cardo.substring(0,2).equals("1 ")){cardo="Ace of "+ando;}
		if(cardo.substring(0,2).equals("11")){cardo="Jack of "+ando;}
		if(cardo.substring(0,2).equals("12")){cardo="Queen of "+ando;}
		if(cardo.substring(0,2).equals("13")){cardo="King of "+ando;}
		else{cardo=bobo+" of "+ando;}
		return cardo;
	}

}
