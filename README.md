# Amazon-Device-Messaging
Amazon Device Messaging
- Setup Amazon Device Messaging
    - <a href="https://developer.amazon.com/docs/adm/set-up.html#adding-adm-to-android-studio">Visit it here!</a> 
    - Get file Amazon-Android-SDKs.zip (contain amazon-device-messaging-1.0.1.jar)
    - Code
    
            dependencies {
                provided files('libs/amazon-device-messaging-1.0.1.jar')
            }
    
    - Update your app manifest
            
            <manifest xmlns:android="http://schemas.android.com/apk/res/android"
                xmlns:amazon="http://schemas.amazon.com/apk/res/android"
                package="tutorial.learnadm">
                
    - Code
    
            <permission
                 android:name="[YOUR PACKAGE NAME].permission.RECEIVE_ADM_MESSAGE"
                 android:protectionLevel="signature" />
            <uses-permission android:name="[YOUR PACKAGE NAME].permission.RECEIVE_ADM_MESSAGE" />
            
            <!-- This permission allows your app access to receive push notifications
            from ADM. -->
            <uses-permission android:name="com.amazon.device.messaging.permission.RECEIVE" />
            
            <!-- ADM uses WAKE_LOCK to keep the processor from sleeping when a message is received. -->
            <uses-permission android:name="android.permission.WAKE_LOCK" />
            
     - Explicitly enable ADM and declare whether your app requires ADM
     
            <!-- You must explicitly enable ADM and declare whether your app cannot work without
                     ADM (android:required="true") or can work without ADM (android:required="false").
                     If you specify android:required="false", your app must degrade gracefully if ADM
                     is unavailable. -->
                    <amazon:enable-feature
                        android:name="com.amazon.device.messaging"
                        android:required="true"/>
                        
     - Declare a broadcast receiver to handle the REGISTRATION and RECEIVE intents that ADM sends. ADM requires that the receiver be defined in the AndroidManifest.xml file, rather than programmatically. Immediately after amazon:enable-feature add the following elements.
     
            <service
                 android:name="[YOUR SERVICE NAME]"
                 android:exported="false" />
            
             <receiver
                 android:name="[YOUR RECEIVER NAME]"
            
                 <!-- This permission ensures that only ADM can send your app registration broadcasts. -->
                 android:permission="com.amazon.device.messaging.permission.SEND" >
            
                 <!-- To interact with ADM, your app must listen for the following intents. -->
                 <intent-filter>
             <action android:name="com.amazon.device.messaging.intent.REGISTRATION" />
             <action android:name="com.amazon.device.messaging.intent.RECEIVE" />
            
             <!-- Replace the name in the category tag with your app's package name. -->
             <category android:name="[YOUR PACKAGE NAME]" />
                 </intent-filter>
             </receiver>
- 