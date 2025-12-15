package week4.day28;

public class Animal {
	public String publicName = "Public Animal";
	protected String protectedName = "Protected Animal";
	String defaultName = "Default Animal"; // package-private
	private String privateName = "Private Animal";

	public void printAllNames() {
		System.out.println(publicName);
		System.out.println(protectedName);
		System.out.println(defaultName);
		System.out.println(privateName);
	}
}
