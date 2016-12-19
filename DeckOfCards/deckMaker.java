
public class deckMaker {

	public void deckMake(){
		//first deck
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
				
				//first player
				int h=0;
				for(int c1=1;c1<14;c1++){
					cardy=new Type(a,c1);
					PlayerOne.add(h,cardy);
					h++;
				}
				for(int d1=1;d1<14;d1++){
					cardy=new Type(aa,d1);
					PlayerOne.add(g,cardy);
					h++;
				}
				for(int e1=1;e1<14;e1++){
					cardy=new Type(aaa,e1);
					PlayerOne.add(h,cardy);
					h++;
				}
				for(int f1=1;f1<14;f1++){
					cardy=new Type(aaaa,f1);
					PlayerOne.add(h,cardy);
					h++;
				}
				
				//Second player
				int j=0;
				for(int c11=1;c11<14;c11++){
					cardy=new Type(a,c11);
					PlayerTwo.add(j,cardy);
					j++;
				}
				for(int d11=1;d11<14;d11++){
					cardy=new Type(aa,d11);
					PlayerTwo.add(j,cardy);
					h++;
				}
				for(int e11=1;e11<14;e11++){
					cardy=new Type(aaa,e11);
					PlayerTwo.add(j,cardy);
					j++;
				}
				for(int f11=1;f11<14;f11++){
					cardy=new Type(aaaa,f11);
					PlayerTwo.add(j,cardy);
					j++;
				}
	}
}
