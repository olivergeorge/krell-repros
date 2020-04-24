
clean:
	rm -fr target index.js

build:
	clj -m krell.main -co build.edn -c

repl:
	clj -m krell.main -co build.edn -c -r

release:
	clj -m krell.main -co build.edn -O advanced -c

