package org.goafabric.eventdispatcher.consumer;

/*
@Component
@Slf4j
public class LoggerAdapter {
    private static final String QUEUE_NAME = "LoggingQueue";

    @RabbitListener(bindings = @QueueBinding(
        value = @Queue(name = QUEUE_NAME, durable = "false"),
        exchange = @Exchange(value = PATIENT, type = ExchangeTypes. TOPIC),
        key = { "#" }
    ))
    public void logExchangePatient(@Header(AmqpHeaders.RECEIVED_ROUTING_KEY) String routingKey, @Header(AmqpHeaders.RECEIVED_EXCHANGE) String exchange, String id) {
        log.info("type = patient; operation = {}; id = {}; received exchange = {}", routingKey, id, exchange);
    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = QUEUE_NAME, durable = "false"),
            exchange = @Exchange(value = PRACTITIONER, type = ExchangeTypes.TOPIC),
            key = { "#" }
    ))
    public void logExchangePractice(@Header(AmqpHeaders.RECEIVED_ROUTING_KEY) String routingKey, @Header(AmqpHeaders.RECEIVED_EXCHANGE) String exchange, String id) {
        log.info("type = practice; operation = {}; id = {}; received exchange = {}", routingKey, id, exchange);
    }

    @RabbitListener(bindings = @QueueBinding(
        value = @Queue(name = QUEUE_NAME, durable = "false"),
        exchange = @Exchange(value = ORGANIZATION, type = ExchangeTypes.TOPIC),
        key = { "#" }
    ))
    public void logExchangeOrganization(@Header(AmqpHeaders.RECEIVED_ROUTING_KEY) String routingKey, @Header(AmqpHeaders.RECEIVED_EXCHANGE) String exchange, String id) {
        log.info("type = organization; operation = {}; id = {}; received exchange = {}", routingKey, id, exchange);
    }
}

 */
