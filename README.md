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
> **_NOTE:_**  The library is yet not available as dependency but will be deployed via Maven Central in the future.

# Project Structure

The project contains several packages.

- `io.adminshell.aas.v3.model` Java interfaces & enums representing the AAS model
- `io.adminshell.aas.v3.model.annotations` Annotations used on the model
- `io.adminshell.aas.v3.model.builder` Abstract builder classes for the interfaces
- `io.adminshell.aas.v3.model.impl` Default implementations of the AAS classes. Can be replaced with custom implementations if needed.

# How to Contribute

We always look for contributions, bug reports, feature requests etc. Simply open an [issue](https://github.com/admin-shell-io/java-model/issues) or - even better - directly propose a change through a [pull request](https://github.com/admin-shell-io/java-model/pulls).


# Contributors

| Name | Affiliation | Github Account |
|:--| -- | -- |
| Sebastian Bader | Fraunhofer IAIS | [sebbader](https://github.com/sebbader) |
| Matthias Böckmann | Fraunhofer IAIS | [maboeckmann](https://github.com/maboeckmann) |
| Daniel Espen | Fraunhofer IESE | [daespen](https://github.com/daespen) |
| Michael Jacoby | Fraunhofer IOSB | [mjacoby](https://github.com/mjacoby) |
| Jens Müller | Fraunhofer IOSB | [JensMueller2709](https://github.com/JensMueller2709) |
| Chang Qin | Fraunhofer IAIS | [changqin26](https://github.com/changqin26) |
| Bastian Rössl | Fraunhofer IOSB-INA | []() |
| Frank Schnicke | Fraunhofer IESE | [frankschnicke](https://github.com/frankschnicke) |
