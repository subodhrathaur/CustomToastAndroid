# Custom Toast Android

[![](https://jitpack.io/v/SubodhKumar1111996/CustomToastAndroid.svg)](https://jitpack.io/#SubodhKumar1111996/CustomToastAndroid)


## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	 implementation 'com.github.subodhrathaur:CustomToastAndroid:0.2.2'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

For default Toast:

``` java
CustomToast.makeText(context, "Default Toast", Toast.LENGTH_SHORT,CustomToast.DEFAULT).show();
```
For success Toast:

``` java
CustomToast.makeText(context, "Success Toast", Toast.LENGTH_SHORT,CustomToast.SUCCESS).show();
```
For Confusing Toast:

``` java
CustomToast.makeText(context, "Confusing Toast", Toast.LENGTH_SHORT,CustomToast.CONFUSING).show();
```
For error Toast:

``` java
CustomToast.makeText(context, "Error Toast", Toast.LENGTH_SHORT,CustomToast.ERROR).show();
```
For info Toast:

``` java
 CustomToast.makeText(context, "Info Toast", Toast.LENGTH_SHORT,CustomToast.INFO).show();
```
For warning Toast:

``` java
CustomToast.makeText(context, "Warning Toast", Toast.LENGTH_SHORT,CustomToast.WARNING).show();
```
## Screenshots

**Please click the image below to enlarge.**


<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/default.jpeg">
<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/success.jpeg">
<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/confusing.jpeg">
<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/error.jpeg">
<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/info.jpeg">
<img src="https://github.com/SubodhKumar1111996/CustomToastAndroid/blob/master/warning.jpeg">

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2019 Subodh Kumar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

