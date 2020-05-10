
clean:
	rm -fr target .cpcache

setup:
	yarn
	npx pod-install ios

compile:
	clj -m krell.main -co build.edn -c

repl:
	clj -m krell.main -ro repl-options.edn -co build.edn -v -c -r

release:
	clj -m krell.main -co build.edn -O advanced -v -c

run-ios:
	npx react-native run-ios

start:
	npx react-native start --verbose

run-android:
	npx react-native run-android

test: setup build run-ios repl

