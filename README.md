## UnityNativeEdit v1.0
Unity Native Input Plugin for both iOS and Android (Unity UI InputField compatible).
This means you don't need a separate 'Unity' Input box and you can use all native text functions such as `Select`, `Copy` and `Paste`

## Usage
1. Simply copy the files in `release/NativeEditPlugin` into your existing unity project asset folder.
2. If using Unity >= 5.6 make sure that your Plugins/Android/AndroidManifest.xml defines 
    ```
    <activity android:name="com.bkmin.android.UnityPlayerNotOnTopActivity"
       android:label="@string/app_name">
    ```
    instead of
    ```
    <activity android:name="com.unity3d.player.UnityPlayerNativeActivity"
        android:label="@string/app_name">
    ```
    Note that there can be multiple Android manifests in a Unity project (if you have multiple Android plugins) and Unity merges them to a single manifest when building. The `activity` on the manifest closest to the root level of `Plugins/Android` directory seems to override definitions in other manifests so make sure to modify that manifest

    If another plugin you're using is overriding the `UnityPlayerActivity` and the input field appears invisible you need to modify the overriding `UnityPlayerActivity` so that it doesn't appear on top of native views, see https://github.com/YousicianGit/UnityNativeEdit/issues/34.
    
    You can refer to sample `AndroidManifest.xml` in `/Plugings/Android` folder.
 
3. Make empty Gameobject and attach ```PluginMsgHandler``` to your new GameObject
4. Attach ```NativeEditBox``` script to your UnityUI ```InputField```object.
5. Build and run on your android or ios device!

## Etc
1. NativeEditBox will work with delegate defined in your Unity UI InputField, `On Value Change` and `End Edit`
2. It's open source and free to use/redistribute!
3. Please refer to `demo` Unity project.
