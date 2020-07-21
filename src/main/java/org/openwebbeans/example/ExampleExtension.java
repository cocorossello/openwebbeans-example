package org.openwebbeans.example;

import javax.enterprise.context.Initialized;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Extension;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
public class ExampleExtension implements Extension, Serializable{

    public void processSessionScopedInit(@Observes @Initialized(SessionScoped.class) HttpSession payload) {}

}
