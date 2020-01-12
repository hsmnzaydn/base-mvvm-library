# Basefy BASE MVVM LIBRARY
Includes useful classes as like below ;

 

  ## Network
- **BaseServiceImp.kt**
		If you use this class you can async request with RxJava2 to your api endpoints. 
		**Sample**;
			[Terminal Commands Clean Architecture CategoryRepositoryImp.kt](https://github.com/hsmnzaydn/term-commands-clean/blob/master/app/src/main/java/com/hsmnzaydn/term_commands_clean/Category/data/repository/CategoryRepositoryImpl.kt)

- **BaseNetworkError.java**
	When you use BaseServiceImp.kt it'll use BaseNetworkError.java for your network's requests.  When your request get an error it'll auto handler for you and except an error to **BaseServiceCallback.kt**'s onError function. And convenience error can manage this way.

- **BaseServiceCallback.kt**
It has two functions. Firstly onSuccess(response:T). This function holder success network request's response body. Secondly onError(errorCode:Int,errorMessage:String). This function holder error network request's response HTTP code and Message. 

## UI
 - **BaseViewInterfaces.kt**
If your applications use a network protocol as like HTTP you'll need UI states. We'll thinking simple this states as like below;
	 - Show a loading
	 - Hide a loading
	 - Show a message
This class holders this functions for you. **Sample**;
			[Terminal Commands Clean Architecture BaseActivity.kt](https://github.com/hsmnzaydn/term-commands-clean/blob/master/app/src/main/java/com/hsmnzaydn/term_commands_clean/base/BaseActivity.kt)

- **BaseResponseCallBack.kt**
 When you use a network protocol as like HTTP you'll need controll UI states for every requests. Sometimes it'll be a torture. This class controls for you. **Sample**;
			[Terminal Commands Clean Architecture CategoryViewModel.kt](https://github.com/hsmnzaydn/term-commands-clean/blob/master/app/src/main/java/com/hsmnzaydn/term_commands_clean/Category/presentation/CategoryViewModel.kt)

## Dagger 2

- **ViewModelFactory.kt**
 When you use MVVM design pattern with Dagger 2 you'll need a VM factory. **Sample**;
			[Terminal Commands Clean Architecture ViewModule.kt ](https://github.com/hsmnzaydn/term-commands-clean/blob/master/app/src/main/java/com/hsmnzaydn/term_commands_clean/di/modules/ViewModule.kt))

## Extension
- **BaseViewExtension.kt**
When you use Recylerview Adapter you need create a LinearLayout Manager and you need define positon etc VERTICAL, HORIZONTAL etc. This extension create LinearLayout Managers for you and defined position for you.

**Sample**;
[Terminal Command Clean Architecture CategoryActivity.kt](https://github.com/hsmnzaydn/term-commands-clean/blob/master/app/src/main/java/com/hsmnzaydn/term_commands_clean/ui/category/CategoryActivity.kt)


##  Download

**Add it in your root build.gradle at the end of repositories:**

<pre>

allprojects {

repositories {
...
    maven { url 'https://jitpack.io' }
    }
}

</pre>

  

**Add the dependency**

<pre>

dependencies {
implementation 'com.github.Basefy:base-mvvm-library:1.2.0
}

</pre>
