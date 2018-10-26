Thread Weaver is test framework for testing concurrent code.
It inserts breakpoints into code, and tests all execution combinations for possible race conditions.

It is well explained in this talk: https://vimeo.com/105758363 and slides: http://www.slideshare.net/RafaelWinterhalter/unit-testing-concurrent-code

Weaver is originally developed by Google Developers here: https://github.com/google/thread-weaver
This forks updates libraries for Java 11 compatibility and adds mavenization needed for MapDB project.

Examples are here:
https://github.com/jankotek/thread-weaver/tree/master/src/test/java/examples

Documentation is here
https://code.google.com/p/thread-weaver/wiki/UsersGuide

Maven dependency:

        <dependency>
            <groupId>org.mapdb</groupId>
            <artifactId>thread-weaver</artifactId>
            <version>3.0.mapdb</version>
            <scope>test</scope>
        </dependency>


Original readme
----------------

This is Weaver, a framework for writing multi-threaded Unit Tests in
Java.

Documentation is available in the docs directory, including a Users'
Guide and a Tutorial.

Post questions to thread-weaver@googlegroups.com

REQUIREMENTS:

Weaver was built with Java 6. (http://java.sun.com/javase/6)

It requires the following components:

 Javassist. (http://www.csg.is.titech.ac.jp/~chiba/javassist). Version 3.8.1 or greater.

 Objenesis. (http://code.google.com/p/objenesis). Version 1.0 or greater.

 Cglib. (http://cglib.sourceforge.net). Version 2.2 or greater.

To build the extensions:

 Easymock/Easymock Class Extension. (http://easymock.org). Version 2.4 or greater.

To run the tests:

 Easymock/Easymock Class Extension.

 JUnit (http://www.junit.org). Version 4.5 or greater.

To run the extensions tests:

 ASM (http://asm.ow2.org). Version 3.0 or greater.

BUILDING:

To build Weaver, edit the build.properties file and fill in the
location of the required jars. The ant target "all" will build the
main jar plus the extensions, and run all the tests.
