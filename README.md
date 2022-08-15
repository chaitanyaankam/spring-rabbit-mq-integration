# spring-rabbit-mq-integration
Spring boot rabbit MQ integration prod ready

a. Navigate to https://customer.cloudamqp.com/instance
b. Create your account.
c. Set up Free tire instance of rabbit mq.
d. Navigate to https://api.cloudamqp.com/console/<instance_id>/details
e. Under AMQP Details copy the following to application.properties
  1. URL as <URL> in spring.rmq.host=<URL>
  2. username as in spring.rmq.username=<username>
  3. password as in spring.rmq.passowrd=<password>
