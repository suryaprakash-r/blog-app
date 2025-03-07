# Use the base Tomcat image
FROM tomcat:10.0.27-jre17-temurin-jammy

RUN apt-get update && apt-get install nano -y && apt-get install vim -y

ENV TZ=Asia/Kolkata
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN useradd -m -s /bin/bash app-user \
    && mkdir -p /usr/local/tomcat/webapps \
    && chown -R app-user:app-user /usr/local/tomcat

USER app-user

# Copy the WAR file to the webapps directory
COPY --chown=app-user:app-user target/blog.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Run Tomcat
CMD ["catalina.sh", "run"]
