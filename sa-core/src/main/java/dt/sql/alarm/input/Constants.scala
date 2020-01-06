package dt.sql.alarm.input

object Constants {

  val KAFKA_TOPIC = "kafka.topic"
  val KAFKA_SUBSCRIBE_TOPIC_PATTERN = "kafka.subscribe.topic.pattern"

  object SubscribeType extends Enumeration{
    type SubscribeType = Value
    val assign = Value(0, "assign")
    val subscribe = Value(1, "subscribe")
    val subscribePattern = Value(2,"subscribePattern")

    override def toString(): String = {
     s"{0:$assign, 1:$subscribe, 2:$subscribePattern}"
    }
  }

  val KAFKA_SERVERS = "kafka.bootstrap.servers"
  val KAFKA_GROUP = "kafka.group"
  val KAFKA_DEFAULT_GROUP = "sqlalarm_group"

}
