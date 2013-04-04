yebspec - a simple test api for Yeti the funtional language for the JVM
==========================================================

Yebspec is a simple test api for [yeti](http://mth.github.com/yeti/) in yeti.

For a description see <http://chrisichris.wordpress.com/2011/04/01/testing-in-yeti-using-yebspec/>

## Sample

To see a an example look at the test folder.

## To run the junit test

use 

	>java -jar ybuilder.jar clean, test

(note if you want to run junit tests with ybuilder the JUnitTask must
be on the projects class-path. see the project.yeti file for how it is added)

## Obtaining

You can git clone it and build it with the included ybuilder.jar:

    java -jar ybuilder.jar clean, jar

Or from my maven-repo 
<http://chrisichris.github.com/chrisis-maven-repo/snapshots/>. 

		group-id: org.yeb
		artifact-id: yebspec
		version: 1.0-SNAPSHOT

## Support

Join the discussion mailing list at:

<http://groups.google.com/group/yeti-lang>
