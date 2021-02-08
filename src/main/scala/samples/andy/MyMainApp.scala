package samples.andy

import scala.concurrent.ExecutionContext

object MyMainApp extends App {

  implicit val global: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global

  val actions: List[ScriptCommand] = List(
  )

  actions.foreach {
    case WaitSeconds(nSec) =>
      Thread.sleep(nSec * 1000)

    case Message(topic, key, value) =>
      topic.sendMessage(key, value)
  }

  println("Hello from console")
}