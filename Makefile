
clean:
	git clean -x -d ios android target .cpcache node_modules -f

configure:
	clj -m cljs.main --install-deps

setup:
	yarn
	npx react-native link
	npx pod-install ios

compile:
	clj -A:repl -m krell.main -co build.edn -c

repl:
	clj -A:repl -m krell.main -ro repl-options.edn -co build.edn -c -r

simple:
	clj -A:repl -m krell.main -co build.edn -O simple -v -c

advanced:
	clj -A:repl -m krell.main -co build.edn -O advanced -v -c

run-ios:
	npx react-native run-ios

run-ios-release:
	npx react-native run-ios --configuration Release

start:
	npx react-native start --verbose

android-emulator:
	emulator -avd `emulator -list-avds | head -1` &

run-android:
	npx react-native run-android

test: setup build run-ios repl

