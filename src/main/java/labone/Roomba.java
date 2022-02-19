/**
 * 
 */
package labone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;


/**
 * My Roomba Class 
 * @author alanis
 *
 */
public class Roomba  implements GenericComponent {

	private String model; //specific model type
	private String bumper; //detects nearby objects 
	private String color; // specifies the color of the vacuum
	private String camera; //helps captures movement
	private int serialNumber; //unique number
	private int registrationNumber; // unique number 
	private int timer;  //reminds itself when to start cleaning
	
	private RoombaCloud myCloud; // interprets messages 
	private User myUser; //utilizes the Roomba
	private InfraredSensors mySensors; //senses dirt
	private MapDetector myMapDetector; //tracks distance and time
	
	public Roomba () {
		myCloud = new RoombaCloud();
		myUser = new User();
		mySensors = new InfraredSensors();
		myMapDetector = new MapDetector(); 
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "iRobot Roomba 960";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myCloud, myUser,mySensors, myMapDetector); // add all your sub components
		return internalComponents;	}

}