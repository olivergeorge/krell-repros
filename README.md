
For a nice development experience we want to see view changes immediately.  This works with simple reagent views.

React navigation seems to be getting in the way.

Steps to repeat:
* Run the app against the repl (e.g. `make setup compile run-ios repl`)
* Wait till it boots
* Modify the string "Container 1" in the awesome-project.views ns

Expect: Text updates

Actual: No visible change

But... changing something in the awesome-project.core namespace will cause the change to be appear.

