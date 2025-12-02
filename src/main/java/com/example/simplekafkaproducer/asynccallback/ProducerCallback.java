package com.example.simplekafkaproducer.asynccallback;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

@Slf4j
public class ProducerCallback implements Callback {

    /**
     * 레코드의 비동기 결과를 받기 위해 사용되는 메서드
     */
    @Override
    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
        if (e != null) {
            log.error(e.getMessage(), e);
        } else {
            log.info(recordMetadata.toString());
        }
    }
}
