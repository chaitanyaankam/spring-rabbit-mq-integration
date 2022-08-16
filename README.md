# spring-rabbit-mq-integration
Spring boot rabbit MQ integration prod ready

a. Navigate to https://customer.cloudamqp.com/instance <br/>
b. Create your account.<br/>
c. Set up Free tire instance of rabbit mq.<br/>
d. Navigate to https://api.cloudamqp.com/console/<instance_id>/details<br/>
e. Under AMQP Details copy the following to application.properties<br/>
  1. URL as <URL> in spring.rmq.host=URL
  2. username as in spring.rmq.username=username
  3. password as in spring.rmq.passowrd=password
f. Run the application as spring boot application <br/>
g. Produce messages to fanout queue using the following API <br/>
  <img width="668" alt="image" src="https://user-images.githubusercontent.com/12813677/184720131-45dd6f37-415a-4b4e-83bf-67056d322301.png">

