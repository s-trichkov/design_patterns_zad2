package zadanie;

public interface ChatInterface {
	public void register(BaseUser user);
	public void unregister(BaseUser user);
	public void send(String from, String to, String message);

}
