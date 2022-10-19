# movies_microservice_ada

<p>Using Docker</p>

```
./mvnw clean package -DskipTests
sudo cp target/Movies-0.0.1-SNAPSHOT.jar src/main/docker/
cd src/main/docker
docker-compose up
```
