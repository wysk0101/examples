package com.github.seraphain.examples.cxf.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.seraphain.examples.cxf.CxfServer;

/**
 * CXF client.
 * 
 * @author
 */
public class CxfClient {

    /** Log */
    private static Logger log = LoggerFactory.getLogger(CxfClient.class);

    /**
     * Main method.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CxfServer cxfServer = (CxfServer) context.getBean("cxfServer");
        String result = cxfServer.service("Client request.");
        if (log.isInfoEnabled()) {
            log.info("Result: " + result);
        }
        context.close();
    }

}
