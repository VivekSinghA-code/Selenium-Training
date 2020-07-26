
public class smartPhone extends AndroidPhones {

	public void connectWhatsApp() {
		System.out.println("connectwhats app");

	}

	public void takeVideo() {

		System.out.println("take Video smartPhone");
	}

	public static void main(String[] args) {
		smartPhone sp = new smartPhone();
		AndroidPhones ap = new AndroidPhones();
		sp.connectWhatsApp();
		sp.takeVideo();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		ap.takeVideo();
	}

}
