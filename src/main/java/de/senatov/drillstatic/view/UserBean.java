package de.senatov.drillstatic.view;



import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;



@Component
@Scope("view")
@Slf4j
@ToString
public class UserBean {

    public UserBean() {

        log.debug("Created UserBean");
    }



    public String getFrom() {

        return this.toString();
    }



    public String getDate() {

        return LocalDateTime.now().toString();
    }

}
