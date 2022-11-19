# docker compose
go to /src/deploy/docker and do "./stack up"

# run jvm multi image
docker pull goafabric/event-dispatcher-service:3.0.0-RC3 && docker run --name event-dispatcher-service --rm -p50500:50500 -e spring.rabbitmq.host=host.docker.internal goafabric/event-dispatcher-service:3.0.0-RC3

# run native image
docker pull goafabric/event-dispatcher-service-native:3.0.0-RC3 && docker run --name event-dispatcher-service-native --rm -p50500:50500 -e spring.rabbitmq.host=host.docker.internal goafabric/event-dispatcher-service-native:3.0.0-RC3 -Xmx32m

# run native image arm
docker pull goafabric/event-dispatcher-service-native-arm64v8:3.0.0-RC3 && docker run --name event-dispatcher-service-native-arm64v8 --rm -p50500:50500 -e spring.rabbitmq.host=host.docker.internal goafabric/event-dispatcher-service-native-arm64v8:3.0.0-RC3 -Xmx32m
                                              
# rabbitmq
docker run --rm -p15672:15672 -p5672:5672 --name rabbitmq -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=admin rabbitmq:3.11.1-management