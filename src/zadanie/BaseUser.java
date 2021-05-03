package zadanie;

public class BaseUser {
	private ChatInterface chatInterface;
	private String name;
	
	public BaseUser(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ChatInterface getChatInterface() {
		return chatInterface;
	}
	
	public void setChatInterface(ChatInterface chatInterface) {
		this.chatInterface = chatInterface;
	}
	
	public void send(String to, String message) {
		chatInterface.send(name, to, message);
	}
	
	public void receive(String from, String message) {
		System.out.printf("%s to %s: '%s'\n", from, getName(), message);
	}
}
