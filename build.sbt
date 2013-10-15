name := "Desktop Push Bullet"

organization := "com.gmail.nmarshall23"

version := "0.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.2" % "test",
  "org.scala-lang" % "scala-swing" % "2.10.3",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.0"
//  "com.propensive" % "rapture-io" % "0.7.2"
)

initialCommands := "import com.gmail.nmarshall23.desktoppushbullet._"
