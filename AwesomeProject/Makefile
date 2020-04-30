
clean:
	rm -fr target index.js node_modules

setup:
	yarn
	npx pod-install ios

build:
	clj -m krell.main -co build.edn -c

repl:
	clj -m krell.main -co build.edn -v -c -r

release:
	clj -m krell.main -co build.edn -O advanced -v -c

run-ios:
	npx react-native run-ios

start:
	npx react-native start --verbose

run-android:
	npx react-native run-android
