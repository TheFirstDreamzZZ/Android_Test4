# 安卓隐式Intent实验

* 姓名: 龚崇敏</br>

* 学号: 116052017129</br>

* 班级: 数学与信息学院 软件工程3班(大数据方向)</br>

## 实验环境

* Windows10+Android Studio3.5.2

* AS采用安卓10

## 实验1

###     实验要求：自定义WebView验证隐式Intent的使用 

<img src="https://github.com/TheFirstDreamzZZ/Android_Test4/blob/master/Intent_test/ScreenShoot/title.png" width="500" />

* 实验关键步骤是隐式intent的使用

关键代码如下</br>
intent_test程序发送intent请求:</br>
```JAVA
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
```
Mybrowser程序接受intent请求:</br>
```JAVA
        Intent intent = getIntent();
        Uri data = intent.getData();
        URL url = null;
        try {
            url = new URL(data.getScheme(),data.getHost(),data.getPath());
        }catch(Exception e){
            e.printStackTrace();
        }
```
首先，我们要先建立MyBrowser程序，在模拟器中执行一次，将应用安装到模拟器上，以便调用。</br>

要强调的是，要在MyBrowser程序的AndroidManifest.xml文件中加入如下代码：</br>

<img src="https://github.com/TheFirstDreamzZZ/Android_Test4/blob/master/Intent_test/ScreenShoot/add.png" width="500" />

其中MyBrowser程序的WebView的使用，参考了博客《Android WebView 的使用(超详细用法)》

* 网址：[https://blog.csdn.net/weixin_40438421/article/details/85700109](https://blog.csdn.net/weixin_40438421/article/details/85700109)

###     实验结果截图：

Intent_test程序界面:

在文本输入框中输入网址，需要加上(http://),因为我们为浏览器定义的数据格式为http格式。

<img src="https://github.com/TheFirstDreamzZZ/Android_Test4/blob/master/Intent_test/ScreenShoot/first.png" width="375" />

点击浏览该网页,隐式intent调用可选程序,选择MyBrowser程序:

<img src="https://github.com/TheFirstDreamzZZ/Android_Test4/blob/master/Intent_test/ScreenShoot/second.png" width="375" />

点击JUST ONCE:

<img src="https://github.com/TheFirstDreamzZZ/Android_Test4/blob/master/Intent_test/ScreenShoot/third.png" width="375" />

使用MyBrowser程序打开输入的网址

## 实验总结:
  
从本次实验中，学习了隐式Intent的使用，光是上课是不方便理解的，在实验中，就能比较直观的感受到intent的使用，在生活中也接触到很多，特别是应用中的分享功能。实验进行得比较顺利，但是提交实验就遇到了不少麻烦，毕竟是第一次接触github，不知道怎么上传两个文件夹，在Android Studio中上传的文件没有总的项目文件夹，在百度上也有很多方法，在不断的尝试下，还是找到了解决方案，才能顺利的提交本次实验。本次实验对我来说收获很多，更加了解了手机app的一些功能实现。
