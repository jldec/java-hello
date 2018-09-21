# riff sample: Java Hello
This sample requires riff v0.1.3 or later.

#### create locally
```sh
riff function create java hello \
  --local-path . \
  --image dev.local/java-hello:v1
```

#### create from git repo, pushing image to DockerHub
```sh
riff function create java hello \
    --git-repo https://github.com/projectriff-samples/java-hello.git \
    --image $DOCKER_ID/java-hello:v1 \
    --verbose
```
To set `$DOCKER_ID` do `export DOCKER_ID=your-docker-id`

#### create from git repo, pushing image to GCR
```sh
riff function create java hello \
    --git-repo https://github.com/projectriff-samples/java-hello.git \
    --image gcr.io/$GCP_PROJECT/java-hello:v1 \
    --verbose
```
To set `$GCP_PROJECT` do `export GCP_PROGECT=your-GCP-project-id`

#### invoke
```
riff service invoke hello --text -- -w '\n' -d world
```
