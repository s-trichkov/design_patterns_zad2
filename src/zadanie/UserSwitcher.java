package zadanie;

public class UserSwitcher {
	public BaseUser getUser(String userType, String userName) {
		if(userType == null) {
			return null;
		}
		
		if(userType.equalsIgnoreCase("USER")) {
			return new User(userName);
		}
		
		if(userType.equalsIgnoreCase("BOT")) {
			return Bot.getInstance();
		}
		return null;
	}
}