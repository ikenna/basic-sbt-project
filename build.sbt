
name := "Ikenna's Simple Scala Project"

version := "1.0"

scalaVersion := "2.11.2"


resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

scalariformSettings

libraryDependencies ++= Seq(
"org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
"ch.qos.logback" % "logback-classic" % "1.0.3",
"ch.qos.logback" % "logback-core" % "1.0.3" )


