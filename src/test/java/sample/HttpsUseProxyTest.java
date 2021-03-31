package sample;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oolon.http.HttpUtil;
import io.oolon.http.config.HttpProxySelector;
import io.oolon.http.config.impl.HttpProxySelectorByProperties;
import io.oolon.http.utils.HttpClientUtil;

public class HttpsUseProxyTest {

	    private static Logger logger = LoggerFactory.getLogger(HttpsUseProxyTest.class);

	    public static void main(String args[]) throws URISyntaxException {
	        HttpProxySelector httpProxySelector = new HttpProxySelectorByProperties();
	        HttpClientUtil.initProxy(httpProxySelector);
	        long begin = System.currentTimeMillis();
	            String response = HttpUtil.doGet("https://www.12306.cn/index/");
	            logger.info(response);

	        long end = System.currentTimeMillis();
	        logger.info("du " + (end - begin));
	        //System.out.println(response);
	    }


}
