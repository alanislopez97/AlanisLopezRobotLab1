/**
 * 
 */
package labone;
import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;
/**
 * @author alanis
 *
 */
public class MapDetector implements SelfCheckCapable {
	@Override
	public String getComponentName() { 
		// TODO Auto-generated method stub
		return "MapDetector"; 
	}
	
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}
}
