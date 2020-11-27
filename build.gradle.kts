plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.3"
   id("us.ihmc.ihmc-cd") version "1.17"
}

ihmc {
   group = "us.ihmc"
   version = "200128"
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
	api("us.ihmc:ihmc-native-library-loader:1.2.1")
	api("net.java.jinput:jinput-platform:2.0.6:natives-windows")
	api("net.java.jinput:jinput-platform:2.0.6:natives-osx")
	api("net.java.jinput:jinput-platform:2.0.6:natives-linux")
}

//test.finalizedBy("addPhonyTestXml")
//
//task addPhonyTestXml {
//   doLast {
//      def testDir = file("$buildDir/test-results/test")
//      project.mkdir(testDir)
//
//      def noTestsFoundFile = file("$testDir/TEST-us.ihmc.NoTestsFoundTest.xml")
//      noTestsFoundFile.text =
//            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
//                  "<testsuite name=\"us.ihmc.NoTestsFoundTest\" tests=\"1\" skipped=\"0\" failures=\"0\" " +
//                  "errors=\"0\" timestamp=\"2018-10-19T15:10:58\" hostname=\"duncan-ihmc\" time=\"0.01\">" +
//                  "<properties/>" +
//                  "<testcase name=\"noTestsFoundTest\" classname=\"us.ihmc.NoTestsFoundTest\" time=\"0.01\"/>" +
//                  "<system-out>This is a phony test to make CI builds pass when a project does not contain any tests.</system-out>" +
//                  "<system-err><![CDATA[]]></system-err>" +
//                  "</testsuite>"
//   }
//}
