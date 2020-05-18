# manage-permission-plugin

Enable Jenkins.MANAGE permission to be used with an authorization strategy (Matrix or RBAC for example).

Reference: [jep-223](https://github.com/jenkinsci/jep/tree/master/jep/223)

## How to compile

The Jenkins.MANAGE permission is annotated as beta, you need to use the beta flag to compile it.

```
mvn clean install -DuseBeta=true
```
