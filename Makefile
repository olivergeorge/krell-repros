
clean:
	rm -fr target .cpcache

configure:
	clj -m cljs.main --install-deps

setup:
	yarn
	npx pod-install ios

compile:
	clj -A:repl -m krell.main -co build.edn -c

repl:
	clj -A:repl -m krell.main -co build.edn -c -r

release:
	clj -A:repl -m krell.main -co build.edn -O advanced -v -c

run-ios:
	npx react-native run-ios

start:
	npx react-native start --verbose

android-emulator:
	emulator -avd `emulator -list-avds | head -1` &

run-android:
	npx react-native run-android

test: setup build run-ios repl

