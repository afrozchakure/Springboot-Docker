### Dockerizing a simple springboot application 

#### Running springboot in VScode 
> Search `spring` in extension, download top 4 extensions.

> Search `java` in extension tab, download the first extension by Microsoft.

#### Installing Java and setting up VSCode for Springboot development 
* Refer video here: https://www.youtube.com/watch?v=2qbf4Duqncw

#### Creating Docker container using springboot
* Refer video here: https://www.youtube.com/watch?v=3SNKdr3f9Io

#### Testing whether your service is running 
> curl localhost:8000/api/hw
output: Hello World

#### Creating jar file in java 
* Creating `jar` file in `target` folder
> mvn clean package 

* Running jar file 
> java -jar hw-0.0.0.1-SNAPSHOT.jar 

#### Docker command for running the springboot application 

* Running docker container at port 8000 with springboot application port as 8080
> docker run -p 8000:8080 springapi  # 8080 (Springboot applicaiton port), forwarding it to 8000 (docker port) 

* Running the container in dormat mode (-d) 
> docker run -d -p 8000:8080 springapi   

* Removing docker container with particular sha
> docker rm -f 783f7fb3c2c5

* See running docker containers 
> docker container ls 

#### Docker Commands 

* Checking docker images 
> docker images 

* Checking if container is running 
> docker ps -a  # -a shows dormat containers as well

* Starting docker container 
> docker start da98 

* Stoping docker container 
> docker stop da98  # docker stop sha-value 

* Checking logs of Docker container since creation 
> docker logs -f da98 # docker logs -f sha-value 

* Executing docker in interactive mode 
> docker exec -it da98 sh 
       `OR`
> docker exec -it da98 bash 

#### Commiting changes
> git init
> git add . 
> git commit -m "Add changes" 
> git remote add origin https://github.com/afrozchakure/Springboot-Docker.git
> git push -u origin main