package samples.andy

trait ScriptCommand
case class WaitSeconds(sec: Int) extends ScriptCommand
case class Message(topic: KafkaTopicProducer, key: String, value: String) extends ScriptCommand
case class MessageEmptyKey(topic: KafkaTopicProducer, value: String) extends ScriptCommand

