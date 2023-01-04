package Videorental_inventory;
import java.io.*;
public class VideoLauncher {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=true;
		VideoStore vs=new VideoStore();
		do{
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("1.Add Videos: \n2.Check Out Video: \n3.Receive Video: \n4.Receive Rating: \n5.List Inventory: \n6.Exit: ");
			System.out.println("Enter your choice (1..6) :  ");
			int ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1: System.out.println("Enter the name of the video you want add: ");
					String v=br.readLine();
					vs.addVideo(v);
					break;
			case 2: System.out.println("Enter the name of the video you want to checkout: ");
					String c=br.readLine();
					vs.doCheckout(c);
					break;
			case 3: System.out.println("Enter the name of the video you want to return : ");
					String r=br.readLine();
					vs.doReturn(r);
					break;
			case 4: System.out.println("Enter the name of the video you want to rate: ");
					String x=br.readLine();
					System.out.println("Enter the rating for this video: ");
					int rating=Integer.parseInt(br.readLine());
					vs.receiveRating(x, rating);
					break;
			case 5: vs.listInventory(); break;
			case 6: System.out.println("Exiting....!!!! Thanks for using the application");flag=false; break;
			}
			
			
		}while(flag);
		
	}

}
