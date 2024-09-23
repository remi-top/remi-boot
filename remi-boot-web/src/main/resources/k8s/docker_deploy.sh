#先删除原有的镜像
docker images | grep dev-remi-boot-web | awk '{print $3}' | xargs docker rmi -f
docker build -t dev-remi-boot-web .
docker images | grep dev-remi-boot-web
#把新镜像推送到私服
docker login -uadmin -pRemi123 harbor.******.com
docker tag dev-remi-boot-web harbor.******.com/remi-top/dev-remi-boot-web:3.1.0
docker tag dev-remi-boot-web harbor.******.com/remi-top/dev-remi-boot-web
docker push harbor.******.com/remi-top/dev-remi-boot-web:3.1.0
docker push harbor.******.com/remi-top/dev-remi-boot-web
