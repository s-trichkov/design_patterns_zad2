package zadanie;

import java.util.HashMap;

public class Chat implements ChatInterface {
	
	private HashMap<String, BaseUser> users = new HashMap<String, BaseUser>();
	private UserSwitcher userSwitcher;
	private BaseUser botUser;
	
	private void notifyUsers() {
		users.forEach((key, value) -> {
			value.receive(botUser.getName(), "You can't just speak about 'cat' here! " + key);
		});
	}

	@Override
	public void register(BaseUser user) {
		if(!users.containsValue(user)) {
			users.put(user.getName(), user);
		}
		
		user.setChatInterface(this);
	}

	@Override
	public void unregister(BaseUser user) {
		if(users.containsKey(user.getName())) {
			System.out.printf("Removing %s\n", user.getName());
			users.remove(user.getName());
			
		}
	}

	@Override
	public void send(String from, String to, String message) {
		if(message == "addBot" && botUser == null) {
			userSwitcher = new UserSwitcher();
			botUser = userSwitcher.getUser("BOT", "General Bot");
		}
		
		BaseUser user = users.get(to);
		
		if(user != null) {
			user.receive(from, message);
		}
		
		if(message.contains("cat") && botUser != null) {
			unregister(users.get(from));
			notifyUsers();
		}
	}

}
