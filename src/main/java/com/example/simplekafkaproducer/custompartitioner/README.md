- [CustomPartitionerProducer 실행 결과](#-CustomPartitionerProducer-실행-결과)
- [토픽에 데이터가 전송되었는지 확인](#-토픽에-데이터가-전송되었는지-확인)

# 💻 CustomPartitionerProducer 실행 결과
```shell
/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/java -Dvisualvm.id=6783067625541 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=49929:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/kyeongchanwoo/projects/simple-kafka-producer/out/production/classes:/Users/kyeongchanwoo/projects/simple-kafka-producer/out/production/resources:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-kafka/4.0.0/13d60be78e5fa00f325a726f0d85a4a92fd0200b/spring-boot-starter-kafka-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/4.0.0/21b8df99b718ba756ad4e20458c59e801865d6e8/spring-boot-starter-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-kafka/4.0.0/28e0957b7af17de72231b54c72439b6c9a212d49/spring-boot-kafka-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/4.0.0/82de562895828f2cdb91284d3f66458c800bfb5d/spring-boot-starter-logging-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/4.0.0/5348987fff66867326396839a066e0c2e52ee989/spring-boot-autoconfigure-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/jakarta.annotation/jakarta.annotation-api/3.0.0/54f928fadec906a99d558536756d171917b9d936/jakarta.annotation-api-3.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/2.5/2d53ddec134280cb384c1e35d094e5f71c1f2316/snakeyaml-2.5.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/4.0.0/92d3fdafcd16e3ffb8fb48a51cff98b5dd6c0432/spring-boot-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.kafka/spring-kafka/4.0.0/793d6f12d17a5ad9a1788757ae60376ce872b5f8/spring-kafka-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.5.21/904915aa29a0bbff111ae90ed85541b2991a72fc/logback-classic-1.5.21.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-to-slf4j/2.25.2/3843798847a7623c1724a9522002233e14fcb0ff/log4j-to-slf4j-2.25.2.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/2.0.17/524cb6ccc2b68a57604750e1ab8b13b5a786a6aa/jul-to-slf4j-2.0.17.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/7.0.1/c75dc812b47a9d6b23568448fbb4518af795bc9e/spring-context-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/7.0.1/a885a444df1d0777989ec11df84eb3e8e7eee2cd/spring-core-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-messaging/7.0.1/b9ef33e77ce94c8c617aef338a5e1186ca6afae7/spring-messaging-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-tx/7.0.1/61bae82733eec52847a6e0565898e00c2fe829a8/spring-tx-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.apache.kafka/kafka-clients/4.1.1/94cb8f39c3157038ec9577634d310a2bf5fb516/kafka-clients-4.1.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-observation/1.16.0/3dc3a2bec5121417b638191b1f3aed16c9764667/micrometer-observation-1.16.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.5.21/970bf47cbc34d24e47f375b6b4e407d6d699474f/logback-core-1.5.21.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.17/d9e58ac9c7779ba3bf8142aff6c830617a7fe60f/slf4j-api-2.0.17.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.25.2/292c1a2b1702f1e1e3adb13e1c57e5bff60335ff/log4j-api-2.25.2.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.jspecify/jspecify/1.0.0/7425a601c1c7ec76645a78d22b8c6a627edee507/jspecify-1.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/7.0.1/20cd632e7fc2fb98f292e9bda0418e725caa0070/spring-aop-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/7.0.1/4ac0dd2d2b27f636385a77a3b40c8597aef8ec06/spring-beans-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/7.0.1/e094d34f17777125adcb01ed5778075aa876c8e6/spring-expression-7.0.1.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.3.5/a3fcc5d3c29b2b03433aa2d2f2d2c1b1638924a1/commons-logging-1.3.5.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-commons/1.16.0/d45ae92945c59eecf485433923fa6a5cf9ce0dbe/micrometer-commons-1.16.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-devtools/4.0.0/dda2d0f369837f2616505f488fd79d2cf31edda3/spring-boot-devtools-4.0.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/com.github.luben/zstd-jni/1.5.6-10/7e146ecb598af55d1f64d1c118af27569a848558/zstd-jni-1.5.6-10.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.lz4/lz4-java/1.8.0/4b986a99445e49ea5fbf5d149c4b63f6ed6c6780/lz4-java-1.8.0.jar:/Users/kyeongchanwoo/.gradle/caches/modules-2/files-2.1/org.xerial.snappy/snappy-java/1.1.10.7/3049f95640f4625a945cfab85715f603fa4c8f80/snappy-java-1.1.10.7.jar com.example.simplekafkaproducer.CustomPartitionerProducer
07:58:13.391 [main] INFO org.apache.kafka.common.config.AbstractConfig -- ProducerConfig values: 
	acks = -1
	batch.size = 16384
	bootstrap.servers = [my-kafka:9092]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-1
	compression.gzip.level = -1
	compression.lz4.level = 9
	compression.type = none
	compression.zstd.level = 3
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = true
	enable.metrics.push = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 5
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metadata.recovery.rebootstrap.trigger.ms = 300000
	metadata.recovery.strategy = rebootstrap
	metric.reporters = [org.apache.kafka.common.metrics.JmxReporter]
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.adaptive.partitioning.enable = true
	partitioner.availability.timeout.ms = 0
	partitioner.class = class com.example.simplekafkaproducer.CustomPartitioner
	partitioner.ignore.keys = false
	receive.buffer.bytes = 32768
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.max.ms = 1000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.assertion.algorithm = RS256
	sasl.oauthbearer.assertion.claim.aud = null
	sasl.oauthbearer.assertion.claim.exp.seconds = 300
	sasl.oauthbearer.assertion.claim.iss = null
	sasl.oauthbearer.assertion.claim.jti.include = false
	sasl.oauthbearer.assertion.claim.nbf.seconds = 60
	sasl.oauthbearer.assertion.claim.sub = null
	sasl.oauthbearer.assertion.file = null
	sasl.oauthbearer.assertion.private.key.file = null
	sasl.oauthbearer.assertion.private.key.passphrase = null
	sasl.oauthbearer.assertion.template.file = null
	sasl.oauthbearer.client.credentials.client.id = null
	sasl.oauthbearer.client.credentials.client.secret = null
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.header.urlencode = false
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.jwt.retriever.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtRetriever
	sasl.oauthbearer.jwt.validator.class = class org.apache.kafka.common.security.oauthbearer.DefaultJwtValidator
	sasl.oauthbearer.scope = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.timeout.ms = 60000
	transaction.two.phase.commit.enable = false
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.StringSerializer

07:58:13.411 [main] INFO org.apache.kafka.common.telemetry.internals.KafkaMetricsCollector -- initializing Kafka metrics collector
07:58:13.464 [main] INFO org.apache.kafka.clients.producer.KafkaProducer -- [Producer clientId=producer-1] Instantiated an idempotent producer.
07:58:13.503 [main] INFO org.apache.kafka.common.utils.AppInfoParser -- Kafka version: 4.1.1
07:58:13.504 [main] INFO org.apache.kafka.common.utils.AppInfoParser -- Kafka commitId: be816b82d25370ce
07:58:13.504 [main] INFO org.apache.kafka.common.utils.AppInfoParser -- Kafka startTimeMs: 1764629893502
07:58:13.712 [kafka-producer-network-thread | producer-1] INFO org.apache.kafka.clients.Metadata -- [Producer clientId=producer-1] Cluster ID: lFtQVYoIRtexLYfgGdNMSQ
07:58:13.713 [kafka-producer-network-thread | producer-1] INFO org.apache.kafka.clients.producer.internals.TransactionManager -- [Producer clientId=producer-1] ProducerId set to 2002 with epoch 0
07:58:13.719 [main] INFO com.example.simplekafkaproducer.CustomPartitionerProducer -- record: ProducerRecord(topic=test, partition=null, headers=RecordHeaders(headers = [], isReadOnly = true), key=charles, value=testMessage, timestamp=null)
07:58:13.761 [main] INFO org.apache.kafka.clients.producer.KafkaProducer -- [Producer clientId=producer-1] Closing the Kafka producer with timeoutMillis = 9223372036854775807 ms.
07:58:13.768 [main] INFO org.apache.kafka.common.metrics.Metrics -- Metrics scheduler closed
07:58:13.768 [main] INFO org.apache.kafka.common.metrics.Metrics -- Closing reporter org.apache.kafka.common.metrics.JmxReporter
07:58:13.768 [main] INFO org.apache.kafka.common.metrics.Metrics -- Closing reporter org.apache.kafka.common.telemetry.internals.ClientTelemetryReporter
07:58:13.768 [main] INFO org.apache.kafka.common.metrics.Metrics -- Metrics reporters closed
07:58:13.769 [main] INFO org.apache.kafka.common.utils.AppInfoParser -- App info kafka.producer for producer-1 unregistered

Process finished with exit code 0

```

<br>

```shell
#producer.send(record).get() 결과
# test 토픽에 0번 파티션에 4번 오프셋
06:16:40.266 [main] INFO com.example.simplekafkaproducer.custompartitioner.CustomPartitionerProducer -- metadata: test-0@4
```


# 💻 토픽에 데이터가 전송되었는지 확인