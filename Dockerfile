From nginx:latest
MAINTAINER ctw1048@hanmail.net

RUN apt-get update && \
    apt-get install net-tools && \
    apt-get clean && \
    mkdir -p /var/lib/www

COPY ./index.html /usr/share/nginx/html