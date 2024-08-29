#先删除原有的镜像
docker stop sit-remi-iam-web
docker rm -f sit-remi-iam-web
docker images | grep sit-remi-iam-web | awk '{print $3}' | xargs docker rmi -f
docker build -t sit-remi-iam-web .
docker images | grep sit-remi-iam-web
#把新镜像推送到私服
docker login -uadmin -pYdsz1020 harbor.njydsz.com
docker tag sit-remi-iam-web harbor.njydsz.com/startdis/sit-remi-iam-web:2.0.9
docker tag sit-remi-iam-web harbor.njydsz.com/startdis/sit-remi-iam-web:latest
docker push harbor.njydsz.com/startdis/sit-remi-iam-web:2.0.9
docker push harbor.njydsz.com/startdis/sit-remi-iam-web:latest
#启动最新的镜像服务
docker run --restart=always -t -dit -p 1010:1010 --name sit-remi-iam-web sit-remi-iam-web
docker ps -a
docker logs -f sit-remi-iam-web
