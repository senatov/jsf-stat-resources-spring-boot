package de.senatov.drillstatic.view;


import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.time.LocalDateTime;


@Component
@ViewScoped
@Slf4j
@ToString
public class UserBean {

    public UserBean() {
        log.debug("Created UserBean");
    }


    public String getFrom() {
        log.info("getFrom ()");
        return toString();
    }


    public String getDate() {
        log.warn("getDate ()");
        return LocalDateTime.now().toString();
    }

}
