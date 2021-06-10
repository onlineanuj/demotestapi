### Resources

S.No. | Resource          | Download URL
----- | ----------------- | ----------------
1     | Mongodb           | https://fastdl.mongodb.org/windows/mongodb-windows-x86_64-4.4.6.zip 
2     | Mongodb exporter  | https://github.com/percona/mongodb_exporter/releases/download/v0.20.5/mongodb_exporter-0.20.5.linux-amd64.tar.gz 
3     | Grafana           | https://dl.grafana.com/oss/release/grafana-8.0.0.windows-amd64.zip 
4     | Prometheus        | https://github.com/prometheus/prometheus/releases/download/v2.27.1/prometheus-2.27.1.windows-amd64.zip 

**Postman** is used as a rest api client to call rest api. 

**Spring STS** is used to devlop and deploy the rest api as spring boot application. 

**Robo 3t** is used a mongo db client.

![Deployment Diagram](https://github.com/onlineanuj/demotestapi/blob/master/Untitled%20Diagram.png)

### Create MongoDB Replica set
Open the mongo client on any mongodb instance and create the replica set  
```javascript
  rs.initiate(
{
_id: "replicaSet1", members: [{ _id: 0, host: "localhost:27017" },{ _id: 1, host: "localhost:27018" },{ _id: 2, host: "localhost:27019" }]
}
)
```

Run mongoDB nodes
```javascript
./mongodb1/bin/mongod.exe --config C:/anuj/projects/mongoDB_graphana/mongodb1.conf
./mongodb2/bin/mongod.exe --config C:/anuj/projects/mongoDB_graphana/mongodb2.conf
./mongodb3/bin/mongod.exe --config C:/anuj/projects/mongoDB_graphana/mongodb3.conf
```
Run mongoDB client
```javascript
./mongo.exe --host localhost --port 27017
```
Run MongoDB exporter
```javascript
./mongodb_exporter --mongodb.uri=mongodb://anuj:anuj@127.0.0.1:27017/demodb?ssl=false --web.listen-address=":9216" --compatible-mode --mongodb.collstats-colls=demodb.message
```
Usefull web URLS
S.No. | Resource          | Download URL
----- | ----------------- | ----------------
1     | Web Url to see mongoDB metrics | http://localhost:9216/metrics 
2     | Web Url to see Prometheus | http://localhost:9090/
3     | Web Url to see Prometheus targets | http://localhost:9090/targets 
4     | Web Url to see Grafana dashboard | http://localhost:3000/
