package zadanie;

public class Main {

	public static void main(String[] args) {
		Chat chat = new Chat();
		
		UserSwitcher userSwitcher = new UserSwitcher();
		BaseUser sasho = userSwitcher.getUser("USER", "SashoQ");
		BaseUser pesho = userSwitcher.getUser("USER", "PeshoU");
		BaseUser gosho = userSwitcher.getUser("USER", "GoshoLU");

		chat.register(sasho);
		chat.register(pesho);
		chat.register(gosho);
		
		sasho.send(pesho.getName(), "How are you dudes? How was the holiday?");
		sasho.send(sasho.getName(), "addBot");
		sasho.send(gosho.getName(), "Watch this!");
		sasho.send(pesho.getName(), "What pet did you have?");
		pesho.send(sasho.getName(), "I've got a nice cat, dude");
	}

}
