ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "simple"
  )
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.6",
  "org.apache.spark" %% "spark-sql" % "2.4.6",
  "org.apache.spark" %% "spark-mllib" % "2.4.6",
  "org.apache.spark" %% "spark-streaming" % "2.4.6" % "provided",
  "org.scala-sbt" %% "util-logging" % "1.3.0-M2",
  "org.elasticsearch" % "elasticsearch-spark-20_2.12" % "7.16.2"
)