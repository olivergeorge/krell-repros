
clean:
	rm -fr target index.js

build:
	clj -m krell.main -co build.edn -c

repl:
	clj -m krell.main -co build.edn -v -c -r

release:
	clj -m krell.main -co build.edn -O advanced -v -c

ios:
	npx react-native start
	npx react-native run-ios

android:
	npx react-native start
	npx react-native run-android
