package org.goafabric.eventdispatcher.producer;

import org.goafabric.eventdispatcher.service.controller.dto.ChangeEvent;
import org.goafabric.eventdispatcher.service.extensions.TenantContext;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Profile("kafka")
@Import(KafkaAutoConfiguration.class)
@Component
public class EventProducerKafka implements EventProducer {

    private final KafkaTemplate kafkaTemplate;

    public EventProducerKafka(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(ChangeEvent changeEvent) {
        send(changeEvent.type().toLowerCase(), changeEvent.operation().toString().toLowerCase(),
                changeEvent.referenceId(), changeEvent.payload());
    }

    private void send(String topic, String operation, String referenceId, Object payload) {
        kafkaTemplate.send(topic, referenceId, new EventData(TenantContext.getAdapterHeaderMap(), referenceId, operation, payload));
    }

}
