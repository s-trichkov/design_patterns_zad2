package zadanie;

public class Bot extends BaseUser {

	private static Bot instance;
	
	public Bot(String name) {
		super(name);
	}
	
	public static Bot getInstance() {
		if(instance == null) {
			instance = new Bot("Botyo");
		}
		
		return instance;
	}

}
