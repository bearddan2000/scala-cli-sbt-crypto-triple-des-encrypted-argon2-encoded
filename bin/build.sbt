name := "scalapass"
organization := "com.outr"
version := "1.0.4"

scalaVersion := "2.13.0"
crossScalaVersions := List("2.13.0", "2.12.8", "2.11.12")
scalacOptions ++= Seq("-unchecked", "-deprecation")

fork := true

libraryDependencies ++= Seq(
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "de.mkammerer" % "argon2-jvm" % "2.7"
)

mainClass := Some("example.Main")
