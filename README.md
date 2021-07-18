# Dark WebView
[![](https://jitpack.io/v/Kakyire/webview-theme.svg)](https://jitpack.io/#Kakyire/webview-theme)

This library helps you to set your `WebView` background to dark in `Dark Theme`


## Prerequisite

Add the JitPack repository to your your root `build.gradle` at the end of repositories:

```gradle
allprojects {
	repositories {
		...
	maven { url 'https://jitpack.io' }
	}
}
  ```

## Dependency
Add the dependency to your **app** level `build.gradle`

```gradle
dependencies {
	implementation "com.github.kakyire:webview-theme:$current_version"
}
  ```



## Implementation
In your `activity` or `fragment` add this single line of code
## Implementation
```kotlin

webView.setWebViewDarkTheme()

```





