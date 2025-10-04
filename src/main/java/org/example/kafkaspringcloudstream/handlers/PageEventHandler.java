package org.example.kafkaspringcloudstream.handlers;

import org.example.kafkaspringcloudstream.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PageEventHandler {

    // ce consommateur fait un subscribe au topic, dés il y a un message qui arrive, il va le consumer
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input)->{
            System.out.println("************************");
            System.out.println(input.toString());
            System.out.println("************************");
        };
    }
}
