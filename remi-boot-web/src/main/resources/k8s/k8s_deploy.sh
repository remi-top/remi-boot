#先删除原有的Pod
kubectl delete deployment dev-remi-boot-web -n remi-top --grace-period=0 --force
kubectl delete svc dev-remi-boot-web -n remi-top
#启动新的Pod
kubectl create -f dev-remi-boot-web.yaml -n remi-top