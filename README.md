# PoC Shared Spring with Liferay 7.X

## Overview

*Foreword: This is based on https://github.com/sammso/spring-portlet-example but commit history cleaned for clarity. Huge thanks for https://github.com/mir333 for initial work*

### The goals

1. To demonstrate appeared bug at Liferay 7.3 update 5, which has been appeared since 7.3 fixpack 2


## Compile

```
mvn clean package
```

# Install

```
tar -zxf deploy/target/sharedspring-deploy-1.0.0.tar.gz -C <liferay-home-directory-here>
```

