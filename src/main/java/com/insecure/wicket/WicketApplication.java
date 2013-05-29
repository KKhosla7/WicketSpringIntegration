package com.insecure.wicket;

import org.apache.wicket.core.util.file.WebApplicationPath;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/26/13
 * Time: 10:33 PM
 */
public class WicketApplication extends WebApplication {

    @Override
    public Class<Greetings> getHomePage() {
        return Greetings.class;
    }

    @Override
    public void init() {
        super.init();
        getDebugSettings().setDevelopmentUtilitiesEnabled(true);
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
        getResourceSettings().getResourceFinders().add(0, new WebApplicationPath(getServletContext(), "/"));
    }
}
