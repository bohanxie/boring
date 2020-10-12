package pri.working.boring.kafka;

import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import pri.working.boring.entity.User;

import javax.annotation.Resource;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName KafkaProducer.java
 * @Description TODO
 * @createTime 2020年10月12日 15:45:00
 */
@Component
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic.user}")
    private String topicUser;//topic名称

    /**
     * 发送用户消息
     *
     * @param user 用户信息
     */
    public void sendUserMessage(User user) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.setDateFormat("yyyy-MM-dd HH:mm:ss");
        String message = builder.create().toJson(user);
        kafkaTemplate.send(topicUser, message);
        System.out.println("\n生产消息至Kafka\n" + message);
    }
}