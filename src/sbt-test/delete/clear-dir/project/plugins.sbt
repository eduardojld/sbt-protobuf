{
  val pluginVersion = System.getProperty("plugin.version")
  if(pluginVersion == null)
    throw new RuntimeException("""|The system property 'plugin.version' is not defined.
                                  |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
  else addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % pluginVersion)
}

libraryDependencies += "com.github.os72" % "protoc-jar" % "3.0.0-b2"
