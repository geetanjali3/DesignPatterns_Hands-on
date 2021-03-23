
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChatMediator chatmediator=new ChatMediator();
		IUser user1=new BasicUser(chatmediator,"user1");
		IUser user2=new PremiumUser(chatmediator,"user2");
		IUser user3=new BasicUser(chatmediator,"user3");
		chatmediator.addUser(user1);
		chatmediator.addUser(user2);
		user3.sendMessage("How are you ???");
		
		
		
		
	}

}
