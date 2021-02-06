# Demo Spring Micro-services

## Components of microservices : 

- API Gateway (9090)
- Eureka (Discovery Service) (8761)
- Service 1 - Employee Service (9001)
- Service 2 - Department Service (9002)

Both services are registered in the eureka service. All calls are going through api gateway. Employee Service calls department service through feign client.

## Logging : 
- JSON logging - To ship logs directly to Elasticsearch without parsing. (https://github.com/logstash/logstash-logback-encoder)
- Add [logback.xml](/api-gateway/src/main/resources/logback.xml)

```java
<dependency>
    <groupId>net.logstash.logback</groupId>
    <artifactId>logstash-logback-encoder</artifactId>
    <version>6.6</version>
</dependency>

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
</dependency>

```