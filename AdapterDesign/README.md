# Adapter Design Patterns
- Allows two incompatible interfaces to work together
- Used when the client expects a (target) interface
- The Adapter class allows the use of the available interface and the Target interface
- Any class can work together as long as the Adapter solves the issue that all classes must implement every method defined by the shared
  interface


## Example 1 - EnemyRobotAdapter
  - EnemyAttacker is the target
  - EnemyRobotAdapter is the adapter
  - EnemyRobot is the adaptee
    
## Example 2 - Shape
  - MediaPlayer interface
  - Concrete class AudioPlayer implementing the MediaPlayer interface.
  - AudioPlayer can play mp3 format audio files by default.
  - AdvancedMediaPlayer interface
  - Concrete classes implementing the AdvancedMediaPlayer interface
    - These classes can play vlc and mp4 format files.
  - We want to make AudioPlayer to play other formats as well.
    - To attain this, we have created an adapter class MediaAdapter which implements the MediaPlayer interface 
      and uses AdvancedMediaPlayer objects to play the required format.
    - AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type without knowing the actual class 
      which can play the desired format. AdapterPatternTest, the test class, will use AudioPlayer class to play various formats.
      
  ![example2_uml](https://user-images.githubusercontent.com/16873263/27505728-7ee849b2-585b-11e7-8a50-52d5ca041b5a.jpg)
