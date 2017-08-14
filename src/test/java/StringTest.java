import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aic on 2017-08-14.
 */
public class StringTest {

	private int tenThousandCount = 10000;

	@Test
	public void appendBuilderTenThousandTest() {
		StringBuilder sb = new StringBuilder();
		for( int i = 0; i < tenThousandCount; ++i ) {
			sb.append( "appender" );
		}
		String s = sb.toString();
//		System.out.println( s );
		Assert.assertTrue( true );

	}

	@Test
	public void appendConcatTenThousandTest() {
		String s = new String();
		for( int i = 0; i < tenThousandCount; ++i ) {
			s = s.concat( "appender" );
		}
//		System.out.println( s );
		Assert.assertTrue( true );
	}
}
