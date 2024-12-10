FROM openjdk:11-ea-11-jdk

WORKDIR /code
COPY . /code

RUN wget -P /tmp https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.tar.gz
RUN tar xzvf /tmp/apache-maven-3.9.9-bin.tar.gz -C /opt && rm /tmp/apache-maven-3.9.9-bin.tar.gz

ENV MVN_HOME="/opt/apache-maven-3.9.9"
ENV PATH="$PATH:$MVN_HOME/bin"
