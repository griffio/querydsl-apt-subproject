## Multi build file project for gradle plugin ewerk querydsl plugin
==============

A base entity, SystemPart, is defined in system and specific parts are created in a different sub project, Parts.
The Querydsl models are generated to java source code in the system and parts projects.
~~~
/system
   ^ (depends)
/parts
~~~
Avoid repeating build script configuration by using a root gradle script.

System project publishes to relative ivy repo.
Parts project has a dependency on the System project using the jar artifact.

=============

### Properties

jpa_version=2.1.0
guava_version=18.0
junit_version=4.11
jsr305_version=1.3.9
logback_version=1.0.13
querydsl_version=3.6.2
querydsl_plugin_version=1.0.3
slf4j_api_version=1.7.10
truth_version=0.25
