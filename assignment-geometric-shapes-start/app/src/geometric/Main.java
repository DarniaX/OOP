package geometric;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Geometric[] list = new Geometric[10];
		command();
    }

	public static void command(){
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a command: ");
        String command = scan.next();
        switch (command) {
            case "quit":
                System.out.println("Quitting program.");
                //quit program
                break;
            case "show":
				System.out.println("test1");
                //list geometric objects
				command();
                break;
            case "circle":
				double circlex = Double.valueOf(scan.next());
				double circley = Double.valueOf(scan.next());
				double circler = Double.valueOf(scan.next());
				double centre[] = {circlex, circley};
                //add new circle
				command();
                break;
            case "rectangle":
				double rectx = Double.valueOf(scan.next());
				double rexty = Double.valueOf(scan.next());
				double rextw = Double.valueOf(scan.next());
				double rexth = Double.valueOf(scan.next());
				double corner[] = {rectx, rexty};
                //add new rectangle
				command();
                break;
            case "move":
				double movei = Double.valueOf(scan.next());
				double dx = Double.valueOf(scan.next());
				double dy = Double.valueOf(scan.next());
                //move object
				command();
                break;
			case "remove":
				double removei = Double.valueOf(scan.next());
				//remove object at i
				command();
				break;
			case "filter":
				String filterc = scan.next();
				double filtern = Double.valueOf(scan.next());
				//filter
				command();
				break;
			case "sort":
				String sortc = scan.next();
				//sort
				command();
				break;
			default:
				System.out.println("No valid command given. Enter a new command:");
				command();
        }
		scan.close();
    }

	
}

