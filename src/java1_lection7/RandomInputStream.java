package java1_lection7;

import java.io.IOException;
import java.io.InputStream;

public class RandomInputStream extends InputStream{

	@Override
	public int read() throws IOException {
		return (int)Math.round(Math.random());
	}

}
