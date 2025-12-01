package com.example.simplekafkaproducer.custompartitioner;

import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
import org.apache.kafka.common.InvalidRecordException;
import org.apache.kafka.common.PartitionInfo;
import org.apache.kafka.common.utils.Utils;

@Slf4j
public class CustomPartitioner implements Partitioner {

    /**
     *
     * @param cluster
     * @return 주어진 레코드가 들어갈 파티션 번호
     */
    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {

        // 레코드에 메시지 키를 지정하지 않을 경우, 비정상적인 데이터로 간주
        if (keyBytes == null) {
            throw new InvalidRecordException("Need message key");
        }

        // 메시지 키가 charles인 경우 파티션 0번으로 지정
        if ("charles".equals(key)) {
            return 0;
        }

        // charles가 아닌 메시지 키를 가진 레코드는 해시값을 지정하여 파티션에 지정한다.
        List<PartitionInfo> partitions = cluster.partitionsForTopic(topic);
        int numPartitions = partitions.size();
        return Utils.toPositive(Utils.murmur2(keyBytes)) % numPartitions;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
