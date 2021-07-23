package de.senatov.drillstatic.view;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import javax.faces.context.FacesContext;
import java.util.Map;


/**
 * The JSF view scope ported to spring *
 */
@Slf4j
public class ViewScope implements Scope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {

        Map<String, Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
        if (viewMap.containsKey(name))
            return viewMap.get(name);
        else {
            Object object = objectFactory.getObject();
            viewMap.put(name, object);
            return object;
        }
    }


    @Override
    public String getConversationId() {
        log.info("getConversationId ()");
        return null;
    }


    @Override
    public void registerDestructionCallback(String arg0, Runnable arg1) {
        log.info("registerDestructionCallback ()");
    }


    @Override
    public Object remove(String name) {
        log.info("remove ()");
        return FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name);

    }


    @Override
    public Object resolveContextualObject(String arg0) {
        return null;
    }

}
