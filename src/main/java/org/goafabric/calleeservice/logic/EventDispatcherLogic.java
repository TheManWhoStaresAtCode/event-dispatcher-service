package org.goafabric.calleeservice.logic;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.goafabric.calleeservice.service.ChangeEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventDispatcherLogic {
    public void dispatch(@RequestBody ChangeEvent changeEvent) {
        log.info(changeEvent.toString());
    }
}