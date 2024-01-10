package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
System.out.println("Chrome");
		return (browserName);
	}

	public void loadURL() {
		System.out.println("URL loaded successfully");
	}

	public static void main(String[] args) {
		Browser chrome = new Browser();
		System.out.println(chrome.launchBrowser("Broswer launched successfully"));
		chrome.loadURL();

	}

}
