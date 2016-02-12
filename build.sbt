scalaVersion := "2.11.7"

resolvers += "Apache Development Snapshot Repository" at "https://repository.apache.org/content/repositories/snapshots/"

val flinkVersion = "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-clients" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-connector-kafka-0.8" % flinkVersion
)

//assemblyMergeStrategy in assembly := {
//  case PathList("org", "apache", "flink", "shaded", xs@_*) => MergeStrategy.first
//  case x =>
//    val oldStrategy = (assemblyMergeStrategy in assembly).value
//    oldStrategy(x)
//}
