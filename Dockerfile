FROM anapsix/alpine-java 
LABEL maintainer="annusharma26@gmail.com"
COPY /target/springBootMSEKSDemo-0.0.1-SNAPSHOT.jar /home/springBootMSEKSDemo-0.0.1-SNAPSHOT.jar 
CMD ["java","-jar","/home/springBootMSEKSDemo-0.0.1-SNAPSHOT.jar"]