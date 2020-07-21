OWB 2.0.16 cannot start if there is an extension "observing" @SessionScoped.

ExampleTest is a reproducer.

It works if OWB is downgraded to 2.0.15 or extension is removed or the @Observes method from the extension is removed 