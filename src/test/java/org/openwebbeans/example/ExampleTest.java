package org.openwebbeans.example;

import org.apache.openejb.jee.WebApp;
import org.apache.openejb.testing.Application;
import org.apache.openejb.testing.ApplicationComposers;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.Module;
import org.apache.webbeans.spi.ContainerLifecycle;
import org.junit.jupiter.api.Test;


public class ExampleTest {

    @Module
    @Classes(cdi = true)
    public WebApp app() {
        return new WebApp()
                .contextRoot("/")
                .addServlet("REST Application", Application.class.getName());
    }

    @Test
    public void start() {
        ApplicationComposers.run(ExampleTest.class, new String[]{});
    }

}
