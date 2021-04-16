package org.villetto.apiuser.services.impl;

import org.villetto.apiuser.services.api.MessagePropertiesService;

import javax.enterprise.context.ApplicationScoped;
import java.util.ResourceBundle;

@ApplicationScoped
public class MessagePropertiesServiceImpl implements MessagePropertiesService {

    @Override
    public String getMessageValue(String code) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        return resourceBundle.getString(code);
    }

}
