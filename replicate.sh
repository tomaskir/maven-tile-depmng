#! /bin/bash

echo;
echo "-----";
echo "Building tiles, this is successful...";
echo "-----";
echo;

cd tiles;
mvn clean;
mvn install;

echo;
echo "-----";
echo "Building project, this fails...";
echo "-----";
echo;

cd ..;
cd project-using-tiles;
mvn clean -X;
mvn install -X;
