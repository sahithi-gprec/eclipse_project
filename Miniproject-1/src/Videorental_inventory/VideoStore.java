package Videorental_inventory;
import java.util.*;
public class VideoStore {
	ArrayList<video> store=new ArrayList<video>();
	void addVideo(String name) {
		video v=new video(name);
		store.add(v);
		System.out.println("Video \" "+name+"\" added successfully");
	}
	void doCheckout(String name) {
		boolean flag=false;
		for(video v:store)
			if(v.getName().equals(name)) {
				v.doCheckout();
				v.checkout=true;
				flag=true;
				System.out.println("Video \" "+name+"\" checked out successfully");

			}
		if(flag==false)
			System.out.println("Video \""+name+"\" couldn't be found");
	}
	void doReturn(String name) {
		boolean flag=false;
		for(video v:store)
			if(v.getName().equals(name)) {
				if(v.getCheckout()==true) {
				v.doReturn();
				v.checkout=false;
				flag=true;
				System.out.println("Video \" "+name+"\" returned successfully");}
				else {
					System.out.println("Video \""+name+"\" couldn't be found");

				}
			}
		if(flag==false)
			System.out.println("Video \""+name+"\" couldn't be found");
	}
	void receiveRating(String name,int rating) {
		for(video v:store)
			if(v.getName().equals(name)) {
				v.receiveRating(rating);
				//v.rating=rating;
			}
		System.out.println("Rating "+rating+" has been mapped to the video \" "+name+"\"");
	}
	void listInventory() {
		System.out.println("-------------------------------------------------------");
		System.out.println("Video Name\t| Checkout status\t| Rating ");
		for(video v:store) {
			System.out.println(v.getName()+"\t\t|"+v.getCheckout()+"\t\t\t|"+v.getRating());
		}
		System.out.println("-------------------------------------------------------");
	}
}
