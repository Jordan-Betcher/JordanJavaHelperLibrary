# JordanJavaHelperLibrary
A Helper Library for coding in java. Contains a Library for events unit tested.
Examples can be found in the HelperLibrary.src.\*examples folder
Unit tests are found in the HelperLibrary.test.\* folder
Event is the basic event, i.e. event.call()
AtCaller has Event and allows setting the number of calls before removing itself, i.e. atCaller.addListener(listener, 1)
OnCaller has AtCaller and let's you change what is the listeners expected input using generics, look at the example
