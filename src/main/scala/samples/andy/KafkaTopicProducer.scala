package samples.andy

import java.util.Properties
import java.util.concurrent.Future


trait KafkaTopicProducer {

  import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord, RecordMetadata}

  private val producer = {
    Thread.currentThread.setContextClassLoader(null)
    val properties = new Properties()
    properties.put("bootstrap.servers", "localhost:9092");
    properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
    properties.put("acks", "1");
    properties.put("retries", "3");
    properties.put("compression.type", "none");

    new KafkaProducer[String, String](properties)
  }

  def topicName: String

  def sendMessage(key: String, value: String): Future[RecordMetadata] = {
    val producerRecord = new ProducerRecord[String, String](topicName, key, value)
    producer.send(producerRecord)
  }
}