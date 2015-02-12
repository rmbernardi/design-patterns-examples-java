import org.junit.Test;

import designpatternsjava.structural.proxy.FastImageLoader;
import designpatternsjava.structural.proxy.ImageLoader;
import designpatternsjava.structural.proxy.Proxy;

/**
 * Example context:
 * 
 * In a fantasy role-playing game, during initialization
 * images need to be shown on the screen.
 * Image may need to be downloaded from the internet
 * which could take a few seconds.
 * To keep the application responsive, a place holder image
 * could be shown until the real image has completed 
 * downloading from the server.
 * 
 */
public class ProxyTest 
{
	@Test
	public void test() 
	{
		// Load the local, placeholder image.
		ImageLoader imageLoader = new FastImageLoader();
		imageLoader.load();
		
		// Load the "real" image from the server.
		// This could be done in a separate thread.
		Proxy proxy = new Proxy();
		proxy.load();	
	}
}
