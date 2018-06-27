FROM java:7
COPY /src_set /HelloRedis/src
COPY /lib /HelloRedis/lib

WORKDIR /HelloRedis
RUN javac -cp lib/jedis-2.1.0-sources.jar -d . src/HelloRedis.java

CMD ["java", "HelloRedis"]


