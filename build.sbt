name := "KafkaSendReceiveSample"

version := "0.1"

scalaVersion := "2.13.3"

lazy val kafkaVer = "2.3.0"
lazy val http4sVersion = "0.21.7"
libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-streams" % kafkaVer,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)

// https://mvnrepository.com/artifact/com.typesafe.play/play-json
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.0"


//libraryDependencies += "org.http4s" %% "http4s-server" % "0.21.7"
//libraryDependencies += "org.http4s" %% "http4s-core" % "0.21.7"
//libraryDependencies += "org.http4s" %% "http4s-dsl" % "0.21.7"

// scalacOptions ++= Seq("-Ypartial-unification")