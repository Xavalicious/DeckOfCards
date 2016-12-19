import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		String a="hearts";
		String aa="clubs";
		String aaa="diamonds";
		String aaaa="spades";
		ArrayList<Type> deck=new ArrayList<Type>();
		ArrayList<Type> PlayerOne=new ArrayList<Type>();
		ArrayList<Type> PlayerTwo=new ArrayList<Type>();
		Type cardy;
		
		int g=0;
		for(int c=1;c<14;c++){
			cardy=new Type(a,c);
			deck.add(g,cardy);
			g++;
		}
		for(int d=1;d<14;d++){
			cardy=new Type(aa,d);
			deck.add(g,cardy);
			g++;
		}
		for(int e=1;e<14;e++){
			cardy=new Type(aaa,e);
			deck.add(g,cardy);
			g++;
		}
		for(int f=1;f<14;f++){
			cardy=new Type(aaaa,f);
			deck.add(g,cardy);
			g++;
		}
		
		Card bicycle=new Card(deck);
		Card One=new Card(PlayerOne);
		Card Two=new Card(PlayerTwo);
		bicycle.shuffle();
		int arraySize=bicycle.returnArraySize(deck)/2;
		
		for(int num=0;num<arraySize;num++){
		bicycle.dealToDeck(PlayerOne);
		bicycle.dealToDeck(PlayerTwo);
		}
		int turns=0;
		boolean fact=true;
		while(fact){
			if(bicycle.returnArraySize(PlayerOne)==0){
				System.out.println(turns+": Player Two has won. GAME OVER");
				break;
			}
			if(bicycle.returnArraySize(PlayerTwo)==0){
				System.out.println(turns+": Player One has won. GAME OVER");
				break;
			}
			if(bicycle.dealio(PlayerOne)>bicycle.dealio(PlayerTwo))
			{
				turns++;
				System.out.println(turns+": Player One has won this round. "+PlayerOne.get(0).getCard1()+" beats "
						+ PlayerTwo.get(0).getCard1());
				bicycle.war(PlayerOne, PlayerTwo);
				continue;
			}
			if(bicycle.dealio(PlayerTwo)>bicycle.dealio(PlayerOne))
			{
				turns++;
				System.out.println(turns+": Player Two has won this round. "+PlayerTwo.get(0).getCard1()+" beats "
						+PlayerTwo.get(0).getCard1());
				bicycle.war(PlayerTwo, PlayerOne);
				continue;
			}
			
			else if(bicycle.dealio(PlayerTwo)==bicycle.dealio(PlayerOne)){bicycle.stalemate(PlayerOne,PlayerTwo);}
			}
		System.out.println("The original deck has "+bicycle.returnArraySize(deck)+" cards remaining.");
		}
}
