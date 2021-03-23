
public class PremiumUser implements IUser {

	private ChatMediator chatMediator;
	private String name;
	
	
	
	

	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+" received message:--"+message);
		

	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		chatMediator.sendMessage(message);
	}


	
}
