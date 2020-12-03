plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.17"
}

ihmc {
   group = "us.ihmc.thirdparty.jinput"
   version = "201202-1"
   vcsUrl = "https://github.com/ihmcrobotics/jinput"
   openSource = true

   configureDependencyResolution()
   javaDirectory("main", "../../applet/src")
   javaDirectory("main", "../../coreAPI/src/java")
   javaDirectory("main", "../../plugins/awt/src")
   javaDirectory("main", "../../plugins/linux/src/java")
   javaDirectory("main", "../../plugins/OSX/src/java")
   javaDirectory("main", "../../plugins/windows/src/java")
   javaDirectory("main", "../../plugins/wintab/src/java")
   configurePublications()
}

mainDependencies {
   api("net.java.jutils:jutils:1.0.0")
	api("org.apache.commons:commons-lang3:3.11")
   api("us.ihmc:ihmc-native-library-loader:1.3.1")
	api("net.java.jinput:jinput-platform:2.0.6:natives-windows")
   api("net.java.jinput:jinput-platform:2.0.6:natives-osx")
	api("net.java.jinput:jinput-platform:2.0.6:natives-linux")
}
