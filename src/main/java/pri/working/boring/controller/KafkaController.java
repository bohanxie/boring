package pri.working.boring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pri.working.boring.entity.User;
import pri.working.boring.kafka.KafkaConsumerDemo;
import pri.working.boring.kafka.KafkaProducer;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName KafkaController.java
 * @Description TODO
 * @createTime 2020年10月12日 16:05:00
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private KafkaConsumerDemo kafkaConsumerDemo;

    @RequestMapping("/createMsg")
    public void createMsg() {
        User user = new User("hah","25","1");
        kafkaProducer.sendUserMessage(user);
    }

    @RequestMapping("/readMsg")
    public void readMsg() {
        kafkaConsumerDemo.consume();
    }
}
