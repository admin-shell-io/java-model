# Java Model

The AAS Java Model is an implementation of the Asset Administration Shell
metamodel in Java. It contains all classes and properties as defined by the
document 'Details of the Asset Administration Shell' published on
[www.plattform-i40.de](https://www.plattform-i40.de).


# Build and Use

You can build the project using Maven by simply executing:

`mvn clean install`

or by integrating the library as a dependency:

```
<dependency>
  <groupId>io.admin-shell.aas</groupId>
  <artifactId>model</artifactId>
  <version>latest-version</version>
<dependency>
```

# Project Structure

The project contains several packages.

- io.adminshell.aas.v3.model: Location of the AAS classes as Java interfaces
- io.adminshell.aas.v3.model.impl: Default implementations of the AAS classes. Can be replaced with custom implementations if needed.
- io.adminshell.aas.v3.model.builder: Provided builder classes to create the instances of the AAS classes
- io.adminshell.aas.v3.dataformat: Interfaces for the serialization formats, for instance JSON, XML, AASX etc. Own serializers can be developed by implementing these interfaces. See also the provided default [serializers](https://github.com/admin-shell-io/java-serializer).

# How to Contribute

We always look for contributions, bug reports, feature requests etc. Simply open an [issue](https://github.com/admin-shell-io/java-model/issues) or - even better - directly propose a change through a [pull request](https://github.com/admin-shell-io/java-model/pulls).


# Contributers

| Name | Affiliation | Github Account |
|:--| -- | -- |
| Sebastian Bader | Fraunhoder IAIS | [sebbader](https://github.com/sebbader) |
| Matthias Böckmann | Fraunhoder IAIS | [maboeckmann](https://github.com/maboeckmann) |
| Chang Qin | Fraunhoder IAIS | [changqin26](https://github.com/changqin26) |
| Michael Jacoby | Fraunhoder IOSB | []() |
| Maximilian Conradi | Fraunhoder IESE | []() |
| Jan-Wilhelm Blume | Fraunhoder IOSB | []() |
| Frank Schnicke | Fraunhoder IESE | []() |
| Jens Müller | Fraunhoder IOSB | []() |
| Daniel Espen | Fraunhoder IESE | []() |
| Bastian Espen | Fraunhoder IOSB | []() |
| Michael Jacoby | Fraunhoder IOSB | []() |
