# 简单的网络封装库
#### 目录介绍
- 01.基础概念介绍
- 02.常见思路和做法
- 03.Api调用说明
- 04.遇到的坑分析
- 05.其他问题说明



### 01.基础概念说明



### 02.常见思路和做法
#### 2.3 Cookie应用场景
- 遇到的问题：登陆成功后，发送请求获取消息，老是提示我没有登陆。
    - Request经常都要携带Cookie，上面说过request创建时可以通过header设置参数，Cookie也是参数之一。
    ```
    Request request = new Request.Builder()
        .url(url)
        .header("Cookie", "xxx")
        .build();
    ```
- 从返回的response里得到新的Cookie，得想办法把Cookie保存起来。但是OkHttp可以不用我们管理Cookie，自动携带，保存和更新Cookie。
    - 方法是在创建OkHttpClient设置管理Cookie的CookieJar，然后在saveFromResponse保存数据，在loadForRequest获取数据。
- 如何实现免密登陆
    - 当我们想要实现免密登录，我们只需要将Cookie存储在文件中或者数据库中即可。




#### 2.4 如何Cookie的持久化
- Android中如何使用Cookie的持久化
    - 第一步：通过响应拦截器从response取出cookie并保存到本地，通过请求拦截器从本地取出cookie并添加到请求中
    - 第二步：自定义CookieJar，在saveFromResponse()中保存cookie到本地，在loadForRequest()从本地取出cookie
    - 第三步：注意在Android中，建议使用sp存储cookie，轻量级存储到本地


### 03.Api调用说明
- OkHttp持久化Cookie操作
    - Okhttp3默认是不持久化Cookie的，想要持久化Cookie就要实现CookieJar接口。
    ``` java
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.cookieJar(new CustomCookieJar());
    ```



### 04.遇到的坑分析


### 05.其他问题说明




