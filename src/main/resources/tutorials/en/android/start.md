# Getting Started with Kotlin on Android

##### 1. Open Android Studio & Start a new Android Studio Project
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_1.png)

##### 2. Configure Project
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_2.png)

##### 3. Configure Project Step 2
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_3.png)

##### 4. In this screen don't add any Activity (Add No Activity) & Click Finish
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_4.png)

Wait till gradle build process finish.

##### 5. Now Setup Koltin Plugin. If you have already installed kotlin plugin you can skip step 5 - 9. Go to Preferences.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_5.png)


##### 6. From `Preference` select `Plugins`. Then in the search box, search for kotlin. If you don't find click on Search in repositories.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_6.png)

##### 7. Once you found click on `Install` to install the plugin.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_7.png)

##### 8. Wait till plugin installation complete.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_8.png)

##### 9. After installation click `Restart Android Studio` to finalize installation process.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_9.png)

##### 10. Cool. You are ready for Android development using Kotlin. Right click on package, then choose `New` and then `Kotlin Activity`
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_10.png)

##### 11. Select Empty Activity
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_11.png)

##### 12. Configure Activity class name & layout file name.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_12.png)

##### 13. See your layout & Activity class ready. Now move to Activity class.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_13.png)

##### 14. When you will move to Activity class, if your project isn't configured with kotlin then it will ask you to configure. Click on `Configure`.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_14.png)

##### 15. Then `Android with Gradle`
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_15.png)

##### 16. In this screen choose 2nd Group Button as below screenshot & select kotlin version to work with. Then press `Ok`. Wait till configuration process finish.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_16.png)

##### 17. Click `Sync Now` to begin gradle configuration process.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_17.png)

##### 18. After configuration your gradle configuration will look like this.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_18.png)

##### 19. And this.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_19.png)

##### 20. Now one thing left. That is, we will use [Anko Framework](https://github.com/Kotlin/anko) for development. It will make your development life much easier. Add `Anko` gradle dependency as below & you are done. Wait till gradle finish processing.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_20.png)

##### 22. Ok. Navigate to layout and add a `Button` to work with.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_22.png)

##### 23. Now connect the `Button` with `Kotlin` code.

See line 14. Declared a Button with garbage as initial value but not null.
```kotlin
private var sayHelloBtn: Button by Delegates.notNull<Button>()
```

Then line 20. `find()` method did all the shitty stuffs you used to do ;).
```kotlin
this.sayHelloBtn = find(R.id.sayHelloBtn)
```

Now you may want to add button click listener.
```kotlin
this.sayHelloBtn.onClick {
    
}
```

Lets do a toast when clicked,
```kotlin
this.sayHelloBtn.onClick {
    toast("Clicked Say Hello Button")
}
```
Just remember how much code you have to do in Java just to do it. Huh.
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_24.png)

##### 24. 
![](https://raw.githubusercontent.com/s4kibs4mi/KotlinSchool/master/src/main/resources/images/en/begin_step_26.png)
