lwjgl3-d3d11
====
Direct3D 11 binding for LWJGL 3.

This repository will contain a Direct3D 11 binding for LWJGL 3.
It is currently in a very early stage and not functioning! I frankly just began with it right now. :)

Mapping Direct3D 11 classes
----
Since Direct3D is meant to be object-oriented and to be used with C++, I will follow that path and map the C++ classes to Java classes and interfaces as closely as possible.
For the time being, I will not use the Kotlin generator language provided by LWJGL 3, since I want to first get a feeling for what it would take to map an object-oriented API such as Direct3D to Java.
