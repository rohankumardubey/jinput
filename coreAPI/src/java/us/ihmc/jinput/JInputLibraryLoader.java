package us.ihmc.jinput;

import java.io.File;

import org.apache.commons.lang3.SystemUtils;

import us.ihmc.tools.nativelibraries.NativeLibraryLoader;

public class JInputLibraryLoader
{
   public static void loadLibraries()
   {
      String absolutePathToDirectory;
      if (SystemUtils.IS_OS_WINDOWS)
      {
         absolutePathToDirectory = new File(NativeLibraryLoader.extractLibraries("", "jinput-raw", "jinput-raw_64", "jinput-dx8_64", "jinput-dx8", "jinput-wintab")).getParent();
      }
      else if (SystemUtils.IS_OS_LINUX)
      {
         absolutePathToDirectory = new File(NativeLibraryLoader.extractLibraries("", "jinput-linux64", "jinput-linux")).getParent();
      }
      else if (SystemUtils.IS_OS_MAC)
      {
         absolutePathToDirectory = new File(NativeLibraryLoader.extractLibraryAbsolute("", "libjinput-osx.jnilib")).getParent();
      }
      else
      {
         return;
      }

      System.setProperty("net.java.games.input.librarypath", absolutePathToDirectory);
   }
}
