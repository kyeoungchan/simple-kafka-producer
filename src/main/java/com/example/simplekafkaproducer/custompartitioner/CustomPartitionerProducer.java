package com.example.simplekafkaproducer.custompartitioner;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * 이 애플리케이션을 실행시키기 전에 토픽이 사전에 생성되어 있어야 한다.
 * 로컬 환경에서 다음의 커맨드 실행
 * $ bin/kafka-topics.sh --bootstrap-server my-kafka:9092 \
 *   --create \
 *   --topic test \
 *   --partitions 3
 */
@Slf4j
public class CustomPartitionerProducer {

    // 프로듀서는 생성한 레코드를 전송하기 위해 전송하고자 하는 토픽을 알고있어야 한다.
    // 토픽 이름은 Producer Record 인스턴스를 생성할 때 사용된다.
    private final static String TOPIC_NAME = "test";

    // 전송하고자 하는 카프카 클러스터 서버의 host와 IP를 지정한다.
    private final static String BOOTSTRAP_SERVERS = "my-kafka:9092";

    public static void main(String[] args) {

        // KafkaProducer 인스턴스를 생성하기 위한 프로듀서 옵션들은 key/value 형태로 선언한다.
        Properties configs = new Properties();

        configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);

        // 메시지 key와 value를 직렬화하기 위한 직렬화 클래스 선언
        configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // CustomPartitioner로 파티셔너 지정
        configs.put(ProducerConfig.PARTITIONER_CLASS_CONFIG, CustomPartitioner.class);

        // Properties를 KafkaProducer 생성 파라미터로 전달하여 인스턴스를 생성
        KafkaProducer<String, String> producer = new KafkaProducer<>(configs);

        String messageValue = "testMessage";

        // 파티션도 직접 지정
        // 토픽 이름, 파티션 번호, message key, message value 전달
        ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, "charles", messageValue);



        // 즉각적인 전송은 아니고, record를 프로듀서 내부에서 갖고 있다가 배치 형태로 묶어서 브로커에 전송한다.
        // 배치 전송
        producer.send(record);

        log.info("record: {}", record);

        // 프로듀서 내부 버퍼에 있던 레코드 배치를 브로커로 전송
        producer.flush();

        // producer 인스턴스의 리소스들을 안전하게 종료
        producer.close();
    }
}
