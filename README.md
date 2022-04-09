# Jenkins Workflow

* [Install Jenkins](#install-jenkins)

### Install Jenkins
Install Jenkins on the Cloud using docker (DigitalOcean).

#### DigitalOcean
Setup DigitalOcean droplet and ssh into the machine: 
```shell
ssh root@<ip-address>
```

#### Download Docker and install Jenkins 
Run the `scripts/install_jenkins.sh` script inside the machine:
```shell
bash install_jenkins.sh
```
Docker will pull the official jenkins image and run the container:
```text
Jenkins installed
You should now be able to access jenkins at: http://<ip-address>:8080
```
_The initial admin password can be found in `/var/jenkins_home/secrets/initialAdminPassword`_


