FROM openjdk:8
EXPOSE 8080
ADD target/k8s-crud-app-0.0.1.jar springboot-curd-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-curd-k8s.jar"]