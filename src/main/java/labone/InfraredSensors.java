/**
 * 
 */
package labone;
import edu.fiu.jit.SelfCheckCapable;
/**
 * @author alanis
 *
 */
public class InfraredSensors extends ControlBoard {

	private String infrared;
	private String photocell;
	private String wall;
	private String cliff;
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Sensors array";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
