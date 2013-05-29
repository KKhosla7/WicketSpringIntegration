package com.insecure.wicket;

import com.insecure.springbeans.services.GreetingService;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: Karan Khosla
 * Date: 5/26/13
 * Time: 11:12 PM
 */

public class Greetings extends WebPage {
    @Inject
    private GreetingService greetingService;

    public Greetings(final PageParameters parameters) {
        add(new Label("greetings", greetingService.getGreetingMessage()));
    }
}
