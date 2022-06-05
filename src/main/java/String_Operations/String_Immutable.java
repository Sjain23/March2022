package String_Operations;

public class String_Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Immutable means? Something which cannot be changed
		//String Objects are immutable. Immutability ka jo concept hai woh String Objects ke sath relate kiya jaata hai
		
		String S=new String("Selenium");	//heap area because of new keyword.SCP mein jisme literal jayega
		S.concat("Java");
		System.out.println(S); 	//Selenium
		
		S=S.concat("C++");
		System.out.println(S); 	//SeleniumC++
		
		//if we try to change anything in String Object, it will create a new object and will not change the original object
		
		//Why is still String immutable?
		
		String player1 = "Cricket";		//String literal is Cricket ->1 object will be created in SCP
		String player2 = "Cricket";		//no object will be created rather player2 will refer to Cricket
		String player3 = "Cricket";
		
		//String player100 = "Cricket";
		
		//Now, if player3 decides to change the literal to "Soccer", Cricket will not be removed. another object "Soccer" will be created in SCP
	}

}
