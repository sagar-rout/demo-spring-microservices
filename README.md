# Demo Spring Microservices

## Components of microservices : 

- API Gateway (9090)
- Eureka (Discovery Service) (8761)
- Service 1 - Employee Service (9001)
- Service 2 - Department Service (9002)

Both services are registered in the eureka service. All calls are going through api gateway. Employee Service calls department service through feign client.

## Logging

- Logstash
- ELK Stack - I prefer Elasticsearch, beats and Kibana

