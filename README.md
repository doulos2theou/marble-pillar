Minecraft Forge Mod to add Marble and Pillars

### Compiling and packaging
1. Ensure that `Apache Ant` (found [here](http://ant.apache.org/)) is installed correctly on your system.
 * Linux users will need the latest version of astyle installed as well.
1. Create a base directory for the build
1. Clone the marble-pillar repository into `basedir/MarblePillar/`
1. Navigate to basedir/MarblePillar in a shell and run `ant` (this will take 2-5 minutes)
1. The compiled and obfuscated jar will be in basedir/bin

Your directory structure should look like this:
***

    basedir
    \- jars
     |- minecraft_server.jar
     \- bin
      |- minecraft.jar
      |- ...
    \- MarblePillar
     |- resources
     |- common
     |- ...

