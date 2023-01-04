package Videorental_inventory;

public class video {
	String videoName;
	boolean checkout;
	int rating;
	String getName() {
		return videoName;
	}
	void doCheckout() {
		checkout=true;
	}
	void doReturn() {
		checkout=false;
	}
	public video(String videoName) {
		this.videoName = videoName;
	}
	void receiveRating(int rating) {
		this.rating=rating;
	}
	int getRating() {
		return rating;
	}
	boolean getCheckout() {
		return checkout;
	}
}
