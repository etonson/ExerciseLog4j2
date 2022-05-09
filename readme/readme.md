# Log4j2學習紀錄

套件版本
<mark>log4j-api-2.17.2</mark>

Log4j2套用xml設定檔可用 `ConfigurationSource`方法作初始化,如下程式。
```			
ConfigurationSource source;
File config = new File("//home//sixson//eclipse-workspace//ExerciseLog4j2//src//lib//log4j2.xml");
source = new ConfigurationSource(new FileInputStream(config), config);
Configurator.initialize(null, source);
```

XML設定檔說明見
ExerciseLog4j2/src/lib/read.xml

XML設定說明參考網站
`https://www.796t.com/article.php?id=194368`