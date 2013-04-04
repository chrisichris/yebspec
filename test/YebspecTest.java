import junit.framework.Test;
import junit.framework.TestCase;
import org.yeb.YebspecJunitSuite;

public class YebspecTest extends TestCase {
	
	public YebspecTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		//will run the spec in yebspecSpec.yeti
		return YebspecJunitSuite.create("yebspecSpec");
	}
}
