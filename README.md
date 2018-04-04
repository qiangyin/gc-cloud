# gc-cloud
容器云平台

#### 1. git clone https://github.com/qiangyin/gc-cloud.git

#### 2. git submodule init

#### 3. git submodule update

#### 4. 进入gc-cloud根目录执行 mvn clean install -Dmaven.test.skip=true
## 启动步骤
* mvn clean install -Dmaven.test.skip=true 部署eureka-server
* mvn clean install -Dmaven.test.skip=true 部署config-server
* mvn clean install -Dmaven.test.skip=true 部署zipkin-server


