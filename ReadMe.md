# How to Use

### 0、运行环境

jdk 1.8+ / tomcat 8.0+

### 1、准备时刻表价格表文件

``` mkdir /var/opt/traindata ```

``` cp train_schedule_data/*.gz  /var/opt/traindata ```

``` cd  /var/opt/traindata; gunzip *.gz ```

### 2、编译

在train-master目录下打开终端

``` mvn install```

如果没有安装maven，请先安装maven。

结果会生成一个WAR文件： ./rest-server/target/rest-server-1.0.war 我们可以将其放入tomcat中。

### 3、运行

```cp ./rest-server/target/rest-server-1.0.war  /opt/你的tomcat/webapps/rest.war```

启动tomcat，并在浏览器中访问如下url：

http://localhost:8080/rest/trest?src=成都&dest=深圳

第一次运行的时候会初始化容器花费很长世间。之后会返回如下json：

```
[{ "segs": [ {"line" : "G1315/G1318", "dep":"7:55", "arriv":"21:50","from":"成都东","to":"广州南"},{"line" : "G6225", "dep":"22:25", "arriv":"23:01","from":"广州南","to":"深圳北"}],"shifa":true,"travel_minutes":906,"price":{"yzPrice":159,"rzPrice":250,"ywPrice":250,"rwPrice":-2}, "start":"7:55", "end":"23:01"},{ "segs": [ {"line" : "G1315/G1318", "dep":"7:55", "arriv":"19:01","from":"成都东","to":"长沙南"},{"line" : "G6027", "dep":"19:29", "arriv":"22:55","from":"长沙南","to":"深圳北"}],"shifa":true,"travel_minutes":900,"price":{"yzPrice":253,"rzPrice":399,"ywPrice":399,"rwPrice":-2}, "start":"7:55", "end":"22:55"},{ "segs": [ {"line" : "D2241/D2244", "dep":"6:45", "arriv":"16:32","from":"成都东","to":"武汉"},{"line" : "G1021", "dep":"16:58", "arriv":"22:02","from":"武汉","to":"深圳北"}],"shifa":true,"travel_minutes":917,"price":{"yzPrice":292,"rzPrice":462,"ywPrice":462,"rwPrice":-2}, "start":"6:45", "end":"22:02"},{ "segs": [ {"line" : "G1315/G1318", "dep":"7:55", "arriv":"20:17","from":"成都东","to":"郴州西"},{"line" : "G9685", "dep":"21:57", "arriv":"23:58","from":"郴州西","to":"深圳北"}],"shifa":true,"travel_minutes":963,"price":{"yzPrice":210,"rzPrice":329,"ywPrice":329,"rwPrice":-2}, "start":"7:55", "end":"23:58"},{ "segs": [ {"line" : "G1315/G1318", "dep":"7:55", "arriv":"21:50","from":"成都东","to":"广州南"},{"line" : "G6141/G6144", "dep":"23:08", "arriv":"23:37","from":"广州南","to":"深圳北"}],"shifa":true,"travel_minutes":942,"price":{"yzPrice":159,"rzPrice":250,"ywPrice":250,"rwPrice":-2}, "start":"7:55", "end":"23:37"},
...
,{ "segs": [ {"line" : "D351/D354", "dep":"8:01", "arriv":"16:54","from":"成都东","to":"汉口"},{"line" : "T95", "dep":"18:30", "arriv":"8:50","from":"汉口","to":"深圳"}],"shifa":true,"travel_minutes":1489,"price":{"yzPrice":304,"rzPrice":509,"ywPrice":666,"rwPrice":428}, "start":"8:01", "end":"8:50"}]

```

其中的每个 segs 代表一个旅行方案，例如：

```
{ "segs": [ {"line" : "G1315/G1318", "dep":"7:55", "arriv":"21:50","from":"成都东","to":"广州南"},{"line" : "G6225", "dep":"22:25", "arriv":"23:01","from":"广州南","to":"深圳北"}],"shifa":true,"travel_minutes":906,"price":{"yzPrice":159,"rzPrice":250,"ywPrice":250,"rwPrice":-2}, "start":"7:55", "end":"23:01"},
```

代表从成都东坐G1315/G1318次车7:55出发，21:50到达广州南, 然后在广州南22:25转G6225次，最后于23:01到达深圳。shifa:true 表示G1315成都东是始发站。
travel_minutes是旅途总共花费时间。price是各种等级座位的价格。

# Notice

### 1、mvn install出错

wait

### 2、初始化容器出错

调整jvm参数，打开tomcat文件夹下 ./bin/catalina.sh 在第一行添加如下参数。将jvm内存设置为2G。

```JAVA_OPTS='-Xms1024m -Xmx2048m -Xss1024K -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=1024m'```

### 3、观察运行状态

在tomcat文件夹下 ./logs 打开终端

``` sudo tail -f catalina.out ```
