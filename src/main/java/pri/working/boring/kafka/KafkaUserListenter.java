package pri.working.boring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author xbh
 * @version 1.0.0
 * @ClassName KafkaUserListenter.java
 * @Description TODO
 * @createTime 2020年10月12日 16:37:00
 */
@Component
public class KafkaUserListenter {

    @KafkaListener(topics = "topic-user")
    public void onMessage(String message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println("消费消息" + message);
    }
}
