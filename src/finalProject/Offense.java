package finalProject;

public class Offense {
	private Odometer odo;
	private Navigation nav;

	public Offense(Navigation nav,Odometer odo){
		this.odo = odo;
		this.nav = nav;
	}
	
	public  void doOffense(){
		
		int corner= Main.getParameter(0);
		int forwadZoneWidth = Main.getParameter(4);
		
		switch(corner){						// want to travel to closeset point in the offending zone from given corner
		case 1:  
			nav.travelToTile(1,1 );
			break;
		case 2:
			nav.travelToTile(9,1 );
			break;
		case 3:
			nav.travelToTile(9,forwadZoneWidth );
			break;
		case 4:
			nav.travelToTile(1,forwadZoneWidth );
			break;
		}
		
		
		
	}

}
