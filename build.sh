#!/bin/bash

echo "====================传输文件===================="

scp -P 22 -r ./target/blade-api.jar root@120.79.52.69:/docker/jar/bladex

echo "====================部署完毕====================="
