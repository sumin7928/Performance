import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by aic on 2017-08-14.
 */
public class ExceptionTest {

	private void showRuntimeException() throws RuntimeException {
		throw new RuntimeException( "runtime exception" );
	}

	private void showIOException() throws IOException {
		throw new IOException( "io exception" );
	}

	private void noneException() {

	}

	@Test
	public void overlapTryTest() {
		int exceptionCount = 0;
		try {
			noneException();
			try {
				showRuntimeException();
			} catch ( Exception e ) {
				e.printStackTrace();
				++exceptionCount;
			}
		} catch ( Exception e ) {
			e.printStackTrace();
			++exceptionCount;
		}
		finally {
			Assert.assertEquals( 1, exceptionCount );
		}
	}
}
