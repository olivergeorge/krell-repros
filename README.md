
Should be possible to set REPL options via EDN file.

Steps to repeat:
* make test

Expect: REPL to boot without error

Actual: REPL fails with error

```
clj -m krell.main -ro repl-options.edn -co build.edn -v -c -r
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
java.lang.IllegalArgumentException: No value supplied for key: [:recompile :all]
	at clojure.lang.PersistentHashMap.create(PersistentHashMap.java:77)
	at krell.repl$repl_env.invokeStatic(repl.clj:445)
	at krell.repl$repl_env.doInvoke(repl.clj:445)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:705)
	at clojure.core$apply.invokeStatic(core.clj:665)
	at clojure.core$apply.invoke(core.clj:660)
	at krell.repl$krell_compile.invokeStatic(repl.clj:331)
	at krell.repl$krell_compile.invoke(repl.clj:328)
	at cljs.cli$compile_opt.invokeStatic(cli.clj:540)
	at cljs.cli$compile_opt.invoke(cli.clj:538)
	at cljs.cli$main.invokeStatic(cli.clj:701)
	at cljs.cli$main.doInvoke(cli.clj:690)
	at clojure.lang.RestFn.applyTo(RestFn.java:139)
	at clojure.core$apply.invokeStatic(core.clj:667)
	at clojure.core$apply.invoke(core.clj:660)
	at cljs.main$_main.invokeStatic(main.clj:65)
	at cljs.main$_main.doInvoke(main.clj:56)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:665)
	at clojure.core$apply.invoke(core.clj:660)
	at krell.main$_main.invokeStatic(main.clj:9)
	at krell.main$_main.doInvoke(main.clj:7)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:705)
	at clojure.core$apply.invokeStatic(core.clj:665)
	at clojure.main$main_opt.invokeStatic(main.clj:514)
	at clojure.main$main_opt.invoke(main.clj:510)
	at clojure.main$main.invokeStatic(main.clj:664)
	at clojure.main$main.doInvoke(main.clj:616)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:705)
	at clojure.main.main(main.java:40)

```

