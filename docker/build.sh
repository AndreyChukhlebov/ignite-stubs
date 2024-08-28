rm -rf target
mkdir target
cp -R ../pom.xml target
cp -R ../mvnw target
cp -R ../src target
cp -R ../.mvn target

docker build --no-cache \
--progress=plain --network=host \
-t ignite_ssl -f Dockerfile . \
&& docker run --rm --network host ignite_ssl \
&& exit

