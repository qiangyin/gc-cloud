# gc-cloud
容器云平台

#### 1. git clone https://github.com/qiangyin/gc-cloud.git

#### 2. git submodule init

#### 3. git submodule update

#### 4. 进入gc-cloud根目录执行 mvn clean install -Dmaven.test.skip=true
## 启动步骤
* 部署eureka-server
* 部署config-server
* 部署zipkin-server
* 部署gitlab-server
* 部署harbor-server
* 部署jenkins-server
* 部署k8s-api-server
* 部署console
  * 导入sql生成数据库
* 部署gc-cloud-web


