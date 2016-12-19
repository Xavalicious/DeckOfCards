import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Card implements Comparable{
	ArrayList<Type> decky;
	int k=0;
	public Card(ArrayList<Type> a){
		decky=a;
	}
	public void shuffle() {
		Random rndm=new Random();
		for(int z=0;z<decky.size();z++){
		int x=rndm.nextInt(decky.size());
		int y=rndm.nextInt(decky.size());
		Collections.swap(decky,x,y);
		}
		k=0;
		System.out.println();
	}

	public void deal() {
		String s=decky.get(k).getCard1();
				/*decky.get(k).getValue()+" of "+decky.get(k).getSuit();
		if(s.substring(0,2).equals("1 ")){s="Ace of "+decky.get(k).getSuit();}
		if(s.substring(0,2).equals("11")){s="Jack of "+decky.get(k).getSuit();}
		if(s.substring(0,2).equals("12")){s="Queen of "+decky.get(k).getSuit();}
		if(s.substring(0,2).equals("13")){s="King of "+decky.get(k).getSuit();}*/
		System.out.println(s);
		k++;
		if(k==52){k=0;}
	}
	public int dealio(ArrayList<Type> res){
		int abra=res.get(0).getValue();
		return abra;
	}
	public void addCard(Type E){
		decky.add(0,E);
	}
	public void removeCard(int rem){
		decky.remove(rem);
	}
	public ArrayList<Type> returnArray(){
		return decky;
	}
	public int returnArraySize(ArrayList<Type> R){
		return R.size();
	}
	public void dealToDeck(ArrayList<Type> A){
		Type B=decky.get(0);
		decky.remove(0);
		A.add(0,B);		
	}
	public void war(ArrayList<Type> first, ArrayList<Type> second){
		Type third=second.get(0);
		second.remove(0);
		if(second.size()>0){second.remove(second.size()-1);}
		first.add(first.size()-1,third);
		Type sixth=first.get(0);
		first.remove(0);
		first.add(first.size()-1,sixth);
	}
	public void stalemate(ArrayList<Type> first1, ArrayList<Type> second1){
		System.out.println("Players One and Two have tied. Both cards are now moved to the bottom of their decks.");
		Type fourth=first1.get(0);
		Type fifth=second1.get(0);
		first1.remove(0);
		second1.remove(0);
		if(first1.size()>0){first1.add(first1.size()-1,fourth);}
		if(second1.size()>0){second1.add(second1.size()-1,fifth);}
	}
	
		
}

