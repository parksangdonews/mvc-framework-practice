package com.ttp.mvcframework;

import java.io.File;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MvcframeworkApplication {

    public static void main(String[] args) throws LifecycleException {
        String webappDirLocation = "webapps";

        // start embedded tomcat server
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath()); // add webapp to tomcat

        log.info("configuring app with basedir: {} ",
            new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();

    }


}
