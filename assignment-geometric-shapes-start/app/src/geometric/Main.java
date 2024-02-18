package geometric;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Geometric[] list = new Geometric[10];
		command(list);
    }

	public static void command(Geometric[] list){
		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a command: ");
        String command = scan.next();
        switch (command) {
            case "quit":
                System.out.println("Quitting program.");
                //quit program
                break;
            case "show":
				for (int i = 0; i < list.length; )
                //list geometric objects
				command(list);
                break;
            case "circle":
				double circlex = Double.valueOf(scan.next());
				double circley = Double.valueOf(scan.next());
				double circler = Double.valueOf(scan.next());
				double centre[] = {circlex, circley};
                //add new circle
				command(list);
                break;
            case "rectangle":
				double rectx = Double.valueOf(scan.next());
				double rexty = Double.valueOf(scan.next());
				double rextw = Double.valueOf(scan.next());
				double rexth = Double.valueOf(scan.next());
				double corner[] = {rectx, rexty};
                //add new rectangle
				command(list);
                break;
            case "move":
				double movei = Double.valueOf(scan.next());
				double dx = Double.valueOf(scan.next());
				double dy = Double.valueOf(scan.next());
                //move object
				command(list);
                break;
			case "remove":
				double removei = Double.valueOf(scan.next());
				//remove object at i
				command(list);
				break;
			case "filter":
				String filterc = scan.next();
				double filtern = Double.valueOf(scan.next());
				//filter
				command(list);
				break;
			case "sort":
				String sortc = scan.next();
				switch (sortc) {
					case "x":
						LeftSorter.compare(list); 
						break;
					case "y":
						BottomSorter.compare(list);
						break;
					default:
						AreaSorter.compare(list);
				}
				//sort
				command(list);
				break;
			default:
				System.out.println("No valid command given. Enter a new command:");
				command(list);
        }
		scan.close();
    }

	public static int firstFreeIndex(Geometric[] list) {
		for (int i = 0; i < list.length; i++){
			if (list[i] = null) //weet dat dit niet werkt maar idk hoe ik lege indexes van de array kan vinden....
				return i;
			else return -1;
		}
	}
	
}

