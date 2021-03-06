
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oolon.http.HttpUtil;
import io.oolon.http.config.HttpProxySelector;
import io.oolon.http.config.impl.HttpProxySelectorByProperties;
import io.oolon.http.utils.HttpClientUtil;

/**
 * @author squall
 * @version 0.1.0
 * @since 0.1.0
 **/
public class SimpleProxyTest {
    private static Logger logger = LoggerFactory.getLogger(SimpleProxyTest.class);

    public static void main(String args[]) throws URISyntaxException {
        HttpProxySelector httpProxySelector = new HttpProxySelectorByProperties();
        HttpClientUtil.initProxy(httpProxySelector);
        long begin = System.currentTimeMillis();
        for(int i = 0; i < 20 ; ++i) {
            String response = HttpUtil.doGet("http://www.apache.org");
        }
        long end = System.currentTimeMillis();
        logger.info("du " + (end - begin));
        //System.out.println(response);
    }
}


